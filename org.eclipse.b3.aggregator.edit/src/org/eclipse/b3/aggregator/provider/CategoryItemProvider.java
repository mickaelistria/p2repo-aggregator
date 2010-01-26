/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.aggregator.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.b3.aggregator.AggregatorPackage;
import org.eclipse.b3.aggregator.Category;
import org.eclipse.b3.aggregator.InstallableUnitReference;
import org.eclipse.b3.aggregator.InstallableUnitType;
import org.eclipse.b3.aggregator.MappedRepository;
import org.eclipse.b3.aggregator.p2.InstallableUnit;
import org.eclipse.b3.aggregator.util.InstallableUnitUtils;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.equinox.internal.provisional.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.internal.provisional.p2.metadata.query.MatchQuery;
import org.eclipse.equinox.internal.provisional.p2.metadata.query.Query;

/**
 * This is the item provider adapter for a {@link org.eclipse.b3.aggregator.Category} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class CategoryItemProvider extends MappedUnitItemProvider implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
		IItemColorProvider, IItemFontProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CategoryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns Category.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage(
				"full/obj16/Category" + (!((Category) object).isBranchDisabledOrMappedRepositoryBroken()
						? ""
						: "Disabled")));
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if(itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLabelOverridePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		Category category = (Category) object;
		InstallableUnit iu = category.getInstallableUnit();
		StringBuilder bld = new StringBuilder();
		bld.append(getString("_UI_Category_type"));
		bld.append(' ');
		if(iu != null) {
			String label = iu.getProperty(IInstallableUnit.PROP_NAME);
			if(label == null)
				label = iu.getId();
			bld.append(label);
			if(!category.isEnabled())
				bld.append(" - disabled");
		}
		else
			bld.append("not mapped");
		return bld.toString();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
	 * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch(notification.getFeatureID(Category.class)) {
		case AggregatorPackage.CATEGORY__LABEL_OVERRIDE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds a property descriptor for the Label Override feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addLabelOverridePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Category_labelOverride_feature"), getString("_UI_PropertyDescriptor_description",
						"_UI_Category_labelOverride_feature", "_UI_Category_type"),
				AggregatorPackage.Literals.CATEGORY__LABEL_OVERRIDE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	@Override
	protected List<? extends InstallableUnitReference> getContainerChildren(MappedRepository container) {
		return container.getCategories();
	}

	@Override
	protected Query getInstallableUnitQuery() {
		return new MatchQuery() {
			@Override
			public boolean isMatch(Object candidate) {
				return InstallableUnitUtils.getType((InstallableUnit) candidate) == InstallableUnitType.CATEGORY;
			}
		};
	}
}