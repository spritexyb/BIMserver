/**
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3tc1.impl;

import org.bimserver.emf.IdEObjectImpl;

import org.bimserver.models.ifc2x3tc1.IfcApproval;
import org.bimserver.models.ifc2x3tc1.IfcApprovalActorRelationship;
import org.bimserver.models.ifc2x3tc1.IfcApprovalRelationship;
import org.bimserver.models.ifc2x3tc1.IfcDateTimeSelect;
import org.bimserver.models.ifc2x3tc1.LogPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Approval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getApprovalDateTime <em>Approval Date Time</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getApprovalLevel <em>Approval Level</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getApprovalQualifier <em>Approval Qualifier</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getIsRelatedWith <em>Is Related With</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcApprovalImpl#getRelates <em>Relates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcApprovalImpl extends IdEObjectImpl implements IfcApproval {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcApprovalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackage.Literals.IFC_APPROVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String) eGet(LogPackage.Literals.IFC_APPROVAL__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(LogPackage.Literals.IFC_APPROVAL__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDescription() {
		eUnset(LogPackage.Literals.IFC_APPROVAL__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDescription() {
		return eIsSet(LogPackage.Literals.IFC_APPROVAL__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDateTimeSelect getApprovalDateTime() {
		return (IfcDateTimeSelect) eGet(LogPackage.Literals.IFC_APPROVAL__APPROVAL_DATE_TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalDateTime(IfcDateTimeSelect newApprovalDateTime) {
		eSet(LogPackage.Literals.IFC_APPROVAL__APPROVAL_DATE_TIME, newApprovalDateTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovalStatus() {
		return (String) eGet(LogPackage.Literals.IFC_APPROVAL__APPROVAL_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalStatus(String newApprovalStatus) {
		eSet(LogPackage.Literals.IFC_APPROVAL__APPROVAL_STATUS, newApprovalStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApprovalStatus() {
		eUnset(LogPackage.Literals.IFC_APPROVAL__APPROVAL_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApprovalStatus() {
		return eIsSet(LogPackage.Literals.IFC_APPROVAL__APPROVAL_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovalLevel() {
		return (String) eGet(LogPackage.Literals.IFC_APPROVAL__APPROVAL_LEVEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalLevel(String newApprovalLevel) {
		eSet(LogPackage.Literals.IFC_APPROVAL__APPROVAL_LEVEL, newApprovalLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApprovalLevel() {
		eUnset(LogPackage.Literals.IFC_APPROVAL__APPROVAL_LEVEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApprovalLevel() {
		return eIsSet(LogPackage.Literals.IFC_APPROVAL__APPROVAL_LEVEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApprovalQualifier() {
		return (String) eGet(LogPackage.Literals.IFC_APPROVAL__APPROVAL_QUALIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovalQualifier(String newApprovalQualifier) {
		eSet(LogPackage.Literals.IFC_APPROVAL__APPROVAL_QUALIFIER, newApprovalQualifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApprovalQualifier() {
		eUnset(LogPackage.Literals.IFC_APPROVAL__APPROVAL_QUALIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApprovalQualifier() {
		return eIsSet(LogPackage.Literals.IFC_APPROVAL__APPROVAL_QUALIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String) eGet(LogPackage.Literals.IFC_APPROVAL__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(LogPackage.Literals.IFC_APPROVAL__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return (String) eGet(LogPackage.Literals.IFC_APPROVAL__IDENTIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		eSet(LogPackage.Literals.IFC_APPROVAL__IDENTIFIER, newIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcApprovalActorRelationship> getActors() {
		return (EList<IfcApprovalActorRelationship>) eGet(LogPackage.Literals.IFC_APPROVAL__ACTORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetActors() {
		eUnset(LogPackage.Literals.IFC_APPROVAL__ACTORS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActors() {
		return eIsSet(LogPackage.Literals.IFC_APPROVAL__ACTORS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcApprovalRelationship> getIsRelatedWith() {
		return (EList<IfcApprovalRelationship>) eGet(LogPackage.Literals.IFC_APPROVAL__IS_RELATED_WITH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsRelatedWith() {
		eUnset(LogPackage.Literals.IFC_APPROVAL__IS_RELATED_WITH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsRelatedWith() {
		return eIsSet(LogPackage.Literals.IFC_APPROVAL__IS_RELATED_WITH);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcApprovalRelationship> getRelates() {
		return (EList<IfcApprovalRelationship>) eGet(LogPackage.Literals.IFC_APPROVAL__RELATES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelates() {
		eUnset(LogPackage.Literals.IFC_APPROVAL__RELATES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelates() {
		return eIsSet(LogPackage.Literals.IFC_APPROVAL__RELATES);
	}

} //IfcApprovalImpl