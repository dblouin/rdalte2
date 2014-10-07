/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Design Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.TraceDesignElementRef#isContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getTraceDesignElementRef()
 * @model
 * @generated
 */
public interface TraceDesignElementRef extends DesignElementReference, RequirementsCoverageData, VerifiableElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see #setContainer(boolean)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getTraceDesignElementRef_Container()
	 * @model required="true"
	 * @generated
	 */
	boolean isContainer();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.TraceDesignElementRef#isContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' attribute.
	 * @see #isContainer()
	 * @generated
	 */
	void setContainer(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void merge(TraceDesignElementRef modelElementReference);

} // TraceDesignElementReference
