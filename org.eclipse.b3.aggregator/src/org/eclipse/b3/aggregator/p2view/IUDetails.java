/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.p2view;

import org.eclipse.emf.common.util.EList;
import org.eclipse.equinox.p2.metadata.ICopyright;
import org.eclipse.equinox.p2.metadata.ILicense;
import org.eclipse.equinox.p2.metadata.IUpdateDescriptor;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>IU Details</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.p2view.IUDetails#getRequirementsContainer <em>Requirements Container</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.IUDetails#getProvidedCapabilitiesContainer <em>Provided Capabilities
 * Container</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.IUDetails#getPropertiesContainer <em>Properties Container</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.IUDetails#getTouchpointsContainer <em>Touchpoints Container</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.IUDetails#getUpdateDescriptor <em>Update Descriptor</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.IUDetails#getCopyright <em>Copyright</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.p2view.IUDetails#getLicenses <em>Licenses</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getIUDetails()
 * @model
 * @generated
 */
public interface IUDetails {
	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Copyright</em>' reference.
	 * @see #setCopyright(ICopyright)
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getIUDetails_Copyright()
	 * @model type="org.eclipse.b3.aggregator.p2.ICopyright" resolveProxies="false"
	 * @generated
	 */
	ICopyright getCopyright();

	/**
	 * Returns the value of the '<em><b>Licenses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.equinox.p2.metadata.ILicense}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Licenses</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Licenses</em>' reference list.
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getIUDetails_Licenses()
	 * @model type="org.eclipse.b3.aggregator.p2.ILicense" resolveProxies="false"
	 * @generated
	 */
	EList<ILicense> getLicenses();

	/**
	 * Returns the value of the '<em><b>Properties Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties Container</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Properties Container</em>' reference.
	 * @see #setPropertiesContainer(Properties)
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getIUDetails_PropertiesContainer()
	 * @model resolveProxies="false"
	 * @generated
	 */
	Properties getPropertiesContainer();

	/**
	 * Returns the value of the '<em><b>Provided Capabilities Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provided Capabilities Container</em>' reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Provided Capabilities Container</em>' reference.
	 * @see #setProvidedCapabilitiesContainer(ProvidedCapabilities)
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getIUDetails_ProvidedCapabilitiesContainer()
	 * @model resolveProxies="false"
	 * @generated
	 */
	ProvidedCapabilities getProvidedCapabilitiesContainer();

	/**
	 * Returns the value of the '<em><b>Requirements Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements Container</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Requirements Container</em>' reference.
	 * @see #setRequirementsContainer(Requirements)
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getIUDetails_RequirementsContainer()
	 * @model resolveProxies="false"
	 * @generated
	 */
	Requirements getRequirementsContainer();

	/**
	 * Returns the value of the '<em><b>Touchpoints Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Touchpoints Container</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Touchpoints Container</em>' reference.
	 * @see #setTouchpointsContainer(Touchpoints)
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getIUDetails_TouchpointsContainer()
	 * @model resolveProxies="false"
	 * @generated
	 */
	Touchpoints getTouchpointsContainer();

	/**
	 * Returns the value of the '<em><b>Update Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Descriptor</em>' reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Update Descriptor</em>' reference.
	 * @see #setUpdateDescriptor(IUpdateDescriptor)
	 * @see org.eclipse.b3.aggregator.p2view.P2viewPackage#getIUDetails_UpdateDescriptor()
	 * @model type="org.eclipse.b3.aggregator.p2.IUpdateDescriptor" resolveProxies="false"
	 * @generated
	 */
	IUpdateDescriptor getUpdateDescriptor();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.p2view.IUDetails#getCopyright <em>Copyright</em>}'
	 * reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Copyright</em>' reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(ICopyright value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.p2view.IUDetails#getPropertiesContainer
	 * <em>Properties Container</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Properties Container</em>' reference.
	 * @see #getPropertiesContainer()
	 * @generated
	 */
	void setPropertiesContainer(Properties value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.p2view.IUDetails#getProvidedCapabilitiesContainer
	 * <em>Provided Capabilities Container</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Provided Capabilities Container</em>' reference.
	 * @see #getProvidedCapabilitiesContainer()
	 * @generated
	 */
	void setProvidedCapabilitiesContainer(ProvidedCapabilities value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.p2view.IUDetails#getRequirementsContainer
	 * <em>Requirements Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Requirements Container</em>' reference.
	 * @see #getRequirementsContainer()
	 * @generated
	 */
	void setRequirementsContainer(Requirements value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.p2view.IUDetails#getTouchpointsContainer
	 * <em>Touchpoints Container</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Touchpoints Container</em>' reference.
	 * @see #getTouchpointsContainer()
	 * @generated
	 */
	void setTouchpointsContainer(Touchpoints value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.aggregator.p2view.IUDetails#getUpdateDescriptor
	 * <em>Update Descriptor</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Update Descriptor</em>' reference.
	 * @see #getUpdateDescriptor()
	 * @generated
	 */
	void setUpdateDescriptor(IUpdateDescriptor value);

} // IUDetails
