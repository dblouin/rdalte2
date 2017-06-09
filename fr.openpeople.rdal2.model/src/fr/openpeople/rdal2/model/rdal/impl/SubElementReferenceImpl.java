/**
 */
package fr.openpeople.rdal2.model.rdal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.RefineableElement;
import fr.openpeople.rdal2.model.rdal.SubElementReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Element Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SubElementReferenceImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SubElementReferenceImpl#getReferencedElementEntries <em>Referenced Element Entries</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SubElementReferenceImpl#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SubElementReferenceImpl extends IdentifiedElementImpl implements SubElementReference {
	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Float WEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected Float weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferencedElementEntries() <em>Referenced Element Entries</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedElementEntries()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap referencedElementEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubElementReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.SUB_ELEMENT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(Float newWeight) {
		Float oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.SUB_ELEMENT_REFERENCE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getReferencedElementEntries() {
		if (referencedElementEntries == null) {
			referencedElementEntries = new BasicFeatureMap(this, RdalPackage.SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT_ENTRIES);
		}
		return referencedElementEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefineableElement getReferencedElement() {
		RefineableElement referencedElement = basicGetReferencedElement();
		return referencedElement != null && referencedElement.eIsProxy() ? (RefineableElement)eResolveProxy((InternalEObject)referencedElement) : referencedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RefineableElement basicGetReferencedElement() {
		final EList<RefineableElement> refElements = getReferencedElementEntries().list( RdalPackage.Literals.SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT );
		
		return refElements.isEmpty() ? null : refElements.get( 0 );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT_ENTRIES:
				return ((InternalEList<?>)getReferencedElementEntries()).basicRemove(otherEnd, msgs);
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
			case RdalPackage.SUB_ELEMENT_REFERENCE__WEIGHT:
				return getWeight();
			case RdalPackage.SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT_ENTRIES:
				if (coreType) return getReferencedElementEntries();
				return ((FeatureMap.Internal)getReferencedElementEntries()).getWrapper();
			case RdalPackage.SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT:
				if (resolve) return getReferencedElement();
				return basicGetReferencedElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RdalPackage.SUB_ELEMENT_REFERENCE__WEIGHT:
				setWeight((Float)newValue);
				return;
			case RdalPackage.SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT_ENTRIES:
				((FeatureMap.Internal)getReferencedElementEntries()).set(newValue);
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
			case RdalPackage.SUB_ELEMENT_REFERENCE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case RdalPackage.SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT_ENTRIES:
				getReferencedElementEntries().clear();
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
			case RdalPackage.SUB_ELEMENT_REFERENCE__WEIGHT:
				return WEIGHT_EDEFAULT == null ? weight != null : !WEIGHT_EDEFAULT.equals(weight);
			case RdalPackage.SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT_ENTRIES:
				return referencedElementEntries != null && !referencedElementEntries.isEmpty();
			case RdalPackage.SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT:
				return basicGetReferencedElement() != null;
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
		result.append(" (weight: ");
		result.append(weight);
		result.append(", referencedElementEntries: ");
		result.append(referencedElementEntries);
		result.append(')');
		return result.toString();
	}

} //SubElementReferenceImpl
