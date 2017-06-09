/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.provider;


import fr.openpeople.rdal2.model.rdal.AbstractContractualElement;
import fr.openpeople.rdal2.model.rdal.RdalFactory;
import fr.openpeople.rdal2.model.rdal.RdalPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractContractualElementItemProvider
	extends TraceableToDesignElementsElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractContractualElementItemProvider(AdapterFactory adapterFactory) {
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

			addStakeholdersPropertyDescriptor(object);
			addContactInformationPropertyDescriptor(object);
			addOriginDatePropertyDescriptor(object);
			addScheduleDatePropertyDescriptor(object);
			addSourcesPropertyDescriptor(object);
			addEvolvedToPropertyDescriptor(object);
			addDroppedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Stakeholders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStakeholdersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractContractualElement_stakeholders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractContractualElement_stakeholders_feature", "_UI_AbstractContractualElement_type"),
				 RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT__STAKEHOLDERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contact Information feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContactInformationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractContractualElement_contactInformation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractContractualElement_contactInformation_feature", "_UI_AbstractContractualElement_type"),
				 RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT__CONTACT_INFORMATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origin Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractContractualElement_originDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractContractualElement_originDate_feature", "_UI_AbstractContractualElement_type"),
				 RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT__ORIGIN_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedule Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScheduleDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractContractualElement_scheduleDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractContractualElement_scheduleDate_feature", "_UI_AbstractContractualElement_type"),
				 RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT__SCHEDULE_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sources feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractContractualElement_sources_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractContractualElement_sources_feature", "_UI_AbstractContractualElement_type"),
				 RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT__SOURCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Evolved To feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvolvedToPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractContractualElement_evolvedTo_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractContractualElement_evolvedTo_feature", "_UI_AbstractContractualElement_type"),
				 RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT__EVOLVED_TO,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dropped feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDroppedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractContractualElement_dropped_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractContractualElement_dropped_feature", "_UI_AbstractContractualElement_type"),
				 RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT__DROPPED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES);
			childrenFeatures.add(RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS);
			childrenFeatures.add(RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY);
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
		String label = ((AbstractContractualElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractContractualElement_type") :
			getString("_UI_AbstractContractualElement_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractContractualElement.class)) {
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__ORIGIN_DATE:
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__SCHEDULE_DATE:
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__SOURCES:
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__DROPPED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES:
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS:
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
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
				(RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES,
				 RdalFactory.eINSTANCE.createRationale()));

		newChildDescriptors.add
			(createChildParameter
				(RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS,
				 RdalFactory.eINSTANCE.createRationale()));

		newChildDescriptors.add
			(createChildParameter
				(RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY,
				 RdalFactory.eINSTANCE.createUncertainty()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES ||
			childFeature == RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
