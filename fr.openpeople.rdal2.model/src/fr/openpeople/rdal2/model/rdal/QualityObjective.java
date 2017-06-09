/**
 */
package fr.openpeople.rdal2.model.rdal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.QualityObjective#getProperty <em>Property</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.QualityObjective#getOwnedSensitivity <em>Owned Sensitivity</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.QualityObjective#getModality <em>Modality</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.QualityObjective#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getQualityObjective()
 * @model
 * @generated
 */
public interface QualityObjective extends NonFunctionalGoal {
	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(NonFunctionalProperty)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getQualityObjective_Property()
	 * @model required="true"
	 * @generated
	 */
	NonFunctionalProperty getProperty();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.QualityObjective#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(NonFunctionalProperty value);

	/**
	 * Returns the value of the '<em><b>Owned Sensitivity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Sensitivity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Sensitivity</em>' containment reference.
	 * @see #setOwnedSensitivity(Sensitivity)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getQualityObjective_OwnedSensitivity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sensitivity getOwnedSensitivity();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.QualityObjective#getOwnedSensitivity <em>Owned Sensitivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Sensitivity</em>' containment reference.
	 * @see #getOwnedSensitivity()
	 * @generated
	 */
	void setOwnedSensitivity(Sensitivity value);

	/**
	 * Returns the value of the '<em><b>Modality</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.openpeople.rdal2.model.rdal.Modality}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modality</em>' attribute.
	 * @see fr.openpeople.rdal2.model.rdal.Modality
	 * @see #setModality(Modality)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getQualityObjective_Modality()
	 * @model required="true"
	 * @generated
	 */
	Modality getModality();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.QualityObjective#getModality <em>Modality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modality</em>' attribute.
	 * @see fr.openpeople.rdal2.model.rdal.Modality
	 * @see #getModality()
	 * @generated
	 */
	void setModality(Modality value);

	/**
	 * Returns the value of the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound</em>' attribute.
	 * @see #setBound(double)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getQualityObjective_Bound()
	 * @model required="true"
	 * @generated
	 */
	double getBound();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.QualityObjective#getBound <em>Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound</em>' attribute.
	 * @see #getBound()
	 * @generated
	 */
	void setBound(double value);

} // QualityObjective
