/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.provider;


import fr.openpeople.rdal2.model.rdal.RdalFactory;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.Specification;

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
 * This is the item provider adapter for a {@link fr.openpeople.rdal2.model.rdal.Specification} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecificationItemProvider
	extends AbstractContractualElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationItemProvider(AdapterFactory adapterFactory) {
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

			addVerifiedPropertyDescriptor(object);
			addSatisfactionLevelPropertyDescriptor(object);
			addConstraintLanguagesSpecPropertyDescriptor(object);
			addPrimaryActorsPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Verified feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerifiedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VerifiableElement_verified_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerifiableElement_verified_feature", "_UI_VerifiableElement_type"),
				 RdalPackage.Literals.VERIFIABLE_ELEMENT__VERIFIED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Satisfaction Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSatisfactionLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SatisfiableElement_satisfactionLevel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SatisfiableElement_satisfactionLevel_feature", "_UI_SatisfiableElement_type"),
				 RdalPackage.Literals.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Constraint Languages Spec feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstraintLanguagesSpecPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Specification_constraintLanguagesSpec_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Specification_constraintLanguagesSpec_feature", "_UI_Specification_type"),
				 RdalPackage.Literals.SPECIFICATION__CONSTRAINT_LANGUAGES_SPEC,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Primary Actors feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrimaryActorsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Specification_primaryActors_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Specification_primaryActors_feature", "_UI_Specification_type"),
				 RdalPackage.Literals.SPECIFICATION__PRIMARY_ACTORS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Specification_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Specification_version_feature", "_UI_Specification_type"),
				 RdalPackage.Literals.SPECIFICATION__VERSION,
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
			childrenFeatures.add(RdalPackage.Literals.SPECIFICATION__OWNED_PACKAGES);
			childrenFeatures.add(RdalPackage.Literals.SPECIFICATION__OWNED_CONTACT_INFORMATION);
			childrenFeatures.add(RdalPackage.Literals.SPECIFICATION__OWNED_CONFLICTS);
			childrenFeatures.add(RdalPackage.Literals.SPECIFICATION__OWNED_SYST_OVERVIEW);
			childrenFeatures.add(RdalPackage.Literals.SPECIFICATION__OWNED_ACTOR_REFERENCES);
			childrenFeatures.add(RdalPackage.Literals.SPECIFICATION__OWNED_NON_FUNC_PROPERTIES);
			childrenFeatures.add(RdalPackage.Literals.SPECIFICATION__OWNED_STAKEHOLDERS);
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
	 * This returns Specification.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Specification"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Specification)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Specification_type") :
			getString("_UI_Specification_type") + " " + label;
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

		switch (notification.getFeatureID(Specification.class)) {
			case RdalPackage.SPECIFICATION__VERIFIED:
			case RdalPackage.SPECIFICATION__SATISFACTION_LEVEL:
			case RdalPackage.SPECIFICATION__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RdalPackage.SPECIFICATION__OWNED_PACKAGES:
			case RdalPackage.SPECIFICATION__OWNED_CONTACT_INFORMATION:
			case RdalPackage.SPECIFICATION__OWNED_CONFLICTS:
			case RdalPackage.SPECIFICATION__OWNED_SYST_OVERVIEW:
			case RdalPackage.SPECIFICATION__OWNED_ACTOR_REFERENCES:
			case RdalPackage.SPECIFICATION__OWNED_NON_FUNC_PROPERTIES:
			case RdalPackage.SPECIFICATION__OWNED_STAKEHOLDERS:
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
				(RdalPackage.Literals.SPECIFICATION__OWNED_PACKAGES,
				 RdalFactory.eINSTANCE.createRequirementsPackage()));

		newChildDescriptors.add
			(createChildParameter
				(RdalPackage.Literals.SPECIFICATION__OWNED_PACKAGES,
				 RdalFactory.eINSTANCE.createGoalsPackage()));

		newChildDescriptors.add
			(createChildParameter
				(RdalPackage.Literals.SPECIFICATION__OWNED_CONTACT_INFORMATION,
				 RdalFactory.eINSTANCE.createContactInformation()));

		newChildDescriptors.add
			(createChildParameter
				(RdalPackage.Literals.SPECIFICATION__OWNED_CONFLICTS,
				 RdalFactory.eINSTANCE.createConflict()));

		newChildDescriptors.add
			(createChildParameter
				(RdalPackage.Literals.SPECIFICATION__OWNED_SYST_OVERVIEW,
				 RdalFactory.eINSTANCE.createSystemOverview()));

		newChildDescriptors.add
			(createChildParameter
				(RdalPackage.Literals.SPECIFICATION__OWNED_ACTOR_REFERENCES,
				 RdalFactory.eINSTANCE.createActorReference()));

		newChildDescriptors.add
			(createChildParameter
				(RdalPackage.Literals.SPECIFICATION__OWNED_NON_FUNC_PROPERTIES,
				 RdalFactory.eINSTANCE.createNonFunctionalProperty()));

		newChildDescriptors.add
			(createChildParameter
				(RdalPackage.Literals.SPECIFICATION__OWNED_STAKEHOLDERS,
				 RdalFactory.eINSTANCE.createStakeholder()));
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
