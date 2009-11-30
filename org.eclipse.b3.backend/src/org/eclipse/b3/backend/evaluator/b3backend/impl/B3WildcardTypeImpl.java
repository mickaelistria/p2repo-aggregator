/**
 * Copyright (c) 2009, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 * 
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.impl;

import java.lang.reflect.Type;

import java.util.Collection;

import org.eclipse.b3.backend.evaluator.b3backend.B3WildcardType;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>B3 Wildcard Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3WildcardTypeImpl#getLowerBoundsList <em>Lower Bounds List</em>}</li>
 *   <li>{@link org.eclipse.b3.backend.evaluator.b3backend.impl.B3WildcardTypeImpl#getUpperBoundsList <em>Upper Bounds List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class B3WildcardTypeImpl extends EObjectImpl implements B3WildcardType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * The cached value of the '{@link #getLowerBoundsList() <em>Lower Bounds List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerBoundsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> lowerBoundsList;

	/**
	 * The cached value of the '{@link #getUpperBoundsList() <em>Upper Bounds List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBoundsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> upperBoundsList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected B3WildcardTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return B3backendPackage.Literals.B3_WILDCARD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getLowerBoundsList() {
		if (lowerBoundsList == null) {
			lowerBoundsList = new EObjectResolvingEList<Type>(Type.class, this, B3backendPackage.B3_WILDCARD_TYPE__LOWER_BOUNDS_LIST);
		}
		return lowerBoundsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getUpperBoundsList() {
		if (upperBoundsList == null) {
			upperBoundsList = new EObjectResolvingEList<Type>(Type.class, this, B3backendPackage.B3_WILDCARD_TYPE__UPPER_BOUNDS_LIST);
		}
		return upperBoundsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type[] getLowerBounds() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type[] getUpperBounds() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case B3backendPackage.B3_WILDCARD_TYPE__LOWER_BOUNDS_LIST:
				return getLowerBoundsList();
			case B3backendPackage.B3_WILDCARD_TYPE__UPPER_BOUNDS_LIST:
				return getUpperBoundsList();
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
			case B3backendPackage.B3_WILDCARD_TYPE__LOWER_BOUNDS_LIST:
				getLowerBoundsList().clear();
				getLowerBoundsList().addAll((Collection<? extends Type>)newValue);
				return;
			case B3backendPackage.B3_WILDCARD_TYPE__UPPER_BOUNDS_LIST:
				getUpperBoundsList().clear();
				getUpperBoundsList().addAll((Collection<? extends Type>)newValue);
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
			case B3backendPackage.B3_WILDCARD_TYPE__LOWER_BOUNDS_LIST:
				getLowerBoundsList().clear();
				return;
			case B3backendPackage.B3_WILDCARD_TYPE__UPPER_BOUNDS_LIST:
				getUpperBoundsList().clear();
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
			case B3backendPackage.B3_WILDCARD_TYPE__LOWER_BOUNDS_LIST:
				return lowerBoundsList != null && !lowerBoundsList.isEmpty();
			case B3backendPackage.B3_WILDCARD_TYPE__UPPER_BOUNDS_LIST:
				return upperBoundsList != null && !upperBoundsList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //B3WildcardTypeImpl
