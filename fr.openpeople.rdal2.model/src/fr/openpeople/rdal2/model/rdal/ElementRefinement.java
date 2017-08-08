/**
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.ElementRefinement#getSubElementRefEntries <em>Sub Element Ref Entries</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.ElementRefinement#getSubElements <em>Sub Elements</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.ElementRefinement#getRefinedElementEntries <em>Refined Element Entries</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.ElementRefinement#getOwnedSubElementRefs <em>Owned Sub Element Refs</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.ElementRefinement#getRefinedElement <em>Refined Element</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getElementRefinement()
 * @model abstract="true"
 * @generated
 */
public interface ElementRefinement extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Sub Element Ref Entries</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Element Ref Entries</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Element Ref Entries</em>' attribute list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getElementRefinement_SubElementRefEntries()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getSubElementRefEntries();

	/**
	 * Returns the value of the '<em><b>Owned Sub Element Refs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.SubElementReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Sub Element Refs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Sub Element Refs</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getElementRefinement_OwnedSubElementRefs()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubElementReference> getOwnedSubElementRefs();

	/**
	 * Returns the value of the '<em><b>Sub Elements</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.RefineableElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Elements</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getElementRefinement_SubElements()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<RefineableElement> getSubElements();

	/**
	 * Returns the value of the '<em><b>Refined Element Entries</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Element Entries</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Element Entries</em>' attribute list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getElementRefinement_RefinedElementEntries()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getRefinedElementEntries();

	/**
	 * Returns the value of the '<em><b>Refined Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Element</em>' reference.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getElementRefinement_RefinedElement()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	RefineableElement getRefinedElement();

} // ElementRefinement
