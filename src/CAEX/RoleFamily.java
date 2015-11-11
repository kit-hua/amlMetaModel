/*******************************************************************************
 * Copyright (c) 2015 Business Informatics Group at TU Wien
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Manuel Wimmer and Emanuel Maetzler
 *******************************************************************************/
/**
 */
package CAEX;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines base structures for a hierarchical RoleClass tree. The hierarchical structure of a role library has organizational character only. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CAEX.RoleFamily#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see CAEX.CAEXPackage#getRoleFamily()
 * @model extendedMetaData="name='RoleFamilyType' kind='elementOnly'"
 * @generated
 */
public interface RoleFamily extends RoleClass {
	/**
	 * Returns the value of the '<em><b>Role Class</b></em>' containment reference list.
	 * The list contents are of type {@link CAEX.RoleFamily}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element that allows definition of child RoleClasses within the class hierarchy. The parent child relation between two RoleClasses has no semantic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Class</em>' containment reference list.
	 * @see CAEX.CAEXPackage#getRoleFamily_RoleClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleClass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RoleFamily> getRoleClass();

} // RoleFamily
