/**
 */
package fr.openpeople.rdal2.model.rdal.provider;


import fr.labsticc.framework.constraints.model.constraints.ConstraintsFactory;

import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.TextualContractualElement;

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
 * This is the item provider adapter for a {@link fr.openpeople.rdal2.model.rdal.TextualContractualElement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TextualContractualElementItemProvider
	extends AbstractContractualElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextualContractualElementItemProvider(AdapterFactory adapterFactory) {
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

			addDerivedFromPropertyDescriptor(object);
			addCategoryPropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Derived From feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivedFromPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextualContractualElement_derivedFrom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextualContractualElement_derivedFrom_feature", "_UI_TextualContractualElement_type"),
				 RdalPackage.Literals.TEXTUAL_CONTRACTUAL_ELEMENT__DERIVED_FROM,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextualContractualElement_category_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextualContractualElement_category_feature", "_UI_TextualContractualElement_type"),
				 RdalPackage.Literals.TEXTUAL_CONTRACTUAL_ELEMENT__CATEGORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TextualContractualElement_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TextualContractualElement_priority_feature", "_UI_TextualContractualElement_type"),
				 RdalPackage.Literals.TEXTUAL_CONTRACTUAL_ELEMENT__PRIORITY,
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
			childrenFeatures.add(RdalPackage.Literals.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION);
			childrenFeatures.add(RdalPackage.Literals.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION);
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
		String label = ((TextualContractualElement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TextualContractualElement_type") :
			getString("_UI_TextualContractualElement_type") + " " + label;
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

		switch (notification.getFeatureID(TextualContractualElement.class)) {
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__PRIORITY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION:
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION:
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
				(RdalPackage.Literals.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION,
				 ConstraintsFactory.eINSTANCE.createNaturalLanguageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RdalPackage.Literals.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION,
				 ConstraintsFactory.eINSTANCE.createFormalLanguageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RdalPackage.Literals.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION,
				 ConstraintsFactory.eINSTANCE.createNaturalLanguageExpression()));

		newChildDescriptors.add
			(createChildParameter
				(RdalPackage.Literals.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION,
				 ConstraintsFactory.eINSTANCE.createFormalLanguageExpression()));
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
			childFeature == RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS ||
			childFeature == RdalPackage.Literals.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION ||
			childFeature == RdalPackage.Literals.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
