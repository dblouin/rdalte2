/**
 */
package fr.openpeople.rdal2.model.rdal.impl;

import fr.labsticc.framework.constraints.model.constraints.Expression;

import fr.labsticc.framework.settings.model.settings.Category;

import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.TextualContractualElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textual Contractual Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.TextualContractualElementImpl#getOwnedExpression <em>Owned Expression</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.TextualContractualElementImpl#getOwnedCondition <em>Owned Condition</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.TextualContractualElementImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.TextualContractualElementImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.TextualContractualElementImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TextualContractualElementImpl extends AbstractContractualElementImpl implements TextualContractualElement {
	/**
	 * The cached value of the '{@link #getOwnedExpression() <em>Owned Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression ownedExpression;

	/**
	 * The cached value of the '{@link #getOwnedCondition() <em>Owned Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression ownedCondition;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<TextualContractualElement> derivedFrom;

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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final Float PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected Float priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextualContractualElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.TEXTUAL_CONTRACTUAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOwnedExpression() {
		return ownedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedExpression(Expression newOwnedExpression, NotificationChain msgs) {
		Expression oldOwnedExpression = ownedExpression;
		ownedExpression = newOwnedExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION, oldOwnedExpression, newOwnedExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedExpression(Expression newOwnedExpression) {
		if (newOwnedExpression != ownedExpression) {
			NotificationChain msgs = null;
			if (ownedExpression != null)
				msgs = ((InternalEObject)ownedExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION, null, msgs);
			if (newOwnedExpression != null)
				msgs = ((InternalEObject)newOwnedExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION, null, msgs);
			msgs = basicSetOwnedExpression(newOwnedExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION, newOwnedExpression, newOwnedExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getOwnedCondition() {
		return ownedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedCondition(Expression newOwnedCondition, NotificationChain msgs) {
		Expression oldOwnedCondition = ownedCondition;
		ownedCondition = newOwnedCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION, oldOwnedCondition, newOwnedCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedCondition(Expression newOwnedCondition) {
		if (newOwnedCondition != ownedCondition) {
			NotificationChain msgs = null;
			if (ownedCondition != null)
				msgs = ((InternalEObject)ownedCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION, null, msgs);
			if (newOwnedCondition != null)
				msgs = ((InternalEObject)newOwnedCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION, null, msgs);
			msgs = basicSetOwnedCondition(newOwnedCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION, newOwnedCondition, newOwnedCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextualContractualElement> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectResolvingEList<TextualContractualElement>(TextualContractualElement.class, this, RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__DERIVED_FROM);
		}
		return derivedFrom;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__CATEGORY, oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(Float newPriority) {
		Float oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION:
				return basicSetOwnedExpression(null, msgs);
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION:
				return basicSetOwnedCondition(null, msgs);
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
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION:
				return getOwnedExpression();
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION:
				return getOwnedCondition();
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__DERIVED_FROM:
				return getDerivedFrom();
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__PRIORITY:
				return getPriority();
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
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION:
				setOwnedExpression((Expression)newValue);
				return;
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION:
				setOwnedCondition((Expression)newValue);
				return;
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends TextualContractualElement>)newValue);
				return;
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__CATEGORY:
				setCategory((Category)newValue);
				return;
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__PRIORITY:
				setPriority((Float)newValue);
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
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION:
				setOwnedExpression((Expression)null);
				return;
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION:
				setOwnedCondition((Expression)null);
				return;
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__CATEGORY:
				setCategory((Category)null);
				return;
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION:
				return ownedExpression != null;
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION:
				return ownedCondition != null;
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__CATEGORY:
				return category != null;
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //TextualContractualElementImpl
