/**
 */
package fr.openpeople.rdal2.model.rdal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prioritized Sat Design Element Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.PrioritizedSatDesignElementRef#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.PrioritizedSatDesignElementRef#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getPrioritizedSatDesignElementRef()
 * @model
 * @generated
 */
public interface PrioritizedSatDesignElementRef extends SatisfiableDesignElementRef {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(Long)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getPrioritizedSatDesignElementRef_Priority()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.PositiveInteger" required="true"
	 * @generated
	 */
	Long getPriority();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.PrioritizedSatDesignElementRef#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(Long value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(Float)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getPrioritizedSatDesignElementRef_Weight()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.NormalizedRatio"
	 * @generated
	 */
	Float getWeight();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.PrioritizedSatDesignElementRef#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(Float value);

} // PrioritizedSatDesignElementRef
