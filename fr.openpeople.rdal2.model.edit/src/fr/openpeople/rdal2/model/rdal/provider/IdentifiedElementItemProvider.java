/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.slf4j.LoggerFactory;

import fr.labsticc.framework.core.exception.IExceptionHandler;
import fr.labsticc.framework.core.exception.ResourceAccessException;
import fr.labsticc.framework.ide.log.DialogExceptionHandler;
import fr.labsticc.framework.settings.ide.SettingsPlugin;
import fr.labsticc.framework.settings.service.ISettingsServiceDelegate;
import fr.openpeople.rdal2.model.rdal.IdentifiedElement;
import fr.openpeople.rdal2.model.rdal.RdalFactory;
import fr.openpeople.rdal2.model.rdal.RdalPackage;

/**
 * This is the item provider adapter for a {@link fr.openpeople.rdal2.model.rdal.IdentifiedElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentifiedElementItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	
	private final ISettingsServiceDelegate settingsDelegate;
	
	private final IExceptionHandler exceptionHandler;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IdentifiedElementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
    	
    	try {
			settingsDelegate = SettingsPlugin.getDefault().getSettingsDelegate();
			exceptionHandler = new DialogExceptionHandler( LoggerFactory.getLogger( getClass() ) );
		} 
    	catch ( final ResourceAccessException p_ex ) {
    		throw new RuntimeException( p_ex );
		}
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

			addNamePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IdentifiedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IdentifiedElement_name_feature", "_UI_IdentifiedElement_type"),
				 RdalPackage.Literals.IDENTIFIED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IdentifiedElement_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IdentifiedElement_id_feature", "_UI_IdentifiedElement_type"),
				 RdalPackage.Literals.IDENTIFIED_ELEMENT__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IdentifiedElement_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IdentifiedElement_description_feature", "_UI_IdentifiedElement_type"),
				 RdalPackage.Literals.IDENTIFIED_ELEMENT__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RdalPackage.Literals.IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((IdentifiedElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_IdentifiedElement_type") :
			getString("_UI_IdentifiedElement_type") + " " + label;
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

		switch (notification.getFeatureID(IdentifiedElement.class)) {
			case RdalPackage.IDENTIFIED_ELEMENT__NAME:
			case RdalPackage.IDENTIFIED_ELEMENT__ID:
			case RdalPackage.IDENTIFIED_ELEMENT__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RdalPackage.IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
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

		newChildDescriptors.add
			(createChildParameter
				(RdalPackage.Literals.IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES,
				 RdalFactory.eINSTANCE.createUserProperty()));
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

	/* Redefine this method to take into account the settings model when the type of the feature is EObject indicating
	 * it may be à RDAL traceability point. 
	 * (non-Javadoc)
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#createItemPropertyDescriptor(org.eclipse.emf.common.notify.AdapterFactory, org.eclipse.emf.common.util.ResourceLocator, java.lang.String, java.lang.String, org.eclipse.emf.ecore.EStructuralFeature, boolean, boolean, boolean, java.lang.Object, java.lang.String, java.lang.String[])
	 */
	@Override
	protected ItemPropertyDescriptor createItemPropertyDescriptor(	final AdapterFactory p_adapterFactory,
																	final ResourceLocator p_resourceLocator,
																	final String p_displayName,
																	final String p_description,
																	final EStructuralFeature p_feature,
																	final boolean pb_isSettable,
																	final boolean pb_multiLine,
																	final boolean pb_sortChoices,
																	final Object p_staticImage,
																	final String p_category,
																	final String[] p_filterFlags ) {
		if ( settingsDelegate.hasDefinedSettings( SettingsPlugin.getDefault().getSpecification(), p_feature ) ) {
			return new SettingsRefPropertyDescriptor( 	settingsDelegate,
														p_adapterFactory,
														p_resourceLocator,
														exceptionHandler,
														p_displayName,
														p_description,
														p_feature,
														pb_isSettable,
														pb_multiLine,
														pb_sortChoices,
														p_staticImage,
														p_category,
														p_filterFlags );

		}
		
		return super.createItemPropertyDescriptor( 	p_adapterFactory,
													p_resourceLocator,
													p_displayName,
													p_description,
													p_feature,
													pb_isSettable,
													pb_multiLine,
													pb_sortChoices,
													p_staticImage,
													p_category,
													p_filterFlags );
	}
}
