/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.Configuration;
import org.eclipse.b3.aggregator.EnabledStatusProvider;
import org.eclipse.b3.aggregator.MappedUnit;
import org.eclipse.buckminster.osgi.filter.Filter;
import org.eclipse.buckminster.osgi.filter.FilterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.equinox.internal.p2.metadata.IRequiredCapability;
import org.eclipse.equinox.internal.provisional.p2.metadata.MetadataFactory;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.osgi.framework.InvalidSyntaxException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Mapped Unit</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.b3.aggregator.impl.MappedUnitImpl#isEnabled <em>Enabled</em>}</li>
 * <li>{@link org.eclipse.b3.aggregator.impl.MappedUnitImpl#getValidConfigurations <em>Valid Configurations</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public abstract class MappedUnitImpl extends InstallableUnitRequestImpl implements MappedUnit {
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;

	/**
	 * The flag representing the value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final int ENABLED_EFLAG = 1 << 0;

	private static Filter createFilter(List<Configuration> configs) {
		List<Configuration> enabledConfigs = getEnabledConfigs(configs);

		if(!(enabledConfigs == null || enabledConfigs.isEmpty())) {
			StringBuilder filterBld = new StringBuilder();
			if(enabledConfigs.size() > 1)
				filterBld.append("(|");

			for(Configuration config : enabledConfigs) {
				filterBld.append("(&(osgi.os=");
				filterBld.append(config.getOperatingSystem().getLiteral());
				filterBld.append(")(osgi.ws=");
				filterBld.append(config.getWindowSystem().getLiteral());
				filterBld.append(")(osgi.arch=");
				filterBld.append(config.getArchitecture().getLiteral());
				filterBld.append("))");
			}
			if(enabledConfigs.size() > 1)
				filterBld.append(')');
			try {
				return FilterFactory.newInstance(filterBld.toString());
			}
			catch(InvalidSyntaxException e) {
				throw new RuntimeException(e);
			}
		}
		return null;
	}

	private static List<Configuration> getEnabledConfigs(List<Configuration> configs) {
		List<Configuration> enabledConfigs = new ArrayList<Configuration>();

		for(Configuration config : configs)
			if(config.isEnabled())
				enabledConfigs.add(config);

		return enabledConfigs;
	}

	/**
	 * The cached value of the '{@link #getValidConfigurations() <em>Valid Configurations</em>}' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValidConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> validConfigurations;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MappedUnitImpl() {
		super();
		eFlags |= ENABLED_EFLAG;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if(baseClass == EnabledStatusProvider.class) {
			switch(derivedFeatureID) {
			case AggregatorPackage.MAPPED_UNIT__ENABLED:
				return AggregatorPackage.ENABLED_STATUS_PROVIDER__ENABLED;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if(baseClass == EnabledStatusProvider.class) {
			switch(baseFeatureID) {
			case AggregatorPackage.ENABLED_STATUS_PROVIDER__ENABLED:
				return AggregatorPackage.MAPPED_UNIT__ENABLED;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch(featureID) {
		case AggregatorPackage.MAPPED_UNIT__ENABLED:
			return isEnabled();
		case AggregatorPackage.MAPPED_UNIT__VALID_CONFIGURATIONS:
			return getValidConfigurations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch(featureID) {
		case AggregatorPackage.MAPPED_UNIT__ENABLED:
			return ((eFlags & ENABLED_EFLAG) != 0) != ENABLED_EDEFAULT;
		case AggregatorPackage.MAPPED_UNIT__VALID_CONFIGURATIONS:
			return validConfigurations != null && !validConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch(featureID) {
		case AggregatorPackage.MAPPED_UNIT__ENABLED:
			setEnabled((Boolean) newValue);
			return;
		case AggregatorPackage.MAPPED_UNIT__VALID_CONFIGURATIONS:
			getValidConfigurations().clear();
			getValidConfigurations().addAll((Collection<? extends Configuration>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch(featureID) {
		case AggregatorPackage.MAPPED_UNIT__ENABLED:
			setEnabled(ENABLED_EDEFAULT);
			return;
		case AggregatorPackage.MAPPED_UNIT__VALID_CONFIGURATIONS:
			getValidConfigurations().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public IRequiredCapability getRequiredCapability() {
		// TODO Cache calculated value
		Filter filter = createFilter(getValidConfigurations());
		return MetadataFactory.createRequiredCapability(IInstallableUnit.NAMESPACE_IU_ID, getName(), getVersionRange(),
				filter, false, false);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Configuration> getValidConfigurations() {
		if(validConfigurations == null) {
			validConfigurations = new EObjectResolvingEList<Configuration>(Configuration.class, this,
					AggregatorPackage.MAPPED_UNIT__VALID_CONFIGURATIONS);
		}
		return validConfigurations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isEnabled() {
		return (eFlags & ENABLED_EFLAG) != 0;
	}

	@Override
	public boolean isMappedRepositoryBroken() {
		return isBranchEnabled()
				? super.isMappedRepositoryBroken()
				: false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = (eFlags & ENABLED_EFLAG) != 0;
		if(newEnabled)
			eFlags |= ENABLED_EFLAG;
		else
			eFlags &= ~ENABLED_EFLAG;
		if(eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AggregatorPackage.MAPPED_UNIT__ENABLED, oldEnabled,
					newEnabled));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if(eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (enabled: ");
		result.append((eFlags & ENABLED_EFLAG) != 0);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AggregatorPackage.Literals.MAPPED_UNIT;
	}

} // MappedUnitImpl
