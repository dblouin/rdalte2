/**
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SubElementReference#getWeight <em>Weight</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SubElementReference#getReferencedElementEntries <em>Referenced Element Entries</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SubElementReference#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSubElementReference()
 * @model abstract="true"
 * @generated
 */
public interface SubElementReference extends IdentifiedElement {
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
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSubElementReference_Weight()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.NormalizedRatio" required="true"
	 * @generated
	 */
	Float getWeight();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.SubElementReference#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(Float value);

	/**
	 * Returns the value of the '<em><b>Referenced Element Entries</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element Entries</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Element Entries</em>' attribute list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSubElementReference_ReferencedElementEntries()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getReferencedElementEntries();

	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Element</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Element</em>' reference.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSubElementReference_ReferencedElement()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	RefineableElement getReferencedElement();

} // SubElementReference
