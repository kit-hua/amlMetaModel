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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CAEX basis object derived from CAEXBasicObject, augmented by 
 * Name (required) and ID (optional).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link CAEX.CAEXObject#getID <em>ID</em>}</li>
 *   <li>{@link CAEX.CAEXObject#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see CAEX.CAEXPackage#getCAEXObject()
 * @model extendedMetaData="name='CAEXObject' kind='elementOnly'"
 * @generated
 */
public interface CAEXObject extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optional attribute that describes a unique identifier of the CAEX object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see CAEX.CAEXPackage#getCAEXObject_ID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link CAEX.CAEXObject#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the name of the CAEX object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see CAEX.CAEXPackage#getCAEXObject_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link CAEX.CAEXObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CAEXObject
