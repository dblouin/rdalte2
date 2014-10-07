/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uncertainty</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getVolatility <em>Volatility</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getCostsImpact <em>Costs Impact</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getScheduleImpact <em>Schedule Impact</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getTimeCriticality <em>Time Criticality</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getFamiliarity <em>Familiarity</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getRiskIndex <em>Risk Index</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getPropRiskIndex <em>Prop Risk Index</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getMaturityIndex <em>Maturity Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getUncertainty()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Uncertainty extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Volatility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volatility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volatility</em>' attribute.
	 * @see #setVolatility(Float)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getUncertainty_Volatility()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.NormalizedRatio" required="true"
	 * @generated
	 */
	Float getVolatility();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getVolatility <em>Volatility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volatility</em>' attribute.
	 * @see #getVolatility()
	 * @generated
	 */
	void setVolatility(Float value);

	/**
	 * Returns the value of the '<em><b>Costs Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Costs Impact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Costs Impact</em>' attribute.
	 * @see #setCostsImpact(Float)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getUncertainty_CostsImpact()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.PositiveFactor" required="true"
	 * @generated
	 */
	Float getCostsImpact();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getCostsImpact <em>Costs Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Costs Impact</em>' attribute.
	 * @see #getCostsImpact()
	 * @generated
	 */
	void setCostsImpact(Float value);

	/**
	 * Returns the value of the '<em><b>Schedule Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schedule Impact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule Impact</em>' attribute.
	 * @see #setScheduleImpact(Float)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getUncertainty_ScheduleImpact()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.PositiveFactor" required="true"
	 * @generated
	 */
	Float getScheduleImpact();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getScheduleImpact <em>Schedule Impact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule Impact</em>' attribute.
	 * @see #getScheduleImpact()
	 * @generated
	 */
	void setScheduleImpact(Float value);

	/**
	 * Returns the value of the '<em><b>Time Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Criticality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Criticality</em>' attribute.
	 * @see #setTimeCriticality(Float)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getUncertainty_TimeCriticality()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.NormalizedRatio" required="true"
	 * @generated
	 */
	Float getTimeCriticality();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getTimeCriticality <em>Time Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Criticality</em>' attribute.
	 * @see #getTimeCriticality()
	 * @generated
	 */
	void setTimeCriticality(Float value);

	/**
	 * Returns the value of the '<em><b>Familiarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Familiarity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Familiarity</em>' attribute.
	 * @see #setFamiliarity(Float)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getUncertainty_Familiarity()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.NormalizedRatio" required="true"
	 * @generated
	 */
	Float getFamiliarity();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getFamiliarity <em>Familiarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Familiarity</em>' attribute.
	 * @see #getFamiliarity()
	 * @generated
	 */
	void setFamiliarity(Float value);

	/**
	 * Returns the value of the '<em><b>Risk Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Index</em>' attribute.
	 * @see #setRiskIndex(Float)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getUncertainty_RiskIndex()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.NormalizedRatio" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Float getRiskIndex();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getRiskIndex <em>Risk Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Index</em>' attribute.
	 * @see #getRiskIndex()
	 * @generated
	 */
	void setRiskIndex(Float value);

	/**
	 * Returns the value of the '<em><b>Prop Risk Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prop Risk Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prop Risk Index</em>' attribute.
	 * @see #setPropRiskIndex(Float)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getUncertainty_PropRiskIndex()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.NormalizedRatio" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Float getPropRiskIndex();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getPropRiskIndex <em>Prop Risk Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prop Risk Index</em>' attribute.
	 * @see #getPropRiskIndex()
	 * @generated
	 */
	void setPropRiskIndex(Float value);

	/**
	 * Returns the value of the '<em><b>Maturity Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maturity Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maturity Index</em>' attribute.
	 * @see #setMaturityIndex(Float)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getUncertainty_MaturityIndex()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.NormalizedRatio" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	Float getMaturityIndex();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getMaturityIndex <em>Maturity Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maturity Index</em>' attribute.
	 * @see #getMaturityIndex()
	 * @generated
	 */
	void setMaturityIndex(Float value);

} // Uncertainty
