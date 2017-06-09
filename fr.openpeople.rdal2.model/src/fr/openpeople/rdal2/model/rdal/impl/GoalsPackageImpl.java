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
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.openpeople.rdal2.model.rdal.AbstractGoal;
import fr.openpeople.rdal2.model.rdal.GoalRefinement;
import fr.openpeople.rdal2.model.rdal.GoalsPackage;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.SatisfiableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goals Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.GoalsPackageImpl#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.GoalsPackageImpl#getOwnedGoals <em>Owned Goals</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.GoalsPackageImpl#getOwnedGoalRefinements <em>Owned Goal Refinements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalsPackageImpl extends RdalOrgPackageImpl implements GoalsPackage {
	/**
	 * The default value of the '{@link #getSatisfactionLevel() <em>Satisfaction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Float SATISFACTION_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSatisfactionLevel() <em>Satisfaction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionLevel()
	 * @generated
	 * @ordered
	 */
	protected Float satisfactionLevel = SATISFACTION_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalsPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.GOALS_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getSatisfactionLevel() {
		return satisfactionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfactionLevel(Float newSatisfactionLevel) {
		Float oldSatisfactionLevel = satisfactionLevel;
		satisfactionLevel = newSatisfactionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.GOALS_PACKAGE__SATISFACTION_LEVEL, oldSatisfactionLevel, satisfactionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractGoal> getOwnedGoals() {
		return getContractualElementEntries().list(RdalPackage.Literals.GOALS_PACKAGE__OWNED_GOALS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GoalRefinement> getOwnedGoalRefinements() {
		return getRefinementEntries().list(RdalPackage.Literals.GOALS_PACKAGE__OWNED_GOAL_REFINEMENTS);
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
			case RdalPackage.GOALS_PACKAGE__OWNED_GOALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedGoals()).basicAdd(otherEnd, msgs);
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
			case RdalPackage.GOALS_PACKAGE__OWNED_GOALS:
				return ((InternalEList<?>)getOwnedGoals()).basicRemove(otherEnd, msgs);
			case RdalPackage.GOALS_PACKAGE__OWNED_GOAL_REFINEMENTS:
				return ((InternalEList<?>)getOwnedGoalRefinements()).basicRemove(otherEnd, msgs);
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
			case RdalPackage.GOALS_PACKAGE__SATISFACTION_LEVEL:
				return getSatisfactionLevel();
			case RdalPackage.GOALS_PACKAGE__OWNED_GOALS:
				return getOwnedGoals();
			case RdalPackage.GOALS_PACKAGE__OWNED_GOAL_REFINEMENTS:
				return getOwnedGoalRefinements();
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
			case RdalPackage.GOALS_PACKAGE__SATISFACTION_LEVEL:
				setSatisfactionLevel((Float)newValue);
				return;
			case RdalPackage.GOALS_PACKAGE__OWNED_GOALS:
				getOwnedGoals().clear();
				getOwnedGoals().addAll((Collection<? extends AbstractGoal>)newValue);
				return;
			case RdalPackage.GOALS_PACKAGE__OWNED_GOAL_REFINEMENTS:
				getOwnedGoalRefinements().clear();
				getOwnedGoalRefinements().addAll((Collection<? extends GoalRefinement>)newValue);
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
			case RdalPackage.GOALS_PACKAGE__SATISFACTION_LEVEL:
				setSatisfactionLevel(SATISFACTION_LEVEL_EDEFAULT);
				return;
			case RdalPackage.GOALS_PACKAGE__OWNED_GOALS:
				getOwnedGoals().clear();
				return;
			case RdalPackage.GOALS_PACKAGE__OWNED_GOAL_REFINEMENTS:
				getOwnedGoalRefinements().clear();
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
			case RdalPackage.GOALS_PACKAGE__SATISFACTION_LEVEL:
				return SATISFACTION_LEVEL_EDEFAULT == null ? satisfactionLevel != null : !SATISFACTION_LEVEL_EDEFAULT.equals(satisfactionLevel);
			case RdalPackage.GOALS_PACKAGE__OWNED_GOALS:
				return !getOwnedGoals().isEmpty();
			case RdalPackage.GOALS_PACKAGE__OWNED_GOAL_REFINEMENTS:
				return !getOwnedGoalRefinements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SatisfiableElement.class) {
			switch (derivedFeatureID) {
				case RdalPackage.GOALS_PACKAGE__SATISFACTION_LEVEL: return RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SatisfiableElement.class) {
			switch (baseFeatureID) {
				case RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL: return RdalPackage.GOALS_PACKAGE__SATISFACTION_LEVEL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (satisfactionLevel: ");
		result.append(satisfactionLevel);
		result.append(')');
		return result.toString();
	}

} //GoalsPackageImpl
