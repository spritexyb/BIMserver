package org.bimserver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import nl.tue.buildingsmart.express.dictionary.SchemaDefinition;

import org.bimserver.database.BimDatabase;
import org.bimserver.database.store.log.AccessMethod;
import org.bimserver.ifcengine.IfcEngineFactory;
import org.bimserver.interfaces.objects.SAccessMethod;
import org.bimserver.interfaces.objects.SUser;
import org.bimserver.shared.SUserSession;
import org.bimserver.shared.ServiceInterface;
import org.bimserver.shared.Token;
import org.bimserver.shared.UserException;
import org.bimserver.utils.GeneratorUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceFactory {
	private static ServiceFactory INSTANCE = null;
	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceFactory.class);
	private static final int TOKEN_TTL_SECONDS = 60*60; // one hour
	private final HashMap<Token, ServiceInterface> tokens = new HashMap<Token, ServiceInterface>();
	private final BimDatabase bimDatabase;
	private final EmfSerializerFactory emfSerializerFactory;
	private final SchemaDefinition schema;
	private final LongActionManager longActionManager;
	private final IfcEngineFactory ifcEngineFactory;

	private ServiceFactory(BimDatabase bimDatabase, EmfSerializerFactory emfSerializerFactory, SchemaDefinition schema,
			LongActionManager longActionManager, IfcEngineFactory ifcEngineFactory) {
		this.bimDatabase = bimDatabase;
		this.emfSerializerFactory = emfSerializerFactory;
		this.schema = schema;
		this.longActionManager = longActionManager;
		this.ifcEngineFactory = ifcEngineFactory;
	}
	
	public static void init(BimDatabase bimDatabase, EmfSerializerFactory emfSerializerFactory, SchemaDefinition schema, LongActionManager longActionManager, IfcEngineFactory ifcEngineFactory) {
		INSTANCE = new ServiceFactory(bimDatabase, emfSerializerFactory, schema, longActionManager, ifcEngineFactory);
	}

	public ServiceInterface newService(AccessMethod accessMethod) {
		Service service = new Service(bimDatabase, emfSerializerFactory, schema, longActionManager, accessMethod, ifcEngineFactory, this);
		Date expires = new Date(new Date().getTime() + (TOKEN_TTL_SECONDS * 1000));
		Token token = new Token(GeneratorUtils.generateToken(), expires);
		tokens.put(token, service);
		service.setToken(token);
		return service;
	}

	public static ServiceFactory getINSTANCE() {
		return INSTANCE;
	}

	public synchronized ServiceInterface getService(Token token) throws UserException {
		if (tokens.containsKey(token)) {
			return tokens.get(token);
		}
		throw new UserException("Invalid token");
	}

	public synchronized void cleanup() {
		LOGGER.info("Cleaning up tokens");
		Date now = new Date();
		Iterator<Token> iterator = tokens.keySet().iterator();
		while (iterator.hasNext()) {
			Token token = iterator.next();
			if (token.getExpiresAsDate().before(now)) {
				LOGGER.info("Removing token " + token.getTokenString() + " because it is expired");
				iterator.remove();
			}
		}
	}

	public synchronized int getNumberOfTokens() {
		return tokens.size();
	}

	public synchronized void remove(Token token) {
		tokens.remove(token);
	}

	public List<SUserSession> getActiveUserSessions() throws UserException {
		List<SUserSession> userSessions = new ArrayList<SUserSession>();
		for (Token token : tokens.keySet()) {
			ServiceInterface serviceInterface = tokens.get(token);
			if (serviceInterface.isLoggedIn() && serviceInterface.getAccessMethod() != SAccessMethod.INTERNAL) {
				SUser user = serviceInterface.getCurrentUser();
				if (user != null) {
					SUserSession userSession = new SUserSession();
					userSession.setUsername(user.getUsername());
					userSession.setType(user.getUserType());
					userSession.setName(user.getName());
					userSession.setUoid(user.getOid());
					userSession.setAccessMethod(serviceInterface.getAccessMethod());
					userSession.setActiveSince(serviceInterface.getActiveSince());
					userSession.setLastActive(serviceInterface.getLastActive());
					userSessions.add(userSession);
				}
			}
		}
		Collections.sort(userSessions, new Comparator<SUserSession>(){
			@Override
			public int compare(SUserSession o1, SUserSession o2) {
				return o1.getLastActive().compareTo(o2.getLastActive());
			}});
		return userSessions;
	}

	public static boolean isInitialized() {
		return INSTANCE != null;
	}
}