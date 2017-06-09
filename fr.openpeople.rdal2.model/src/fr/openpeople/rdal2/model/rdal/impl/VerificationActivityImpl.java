/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import fr.labsticc.framework.settings.model.settings.Category;
import fr.openpeople.rdal2.model.rdal.AbstractRequirement;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.VerificationActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.VerificationActivityImpl#getExternalRefs <em>External Refs</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.VerificationActivityImpl#isPassed <em>Passed</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.VerificationActivityImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.VerificationActivityImpl#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerificationActivityImpl extends IdentifiedElementImpl implements VerificationActivity {
	/**
	 * The cached value of the '{@link #getExternalRefs() <em>External Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> externalRefs;

	/**
	 * The default value of the '{@link #isPassed() <em>Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PASSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPassed() <em>Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPassed()
	 * @generated
	 * @ordered
	 */
	protected boolean passed = PASSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected Category category;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerificationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.VERIFICATION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (Category)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdalPackage.VERIFICATION_ACTIVITY__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(Category newCategory) {
		Category oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.VERIFICATION_ACTIVITY__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getExternalRefs() {
		if (externalRefs == null) {
			externalRefs = new EObjectResolvingEList<EObject>(EObject.class, this, RdalPackage.VERIFICATION_ACTIVITY__EXTERNAL_REFS);
		}
		return externalRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPassed() {
		return passed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassed(boolean newPassed) {
		boolean oldPassed = passed;
		passed = newPassed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.VERIFICATION_ACTIVITY__PASSED, oldPassed, passed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRequirement getRequirements() {
		if (eContainerFeatureID() != RdalPackage.VERIFICATION_ACTIVITY__REQUIREMENTS) return null;
		return (AbstractRequirement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirements(AbstractRequirement newRequirements, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRequirements, RdalPackage.VERIFICATION_ACTIVITY__REQUIREMENTS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirements(AbstractRequirement newRequirements) {
		if (newRequirements != eInternalContainer() || (eContainerFeatureID() != RdalPackage.VERIFICATION_ACTIVITY__REQUIREMENTS && newRequirements != null)) {
			if (EcoreUtil.isAncestor(this, newRequirements))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRequirements != null)
				msgs = ((InternalEObject)newRequirements).eInverseAdd(this, RdalPackage.ABSTRACT_REQUIREMENT__OWNED_VERIFIED_BY, AbstractRequirement.class, msgs);
			msgs = basicSetRequirements(newRequirements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.VERIFICATION_ACTIVITY__REQUIREMENTS, newRequirements, newRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.VERIFICATION_ACTIVITY__REQUIREMENTS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRequirements((AbstractRequirement)otherEnd, msgs);
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
			case RdalPackage.VERIFICATION_ACTIVITY__REQUIREMENTS:
				return basicSetRequirements(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RdalPackage.VERIFICATION_ACTIVITY__REQUIREMENTS:
				return eInternalContainer().eInverseRemove(this, RdalPackage.ABSTRACT_REQUIREMENT__OWNED_VERIFIED_BY, AbstractRequirement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdalPackage.VERIFICATION_ACTIVITY__EXTERNAL_REFS:
				return getExternalRefs();
			case RdalPackage.VERIFICATION_ACTIVITY__PASSED:
				return isPassed();
			case RdalPackage.VERIFICATION_ACTIVITY__REQUIREMENTS:
				return getRequirements();
			case RdalPackage.VERIFICATION_ACTIVITY__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
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
			case RdalPackage.VERIFICATION_ACTIVITY__EXTERNAL_REFS:
				getExternalRefs().clear();
				getExternalRefs().addAll((Collection<? extends EObject>)newValue);
				return;
			case RdalPackage.VERIFICATION_ACTIVITY__PASSED:
				setPassed((Boolean)newValue);
				return;
			case RdalPackage.VERIFICATION_ACTIVITY__REQUIREMENTS:
				setRequirements((AbstractRequirement)newValue);
				return;
			case RdalPackage.VERIFICATION_ACTIVITY__CATEGORY:
				setCategory((Category)newValue);
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
			case RdalPackage.VERIFICATION_ACTIVITY__EXTERNAL_REFS:
				getExternalRefs().clear();
				return;
			case RdalPackage.VERIFICATION_ACTIVITY__PASSED:
				setPassed(PASSED_EDEFAULT);
				return;
			case RdalPackage.VERIFICATION_ACTIVITY__REQUIREMENTS:
				setRequirements((AbstractRequirement)null);
				return;
			case RdalPackage.VERIFICATION_ACTIVITY__CATEGORY:
				setCategory((Category)null);
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
			case RdalPackage.VERIFICATION_ACTIVITY__EXTERNAL_REFS:
				return externalRefs != null && !externalRefs.isEmpty();
			case RdalPackage.VERIFICATION_ACTIVITY__PASSED:
				return passed != PASSED_EDEFAULT;
			case RdalPackage.VERIFICATION_ACTIVITY__REQUIREMENTS:
				return getRequirements() != null;
			case RdalPackage.VERIFICATION_ACTIVITY__CATEGORY:
				return category != null;
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
		result.append(" (passed: ");
		result.append(passed);
		result.append(')');
		return result.toString();
	}

} //VerificationActivityImpl
