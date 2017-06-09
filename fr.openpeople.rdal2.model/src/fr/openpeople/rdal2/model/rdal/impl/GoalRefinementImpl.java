/**
 */
package fr.openpeople.rdal2.model.rdal.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.openpeople.rdal2.model.rdal.AbstractGoal;
import fr.openpeople.rdal2.model.rdal.GoalRefinement;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.SatisfiableElement;
import fr.openpeople.rdal2.model.rdal.SubGoalReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal Refinement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.GoalRefinementImpl#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.GoalRefinementImpl#getOwnedSubGoalRefs <em>Owned Sub Goal Refs</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.GoalRefinementImpl#getSubGoals <em>Sub Goals</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.GoalRefinementImpl#getRefinedGoal <em>Refined Goal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GoalRefinementImpl extends ElementRefinementImpl implements GoalRefinement {
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
	 * The cached value of the '{@link #getRefinedGoal() <em>Refined Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinedGoal()
	 * @generated
	 * @ordered
	 */
	protected AbstractGoal refinedGoal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalRefinementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.GOAL_REFINEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.GOAL_REFINEMENT__SATISFACTION_LEVEL, oldSatisfactionLevel, satisfactionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubGoalReference> getOwnedSubGoalRefs() {
		return getSubElementRefEntries().list(RdalPackage.Literals.GOAL_REFINEMENT__OWNED_SUB_GOAL_REFS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<AbstractGoal> getSubGoals() {
		final List<AbstractGoal> elements = new ArrayList<AbstractGoal>();
		
		for ( final SubGoalReference reference : getOwnedSubGoalRefs() ) {
			elements.add( reference.getGoal() );
		}
		
		return new EcoreEList.UnmodifiableEList<AbstractGoal>( 	this, 
																RdalPackage.eINSTANCE.getGoalRefinement_SubGoals(),
																elements.size(),
																elements.toArray() );
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGoal getRefinedGoal() {
		if (refinedGoal != null && refinedGoal.eIsProxy()) {
			InternalEObject oldRefinedGoal = (InternalEObject)refinedGoal;
			refinedGoal = (AbstractGoal)eResolveProxy(oldRefinedGoal);
			if (refinedGoal != oldRefinedGoal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdalPackage.GOAL_REFINEMENT__REFINED_GOAL, oldRefinedGoal, refinedGoal));
			}
		}
		return refinedGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGoal basicGetRefinedGoal() {
		return refinedGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinedGoal(AbstractGoal newRefinedGoal) {
		AbstractGoal oldRefinedGoal = refinedGoal;
		refinedGoal = newRefinedGoal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.GOAL_REFINEMENT__REFINED_GOAL, oldRefinedGoal, refinedGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.GOAL_REFINEMENT__OWNED_SUB_GOAL_REFS:
				return ((InternalEList<?>)getOwnedSubGoalRefs()).basicRemove(otherEnd, msgs);
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
			case RdalPackage.GOAL_REFINEMENT__SATISFACTION_LEVEL:
				return getSatisfactionLevel();
			case RdalPackage.GOAL_REFINEMENT__OWNED_SUB_GOAL_REFS:
				return getOwnedSubGoalRefs();
			case RdalPackage.GOAL_REFINEMENT__SUB_GOALS:
				return getSubGoals();
			case RdalPackage.GOAL_REFINEMENT__REFINED_GOAL:
				if (resolve) return getRefinedGoal();
				return basicGetRefinedGoal();
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
			case RdalPackage.GOAL_REFINEMENT__SATISFACTION_LEVEL:
				setSatisfactionLevel((Float)newValue);
				return;
			case RdalPackage.GOAL_REFINEMENT__OWNED_SUB_GOAL_REFS:
				getOwnedSubGoalRefs().clear();
				getOwnedSubGoalRefs().addAll((Collection<? extends SubGoalReference>)newValue);
				return;
			case RdalPackage.GOAL_REFINEMENT__REFINED_GOAL:
				setRefinedGoal((AbstractGoal)newValue);
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
			case RdalPackage.GOAL_REFINEMENT__SATISFACTION_LEVEL:
				setSatisfactionLevel(SATISFACTION_LEVEL_EDEFAULT);
				return;
			case RdalPackage.GOAL_REFINEMENT__OWNED_SUB_GOAL_REFS:
				getOwnedSubGoalRefs().clear();
				return;
			case RdalPackage.GOAL_REFINEMENT__REFINED_GOAL:
				setRefinedGoal((AbstractGoal)null);
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
			case RdalPackage.GOAL_REFINEMENT__SATISFACTION_LEVEL:
				return SATISFACTION_LEVEL_EDEFAULT == null ? satisfactionLevel != null : !SATISFACTION_LEVEL_EDEFAULT.equals(satisfactionLevel);
			case RdalPackage.GOAL_REFINEMENT__OWNED_SUB_GOAL_REFS:
				return !getOwnedSubGoalRefs().isEmpty();
			case RdalPackage.GOAL_REFINEMENT__SUB_GOALS:
				return !getSubGoals().isEmpty();
			case RdalPackage.GOAL_REFINEMENT__REFINED_GOAL:
				return refinedGoal != null;
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
				case RdalPackage.GOAL_REFINEMENT__SATISFACTION_LEVEL: return RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL;
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
				case RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL: return RdalPackage.GOAL_REFINEMENT__SATISFACTION_LEVEL;
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

} //GoalRefinementImpl
