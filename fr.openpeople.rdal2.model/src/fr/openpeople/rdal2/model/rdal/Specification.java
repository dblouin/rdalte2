/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguagesSpec;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Specification#getOwnedPackages <em>Owned Packages</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Specification#getOwnedContactInformation <em>Owned Contact Information</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Specification#getOwnedConflicts <em>Owned Conflicts</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Specification#getOwnedSystOverview <em>Owned Syst Overview</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Specification#getConstraintLanguagesSpec <em>Constraint Languages Spec</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Specification#getOwnedActorReferences <em>Owned Actor References</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Specification#getPrimaryActors <em>Primary Actors</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Specification#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Specification#getOwnedNonFuncProperties <em>Owned Non Func Properties</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Specification#getOwnedStakeholders <em>Owned Stakeholders</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends AbstractContractualElement, VerifiableElement, SatisfiableElement {
	/**
	 * Returns the value of the '<em><b>Owned Packages</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage}.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Packages</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSpecification_OwnedPackages()
	 * @see fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getSpecification
	 * @model opposite="specification" containment="true"
	 * @generated
	 */
	EList<RdalOrgPackage> getOwnedPackages();

	/**
	 * Returns the value of the '<em><b>Owned Contact Information</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.ContactInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Contact Information</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Contact Information</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSpecification_OwnedContactInformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContactInformation> getOwnedContactInformation();

	/**
	 * Returns the value of the '<em><b>Owned Conflicts</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.Conflict}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Conflicts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Conflicts</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSpecification_OwnedConflicts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Conflict> getOwnedConflicts();

	/**
	 * Returns the value of the '<em><b>Owned Syst Overview</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Syst Overview</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Syst Overview</em>' containment reference.
	 * @see #setOwnedSystOverview(SystemOverview)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSpecification_OwnedSystOverview()
	 * @model containment="true"
	 * @generated
	 */
	SystemOverview getOwnedSystOverview();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.Specification#getOwnedSystOverview <em>Owned Syst Overview</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Syst Overview</em>' containment reference.
	 * @see #getOwnedSystOverview()
	 * @generated
	 */
	void setOwnedSystOverview(SystemOverview value);

	/**
	 * Returns the value of the '<em><b>Constraint Languages Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Languages Spec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Languages Spec</em>' reference.
	 * @see #setConstraintLanguagesSpec(ConstraintLanguagesSpec)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSpecification_ConstraintLanguagesSpec()
	 * @model
	 * @generated
	 */
	ConstraintLanguagesSpec getConstraintLanguagesSpec();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.Specification#getConstraintLanguagesSpec <em>Constraint Languages Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Languages Spec</em>' reference.
	 * @see #getConstraintLanguagesSpec()
	 * @generated
	 */
	void setConstraintLanguagesSpec(ConstraintLanguagesSpec value);

	/**
	 * Returns the value of the '<em><b>Owned Actor References</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.ActorReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Actor References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Actor References</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSpecification_OwnedActorReferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActorReference> getOwnedActorReferences();

	/**
	 * Returns the value of the '<em><b>Primary Actors</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Actors</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSpecification_PrimaryActors()
	 * @model
	 * @generated
	 */
	EList<EObject> getPrimaryActors();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSpecification_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.Specification#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Owned Non Func Properties</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.NonFunctionalProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Non Func Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Non Func Properties</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSpecification_OwnedNonFuncProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<NonFunctionalProperty> getOwnedNonFuncProperties();

	/**
	 * Returns the value of the '<em><b>Owned Stakeholders</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.Stakeholder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Stakeholders</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Stakeholders</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSpecification_OwnedStakeholders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stakeholder> getOwnedStakeholders();

} // Specification
