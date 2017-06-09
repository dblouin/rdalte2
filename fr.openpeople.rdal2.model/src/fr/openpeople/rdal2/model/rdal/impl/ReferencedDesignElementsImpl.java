/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import fr.openpeople.rdal2.model.rdal.AggregationType;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.openpeople.rdal2.model.rdal.DesignElementReference;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.ReferencedDesignElements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenced Design Elements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.ReferencedDesignElementsImpl#getOwnedDesignElementRefs <em>Owned Design Element Refs</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.ReferencedDesignElementsImpl#getAgregationType <em>Agregation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReferencedDesignElementsImpl extends IdentifiedElementImpl implements ReferencedDesignElements {
	/**
	 * The cached value of the '{@link #getOwnedDesignElementRefs() <em>Owned Design Element Refs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDesignElementRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignElementReference> ownedDesignElementRefs;

	/**
	 * The default value of the '{@link #getAgregationType() <em>Agregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgregationType()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationType AGREGATION_TYPE_EDEFAULT = AggregationType.COMPOSITION;
	/**
	 * The cached value of the '{@link #getAgregationType() <em>Agregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgregationType()
	 * @generated
	 * @ordered
	 */
	protected AggregationType agregationType = AGREGATION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencedDesignElementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.REFERENCED_DESIGN_ELEMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignElementReference> getOwnedDesignElementRefs() {
		if (ownedDesignElementRefs == null) {
			ownedDesignElementRefs = new EObjectContainmentWithInverseEList<DesignElementReference>(DesignElementReference.class, this, RdalPackage.REFERENCED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS, RdalPackage.DESIGN_ELEMENT_REFERENCE__PARENT);
		}
		return ownedDesignElementRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationType getAgregationType() {
		return agregationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgregationType(AggregationType newAgregationType) {
		AggregationType oldAgregationType = agregationType;
		agregationType = newAgregationType == null ? AGREGATION_TYPE_EDEFAULT : newAgregationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.REFERENCED_DESIGN_ELEMENTS__AGREGATION_TYPE, oldAgregationType, agregationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.REFERENCED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedDesignElementRefs()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.REFERENCED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS:
				return ((InternalEList<?>)getOwnedDesignElementRefs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdalPackage.REFERENCED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS:
				return getOwnedDesignElementRefs();
			case RdalPackage.REFERENCED_DESIGN_ELEMENTS__AGREGATION_TYPE:
				return getAgregationType();
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
			case RdalPackage.REFERENCED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS:
				getOwnedDesignElementRefs().clear();
				getOwnedDesignElementRefs().addAll((Collection<? extends DesignElementReference>)newValue);
				return;
			case RdalPackage.REFERENCED_DESIGN_ELEMENTS__AGREGATION_TYPE:
				setAgregationType((AggregationType)newValue);
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
			case RdalPackage.REFERENCED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS:
				getOwnedDesignElementRefs().clear();
				return;
			case RdalPackage.REFERENCED_DESIGN_ELEMENTS__AGREGATION_TYPE:
				setAgregationType(AGREGATION_TYPE_EDEFAULT);
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
			case RdalPackage.REFERENCED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS:
				return ownedDesignElementRefs != null && !ownedDesignElementRefs.isEmpty();
			case RdalPackage.REFERENCED_DESIGN_ELEMENTS__AGREGATION_TYPE:
				return agregationType != AGREGATION_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (agregationType: ");
		result.append(agregationType);
		result.append(')');
		return result.toString();
	}

} //ReferencedDesignElementsImpl
