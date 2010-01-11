/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.NamePredicate#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.NamePredicate#getNamePattern <em>Name Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getNamePredicate()
 * @model
 * @generated
 */
public interface NamePredicate extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getNamePredicate_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.NamePredicate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Name Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Pattern</em>' containment reference.
	 * @see #setNamePattern(BExpression)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getNamePredicate_NamePattern()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getNamePattern();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.NamePredicate#getNamePattern <em>Name Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Pattern</em>' containment reference.
	 * @see #getNamePattern()
	 * @generated
	 */
	void setNamePattern(BExpression value);

} // NamePredicate
