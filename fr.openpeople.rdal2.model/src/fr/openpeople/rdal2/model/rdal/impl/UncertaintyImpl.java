/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.Uncertainty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uncertainty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.UncertaintyImpl#getVolatility <em>Volatility</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.UncertaintyImpl#getCostsImpact <em>Costs Impact</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.UncertaintyImpl#getScheduleImpact <em>Schedule Impact</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.UncertaintyImpl#getTimeCriticality <em>Time Criticality</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.UncertaintyImpl#getFamiliarity <em>Familiarity</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.UncertaintyImpl#getRiskIndex <em>Risk Index</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.UncertaintyImpl#getPropRiskIndex <em>Prop Risk Index</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.UncertaintyImpl#getMaturityIndex <em>Maturity Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UncertaintyImpl extends IdentifiedElementImpl implements Uncertainty {
	/**
	 * The default value of the '{@link #getVolatility() <em>Volatility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatility()
	 * @generated
	 * @ordered
	 */
	protected static final Float VOLATILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolatility() <em>Volatility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolatility()
	 * @generated
	 * @ordered
	 */
	protected Float volatility = VOLATILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCostsImpact() <em>Costs Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostsImpact()
	 * @generated
	 * @ordered
	 */
	protected static final Float COSTS_IMPACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCostsImpact() <em>Costs Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostsImpact()
	 * @generated
	 * @ordered
	 */
	protected Float costsImpact = COSTS_IMPACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduleImpact() <em>Schedule Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleImpact()
	 * @generated
	 * @ordered
	 */
	protected static final Float SCHEDULE_IMPACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduleImpact() <em>Schedule Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleImpact()
	 * @generated
	 * @ordered
	 */
	protected Float scheduleImpact = SCHEDULE_IMPACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeCriticality() <em>Time Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCriticality()
	 * @generated
	 * @ordered
	 */
	protected static final Float TIME_CRITICALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeCriticality() <em>Time Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCriticality()
	 * @generated
	 * @ordered
	 */
	protected Float timeCriticality = TIME_CRITICALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFamiliarity() <em>Familiarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamiliarity()
	 * @generated
	 * @ordered
	 */
	protected static final Float FAMILIARITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamiliarity() <em>Familiarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamiliarity()
	 * @generated
	 * @ordered
	 */
	protected Float familiarity = FAMILIARITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRiskIndex() <em>Risk Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Float RISK_INDEX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPropRiskIndex() <em>Prop Risk Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropRiskIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Float PROP_RISK_INDEX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaturityIndex() <em>Maturity Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaturityIndex()
	 * @generated
	 * @ordered
	 */
	protected static final Float MATURITY_INDEX_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UncertaintyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.UNCERTAINTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getVolatility() {
		return volatility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolatility(Float newVolatility) {
		Float oldVolatility = volatility;
		volatility = newVolatility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.UNCERTAINTY__VOLATILITY, oldVolatility, volatility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getCostsImpact() {
		return costsImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCostsImpact(Float newCostsImpact) {
		Float oldCostsImpact = costsImpact;
		costsImpact = newCostsImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.UNCERTAINTY__COSTS_IMPACT, oldCostsImpact, costsImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getScheduleImpact() {
		return scheduleImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleImpact(Float newScheduleImpact) {
		Float oldScheduleImpact = scheduleImpact;
		scheduleImpact = newScheduleImpact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.UNCERTAINTY__SCHEDULE_IMPACT, oldScheduleImpact, scheduleImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getTimeCriticality() {
		return timeCriticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeCriticality(Float newTimeCriticality) {
		Float oldTimeCriticality = timeCriticality;
		timeCriticality = newTimeCriticality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.UNCERTAINTY__TIME_CRITICALITY, oldTimeCriticality, timeCriticality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getFamiliarity() {
		return familiarity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamiliarity(Float newFamiliarity) {
		Float oldFamiliarity = familiarity;
		familiarity = newFamiliarity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.UNCERTAINTY__FAMILIARITY, oldFamiliarity, familiarity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getRiskIndex() {
		// TODO: implement this method to return the 'Risk Index' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskIndex(Float newRiskIndex) {
		// TODO: implement this method to set the 'Risk Index' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getPropRiskIndex() {
		// TODO: implement this method to return the 'Prop Risk Index' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropRiskIndex(Float newPropRiskIndex) {
		// TODO: implement this method to set the 'Prop Risk Index' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getMaturityIndex() {
		// TODO: implement this method to return the 'Maturity Index' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaturityIndex(Float newMaturityIndex) {
		// TODO: implement this method to set the 'Maturity Index' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdalPackage.UNCERTAINTY__VOLATILITY:
				return getVolatility();
			case RdalPackage.UNCERTAINTY__COSTS_IMPACT:
				return getCostsImpact();
			case RdalPackage.UNCERTAINTY__SCHEDULE_IMPACT:
				return getScheduleImpact();
			case RdalPackage.UNCERTAINTY__TIME_CRITICALITY:
				return getTimeCriticality();
			case RdalPackage.UNCERTAINTY__FAMILIARITY:
				return getFamiliarity();
			case RdalPackage.UNCERTAINTY__RISK_INDEX:
				return getRiskIndex();
			case RdalPackage.UNCERTAINTY__PROP_RISK_INDEX:
				return getPropRiskIndex();
			case RdalPackage.UNCERTAINTY__MATURITY_INDEX:
				return getMaturityIndex();
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
			case RdalPackage.UNCERTAINTY__VOLATILITY:
				setVolatility((Float)newValue);
				return;
			case RdalPackage.UNCERTAINTY__COSTS_IMPACT:
				setCostsImpact((Float)newValue);
				return;
			case RdalPackage.UNCERTAINTY__SCHEDULE_IMPACT:
				setScheduleImpact((Float)newValue);
				return;
			case RdalPackage.UNCERTAINTY__TIME_CRITICALITY:
				setTimeCriticality((Float)newValue);
				return;
			case RdalPackage.UNCERTAINTY__FAMILIARITY:
				setFamiliarity((Float)newValue);
				return;
			case RdalPackage.UNCERTAINTY__RISK_INDEX:
				setRiskIndex((Float)newValue);
				return;
			case RdalPackage.UNCERTAINTY__PROP_RISK_INDEX:
				setPropRiskIndex((Float)newValue);
				return;
			case RdalPackage.UNCERTAINTY__MATURITY_INDEX:
				setMaturityIndex((Float)newValue);
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
			case RdalPackage.UNCERTAINTY__VOLATILITY:
				setVolatility(VOLATILITY_EDEFAULT);
				return;
			case RdalPackage.UNCERTAINTY__COSTS_IMPACT:
				setCostsImpact(COSTS_IMPACT_EDEFAULT);
				return;
			case RdalPackage.UNCERTAINTY__SCHEDULE_IMPACT:
				setScheduleImpact(SCHEDULE_IMPACT_EDEFAULT);
				return;
			case RdalPackage.UNCERTAINTY__TIME_CRITICALITY:
				setTimeCriticality(TIME_CRITICALITY_EDEFAULT);
				return;
			case RdalPackage.UNCERTAINTY__FAMILIARITY:
				setFamiliarity(FAMILIARITY_EDEFAULT);
				return;
			case RdalPackage.UNCERTAINTY__RISK_INDEX:
				setRiskIndex(RISK_INDEX_EDEFAULT);
				return;
			case RdalPackage.UNCERTAINTY__PROP_RISK_INDEX:
				setPropRiskIndex(PROP_RISK_INDEX_EDEFAULT);
				return;
			case RdalPackage.UNCERTAINTY__MATURITY_INDEX:
				setMaturityIndex(MATURITY_INDEX_EDEFAULT);
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
			case RdalPackage.UNCERTAINTY__VOLATILITY:
				return VOLATILITY_EDEFAULT == null ? volatility != null : !VOLATILITY_EDEFAULT.equals(volatility);
			case RdalPackage.UNCERTAINTY__COSTS_IMPACT:
				return COSTS_IMPACT_EDEFAULT == null ? costsImpact != null : !COSTS_IMPACT_EDEFAULT.equals(costsImpact);
			case RdalPackage.UNCERTAINTY__SCHEDULE_IMPACT:
				return SCHEDULE_IMPACT_EDEFAULT == null ? scheduleImpact != null : !SCHEDULE_IMPACT_EDEFAULT.equals(scheduleImpact);
			case RdalPackage.UNCERTAINTY__TIME_CRITICALITY:
				return TIME_CRITICALITY_EDEFAULT == null ? timeCriticality != null : !TIME_CRITICALITY_EDEFAULT.equals(timeCriticality);
			case RdalPackage.UNCERTAINTY__FAMILIARITY:
				return FAMILIARITY_EDEFAULT == null ? familiarity != null : !FAMILIARITY_EDEFAULT.equals(familiarity);
			case RdalPackage.UNCERTAINTY__RISK_INDEX:
				return RISK_INDEX_EDEFAULT == null ? getRiskIndex() != null : !RISK_INDEX_EDEFAULT.equals(getRiskIndex());
			case RdalPackage.UNCERTAINTY__PROP_RISK_INDEX:
				return PROP_RISK_INDEX_EDEFAULT == null ? getPropRiskIndex() != null : !PROP_RISK_INDEX_EDEFAULT.equals(getPropRiskIndex());
			case RdalPackage.UNCERTAINTY__MATURITY_INDEX:
				return MATURITY_INDEX_EDEFAULT == null ? getMaturityIndex() != null : !MATURITY_INDEX_EDEFAULT.equals(getMaturityIndex());
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
		result.append(" (volatility: ");
		result.append(volatility);
		result.append(", costsImpact: ");
		result.append(costsImpact);
		result.append(", scheduleImpact: ");
		result.append(scheduleImpact);
		result.append(", timeCriticality: ");
		result.append(timeCriticality);
		result.append(", familiarity: ");
		result.append(familiarity);
		result.append(')');
		return result.toString();
	}

} //UncertaintyImpl
