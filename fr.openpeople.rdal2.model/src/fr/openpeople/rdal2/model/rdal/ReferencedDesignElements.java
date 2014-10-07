/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenced Design Elements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.ReferencedDesignElements#getOwnedDesignElementRefs <em>Owned Design Element Refs</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.ReferencedDesignElements#getAgregationType <em>Agregation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getReferencedDesignElements()
 * @model abstract="true"
 * @generated
 */
public interface ReferencedDesignElements extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Owned Design Element Refs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.DesignElementReference}.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.DesignElementReference#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Design Element Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Design Element Refs</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getReferencedDesignElements_OwnedDesignElementRefs()
	 * @see fr.openpeople.rdal2.model.rdal.DesignElementReference#getParent
	 * @model opposite="parent" containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sumWeightsLessEqualsOne'"
	 * @generated
	 */
	EList<DesignElementReference> getOwnedDesignElementRefs();

	/**
	 * Returns the value of the '<em><b>Agregation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.openpeople.rdal2.model.rdal.AggregationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agregation Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agregation Type</em>' attribute.
	 * @see fr.openpeople.rdal2.model.rdal.AggregationType
	 * @see #setAgregationType(AggregationType)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getReferencedDesignElements_AgregationType()
	 * @model
	 * @generated
	 */
	AggregationType getAgregationType();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.ReferencedDesignElements#getAgregationType <em>Agregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agregation Type</em>' attribute.
	 * @see fr.openpeople.rdal2.model.rdal.AggregationType
	 * @see #getAgregationType()
	 * @generated
	 */
	void setAgregationType(AggregationType value);

} // ReferencedDesignElements
