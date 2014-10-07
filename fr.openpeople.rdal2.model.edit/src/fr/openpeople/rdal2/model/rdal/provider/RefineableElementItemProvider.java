/**
 */
package fr.openpeople.rdal2.model.rdal.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

/**
 * This is the item provider adapter for a {@link fr.openpeople.rdal2.model.rdal.RefineableElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RefineableElementItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
//	
//	private final ISettingsServiceDelegate settingsDelegate;
//	
//	private final IExceptionHandler exceptionHandler;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefineableElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_RefineableElement_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Rdal2EditPlugin.INSTANCE;
	}
//
//	@Override
//	protected ItemPropertyDescriptor createItemPropertyDescriptor(	final AdapterFactory p_adapterFactory,
//																	final ResourceLocator p_resourceLocator,
//																	final String p_displayName,
//																	final String p_description,
//																	final EStructuralFeature p_feature,
//																	final boolean pb_isSettable,
//																	final boolean pb_multiLine,
//																	final boolean pb_sortChoices,
//																	final Object p_staticImage,
//																	final String p_category,
//																	final String[] p_filterFlags ) {
//		if ( settingsDelegate.hasDefinedSettings( SettingsPlugin.getDefault().getSpecification(), p_feature ) ) {
//			return new SettingsRefPropertyDescriptor( 	settingsDelegate,
//														p_adapterFactory,
//														p_resourceLocator,
//														exceptionHandler,
//														p_displayName,
//														p_description,
//														p_feature,
//														pb_isSettable,
//														pb_multiLine,
//														pb_sortChoices,
//														p_staticImage,
//														p_category,
//														p_filterFlags );
//
//		}
//		
//		return super.createItemPropertyDescriptor( 	p_adapterFactory,
//													p_resourceLocator,
//													p_displayName,
//													p_description,
//													p_feature,
//													pb_isSettable,
//													pb_multiLine,
//													pb_sortChoices,
//													p_staticImage,
//													p_category,
//													p_filterFlags );
//	}
}
