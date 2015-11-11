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
package CAEX.impl;

import CAEX.CAEXPackage;
import CAEX.SystemUnitClassLib;
import CAEX.SystemUnitFamily;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Unit Class Lib</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link CAEX.impl.SystemUnitClassLibImpl#getSystemUnitClass <em>System Unit Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemUnitClassLibImpl extends CAEXObjectImpl implements SystemUnitClassLib {
	/**
	 * The cached value of the '{@link #getSystemUnitClass() <em>System Unit Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitClass()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUnitFamily> systemUnitClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemUnitClassLibImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.SYSTEM_UNIT_CLASS_LIB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemUnitFamily> getSystemUnitClass() {
		if (systemUnitClass == null) {
			systemUnitClass = new EObjectContainmentEList<SystemUnitFamily>(SystemUnitFamily.class, this, CAEXPackage.SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS);
		}
		return systemUnitClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CAEXPackage.SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS:
				return ((InternalEList<?>)getSystemUnitClass()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CAEXPackage.SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS:
				return getSystemUnitClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CAEXPackage.SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS:
				getSystemUnitClass().clear();
				getSystemUnitClass().addAll((Collection<? extends SystemUnitFamily>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CAEXPackage.SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS:
				getSystemUnitClass().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CAEXPackage.SYSTEM_UNIT_CLASS_LIB__SYSTEM_UNIT_CLASS:
				return systemUnitClass != null && !systemUnitClass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SystemUnitClassLibImpl
