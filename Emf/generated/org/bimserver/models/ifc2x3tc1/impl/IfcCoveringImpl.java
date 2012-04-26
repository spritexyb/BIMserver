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

import org.bimserver.models.ifc2x3tc1.IfcCovering;
import org.bimserver.models.ifc2x3tc1.IfcCoveringTypeEnum;
import org.bimserver.models.ifc2x3tc1.IfcRelCoversBldgElements;
import org.bimserver.models.ifc2x3tc1.IfcRelCoversSpaces;
import org.bimserver.models.ifc2x3tc1.LogPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Covering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCoveringImpl#getPredefinedType <em>Predefined Type</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCoveringImpl#getCoversSpaces <em>Covers Spaces</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcCoveringImpl#getCovers <em>Covers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcCoveringImpl extends IfcBuildingElementImpl implements IfcCovering {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcCoveringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogPackage.Literals.IFC_COVERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCoveringTypeEnum getPredefinedType() {
		return (IfcCoveringTypeEnum) eGet(LogPackage.Literals.IFC_COVERING__PREDEFINED_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredefinedType(IfcCoveringTypeEnum newPredefinedType) {
		eSet(LogPackage.Literals.IFC_COVERING__PREDEFINED_TYPE, newPredefinedType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPredefinedType() {
		eUnset(LogPackage.Literals.IFC_COVERING__PREDEFINED_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredefinedType() {
		return eIsSet(LogPackage.Literals.IFC_COVERING__PREDEFINED_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelCoversSpaces> getCoversSpaces() {
		return (EList<IfcRelCoversSpaces>) eGet(LogPackage.Literals.IFC_COVERING__COVERS_SPACES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCoversSpaces() {
		eUnset(LogPackage.Literals.IFC_COVERING__COVERS_SPACES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCoversSpaces() {
		return eIsSet(LogPackage.Literals.IFC_COVERING__COVERS_SPACES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcRelCoversBldgElements> getCovers() {
		return (EList<IfcRelCoversBldgElements>) eGet(LogPackage.Literals.IFC_COVERING__COVERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCovers() {
		eUnset(LogPackage.Literals.IFC_COVERING__COVERS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCovers() {
		return eIsSet(LogPackage.Literals.IFC_COVERING__COVERS);
	}

} //IfcCoveringImpl