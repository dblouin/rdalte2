/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.DesignElementReference#getDesignElement <em>Design Element</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.DesignElementReference#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.DesignElementReference#getEvaluationResult <em>Evaluation Result</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.DesignElementReference#getParentTraceableElement <em>Parent Traceable Element</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getDesignElementReference()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='designElementsContainedInSpecifedArchSpecs'"
 * @generated
 */
public interface DesignElementReference extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Design Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Element</em>' reference.
	 * @see #setDesignElement(EObject)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getDesignElementReference_DesignElement()
	 * @model required="true"
	 * @generated
	 */
	EObject getDesignElement();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.DesignElementReference#getDesignElement <em>Design Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Element</em>' reference.
	 * @see #getDesignElement()
	 * @generated
	 */
	void setDesignElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.ReferencedDesignElements#getOwnedDesignElementRefs <em>Owned Design Element Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ReferencedDesignElements)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getDesignElementReference_Parent()
	 * @see fr.openpeople.rdal2.model.rdal.ReferencedDesignElements#getOwnedDesignElementRefs
	 * @model opposite="ownedDesignElementRefs" required="true" transient="false"
	 * @generated
	 */
	ReferencedDesignElements getParent();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.DesignElementReference#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ReferencedDesignElements value);

	/**
	 * Returns the value of the '<em><b>Evaluation Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Result</em>' attribute.
	 * @see #setEvaluationResult(String)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getDesignElementReference_EvaluationResult()
	 * @model
	 * @generated
	 */
	String getEvaluationResult();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.DesignElementReference#getEvaluationResult <em>Evaluation Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Result</em>' attribute.
	 * @see #getEvaluationResult()
	 * @generated
	 */
	void setEvaluationResult(String value);

	/**
	 * Returns the value of the '<em><b>Parent Traceable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Traceable Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Traceable Element</em>' reference.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getDesignElementReference_ParentTraceableElement()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	TraceableToDesignElementsElement getParentTraceableElement();

} // DesignElementReference
