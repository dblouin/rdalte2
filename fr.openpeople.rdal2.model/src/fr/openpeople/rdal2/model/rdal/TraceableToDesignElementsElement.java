/**
 */
package fr.openpeople.rdal2.model.rdal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traceable To Design Elements Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement#getOwnedReferencedDesignElements <em>Owned Referenced Design Elements</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement#getSpecification <em>Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getTraceableToDesignElementsElement()
 * @model abstract="true"
 * @generated
 */
public interface TraceableToDesignElementsElement extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Owned Referenced Design Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Referenced Design Elements</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Referenced Design Elements</em>' containment reference.
	 * @see #setOwnedReferencedDesignElements(ReferencedDesignElements)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getTraceableToDesignElementsElement_OwnedReferencedDesignElements()
	 * @model containment="true"
	 * @generated
	 */
	ReferencedDesignElements getOwnedReferencedDesignElements();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement#getOwnedReferencedDesignElements <em>Owned Referenced Design Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Referenced Design Elements</em>' containment reference.
	 * @see #getOwnedReferencedDesignElements()
	 * @generated
	 */
	void setOwnedReferencedDesignElements(ReferencedDesignElements value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' reference.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getTraceableToDesignElementsElement_Specification()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Specification getSpecification();

} // TraceableToDesignElementsElement
