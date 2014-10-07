/**
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.openpeople.rdal2.model.rdal.RdalFactory
 * @model kind="package"
 * @generated
 */
public interface RdalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rdal";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.open-people.fr/rdal2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rdal";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RdalPackage eINSTANCE = fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.IdentifiedElementImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getIdentifiedElement()
	 * @generated
	 */
	int IDENTIFIED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.ElementRefinementImpl <em>Element Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.ElementRefinementImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getElementRefinement()
	 * @generated
	 */
	int ELEMENT_REFINEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFINEMENT__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFINEMENT__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFINEMENT__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFINEMENT__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sub Element Ref Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFINEMENT__SUB_ELEMENT_REF_ENTRIES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFINEMENT__SUB_ELEMENTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Refined Element Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFINEMENT__REFINED_ELEMENT_ENTRIES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Sub Element Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFINEMENT__OWNED_SUB_ELEMENT_REFS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refined Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFINEMENT__REFINED_ELEMENT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Element Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_REFINEMENT_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.RequirementRefinementImpl <em>Requirement Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.RequirementRefinementImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRequirementRefinement()
	 * @generated
	 */
	int REQUIREMENT_REFINEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFINEMENT__NAME = ELEMENT_REFINEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFINEMENT__ID = ELEMENT_REFINEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFINEMENT__DESCRIPTION = ELEMENT_REFINEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFINEMENT__OWNED_USER_PROPERTIES = ELEMENT_REFINEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sub Element Ref Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFINEMENT__SUB_ELEMENT_REF_ENTRIES = ELEMENT_REFINEMENT__SUB_ELEMENT_REF_ENTRIES;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFINEMENT__SUB_ELEMENTS = ELEMENT_REFINEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Refined Element Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFINEMENT__REFINED_ELEMENT_ENTRIES = ELEMENT_REFINEMENT__REFINED_ELEMENT_ENTRIES;

	/**
	 * The feature id for the '<em><b>Owned Sub Element Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFINEMENT__OWNED_SUB_ELEMENT_REFS = ELEMENT_REFINEMENT__OWNED_SUB_ELEMENT_REFS;

	/**
	 * The feature id for the '<em><b>Refined Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFINEMENT__REFINED_ELEMENT = ELEMENT_REFINEMENT__REFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFINEMENT__SATISFACTION_LEVEL = ELEMENT_REFINEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFINEMENT__VERIFIED = ELEMENT_REFINEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Sub Requirement Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFINEMENT__OWNED_SUB_REQUIREMENT_REFS = ELEMENT_REFINEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sub Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFINEMENT__SUB_REQUIREMENTS = ELEMENT_REFINEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refined Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFINEMENT__REFINED_REQUIREMENT = ELEMENT_REFINEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Requirement Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REFINEMENT_FEATURE_COUNT = ELEMENT_REFINEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.GoalRefinementImpl <em>Goal Refinement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.GoalRefinementImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getGoalRefinement()
	 * @generated
	 */
	int GOAL_REFINEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFINEMENT__NAME = ELEMENT_REFINEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFINEMENT__ID = ELEMENT_REFINEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFINEMENT__DESCRIPTION = ELEMENT_REFINEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFINEMENT__OWNED_USER_PROPERTIES = ELEMENT_REFINEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sub Element Ref Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFINEMENT__SUB_ELEMENT_REF_ENTRIES = ELEMENT_REFINEMENT__SUB_ELEMENT_REF_ENTRIES;

	/**
	 * The feature id for the '<em><b>Sub Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFINEMENT__SUB_ELEMENTS = ELEMENT_REFINEMENT__SUB_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Refined Element Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFINEMENT__REFINED_ELEMENT_ENTRIES = ELEMENT_REFINEMENT__REFINED_ELEMENT_ENTRIES;

	/**
	 * The feature id for the '<em><b>Owned Sub Element Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFINEMENT__OWNED_SUB_ELEMENT_REFS = ELEMENT_REFINEMENT__OWNED_SUB_ELEMENT_REFS;

	/**
	 * The feature id for the '<em><b>Refined Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFINEMENT__REFINED_ELEMENT = ELEMENT_REFINEMENT__REFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFINEMENT__SATISFACTION_LEVEL = ELEMENT_REFINEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Sub Goal Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFINEMENT__OWNED_SUB_GOAL_REFS = ELEMENT_REFINEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Goals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFINEMENT__SUB_GOALS = ELEMENT_REFINEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Refined Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFINEMENT__REFINED_GOAL = ELEMENT_REFINEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Goal Refinement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_REFINEMENT_FEATURE_COUNT = ELEMENT_REFINEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.TraceableToDesignElementsElementImpl <em>Traceable To Design Elements Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.TraceableToDesignElementsElementImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getTraceableToDesignElementsElement()
	 * @generated
	 */
	int TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Referenced Design Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__SPECIFICATION = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traceable To Design Elements Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.AbstractContractualElementImpl <em>Abstract Contractual Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.AbstractContractualElementImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getAbstractContractualElement()
	 * @generated
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT__NAME = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT__ID = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT__DESCRIPTION = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_USER_PROPERTIES = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Referenced Design Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT__SPECIFICATION = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT__STAKEHOLDERS = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT__CONTACT_INFORMATION = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT__ORIGIN_DATE = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT__SCHEDULE_DATE = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT__SOURCES = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT__EVOLVED_TO = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT__DROPPED = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Owned Dropping Reasons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Abstract Contractual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.ContactInformationImpl <em>Contact Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.ContactInformationImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getContactInformation()
	 * @generated
	 */
	int CONTACT_INFORMATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION__ADDRESS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION__EMAIL = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION__PHONE_NUMBER = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION__COUNTRY = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Contact Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_INFORMATION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.StakeholderImpl <em>Stakeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.StakeholderImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getStakeholder()
	 * @generated
	 */
	int STAKEHOLDER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__CONTACT_INFORMATION = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.RationaleImpl <em>Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.RationaleImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRationale()
	 * @generated
	 */
	int RATIONALE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE__STAKEHOLDERS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATIONALE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.TextualContractualElementImpl <em>Textual Contractual Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.TextualContractualElementImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getTextualContractualElement()
	 * @generated
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__NAME = ABSTRACT_CONTRACTUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__ID = ABSTRACT_CONTRACTUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__DESCRIPTION = ABSTRACT_CONTRACTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_USER_PROPERTIES = ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Referenced Design Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS = ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__SPECIFICATION = ABSTRACT_CONTRACTUAL_ELEMENT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__STAKEHOLDERS = ABSTRACT_CONTRACTUAL_ELEMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Owned Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_RATIONALES = ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__CONTACT_INFORMATION = ABSTRACT_CONTRACTUAL_ELEMENT__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__ORIGIN_DATE = ABSTRACT_CONTRACTUAL_ELEMENT__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__SCHEDULE_DATE = ABSTRACT_CONTRACTUAL_ELEMENT__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__SOURCES = ABSTRACT_CONTRACTUAL_ELEMENT__SOURCES;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__EVOLVED_TO = ABSTRACT_CONTRACTUAL_ELEMENT__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__DROPPED = ABSTRACT_CONTRACTUAL_ELEMENT__DROPPED;

	/**
	 * The feature id for the '<em><b>Owned Dropping Reasons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS = ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY = ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__DERIVED_FROM = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__CATEGORY = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT__PRIORITY = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Textual Contractual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTUAL_CONTRACTUAL_ELEMENT_FEATURE_COUNT = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.UncertaintyImpl <em>Uncertainty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.UncertaintyImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getUncertainty()
	 * @generated
	 */
	int UNCERTAINTY = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Volatility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__VOLATILITY = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Costs Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__COSTS_IMPACT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schedule Impact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__SCHEDULE_IMPACT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__TIME_CRITICALITY = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Familiarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__FAMILIARITY = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Risk Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__RISK_INDEX = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Prop Risk Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__PROP_RISK_INDEX = IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Maturity Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY__MATURITY_INDEX = IDENTIFIED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Uncertainty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCERTAINTY_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.SatisfiableElementImpl <em>Satisfiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.SatisfiableElementImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSatisfiableElement()
	 * @generated
	 */
	int SATISFIABLE_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIABLE_ELEMENT__SATISFACTION_LEVEL = 0;

	/**
	 * The number of structural features of the '<em>Satisfiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.VerifiableElementImpl <em>Verifiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.VerifiableElementImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getVerifiableElement()
	 * @generated
	 */
	int VERIFIABLE_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT__VERIFIED = 0;

	/**
	 * The number of structural features of the '<em>Verifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.SpecificationImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = ABSTRACT_CONTRACTUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ID = ABSTRACT_CONTRACTUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DESCRIPTION = ABSTRACT_CONTRACTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_USER_PROPERTIES = ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Referenced Design Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_REFERENCED_DESIGN_ELEMENTS = ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SPECIFICATION = ABSTRACT_CONTRACTUAL_ELEMENT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__STAKEHOLDERS = ABSTRACT_CONTRACTUAL_ELEMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Owned Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_RATIONALES = ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CONTACT_INFORMATION = ABSTRACT_CONTRACTUAL_ELEMENT__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ORIGIN_DATE = ABSTRACT_CONTRACTUAL_ELEMENT__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SCHEDULE_DATE = ABSTRACT_CONTRACTUAL_ELEMENT__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SOURCES = ABSTRACT_CONTRACTUAL_ELEMENT__SOURCES;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__EVOLVED_TO = ABSTRACT_CONTRACTUAL_ELEMENT__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__DROPPED = ABSTRACT_CONTRACTUAL_ELEMENT__DROPPED;

	/**
	 * The feature id for the '<em><b>Owned Dropping Reasons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_DROPPING_REASONS = ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CHANGE_UNCERTAINTY = ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__VERIFIED = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SATISFACTION_LEVEL = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_PACKAGES = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Contact Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_CONTACT_INFORMATION = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Conflicts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_CONFLICTS = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Syst Overview</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_SYST_OVERVIEW = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Constraint Languages Spec</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__CONSTRAINT_LANGUAGES_SPEC = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Owned Actor References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_ACTOR_REFERENCES = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Primary Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__PRIMARY_ACTORS = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__VERSION = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Owned Non Func Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_NON_FUNC_PROPERTIES = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Owned Stakeholders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OWNED_STAKEHOLDERS = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.RdalOrgPackageImpl <em>Org Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalOrgPackageImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRdalOrgPackage()
	 * @generated
	 */
	int RDAL_ORG_PACKAGE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDAL_ORG_PACKAGE__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDAL_ORG_PACKAGE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDAL_ORG_PACKAGE__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDAL_ORG_PACKAGE__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDAL_ORG_PACKAGE__SPECIFICATION = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDAL_ORG_PACKAGE__SUB_PACKAGES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contractual Element Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDAL_ORG_PACKAGE__CONTRACTUAL_ELEMENT_ENTRIES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDAL_ORG_PACKAGE__PARENT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Refinement Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDAL_ORG_PACKAGE__REFINEMENT_ENTRIES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Refinements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDAL_ORG_PACKAGE__OWNED_REFINEMENTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Owned Contractual Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDAL_ORG_PACKAGE__OWNED_CONTRACTUAL_ELEMENTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Org Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RDAL_ORG_PACKAGE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.RequirementsPackageImpl <em>Requirements Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.RequirementsPackageImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRequirementsPackage()
	 * @generated
	 */
	int REQUIREMENTS_PACKAGE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__NAME = RDAL_ORG_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__ID = RDAL_ORG_PACKAGE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__DESCRIPTION = RDAL_ORG_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__OWNED_USER_PROPERTIES = RDAL_ORG_PACKAGE__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__SPECIFICATION = RDAL_ORG_PACKAGE__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Sub Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__SUB_PACKAGES = RDAL_ORG_PACKAGE__SUB_PACKAGES;

	/**
	 * The feature id for the '<em><b>Contractual Element Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__CONTRACTUAL_ELEMENT_ENTRIES = RDAL_ORG_PACKAGE__CONTRACTUAL_ELEMENT_ENTRIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__PARENT = RDAL_ORG_PACKAGE__PARENT;

	/**
	 * The feature id for the '<em><b>Refinement Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__REFINEMENT_ENTRIES = RDAL_ORG_PACKAGE__REFINEMENT_ENTRIES;

	/**
	 * The feature id for the '<em><b>Owned Refinements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__OWNED_REFINEMENTS = RDAL_ORG_PACKAGE__OWNED_REFINEMENTS;

	/**
	 * The feature id for the '<em><b>Owned Contractual Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__OWNED_CONTRACTUAL_ELEMENTS = RDAL_ORG_PACKAGE__OWNED_CONTRACTUAL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__SATISFACTION_LEVEL = RDAL_ORG_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__VERIFIED = RDAL_ORG_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS = RDAL_ORG_PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Function Used In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__FUNCTION_USED_IN = RDAL_ORG_PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned Requirements Refinements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS_REFINEMENTS = RDAL_ORG_PACKAGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Requirements Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_PACKAGE_FEATURE_COUNT = RDAL_ORG_PACKAGE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.GoalsPackageImpl <em>Goals Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.GoalsPackageImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getGoalsPackage()
	 * @generated
	 */
	int GOALS_PACKAGE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_PACKAGE__NAME = RDAL_ORG_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_PACKAGE__ID = RDAL_ORG_PACKAGE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_PACKAGE__DESCRIPTION = RDAL_ORG_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_PACKAGE__OWNED_USER_PROPERTIES = RDAL_ORG_PACKAGE__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_PACKAGE__SPECIFICATION = RDAL_ORG_PACKAGE__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Sub Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_PACKAGE__SUB_PACKAGES = RDAL_ORG_PACKAGE__SUB_PACKAGES;

	/**
	 * The feature id for the '<em><b>Contractual Element Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_PACKAGE__CONTRACTUAL_ELEMENT_ENTRIES = RDAL_ORG_PACKAGE__CONTRACTUAL_ELEMENT_ENTRIES;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_PACKAGE__PARENT = RDAL_ORG_PACKAGE__PARENT;

	/**
	 * The feature id for the '<em><b>Refinement Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_PACKAGE__REFINEMENT_ENTRIES = RDAL_ORG_PACKAGE__REFINEMENT_ENTRIES;

	/**
	 * The feature id for the '<em><b>Owned Refinements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_PACKAGE__OWNED_REFINEMENTS = RDAL_ORG_PACKAGE__OWNED_REFINEMENTS;

	/**
	 * The feature id for the '<em><b>Owned Contractual Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_PACKAGE__OWNED_CONTRACTUAL_ELEMENTS = RDAL_ORG_PACKAGE__OWNED_CONTRACTUAL_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_PACKAGE__SATISFACTION_LEVEL = RDAL_ORG_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_PACKAGE__OWNED_GOALS = RDAL_ORG_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Goal Refinements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_PACKAGE__OWNED_GOAL_REFINEMENTS = RDAL_ORG_PACKAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Goals Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOALS_PACKAGE_FEATURE_COUNT = RDAL_ORG_PACKAGE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.SystemOverviewImpl <em>System Overview</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.SystemOverviewImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSystemOverview()
	 * @generated
	 */
	int SYSTEM_OVERVIEW = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__NAME = ABSTRACT_CONTRACTUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__ID = ABSTRACT_CONTRACTUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__DESCRIPTION = ABSTRACT_CONTRACTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__OWNED_USER_PROPERTIES = ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Referenced Design Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__OWNED_REFERENCED_DESIGN_ELEMENTS = ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__SPECIFICATION = ABSTRACT_CONTRACTUAL_ELEMENT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__STAKEHOLDERS = ABSTRACT_CONTRACTUAL_ELEMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Owned Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__OWNED_RATIONALES = ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__CONTACT_INFORMATION = ABSTRACT_CONTRACTUAL_ELEMENT__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__ORIGIN_DATE = ABSTRACT_CONTRACTUAL_ELEMENT__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__SCHEDULE_DATE = ABSTRACT_CONTRACTUAL_ELEMENT__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__SOURCES = ABSTRACT_CONTRACTUAL_ELEMENT__SOURCES;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__EVOLVED_TO = ABSTRACT_CONTRACTUAL_ELEMENT__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__DROPPED = ABSTRACT_CONTRACTUAL_ELEMENT__DROPPED;

	/**
	 * The feature id for the '<em><b>Owned Dropping Reasons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__OWNED_DROPPING_REASONS = ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__CHANGE_UNCERTAINTY = ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Owned Capabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__OWNED_CAPABILITIES = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Global System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__GLOBAL_SYSTEM = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>System To Be</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__SYSTEM_TO_BE = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__OWNED_CONTEXTS = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owned System Boundary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__OWNED_SYSTEM_BOUNDARY = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW__PURPOSE = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>System Overview</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_OVERVIEW_FEATURE_COUNT = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.CapabilityImpl <em>Capability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.CapabilityImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getCapability()
	 * @generated
	 */
	int CAPABILITY = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Capability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPABILITY_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.SystemContextImpl <em>System Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.SystemContextImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSystemContext()
	 * @generated
	 */
	int SYSTEM_CONTEXT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__NAME = ABSTRACT_CONTRACTUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__ID = ABSTRACT_CONTRACTUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__DESCRIPTION = ABSTRACT_CONTRACTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_USER_PROPERTIES = ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Referenced Design Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_REFERENCED_DESIGN_ELEMENTS = ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__SPECIFICATION = ABSTRACT_CONTRACTUAL_ELEMENT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__STAKEHOLDERS = ABSTRACT_CONTRACTUAL_ELEMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Owned Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_RATIONALES = ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__CONTACT_INFORMATION = ABSTRACT_CONTRACTUAL_ELEMENT__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__ORIGIN_DATE = ABSTRACT_CONTRACTUAL_ELEMENT__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__SCHEDULE_DATE = ABSTRACT_CONTRACTUAL_ELEMENT__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__SOURCES = ABSTRACT_CONTRACTUAL_ELEMENT__SOURCES;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__EVOLVED_TO = ABSTRACT_CONTRACTUAL_ELEMENT__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__DROPPED = ABSTRACT_CONTRACTUAL_ELEMENT__DROPPED;

	/**
	 * The feature id for the '<em><b>Owned Dropping Reasons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__OWNED_DROPPING_REASONS = ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__CHANGE_UNCERTAINTY = ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Global System Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__GLOBAL_SYSTEM_CONTEXT = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>System Context Boundary</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__SYSTEM_CONTEXT_BOUNDARY = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__ACTORS = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>System Overview</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT__SYSTEM_OVERVIEW = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>System Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_FEATURE_COUNT = ABSTRACT_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.VariableImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Design Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DESIGN_VARIABLE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.InteractionVariableImpl <em>Interaction Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.InteractionVariableImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getInteractionVariable()
	 * @generated
	 */
	int INTERACTION_VARIABLE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_VARIABLE__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_VARIABLE__ID = VARIABLE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_VARIABLE__DESCRIPTION = VARIABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_VARIABLE__OWNED_USER_PROPERTIES = VARIABLE__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Design Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_VARIABLE__DESIGN_VARIABLE = VARIABLE__DESIGN_VARIABLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_VARIABLE__TYPE = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neglected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_VARIABLE__NEGLECTED = VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interaction Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.ActorReferenceImpl <em>Actor Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.ActorReferenceImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getActorReference()
	 * @generated
	 */
	int ACTOR_REFERENCE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REFERENCE__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REFERENCE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REFERENCE__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REFERENCE__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Referenced Actors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REFERENCE__REFERENCED_ACTORS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Actor Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REFERENCE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.RefineableElementImpl <em>Refineable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.RefineableElementImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRefineableElement()
	 * @generated
	 */
	int REFINEABLE_ELEMENT = 23;

	/**
	 * The number of structural features of the '<em>Refineable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINEABLE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.AbstractRequirementImpl <em>Abstract Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.AbstractRequirementImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getAbstractRequirement()
	 * @generated
	 */
	int ABSTRACT_REQUIREMENT = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__NAME = TEXTUAL_CONTRACTUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__ID = TEXTUAL_CONTRACTUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__DESCRIPTION = TEXTUAL_CONTRACTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__OWNED_USER_PROPERTIES = TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Referenced Design Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__OWNED_REFERENCED_DESIGN_ELEMENTS = TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__SPECIFICATION = TEXTUAL_CONTRACTUAL_ELEMENT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__STAKEHOLDERS = TEXTUAL_CONTRACTUAL_ELEMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Owned Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__OWNED_RATIONALES = TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__CONTACT_INFORMATION = TEXTUAL_CONTRACTUAL_ELEMENT__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__ORIGIN_DATE = TEXTUAL_CONTRACTUAL_ELEMENT__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__SCHEDULE_DATE = TEXTUAL_CONTRACTUAL_ELEMENT__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__SOURCES = TEXTUAL_CONTRACTUAL_ELEMENT__SOURCES;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__EVOLVED_TO = TEXTUAL_CONTRACTUAL_ELEMENT__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__DROPPED = TEXTUAL_CONTRACTUAL_ELEMENT__DROPPED;

	/**
	 * The feature id for the '<em><b>Owned Dropping Reasons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__OWNED_DROPPING_REASONS = TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__CHANGE_UNCERTAINTY = TEXTUAL_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__OWNED_EXPRESSION = TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__OWNED_CONDITION = TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__DERIVED_FROM = TEXTUAL_CONTRACTUAL_ELEMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__CATEGORY = TEXTUAL_CONTRACTUAL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__PRIORITY = TEXTUAL_CONTRACTUAL_ELEMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__SATISFACTION_LEVEL = TEXTUAL_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__VERIFIED = TEXTUAL_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Verified By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__OWNED_VERIFIED_BY = TEXTUAL_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__RISK = TEXTUAL_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT__PACKAGE = TEXTUAL_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_REQUIREMENT_FEATURE_COUNT = TEXTUAL_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.VerificationActivityImpl <em>Verification Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.VerificationActivityImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getVerificationActivity()
	 * @generated
	 */
	int VERIFICATION_ACTIVITY = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>External Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY__EXTERNAL_REFS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Passed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY__PASSED = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY__REQUIREMENTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY__CATEGORY = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Verification Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATION_ACTIVITY_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.RequirementImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = ABSTRACT_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = ABSTRACT_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = ABSTRACT_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__OWNED_USER_PROPERTIES = ABSTRACT_REQUIREMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Referenced Design Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__OWNED_REFERENCED_DESIGN_ELEMENTS = ABSTRACT_REQUIREMENT__OWNED_REFERENCED_DESIGN_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SPECIFICATION = ABSTRACT_REQUIREMENT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STAKEHOLDERS = ABSTRACT_REQUIREMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Owned Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__OWNED_RATIONALES = ABSTRACT_REQUIREMENT__OWNED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONTACT_INFORMATION = ABSTRACT_REQUIREMENT__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ORIGIN_DATE = ABSTRACT_REQUIREMENT__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SCHEDULE_DATE = ABSTRACT_REQUIREMENT__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SOURCES = ABSTRACT_REQUIREMENT__SOURCES;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__EVOLVED_TO = ABSTRACT_REQUIREMENT__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DROPPED = ABSTRACT_REQUIREMENT__DROPPED;

	/**
	 * The feature id for the '<em><b>Owned Dropping Reasons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__OWNED_DROPPING_REASONS = ABSTRACT_REQUIREMENT__OWNED_DROPPING_REASONS;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CHANGE_UNCERTAINTY = ABSTRACT_REQUIREMENT__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__OWNED_EXPRESSION = ABSTRACT_REQUIREMENT__OWNED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__OWNED_CONDITION = ABSTRACT_REQUIREMENT__OWNED_CONDITION;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DERIVED_FROM = ABSTRACT_REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CATEGORY = ABSTRACT_REQUIREMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PRIORITY = ABSTRACT_REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFACTION_LEVEL = ABSTRACT_REQUIREMENT__SATISFACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VERIFIED = ABSTRACT_REQUIREMENT__VERIFIED;

	/**
	 * The feature id for the '<em><b>Owned Verified By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__OWNED_VERIFIED_BY = ABSTRACT_REQUIREMENT__OWNED_VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RISK = ABSTRACT_REQUIREMENT__RISK;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PACKAGE = ABSTRACT_REQUIREMENT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Image Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IMAGE_ASSUMPTIONS = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Function Used In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__FUNCTION_USED_IN = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.AssumptionImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__NAME = ABSTRACT_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__ID = ABSTRACT_REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DESCRIPTION = ABSTRACT_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__OWNED_USER_PROPERTIES = ABSTRACT_REQUIREMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Referenced Design Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__OWNED_REFERENCED_DESIGN_ELEMENTS = ABSTRACT_REQUIREMENT__OWNED_REFERENCED_DESIGN_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__SPECIFICATION = ABSTRACT_REQUIREMENT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__STAKEHOLDERS = ABSTRACT_REQUIREMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Owned Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__OWNED_RATIONALES = ABSTRACT_REQUIREMENT__OWNED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CONTACT_INFORMATION = ABSTRACT_REQUIREMENT__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__ORIGIN_DATE = ABSTRACT_REQUIREMENT__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__SCHEDULE_DATE = ABSTRACT_REQUIREMENT__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__SOURCES = ABSTRACT_REQUIREMENT__SOURCES;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__EVOLVED_TO = ABSTRACT_REQUIREMENT__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DROPPED = ABSTRACT_REQUIREMENT__DROPPED;

	/**
	 * The feature id for the '<em><b>Owned Dropping Reasons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__OWNED_DROPPING_REASONS = ABSTRACT_REQUIREMENT__OWNED_DROPPING_REASONS;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CHANGE_UNCERTAINTY = ABSTRACT_REQUIREMENT__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__OWNED_EXPRESSION = ABSTRACT_REQUIREMENT__OWNED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__OWNED_CONDITION = ABSTRACT_REQUIREMENT__OWNED_CONDITION;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DERIVED_FROM = ABSTRACT_REQUIREMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CATEGORY = ABSTRACT_REQUIREMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__PRIORITY = ABSTRACT_REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__SATISFACTION_LEVEL = ABSTRACT_REQUIREMENT__SATISFACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__VERIFIED = ABSTRACT_REQUIREMENT__VERIFIED;

	/**
	 * The feature id for the '<em><b>Owned Verified By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__OWNED_VERIFIED_BY = ABSTRACT_REQUIREMENT__OWNED_VERIFIED_BY;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__RISK = ABSTRACT_REQUIREMENT__RISK;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__PACKAGE = ABSTRACT_REQUIREMENT__PACKAGE;

	/**
	 * The feature id for the '<em><b>Image Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IMAGE_REQUIREMENT = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Assumptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IMAGE_ASSUMPTIONS = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_FEATURE_COUNT = ABSTRACT_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.AbstractGoalImpl <em>Abstract Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.AbstractGoalImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getAbstractGoal()
	 * @generated
	 */
	int ABSTRACT_GOAL = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__NAME = TEXTUAL_CONTRACTUAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__ID = TEXTUAL_CONTRACTUAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__DESCRIPTION = TEXTUAL_CONTRACTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__OWNED_USER_PROPERTIES = TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Referenced Design Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__OWNED_REFERENCED_DESIGN_ELEMENTS = TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__SPECIFICATION = TEXTUAL_CONTRACTUAL_ELEMENT__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__STAKEHOLDERS = TEXTUAL_CONTRACTUAL_ELEMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Owned Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__OWNED_RATIONALES = TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__CONTACT_INFORMATION = TEXTUAL_CONTRACTUAL_ELEMENT__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__ORIGIN_DATE = TEXTUAL_CONTRACTUAL_ELEMENT__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__SCHEDULE_DATE = TEXTUAL_CONTRACTUAL_ELEMENT__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__SOURCES = TEXTUAL_CONTRACTUAL_ELEMENT__SOURCES;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__EVOLVED_TO = TEXTUAL_CONTRACTUAL_ELEMENT__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__DROPPED = TEXTUAL_CONTRACTUAL_ELEMENT__DROPPED;

	/**
	 * The feature id for the '<em><b>Owned Dropping Reasons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__OWNED_DROPPING_REASONS = TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__CHANGE_UNCERTAINTY = TEXTUAL_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__OWNED_EXPRESSION = TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__OWNED_CONDITION = TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__DERIVED_FROM = TEXTUAL_CONTRACTUAL_ELEMENT__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__CATEGORY = TEXTUAL_CONTRACTUAL_ELEMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__PRIORITY = TEXTUAL_CONTRACTUAL_ELEMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__SATISFACTION_LEVEL = TEXTUAL_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__CONFLICTS = TEXTUAL_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL__PACKAGE = TEXTUAL_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GOAL_FEATURE_COUNT = TEXTUAL_CONTRACTUAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.SystemFunctionGoalImpl <em>System Function Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.SystemFunctionGoalImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSystemFunctionGoal()
	 * @generated
	 */
	int SYSTEM_FUNCTION_GOAL = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__NAME = ABSTRACT_GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__ID = ABSTRACT_GOAL__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__DESCRIPTION = ABSTRACT_GOAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__OWNED_USER_PROPERTIES = ABSTRACT_GOAL__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Referenced Design Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__OWNED_REFERENCED_DESIGN_ELEMENTS = ABSTRACT_GOAL__OWNED_REFERENCED_DESIGN_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__SPECIFICATION = ABSTRACT_GOAL__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__STAKEHOLDERS = ABSTRACT_GOAL__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Owned Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__OWNED_RATIONALES = ABSTRACT_GOAL__OWNED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__CONTACT_INFORMATION = ABSTRACT_GOAL__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__ORIGIN_DATE = ABSTRACT_GOAL__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__SCHEDULE_DATE = ABSTRACT_GOAL__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__SOURCES = ABSTRACT_GOAL__SOURCES;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__EVOLVED_TO = ABSTRACT_GOAL__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__DROPPED = ABSTRACT_GOAL__DROPPED;

	/**
	 * The feature id for the '<em><b>Owned Dropping Reasons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__OWNED_DROPPING_REASONS = ABSTRACT_GOAL__OWNED_DROPPING_REASONS;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__CHANGE_UNCERTAINTY = ABSTRACT_GOAL__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__OWNED_EXPRESSION = ABSTRACT_GOAL__OWNED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__OWNED_CONDITION = ABSTRACT_GOAL__OWNED_CONDITION;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__DERIVED_FROM = ABSTRACT_GOAL__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__CATEGORY = ABSTRACT_GOAL__CATEGORY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__PRIORITY = ABSTRACT_GOAL__PRIORITY;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__SATISFACTION_LEVEL = ABSTRACT_GOAL__SATISFACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__CONFLICTS = ABSTRACT_GOAL__CONFLICTS;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__PACKAGE = ABSTRACT_GOAL__PACKAGE;

	/**
	 * The feature id for the '<em><b>Use Cases</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL__USE_CASES = ABSTRACT_GOAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Function Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FUNCTION_GOAL_FEATURE_COUNT = ABSTRACT_GOAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.NonFunctionalGoalImpl <em>Non Functional Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.NonFunctionalGoalImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getNonFunctionalGoal()
	 * @generated
	 */
	int NON_FUNCTIONAL_GOAL = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__NAME = ABSTRACT_GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__ID = ABSTRACT_GOAL__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__DESCRIPTION = ABSTRACT_GOAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__OWNED_USER_PROPERTIES = ABSTRACT_GOAL__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Referenced Design Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__OWNED_REFERENCED_DESIGN_ELEMENTS = ABSTRACT_GOAL__OWNED_REFERENCED_DESIGN_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__SPECIFICATION = ABSTRACT_GOAL__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__STAKEHOLDERS = ABSTRACT_GOAL__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Owned Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__OWNED_RATIONALES = ABSTRACT_GOAL__OWNED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__CONTACT_INFORMATION = ABSTRACT_GOAL__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__ORIGIN_DATE = ABSTRACT_GOAL__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__SCHEDULE_DATE = ABSTRACT_GOAL__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__SOURCES = ABSTRACT_GOAL__SOURCES;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__EVOLVED_TO = ABSTRACT_GOAL__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__DROPPED = ABSTRACT_GOAL__DROPPED;

	/**
	 * The feature id for the '<em><b>Owned Dropping Reasons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__OWNED_DROPPING_REASONS = ABSTRACT_GOAL__OWNED_DROPPING_REASONS;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__CHANGE_UNCERTAINTY = ABSTRACT_GOAL__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__OWNED_EXPRESSION = ABSTRACT_GOAL__OWNED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__OWNED_CONDITION = ABSTRACT_GOAL__OWNED_CONDITION;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__DERIVED_FROM = ABSTRACT_GOAL__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__CATEGORY = ABSTRACT_GOAL__CATEGORY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__PRIORITY = ABSTRACT_GOAL__PRIORITY;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__SATISFACTION_LEVEL = ABSTRACT_GOAL__SATISFACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__CONFLICTS = ABSTRACT_GOAL__CONFLICTS;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL__PACKAGE = ABSTRACT_GOAL__PACKAGE;

	/**
	 * The number of structural features of the '<em>Non Functional Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_GOAL_FEATURE_COUNT = ABSTRACT_GOAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.QualityObjectiveImpl <em>Quality Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.QualityObjectiveImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getQualityObjective()
	 * @generated
	 */
	int QUALITY_OBJECTIVE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__NAME = NON_FUNCTIONAL_GOAL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__ID = NON_FUNCTIONAL_GOAL__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__DESCRIPTION = NON_FUNCTIONAL_GOAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__OWNED_USER_PROPERTIES = NON_FUNCTIONAL_GOAL__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Referenced Design Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__OWNED_REFERENCED_DESIGN_ELEMENTS = NON_FUNCTIONAL_GOAL__OWNED_REFERENCED_DESIGN_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__SPECIFICATION = NON_FUNCTIONAL_GOAL__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__STAKEHOLDERS = NON_FUNCTIONAL_GOAL__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Owned Rationales</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__OWNED_RATIONALES = NON_FUNCTIONAL_GOAL__OWNED_RATIONALES;

	/**
	 * The feature id for the '<em><b>Contact Information</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__CONTACT_INFORMATION = NON_FUNCTIONAL_GOAL__CONTACT_INFORMATION;

	/**
	 * The feature id for the '<em><b>Origin Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__ORIGIN_DATE = NON_FUNCTIONAL_GOAL__ORIGIN_DATE;

	/**
	 * The feature id for the '<em><b>Schedule Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__SCHEDULE_DATE = NON_FUNCTIONAL_GOAL__SCHEDULE_DATE;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__SOURCES = NON_FUNCTIONAL_GOAL__SOURCES;

	/**
	 * The feature id for the '<em><b>Evolved To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__EVOLVED_TO = NON_FUNCTIONAL_GOAL__EVOLVED_TO;

	/**
	 * The feature id for the '<em><b>Dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__DROPPED = NON_FUNCTIONAL_GOAL__DROPPED;

	/**
	 * The feature id for the '<em><b>Owned Dropping Reasons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__OWNED_DROPPING_REASONS = NON_FUNCTIONAL_GOAL__OWNED_DROPPING_REASONS;

	/**
	 * The feature id for the '<em><b>Change Uncertainty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__CHANGE_UNCERTAINTY = NON_FUNCTIONAL_GOAL__CHANGE_UNCERTAINTY;

	/**
	 * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__OWNED_EXPRESSION = NON_FUNCTIONAL_GOAL__OWNED_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Owned Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__OWNED_CONDITION = NON_FUNCTIONAL_GOAL__OWNED_CONDITION;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__DERIVED_FROM = NON_FUNCTIONAL_GOAL__DERIVED_FROM;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__CATEGORY = NON_FUNCTIONAL_GOAL__CATEGORY;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__PRIORITY = NON_FUNCTIONAL_GOAL__PRIORITY;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__SATISFACTION_LEVEL = NON_FUNCTIONAL_GOAL__SATISFACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Conflicts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__CONFLICTS = NON_FUNCTIONAL_GOAL__CONFLICTS;

	/**
	 * The feature id for the '<em><b>Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__PACKAGE = NON_FUNCTIONAL_GOAL__PACKAGE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__PROPERTY = NON_FUNCTIONAL_GOAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Sensitivity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__OWNED_SENSITIVITY = NON_FUNCTIONAL_GOAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Modality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__MODALITY = NON_FUNCTIONAL_GOAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE__BOUND = NON_FUNCTIONAL_GOAL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Quality Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_OBJECTIVE_FEATURE_COUNT = NON_FUNCTIONAL_GOAL_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.ConflictImpl <em>Conflict</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.ConflictImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getConflict()
	 * @generated
	 */
	int CONFLICT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__GOAL = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contractual Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__CONTRACTUAL_ELEMENT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT__DEGREE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conflict</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLICT_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.DesignElementReferenceImpl <em>Design Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.DesignElementReferenceImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getDesignElementReference()
	 * @generated
	 */
	int DESIGN_ELEMENT_REFERENCE = 34;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.VerifiableDesignElementRefImpl <em>Verifiable Design Element Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.VerifiableDesignElementRefImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getVerifiableDesignElementRef()
	 * @generated
	 */
	int VERIFIABLE_DESIGN_ELEMENT_REF = 35;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.SatisfiableDesignElementRefImpl <em>Satisfiable Design Element Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.SatisfiableDesignElementRefImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSatisfiableDesignElementRef()
	 * @generated
	 */
	int SATISFIABLE_DESIGN_ELEMENT_REF = 36;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.SystOverviewDesignElemRefImpl <em>Syst Overview Design Elem Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.SystOverviewDesignElemRefImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSystOverviewDesignElemRef()
	 * @generated
	 */
	int SYST_OVERVIEW_DESIGN_ELEM_REF = 38;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.SystContextDesignElemRefImpl <em>Syst Context Design Elem Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.SystContextDesignElemRefImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSystContextDesignElemRef()
	 * @generated
	 */
	int SYST_CONTEXT_DESIGN_ELEM_REF = 39;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.ReferencedDesignElementsImpl <em>Referenced Design Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.ReferencedDesignElementsImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getReferencedDesignElements()
	 * @generated
	 */
	int REFERENCED_DESIGN_ELEMENTS = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_DESIGN_ELEMENTS__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_DESIGN_ELEMENTS__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_DESIGN_ELEMENTS__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_DESIGN_ELEMENTS__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Design Element Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Agregation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_DESIGN_ELEMENTS__AGREGATION_TYPE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Referenced Design Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCED_DESIGN_ELEMENTS_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT_REFERENCE__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT_REFERENCE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT_REFERENCE__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT_REFERENCE__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Design Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT_REFERENCE__DESIGN_ELEMENT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT_REFERENCE__PARENT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Evaluation Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT_REFERENCE__EVALUATION_RESULT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parent Traceable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT_REFERENCE__PARENT_TRACEABLE_ELEMENT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Design Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_ELEMENT_REFERENCE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_DESIGN_ELEMENT_REF__NAME = DESIGN_ELEMENT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_DESIGN_ELEMENT_REF__ID = DESIGN_ELEMENT_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_DESIGN_ELEMENT_REF__DESCRIPTION = DESIGN_ELEMENT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_DESIGN_ELEMENT_REF__OWNED_USER_PROPERTIES = DESIGN_ELEMENT_REFERENCE__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Design Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_DESIGN_ELEMENT_REF__DESIGN_ELEMENT = DESIGN_ELEMENT_REFERENCE__DESIGN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_DESIGN_ELEMENT_REF__PARENT = DESIGN_ELEMENT_REFERENCE__PARENT;

	/**
	 * The feature id for the '<em><b>Evaluation Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_DESIGN_ELEMENT_REF__EVALUATION_RESULT = DESIGN_ELEMENT_REFERENCE__EVALUATION_RESULT;

	/**
	 * The feature id for the '<em><b>Parent Traceable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_DESIGN_ELEMENT_REF__PARENT_TRACEABLE_ELEMENT = DESIGN_ELEMENT_REFERENCE__PARENT_TRACEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_DESIGN_ELEMENT_REF__VERIFIED = DESIGN_ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Verifiable Design Element Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFIABLE_DESIGN_ELEMENT_REF_FEATURE_COUNT = DESIGN_ELEMENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIABLE_DESIGN_ELEMENT_REF__NAME = DESIGN_ELEMENT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIABLE_DESIGN_ELEMENT_REF__ID = DESIGN_ELEMENT_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIABLE_DESIGN_ELEMENT_REF__DESCRIPTION = DESIGN_ELEMENT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIABLE_DESIGN_ELEMENT_REF__OWNED_USER_PROPERTIES = DESIGN_ELEMENT_REFERENCE__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Design Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIABLE_DESIGN_ELEMENT_REF__DESIGN_ELEMENT = DESIGN_ELEMENT_REFERENCE__DESIGN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIABLE_DESIGN_ELEMENT_REF__PARENT = DESIGN_ELEMENT_REFERENCE__PARENT;

	/**
	 * The feature id for the '<em><b>Evaluation Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIABLE_DESIGN_ELEMENT_REF__EVALUATION_RESULT = DESIGN_ELEMENT_REFERENCE__EVALUATION_RESULT;

	/**
	 * The feature id for the '<em><b>Parent Traceable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIABLE_DESIGN_ELEMENT_REF__PARENT_TRACEABLE_ELEMENT = DESIGN_ELEMENT_REFERENCE__PARENT_TRACEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIABLE_DESIGN_ELEMENT_REF__SATISFACTION_LEVEL = DESIGN_ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Satisfiable Design Element Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFIABLE_DESIGN_ELEMENT_REF_FEATURE_COUNT = DESIGN_ELEMENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.PrioritizedSatDesignElementRefImpl <em>Prioritized Sat Design Element Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.PrioritizedSatDesignElementRefImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getPrioritizedSatDesignElementRef()
	 * @generated
	 */
	int PRIORITIZED_SAT_DESIGN_ELEMENT_REF = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_SAT_DESIGN_ELEMENT_REF__NAME = SATISFIABLE_DESIGN_ELEMENT_REF__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_SAT_DESIGN_ELEMENT_REF__ID = SATISFIABLE_DESIGN_ELEMENT_REF__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_SAT_DESIGN_ELEMENT_REF__DESCRIPTION = SATISFIABLE_DESIGN_ELEMENT_REF__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_SAT_DESIGN_ELEMENT_REF__OWNED_USER_PROPERTIES = SATISFIABLE_DESIGN_ELEMENT_REF__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Design Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_SAT_DESIGN_ELEMENT_REF__DESIGN_ELEMENT = SATISFIABLE_DESIGN_ELEMENT_REF__DESIGN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_SAT_DESIGN_ELEMENT_REF__PARENT = SATISFIABLE_DESIGN_ELEMENT_REF__PARENT;

	/**
	 * The feature id for the '<em><b>Evaluation Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_SAT_DESIGN_ELEMENT_REF__EVALUATION_RESULT = SATISFIABLE_DESIGN_ELEMENT_REF__EVALUATION_RESULT;

	/**
	 * The feature id for the '<em><b>Parent Traceable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_SAT_DESIGN_ELEMENT_REF__PARENT_TRACEABLE_ELEMENT = SATISFIABLE_DESIGN_ELEMENT_REF__PARENT_TRACEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Satisfaction Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_SAT_DESIGN_ELEMENT_REF__SATISFACTION_LEVEL = SATISFIABLE_DESIGN_ELEMENT_REF__SATISFACTION_LEVEL;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_SAT_DESIGN_ELEMENT_REF__PRIORITY = SATISFIABLE_DESIGN_ELEMENT_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_SAT_DESIGN_ELEMENT_REF__WEIGHT = SATISFIABLE_DESIGN_ELEMENT_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Prioritized Sat Design Element Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITIZED_SAT_DESIGN_ELEMENT_REF_FEATURE_COUNT = SATISFIABLE_DESIGN_ELEMENT_REF_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_OVERVIEW_DESIGN_ELEM_REF__NAME = DESIGN_ELEMENT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_OVERVIEW_DESIGN_ELEM_REF__ID = DESIGN_ELEMENT_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_OVERVIEW_DESIGN_ELEM_REF__DESCRIPTION = DESIGN_ELEMENT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_OVERVIEW_DESIGN_ELEM_REF__OWNED_USER_PROPERTIES = DESIGN_ELEMENT_REFERENCE__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Design Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_OVERVIEW_DESIGN_ELEM_REF__DESIGN_ELEMENT = DESIGN_ELEMENT_REFERENCE__DESIGN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_OVERVIEW_DESIGN_ELEM_REF__PARENT = DESIGN_ELEMENT_REFERENCE__PARENT;

	/**
	 * The feature id for the '<em><b>Evaluation Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_OVERVIEW_DESIGN_ELEM_REF__EVALUATION_RESULT = DESIGN_ELEMENT_REFERENCE__EVALUATION_RESULT;

	/**
	 * The feature id for the '<em><b>Parent Traceable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_OVERVIEW_DESIGN_ELEM_REF__PARENT_TRACEABLE_ELEMENT = DESIGN_ELEMENT_REFERENCE__PARENT_TRACEABLE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Syst Overview Design Elem Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_OVERVIEW_DESIGN_ELEM_REF_FEATURE_COUNT = DESIGN_ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_CONTEXT_DESIGN_ELEM_REF__NAME = DESIGN_ELEMENT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_CONTEXT_DESIGN_ELEM_REF__ID = DESIGN_ELEMENT_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_CONTEXT_DESIGN_ELEM_REF__DESCRIPTION = DESIGN_ELEMENT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_CONTEXT_DESIGN_ELEM_REF__OWNED_USER_PROPERTIES = DESIGN_ELEMENT_REFERENCE__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Design Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_CONTEXT_DESIGN_ELEM_REF__DESIGN_ELEMENT = DESIGN_ELEMENT_REFERENCE__DESIGN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_CONTEXT_DESIGN_ELEM_REF__PARENT = DESIGN_ELEMENT_REFERENCE__PARENT;

	/**
	 * The feature id for the '<em><b>Evaluation Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_CONTEXT_DESIGN_ELEM_REF__EVALUATION_RESULT = DESIGN_ELEMENT_REFERENCE__EVALUATION_RESULT;

	/**
	 * The feature id for the '<em><b>Parent Traceable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_CONTEXT_DESIGN_ELEM_REF__PARENT_TRACEABLE_ELEMENT = DESIGN_ELEMENT_REFERENCE__PARENT_TRACEABLE_ELEMENT;

	/**
	 * The number of structural features of the '<em>Syst Context Design Elem Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYST_CONTEXT_DESIGN_ELEM_REF_FEATURE_COUNT = DESIGN_ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.RefManuallySelectedDesignElementsImpl <em>Ref Manually Selected Design Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.RefManuallySelectedDesignElementsImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRefManuallySelectedDesignElements()
	 * @generated
	 */
	int REF_MANUALLY_SELECTED_DESIGN_ELEMENTS = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MANUALLY_SELECTED_DESIGN_ELEMENTS__NAME = REFERENCED_DESIGN_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MANUALLY_SELECTED_DESIGN_ELEMENTS__ID = REFERENCED_DESIGN_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MANUALLY_SELECTED_DESIGN_ELEMENTS__DESCRIPTION = REFERENCED_DESIGN_ELEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MANUALLY_SELECTED_DESIGN_ELEMENTS__OWNED_USER_PROPERTIES = REFERENCED_DESIGN_ELEMENTS__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Design Element Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MANUALLY_SELECTED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS = REFERENCED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS;

	/**
	 * The feature id for the '<em><b>Agregation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MANUALLY_SELECTED_DESIGN_ELEMENTS__AGREGATION_TYPE = REFERENCED_DESIGN_ELEMENTS__AGREGATION_TYPE;

	/**
	 * The number of structural features of the '<em>Ref Manually Selected Design Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_MANUALLY_SELECTED_DESIGN_ELEMENTS_FEATURE_COUNT = REFERENCED_DESIGN_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.RefQueryCollectedDesignElementsImpl <em>Ref Query Collected Design Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.RefQueryCollectedDesignElementsImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRefQueryCollectedDesignElements()
	 * @generated
	 */
	int REF_QUERY_COLLECTED_DESIGN_ELEMENTS = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_QUERY_COLLECTED_DESIGN_ELEMENTS__NAME = REFERENCED_DESIGN_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_QUERY_COLLECTED_DESIGN_ELEMENTS__ID = REFERENCED_DESIGN_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_QUERY_COLLECTED_DESIGN_ELEMENTS__DESCRIPTION = REFERENCED_DESIGN_ELEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_QUERY_COLLECTED_DESIGN_ELEMENTS__OWNED_USER_PROPERTIES = REFERENCED_DESIGN_ELEMENTS__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Design Element Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_QUERY_COLLECTED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS = REFERENCED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS;

	/**
	 * The feature id for the '<em><b>Agregation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_QUERY_COLLECTED_DESIGN_ELEMENTS__AGREGATION_TYPE = REFERENCED_DESIGN_ELEMENTS__AGREGATION_TYPE;

	/**
	 * The feature id for the '<em><b>Query Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_QUERY_COLLECTED_DESIGN_ELEMENTS__QUERY_EXPRESSION = REFERENCED_DESIGN_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Query Collected Design Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_QUERY_COLLECTED_DESIGN_ELEMENTS_FEATURE_COUNT = REFERENCED_DESIGN_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.TraceDesignElementRefImpl <em>Trace Design Element Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.TraceDesignElementRefImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getTraceDesignElementRef()
	 * @generated
	 */
	int TRACE_DESIGN_ELEMENT_REF = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DESIGN_ELEMENT_REF__NAME = DESIGN_ELEMENT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DESIGN_ELEMENT_REF__ID = DESIGN_ELEMENT_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DESIGN_ELEMENT_REF__DESCRIPTION = DESIGN_ELEMENT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DESIGN_ELEMENT_REF__OWNED_USER_PROPERTIES = DESIGN_ELEMENT_REFERENCE__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Design Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DESIGN_ELEMENT_REF__DESIGN_ELEMENT = DESIGN_ELEMENT_REFERENCE__DESIGN_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DESIGN_ELEMENT_REF__PARENT = DESIGN_ELEMENT_REFERENCE__PARENT;

	/**
	 * The feature id for the '<em><b>Evaluation Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DESIGN_ELEMENT_REF__EVALUATION_RESULT = DESIGN_ELEMENT_REFERENCE__EVALUATION_RESULT;

	/**
	 * The feature id for the '<em><b>Parent Traceable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DESIGN_ELEMENT_REF__PARENT_TRACEABLE_ELEMENT = DESIGN_ELEMENT_REFERENCE__PARENT_TRACEABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Nb Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DESIGN_ELEMENT_REF__NB_REQUIREMENTS = DESIGN_ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verification Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DESIGN_ELEMENT_REF__VERIFICATION_LEVEL = DESIGN_ELEMENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DESIGN_ELEMENT_REF__VERIFIED = DESIGN_ELEMENT_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DESIGN_ELEMENT_REF__CONTAINER = DESIGN_ELEMENT_REFERENCE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Trace Design Element Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_DESIGN_ELEMENT_REF_FEATURE_COUNT = DESIGN_ELEMENT_REFERENCE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.TraceImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__NAME = REFERENCED_DESIGN_ELEMENTS__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__ID = REFERENCED_DESIGN_ELEMENTS__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__DESCRIPTION = REFERENCED_DESIGN_ELEMENTS__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__OWNED_USER_PROPERTIES = REFERENCED_DESIGN_ELEMENTS__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Design Element Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__OWNED_DESIGN_ELEMENT_REFS = REFERENCED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS;

	/**
	 * The feature id for the '<em><b>Agregation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__AGREGATION_TYPE = REFERENCED_DESIGN_ELEMENTS__AGREGATION_TYPE;

	/**
	 * The feature id for the '<em><b>Specifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SPECIFICATIONS = REFERENCED_DESIGN_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = REFERENCED_DESIGN_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.RequirementsCoverageDataImpl <em>Requirements Coverage Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.RequirementsCoverageDataImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRequirementsCoverageData()
	 * @generated
	 */
	int REQUIREMENTS_COVERAGE_DATA = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_COVERAGE_DATA__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_COVERAGE_DATA__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_COVERAGE_DATA__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_COVERAGE_DATA__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Nb Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_COVERAGE_DATA__NB_REQUIREMENTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verification Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_COVERAGE_DATA__VERIFICATION_LEVEL = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirements Coverage Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_COVERAGE_DATA_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.NonFunctionalPropertyImpl <em>Non Functional Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.NonFunctionalPropertyImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getNonFunctionalProperty()
	 * @generated
	 */
	int NON_FUNCTIONAL_PROPERTY = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_PROPERTY__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_PROPERTY__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_PROPERTY__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_PROPERTY__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Design Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_PROPERTY__DESIGN_PROPERTY = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Functional Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_PROPERTY_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.SensitivityImpl <em>Sensitivity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.SensitivityImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSensitivity()
	 * @generated
	 */
	int SENSITIVITY = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY__NAME = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY__ID = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY__DESCRIPTION = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY__OWNED_USER_PROPERTIES = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Owned Referenced Design Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY__OWNED_REFERENCED_DESIGN_ELEMENTS = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY__SPECIFICATION = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__SPECIFICATION;

	/**
	 * The number of structural features of the '<em>Sensitivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSITIVITY_FEATURE_COUNT = TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.SubElementReferenceImpl <em>Sub Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.SubElementReferenceImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSubElementReference()
	 * @generated
	 */
	int SUB_ELEMENT_REFERENCE = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENT_REFERENCE__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENT_REFERENCE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENT_REFERENCE__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENT_REFERENCE__OWNED_USER_PROPERTIES = IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENT_REFERENCE__WEIGHT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referenced Element Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT_ENTRIES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sub Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_ELEMENT_REFERENCE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.SubRequirementReferenceImpl <em>Sub Requirement Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.SubRequirementReferenceImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSubRequirementReference()
	 * @generated
	 */
	int SUB_REQUIREMENT_REFERENCE = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_REQUIREMENT_REFERENCE__NAME = SUB_ELEMENT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_REQUIREMENT_REFERENCE__ID = SUB_ELEMENT_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_REQUIREMENT_REFERENCE__DESCRIPTION = SUB_ELEMENT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_REQUIREMENT_REFERENCE__OWNED_USER_PROPERTIES = SUB_ELEMENT_REFERENCE__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_REQUIREMENT_REFERENCE__WEIGHT = SUB_ELEMENT_REFERENCE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Referenced Element Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_REQUIREMENT_REFERENCE__REFERENCED_ELEMENT_ENTRIES = SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT_ENTRIES;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_REQUIREMENT_REFERENCE__REFERENCED_ELEMENT = SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_REQUIREMENT_REFERENCE__REQUIREMENT = SUB_ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Requirement Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_REQUIREMENT_REFERENCE_FEATURE_COUNT = SUB_ELEMENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.SubGoalReferenceImpl <em>Sub Goal Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.SubGoalReferenceImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSubGoalReference()
	 * @generated
	 */
	int SUB_GOAL_REFERENCE = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GOAL_REFERENCE__NAME = SUB_ELEMENT_REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GOAL_REFERENCE__ID = SUB_ELEMENT_REFERENCE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GOAL_REFERENCE__DESCRIPTION = SUB_ELEMENT_REFERENCE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned User Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GOAL_REFERENCE__OWNED_USER_PROPERTIES = SUB_ELEMENT_REFERENCE__OWNED_USER_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GOAL_REFERENCE__WEIGHT = SUB_ELEMENT_REFERENCE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Referenced Element Entries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GOAL_REFERENCE__REFERENCED_ELEMENT_ENTRIES = SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT_ENTRIES;

	/**
	 * The feature id for the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GOAL_REFERENCE__REFERENCED_ELEMENT = SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GOAL_REFERENCE__GOAL = SUB_ELEMENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sub Goal Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GOAL_REFERENCE_FEATURE_COUNT = SUB_ELEMENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.impl.UserPropertyImpl <em>User Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.impl.UserPropertyImpl
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getUserProperty()
	 * @generated
	 */
	int USER_PROPERTY = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>User Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.InteractionVariableType <em>Interaction Variable Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.InteractionVariableType
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getInteractionVariableType()
	 * @generated
	 */
	int INTERACTION_VARIABLE_TYPE = 51;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.AggregationType <em>Aggregation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.AggregationType
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getAggregationType()
	 * @generated
	 */
	int AGGREGATION_TYPE = 52;

	/**
	 * The meta object id for the '{@link fr.openpeople.rdal2.model.rdal.Modality <em>Modality</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.openpeople.rdal2.model.rdal.Modality
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getModality()
	 * @generated
	 */
	int MODALITY = 53;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 54;

	/**
	 * The meta object id for the '<em>Normalized Ratio</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getNormalizedRatio()
	 * @generated
	 */
	int NORMALIZED_RATIO = 57;

	/**
	 * The meta object id for the '<em>Positive Factor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Float
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getPositiveFactor()
	 * @generated
	 */
	int POSITIVE_FACTOR = 55;


	/**
	 * The meta object id for the '<em>Positive Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getPositiveInteger()
	 * @generated
	 */
	int POSITIVE_INTEGER = 56;


	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Element</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.IdentifiedElement
	 * @generated
	 */
	EClass getIdentifiedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.IdentifiedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.IdentifiedElement#getName()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.IdentifiedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.IdentifiedElement#getId()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.IdentifiedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.IdentifiedElement#getDescription()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.IdentifiedElement#getOwnedUserProperties <em>Owned User Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned User Properties</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.IdentifiedElement#getOwnedUserProperties()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EReference getIdentifiedElement_OwnedUserProperties();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.ElementRefinement <em>Element Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Refinement</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.ElementRefinement
	 * @generated
	 */
	EClass getElementRefinement();

	/**
	 * Returns the meta object for the attribute list '{@link fr.openpeople.rdal2.model.rdal.ElementRefinement#getSubElementRefEntries <em>Sub Element Ref Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sub Element Ref Entries</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.ElementRefinement#getSubElementRefEntries()
	 * @see #getElementRefinement()
	 * @generated
	 */
	EAttribute getElementRefinement_SubElementRefEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.ElementRefinement#getOwnedSubElementRefs <em>Owned Sub Element Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Sub Element Refs</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.ElementRefinement#getOwnedSubElementRefs()
	 * @see #getElementRefinement()
	 * @generated
	 */
	EReference getElementRefinement_OwnedSubElementRefs();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.ElementRefinement#getSubElements <em>Sub Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Elements</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.ElementRefinement#getSubElements()
	 * @see #getElementRefinement()
	 * @generated
	 */
	EReference getElementRefinement_SubElements();

	/**
	 * Returns the meta object for the attribute list '{@link fr.openpeople.rdal2.model.rdal.ElementRefinement#getRefinedElementEntries <em>Refined Element Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Refined Element Entries</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.ElementRefinement#getRefinedElementEntries()
	 * @see #getElementRefinement()
	 * @generated
	 */
	EAttribute getElementRefinement_RefinedElementEntries();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.ElementRefinement#getRefinedElement <em>Refined Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined Element</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.ElementRefinement#getRefinedElement()
	 * @see #getElementRefinement()
	 * @generated
	 */
	EReference getElementRefinement_RefinedElement();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.RequirementRefinement <em>Requirement Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Refinement</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RequirementRefinement
	 * @generated
	 */
	EClass getRequirementRefinement();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.RequirementRefinement#getOwnedSubRequirementRefs <em>Owned Sub Requirement Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Sub Requirement Refs</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RequirementRefinement#getOwnedSubRequirementRefs()
	 * @see #getRequirementRefinement()
	 * @generated
	 */
	EReference getRequirementRefinement_OwnedSubRequirementRefs();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.RequirementRefinement#getSubRequirements <em>Sub Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Requirements</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RequirementRefinement#getSubRequirements()
	 * @see #getRequirementRefinement()
	 * @generated
	 */
	EReference getRequirementRefinement_SubRequirements();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.RequirementRefinement#getRefinedRequirement <em>Refined Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined Requirement</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RequirementRefinement#getRefinedRequirement()
	 * @see #getRequirementRefinement()
	 * @generated
	 */
	EReference getRequirementRefinement_RefinedRequirement();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.GoalRefinement <em>Goal Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal Refinement</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.GoalRefinement
	 * @generated
	 */
	EClass getGoalRefinement();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.GoalRefinement#getOwnedSubGoalRefs <em>Owned Sub Goal Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Sub Goal Refs</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.GoalRefinement#getOwnedSubGoalRefs()
	 * @see #getGoalRefinement()
	 * @generated
	 */
	EReference getGoalRefinement_OwnedSubGoalRefs();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.GoalRefinement#getSubGoals <em>Sub Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Goals</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.GoalRefinement#getSubGoals()
	 * @see #getGoalRefinement()
	 * @generated
	 */
	EReference getGoalRefinement_SubGoals();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.GoalRefinement#getRefinedGoal <em>Refined Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refined Goal</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.GoalRefinement#getRefinedGoal()
	 * @see #getGoalRefinement()
	 * @generated
	 */
	EReference getGoalRefinement_RefinedGoal();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement <em>Traceable To Design Elements Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traceable To Design Elements Element</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement
	 * @generated
	 */
	EClass getTraceableToDesignElementsElement();

	/**
	 * Returns the meta object for the containment reference '{@link fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement#getOwnedReferencedDesignElements <em>Owned Referenced Design Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Referenced Design Elements</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement#getOwnedReferencedDesignElements()
	 * @see #getTraceableToDesignElementsElement()
	 * @generated
	 */
	EReference getTraceableToDesignElementsElement_OwnedReferencedDesignElements();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specification</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement#getSpecification()
	 * @see #getTraceableToDesignElementsElement()
	 * @generated
	 */
	EReference getTraceableToDesignElementsElement_Specification();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement <em>Abstract Contractual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Contractual Element</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractContractualElement
	 * @generated
	 */
	EClass getAbstractContractualElement();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getStakeholders <em>Stakeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stakeholders</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getStakeholders()
	 * @see #getAbstractContractualElement()
	 * @generated
	 */
	EReference getAbstractContractualElement_Stakeholders();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getOwnedRationales <em>Owned Rationales</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Rationales</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getOwnedRationales()
	 * @see #getAbstractContractualElement()
	 * @generated
	 */
	EReference getAbstractContractualElement_OwnedRationales();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getContactInformation <em>Contact Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contact Information</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getContactInformation()
	 * @see #getAbstractContractualElement()
	 * @generated
	 */
	EReference getAbstractContractualElement_ContactInformation();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getOriginDate <em>Origin Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin Date</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getOriginDate()
	 * @see #getAbstractContractualElement()
	 * @generated
	 */
	EAttribute getAbstractContractualElement_OriginDate();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getScheduleDate <em>Schedule Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Date</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getScheduleDate()
	 * @see #getAbstractContractualElement()
	 * @generated
	 */
	EAttribute getAbstractContractualElement_ScheduleDate();

	/**
	 * Returns the meta object for the attribute list '{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sources</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getSources()
	 * @see #getAbstractContractualElement()
	 * @generated
	 */
	EAttribute getAbstractContractualElement_Sources();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getEvolvedTo <em>Evolved To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evolved To</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getEvolvedTo()
	 * @see #getAbstractContractualElement()
	 * @generated
	 */
	EReference getAbstractContractualElement_EvolvedTo();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#isDropped <em>Dropped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dropped</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractContractualElement#isDropped()
	 * @see #getAbstractContractualElement()
	 * @generated
	 */
	EAttribute getAbstractContractualElement_Dropped();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getOwnedDroppingReasons <em>Owned Dropping Reasons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Dropping Reasons</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getOwnedDroppingReasons()
	 * @see #getAbstractContractualElement()
	 * @generated
	 */
	EReference getAbstractContractualElement_OwnedDroppingReasons();

	/**
	 * Returns the meta object for the containment reference '{@link fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getChangeUncertainty <em>Change Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change Uncertainty</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractContractualElement#getChangeUncertainty()
	 * @see #getAbstractContractualElement()
	 * @generated
	 */
	EReference getAbstractContractualElement_ChangeUncertainty();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.ContactInformation <em>Contact Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact Information</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.ContactInformation
	 * @generated
	 */
	EClass getContactInformation();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.ContactInformation#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.ContactInformation#getAddress()
	 * @see #getContactInformation()
	 * @generated
	 */
	EAttribute getContactInformation_Address();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.ContactInformation#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.ContactInformation#getEmail()
	 * @see #getContactInformation()
	 * @generated
	 */
	EAttribute getContactInformation_Email();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.ContactInformation#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.ContactInformation#getPhoneNumber()
	 * @see #getContactInformation()
	 * @generated
	 */
	EAttribute getContactInformation_PhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.ContactInformation#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.ContactInformation#getCountry()
	 * @see #getContactInformation()
	 * @generated
	 */
	EAttribute getContactInformation_Country();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stakeholder</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Stakeholder
	 * @generated
	 */
	EClass getStakeholder();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.Stakeholder#getContactInformation <em>Contact Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contact Information</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Stakeholder#getContactInformation()
	 * @see #getStakeholder()
	 * @generated
	 */
	EReference getStakeholder_ContactInformation();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.Rationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rationale</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Rationale
	 * @generated
	 */
	EClass getRationale();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.Rationale#getStakeholders <em>Stakeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stakeholders</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Rationale#getStakeholders()
	 * @see #getRationale()
	 * @generated
	 */
	EReference getRationale_Stakeholders();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.TextualContractualElement <em>Textual Contractual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textual Contractual Element</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.TextualContractualElement
	 * @generated
	 */
	EClass getTextualContractualElement();

	/**
	 * Returns the meta object for the containment reference '{@link fr.openpeople.rdal2.model.rdal.TextualContractualElement#getOwnedExpression <em>Owned Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Expression</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.TextualContractualElement#getOwnedExpression()
	 * @see #getTextualContractualElement()
	 * @generated
	 */
	EReference getTextualContractualElement_OwnedExpression();

	/**
	 * Returns the meta object for the containment reference '{@link fr.openpeople.rdal2.model.rdal.TextualContractualElement#getOwnedCondition <em>Owned Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Condition</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.TextualContractualElement#getOwnedCondition()
	 * @see #getTextualContractualElement()
	 * @generated
	 */
	EReference getTextualContractualElement_OwnedCondition();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.TextualContractualElement#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derived From</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.TextualContractualElement#getDerivedFrom()
	 * @see #getTextualContractualElement()
	 * @generated
	 */
	EReference getTextualContractualElement_DerivedFrom();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.TextualContractualElement#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.TextualContractualElement#getCategory()
	 * @see #getTextualContractualElement()
	 * @generated
	 */
	EReference getTextualContractualElement_Category();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.TextualContractualElement#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.TextualContractualElement#getPriority()
	 * @see #getTextualContractualElement()
	 * @generated
	 */
	EAttribute getTextualContractualElement_Priority();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.Uncertainty <em>Uncertainty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uncertainty</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Uncertainty
	 * @generated
	 */
	EClass getUncertainty();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getVolatility <em>Volatility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volatility</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Uncertainty#getVolatility()
	 * @see #getUncertainty()
	 * @generated
	 */
	EAttribute getUncertainty_Volatility();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getCostsImpact <em>Costs Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Costs Impact</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Uncertainty#getCostsImpact()
	 * @see #getUncertainty()
	 * @generated
	 */
	EAttribute getUncertainty_CostsImpact();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getScheduleImpact <em>Schedule Impact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schedule Impact</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Uncertainty#getScheduleImpact()
	 * @see #getUncertainty()
	 * @generated
	 */
	EAttribute getUncertainty_ScheduleImpact();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getTimeCriticality <em>Time Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Criticality</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Uncertainty#getTimeCriticality()
	 * @see #getUncertainty()
	 * @generated
	 */
	EAttribute getUncertainty_TimeCriticality();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getFamiliarity <em>Familiarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Familiarity</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Uncertainty#getFamiliarity()
	 * @see #getUncertainty()
	 * @generated
	 */
	EAttribute getUncertainty_Familiarity();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getRiskIndex <em>Risk Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Index</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Uncertainty#getRiskIndex()
	 * @see #getUncertainty()
	 * @generated
	 */
	EAttribute getUncertainty_RiskIndex();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getPropRiskIndex <em>Prop Risk Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prop Risk Index</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Uncertainty#getPropRiskIndex()
	 * @see #getUncertainty()
	 * @generated
	 */
	EAttribute getUncertainty_PropRiskIndex();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.Uncertainty#getMaturityIndex <em>Maturity Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maturity Index</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Uncertainty#getMaturityIndex()
	 * @see #getUncertainty()
	 * @generated
	 */
	EAttribute getUncertainty_MaturityIndex();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.SatisfiableElement <em>Satisfiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfiable Element</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SatisfiableElement
	 * @generated
	 */
	EClass getSatisfiableElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.SatisfiableElement#getSatisfactionLevel <em>Satisfaction Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfaction Level</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SatisfiableElement#getSatisfactionLevel()
	 * @see #getSatisfiableElement()
	 * @generated
	 */
	EAttribute getSatisfiableElement_SatisfactionLevel();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.VerifiableElement <em>Verifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verifiable Element</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.VerifiableElement
	 * @generated
	 */
	EClass getVerifiableElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.VerifiableElement#getVerified <em>Verified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verified</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.VerifiableElement#getVerified()
	 * @see #getVerifiableElement()
	 * @generated
	 */
	EAttribute getVerifiableElement_Verified();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.Specification#getOwnedPackages <em>Owned Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Packages</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Specification#getOwnedPackages()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_OwnedPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.Specification#getOwnedContactInformation <em>Owned Contact Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Contact Information</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Specification#getOwnedContactInformation()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_OwnedContactInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.Specification#getOwnedConflicts <em>Owned Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Conflicts</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Specification#getOwnedConflicts()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_OwnedConflicts();

	/**
	 * Returns the meta object for the containment reference '{@link fr.openpeople.rdal2.model.rdal.Specification#getOwnedSystOverview <em>Owned Syst Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Syst Overview</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Specification#getOwnedSystOverview()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_OwnedSystOverview();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.Specification#getConstraintLanguagesSpec <em>Constraint Languages Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraint Languages Spec</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Specification#getConstraintLanguagesSpec()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_ConstraintLanguagesSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.Specification#getOwnedActorReferences <em>Owned Actor References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Actor References</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Specification#getOwnedActorReferences()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_OwnedActorReferences();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.Specification#getPrimaryActors <em>Primary Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Primary Actors</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Specification#getPrimaryActors()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_PrimaryActors();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.Specification#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Specification#getVersion()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.Specification#getOwnedNonFuncProperties <em>Owned Non Func Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Non Func Properties</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Specification#getOwnedNonFuncProperties()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_OwnedNonFuncProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.Specification#getOwnedStakeholders <em>Owned Stakeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Stakeholders</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Specification#getOwnedStakeholders()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_OwnedStakeholders();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage <em>Org Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Org Package</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RdalOrgPackage
	 * @generated
	 */
	EClass getRdalOrgPackage();

	/**
	 * Returns the meta object for the container reference '{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specification</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getSpecification()
	 * @see #getRdalOrgPackage()
	 * @generated
	 */
	EReference getRdalOrgPackage_Specification();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Packages</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getSubPackages()
	 * @see #getRdalOrgPackage()
	 * @generated
	 */
	EReference getRdalOrgPackage_SubPackages();

	/**
	 * Returns the meta object for the attribute list '{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getContractualElementEntries <em>Contractual Element Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Contractual Element Entries</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getContractualElementEntries()
	 * @see #getRdalOrgPackage()
	 * @generated
	 */
	EAttribute getRdalOrgPackage_ContractualElementEntries();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getParent()
	 * @see #getRdalOrgPackage()
	 * @generated
	 */
	EReference getRdalOrgPackage_Parent();

	/**
	 * Returns the meta object for the attribute list '{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getRefinementEntries <em>Refinement Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Refinement Entries</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getRefinementEntries()
	 * @see #getRdalOrgPackage()
	 * @generated
	 */
	EAttribute getRdalOrgPackage_RefinementEntries();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getOwnedRefinements <em>Owned Refinements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Refinements</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getOwnedRefinements()
	 * @see #getRdalOrgPackage()
	 * @generated
	 */
	EReference getRdalOrgPackage_OwnedRefinements();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getOwnedContractualElements <em>Owned Contractual Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Contractual Elements</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getOwnedContractualElements()
	 * @see #getRdalOrgPackage()
	 * @generated
	 */
	EReference getRdalOrgPackage_OwnedContractualElements();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.RequirementsPackage <em>Requirements Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Package</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RequirementsPackage
	 * @generated
	 */
	EClass getRequirementsPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.RequirementsPackage#getOwnedRequirements <em>Owned Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Requirements</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RequirementsPackage#getOwnedRequirements()
	 * @see #getRequirementsPackage()
	 * @generated
	 */
	EReference getRequirementsPackage_OwnedRequirements();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.RequirementsPackage#getFunctionUsedIn <em>Function Used In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function Used In</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RequirementsPackage#getFunctionUsedIn()
	 * @see #getRequirementsPackage()
	 * @generated
	 */
	EReference getRequirementsPackage_FunctionUsedIn();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.RequirementsPackage#getOwnedRequirementsRefinements <em>Owned Requirements Refinements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Requirements Refinements</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RequirementsPackage#getOwnedRequirementsRefinements()
	 * @see #getRequirementsPackage()
	 * @generated
	 */
	EReference getRequirementsPackage_OwnedRequirementsRefinements();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.GoalsPackage <em>Goals Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goals Package</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.GoalsPackage
	 * @generated
	 */
	EClass getGoalsPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.GoalsPackage#getOwnedGoals <em>Owned Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Goals</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.GoalsPackage#getOwnedGoals()
	 * @see #getGoalsPackage()
	 * @generated
	 */
	EReference getGoalsPackage_OwnedGoals();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.GoalsPackage#getOwnedGoalRefinements <em>Owned Goal Refinements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Goal Refinements</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.GoalsPackage#getOwnedGoalRefinements()
	 * @see #getGoalsPackage()
	 * @generated
	 */
	EReference getGoalsPackage_OwnedGoalRefinements();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.SystemOverview <em>System Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Overview</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SystemOverview
	 * @generated
	 */
	EClass getSystemOverview();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.SystemOverview#getOwnedCapabilities <em>Owned Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Capabilities</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SystemOverview#getOwnedCapabilities()
	 * @see #getSystemOverview()
	 * @generated
	 */
	EReference getSystemOverview_OwnedCapabilities();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.SystemOverview#getGlobalSystem <em>Global System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Global System</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SystemOverview#getGlobalSystem()
	 * @see #getSystemOverview()
	 * @generated
	 */
	EReference getSystemOverview_GlobalSystem();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.SystemOverview#getSystemToBe <em>System To Be</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System To Be</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SystemOverview#getSystemToBe()
	 * @see #getSystemOverview()
	 * @generated
	 */
	EReference getSystemOverview_SystemToBe();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.SystemOverview#getOwnedContexts <em>Owned Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Contexts</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SystemOverview#getOwnedContexts()
	 * @see #getSystemOverview()
	 * @generated
	 */
	EReference getSystemOverview_OwnedContexts();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.SystemOverview#getOwnedSystemBoundary <em>Owned System Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned System Boundary</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SystemOverview#getOwnedSystemBoundary()
	 * @see #getSystemOverview()
	 * @generated
	 */
	EReference getSystemOverview_OwnedSystemBoundary();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.SystemOverview#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SystemOverview#getPurpose()
	 * @see #getSystemOverview()
	 * @generated
	 */
	EAttribute getSystemOverview_Purpose();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.Capability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capability</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Capability
	 * @generated
	 */
	EClass getCapability();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.SystemContext <em>System Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Context</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SystemContext
	 * @generated
	 */
	EClass getSystemContext();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.SystemContext#getGlobalSystemContext <em>Global System Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Global System Context</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SystemContext#getGlobalSystemContext()
	 * @see #getSystemContext()
	 * @generated
	 */
	EReference getSystemContext_GlobalSystemContext();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.SystemContext#getSystemContextBoundary <em>System Context Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>System Context Boundary</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SystemContext#getSystemContextBoundary()
	 * @see #getSystemContext()
	 * @generated
	 */
	EReference getSystemContext_SystemContextBoundary();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.SystemContext#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Actors</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SystemContext#getActors()
	 * @see #getSystemContext()
	 * @generated
	 */
	EReference getSystemContext_Actors();

	/**
	 * Returns the meta object for the container reference '{@link fr.openpeople.rdal2.model.rdal.SystemContext#getSystemOverview <em>System Overview</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>System Overview</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SystemContext#getSystemOverview()
	 * @see #getSystemContext()
	 * @generated
	 */
	EReference getSystemContext_SystemOverview();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.Variable#getDesignVariable <em>Design Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Variable</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Variable#getDesignVariable()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_DesignVariable();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.InteractionVariable <em>Interaction Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Variable</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.InteractionVariable
	 * @generated
	 */
	EClass getInteractionVariable();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.InteractionVariable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.InteractionVariable#getType()
	 * @see #getInteractionVariable()
	 * @generated
	 */
	EAttribute getInteractionVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.InteractionVariable#isNeglected <em>Neglected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neglected</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.InteractionVariable#isNeglected()
	 * @see #getInteractionVariable()
	 * @generated
	 */
	EAttribute getInteractionVariable_Neglected();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.ActorReference <em>Actor Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Reference</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.ActorReference
	 * @generated
	 */
	EClass getActorReference();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.ActorReference#getReferencedActors <em>Referenced Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Referenced Actors</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.ActorReference#getReferencedActors()
	 * @see #getActorReference()
	 * @generated
	 */
	EReference getActorReference_ReferencedActors();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.RefineableElement <em>Refineable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refineable Element</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RefineableElement
	 * @generated
	 */
	EClass getRefineableElement();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.AbstractRequirement <em>Abstract Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Requirement</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractRequirement
	 * @generated
	 */
	EClass getAbstractRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.AbstractRequirement#getOwnedVerifiedBy <em>Owned Verified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Verified By</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractRequirement#getOwnedVerifiedBy()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_OwnedVerifiedBy();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.AbstractRequirement#getRisk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractRequirement#getRisk()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EAttribute getAbstractRequirement_Risk();

	/**
	 * Returns the meta object for the container reference '{@link fr.openpeople.rdal2.model.rdal.AbstractRequirement#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractRequirement#getPackage()
	 * @see #getAbstractRequirement()
	 * @generated
	 */
	EReference getAbstractRequirement_Package();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.VerificationActivity <em>Verification Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verification Activity</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.VerificationActivity
	 * @generated
	 */
	EClass getVerificationActivity();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.VerificationActivity#getExternalRefs <em>External Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Refs</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.VerificationActivity#getExternalRefs()
	 * @see #getVerificationActivity()
	 * @generated
	 */
	EReference getVerificationActivity_ExternalRefs();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.VerificationActivity#isPassed <em>Passed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passed</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.VerificationActivity#isPassed()
	 * @see #getVerificationActivity()
	 * @generated
	 */
	EAttribute getVerificationActivity_Passed();

	/**
	 * Returns the meta object for the container reference '{@link fr.openpeople.rdal2.model.rdal.VerificationActivity#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Requirements</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.VerificationActivity#getRequirements()
	 * @see #getVerificationActivity()
	 * @generated
	 */
	EReference getVerificationActivity_Requirements();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.VerificationActivity#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.VerificationActivity#getCategory()
	 * @see #getVerificationActivity()
	 * @generated
	 */
	EReference getVerificationActivity_Category();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.Requirement#getImageAssumptions <em>Image Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image Assumptions</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Requirement#getImageAssumptions()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_ImageAssumptions();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.Requirement#getFunctionUsedIn <em>Function Used In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Function Used In</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Requirement#getFunctionUsedIn()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_FunctionUsedIn();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.Assumption#getImageRequirement <em>Image Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image Requirement</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Assumption#getImageRequirement()
	 * @see #getAssumption()
	 * @generated
	 */
	EReference getAssumption_ImageRequirement();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.Assumption#getImageAssumptions <em>Image Assumptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Image Assumptions</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Assumption#getImageAssumptions()
	 * @see #getAssumption()
	 * @generated
	 */
	EReference getAssumption_ImageAssumptions();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.AbstractGoal <em>Abstract Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Goal</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractGoal
	 * @generated
	 */
	EClass getAbstractGoal();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.AbstractGoal#getConflicts <em>Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conflicts</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractGoal#getConflicts()
	 * @see #getAbstractGoal()
	 * @generated
	 */
	EReference getAbstractGoal_Conflicts();

	/**
	 * Returns the meta object for the container reference '{@link fr.openpeople.rdal2.model.rdal.AbstractGoal#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Package</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AbstractGoal#getPackage()
	 * @see #getAbstractGoal()
	 * @generated
	 */
	EReference getAbstractGoal_Package();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.SystemFunctionGoal <em>System Function Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Function Goal</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SystemFunctionGoal
	 * @generated
	 */
	EClass getSystemFunctionGoal();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.SystemFunctionGoal#getUseCases <em>Use Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use Cases</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SystemFunctionGoal#getUseCases()
	 * @see #getSystemFunctionGoal()
	 * @generated
	 */
	EReference getSystemFunctionGoal_UseCases();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.NonFunctionalGoal <em>Non Functional Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Functional Goal</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.NonFunctionalGoal
	 * @generated
	 */
	EClass getNonFunctionalGoal();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.QualityObjective <em>Quality Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Objective</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.QualityObjective
	 * @generated
	 */
	EClass getQualityObjective();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.QualityObjective#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.QualityObjective#getProperty()
	 * @see #getQualityObjective()
	 * @generated
	 */
	EReference getQualityObjective_Property();

	/**
	 * Returns the meta object for the containment reference '{@link fr.openpeople.rdal2.model.rdal.QualityObjective#getOwnedSensitivity <em>Owned Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Sensitivity</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.QualityObjective#getOwnedSensitivity()
	 * @see #getQualityObjective()
	 * @generated
	 */
	EReference getQualityObjective_OwnedSensitivity();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.QualityObjective#getModality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modality</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.QualityObjective#getModality()
	 * @see #getQualityObjective()
	 * @generated
	 */
	EAttribute getQualityObjective_Modality();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.QualityObjective#getBound <em>Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bound</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.QualityObjective#getBound()
	 * @see #getQualityObjective()
	 * @generated
	 */
	EAttribute getQualityObjective_Bound();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.Conflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conflict</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Conflict
	 * @generated
	 */
	EClass getConflict();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.Conflict#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Conflict#getGoal()
	 * @see #getConflict()
	 * @generated
	 */
	EReference getConflict_Goal();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.Conflict#getContractualElement <em>Contractual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contractual Element</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Conflict#getContractualElement()
	 * @see #getConflict()
	 * @generated
	 */
	EReference getConflict_ContractualElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.Conflict#getDegree <em>Degree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degree</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Conflict#getDegree()
	 * @see #getConflict()
	 * @generated
	 */
	EAttribute getConflict_Degree();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.DesignElementReference <em>Design Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design Element Reference</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.DesignElementReference
	 * @generated
	 */
	EClass getDesignElementReference();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.DesignElementReference#getDesignElement <em>Design Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Element</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.DesignElementReference#getDesignElement()
	 * @see #getDesignElementReference()
	 * @generated
	 */
	EReference getDesignElementReference_DesignElement();

	/**
	 * Returns the meta object for the container reference '{@link fr.openpeople.rdal2.model.rdal.DesignElementReference#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.DesignElementReference#getParent()
	 * @see #getDesignElementReference()
	 * @generated
	 */
	EReference getDesignElementReference_Parent();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.DesignElementReference#getEvaluationResult <em>Evaluation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluation Result</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.DesignElementReference#getEvaluationResult()
	 * @see #getDesignElementReference()
	 * @generated
	 */
	EAttribute getDesignElementReference_EvaluationResult();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.DesignElementReference#getParentTraceableElement <em>Parent Traceable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Traceable Element</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.DesignElementReference#getParentTraceableElement()
	 * @see #getDesignElementReference()
	 * @generated
	 */
	EReference getDesignElementReference_ParentTraceableElement();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.VerifiableDesignElementRef <em>Verifiable Design Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verifiable Design Element Ref</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.VerifiableDesignElementRef
	 * @generated
	 */
	EClass getVerifiableDesignElementRef();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.SatisfiableDesignElementRef <em>Satisfiable Design Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfiable Design Element Ref</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SatisfiableDesignElementRef
	 * @generated
	 */
	EClass getSatisfiableDesignElementRef();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.PrioritizedSatDesignElementRef <em>Prioritized Sat Design Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prioritized Sat Design Element Ref</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.PrioritizedSatDesignElementRef
	 * @generated
	 */
	EClass getPrioritizedSatDesignElementRef();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.PrioritizedSatDesignElementRef#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.PrioritizedSatDesignElementRef#getPriority()
	 * @see #getPrioritizedSatDesignElementRef()
	 * @generated
	 */
	EAttribute getPrioritizedSatDesignElementRef_Priority();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.PrioritizedSatDesignElementRef#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.PrioritizedSatDesignElementRef#getWeight()
	 * @see #getPrioritizedSatDesignElementRef()
	 * @generated
	 */
	EAttribute getPrioritizedSatDesignElementRef_Weight();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.SystOverviewDesignElemRef <em>Syst Overview Design Elem Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syst Overview Design Elem Ref</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SystOverviewDesignElemRef
	 * @generated
	 */
	EClass getSystOverviewDesignElemRef();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.SystContextDesignElemRef <em>Syst Context Design Elem Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Syst Context Design Elem Ref</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SystContextDesignElemRef
	 * @generated
	 */
	EClass getSystContextDesignElemRef();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.ReferencedDesignElements <em>Referenced Design Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Referenced Design Elements</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.ReferencedDesignElements
	 * @generated
	 */
	EClass getReferencedDesignElements();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.openpeople.rdal2.model.rdal.ReferencedDesignElements#getOwnedDesignElementRefs <em>Owned Design Element Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Design Element Refs</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.ReferencedDesignElements#getOwnedDesignElementRefs()
	 * @see #getReferencedDesignElements()
	 * @generated
	 */
	EReference getReferencedDesignElements_OwnedDesignElementRefs();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.ReferencedDesignElements#getAgregationType <em>Agregation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agregation Type</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.ReferencedDesignElements#getAgregationType()
	 * @see #getReferencedDesignElements()
	 * @generated
	 */
	EAttribute getReferencedDesignElements_AgregationType();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.RefManuallySelectedDesignElements <em>Ref Manually Selected Design Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Manually Selected Design Elements</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RefManuallySelectedDesignElements
	 * @generated
	 */
	EClass getRefManuallySelectedDesignElements();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.RefQueryCollectedDesignElements <em>Ref Query Collected Design Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Query Collected Design Elements</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RefQueryCollectedDesignElements
	 * @generated
	 */
	EClass getRefQueryCollectedDesignElements();

	/**
	 * Returns the meta object for the containment reference '{@link fr.openpeople.rdal2.model.rdal.RefQueryCollectedDesignElements#getQueryExpression <em>Query Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query Expression</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RefQueryCollectedDesignElements#getQueryExpression()
	 * @see #getRefQueryCollectedDesignElements()
	 * @generated
	 */
	EReference getRefQueryCollectedDesignElements_QueryExpression();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.TraceDesignElementRef <em>Trace Design Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Design Element Ref</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.TraceDesignElementRef
	 * @generated
	 */
	EClass getTraceDesignElementRef();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.TraceDesignElementRef#isContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.TraceDesignElementRef#isContainer()
	 * @see #getTraceDesignElementRef()
	 * @generated
	 */
	EAttribute getTraceDesignElementRef_Container();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the reference list '{@link fr.openpeople.rdal2.model.rdal.Trace#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specifications</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Trace#getSpecifications()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Specifications();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.RequirementsCoverageData <em>Requirements Coverage Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Coverage Data</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RequirementsCoverageData
	 * @generated
	 */
	EClass getRequirementsCoverageData();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.RequirementsCoverageData#getNbRequirements <em>Nb Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Requirements</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RequirementsCoverageData#getNbRequirements()
	 * @see #getRequirementsCoverageData()
	 * @generated
	 */
	EAttribute getRequirementsCoverageData_NbRequirements();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.RequirementsCoverageData#getVerificationLevel <em>Verification Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verification Level</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.RequirementsCoverageData#getVerificationLevel()
	 * @see #getRequirementsCoverageData()
	 * @generated
	 */
	EAttribute getRequirementsCoverageData_VerificationLevel();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.NonFunctionalProperty <em>Non Functional Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Functional Property</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.NonFunctionalProperty
	 * @generated
	 */
	EClass getNonFunctionalProperty();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.NonFunctionalProperty#getDesignProperty <em>Design Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Design Property</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.NonFunctionalProperty#getDesignProperty()
	 * @see #getNonFunctionalProperty()
	 * @generated
	 */
	EReference getNonFunctionalProperty_DesignProperty();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.Sensitivity <em>Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensitivity</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Sensitivity
	 * @generated
	 */
	EClass getSensitivity();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.SubElementReference <em>Sub Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Element Reference</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SubElementReference
	 * @generated
	 */
	EClass getSubElementReference();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.SubElementReference#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SubElementReference#getWeight()
	 * @see #getSubElementReference()
	 * @generated
	 */
	EAttribute getSubElementReference_Weight();

	/**
	 * Returns the meta object for the attribute list '{@link fr.openpeople.rdal2.model.rdal.SubElementReference#getReferencedElementEntries <em>Referenced Element Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Referenced Element Entries</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SubElementReference#getReferencedElementEntries()
	 * @see #getSubElementReference()
	 * @generated
	 */
	EAttribute getSubElementReference_ReferencedElementEntries();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.SubElementReference#getReferencedElement <em>Referenced Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Element</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SubElementReference#getReferencedElement()
	 * @see #getSubElementReference()
	 * @generated
	 */
	EReference getSubElementReference_ReferencedElement();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.SubRequirementReference <em>Sub Requirement Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Requirement Reference</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SubRequirementReference
	 * @generated
	 */
	EClass getSubRequirementReference();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.SubRequirementReference#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SubRequirementReference#getRequirement()
	 * @see #getSubRequirementReference()
	 * @generated
	 */
	EReference getSubRequirementReference_Requirement();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.SubGoalReference <em>Sub Goal Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Goal Reference</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SubGoalReference
	 * @generated
	 */
	EClass getSubGoalReference();

	/**
	 * Returns the meta object for the reference '{@link fr.openpeople.rdal2.model.rdal.SubGoalReference#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.SubGoalReference#getGoal()
	 * @see #getSubGoalReference()
	 * @generated
	 */
	EReference getSubGoalReference_Goal();

	/**
	 * Returns the meta object for class '{@link fr.openpeople.rdal2.model.rdal.UserProperty <em>User Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Property</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.UserProperty
	 * @generated
	 */
	EClass getUserProperty();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.UserProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.UserProperty#getName()
	 * @see #getUserProperty()
	 * @generated
	 */
	EAttribute getUserProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.openpeople.rdal2.model.rdal.UserProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.UserProperty#getValue()
	 * @see #getUserProperty()
	 * @generated
	 */
	EAttribute getUserProperty_Value();

	/**
	 * Returns the meta object for enum '{@link fr.openpeople.rdal2.model.rdal.InteractionVariableType <em>Interaction Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Interaction Variable Type</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.InteractionVariableType
	 * @generated
	 */
	EEnum getInteractionVariableType();

	/**
	 * Returns the meta object for enum '{@link fr.openpeople.rdal2.model.rdal.AggregationType <em>Aggregation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Type</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.AggregationType
	 * @generated
	 */
	EEnum getAggregationType();

	/**
	 * Returns the meta object for enum '{@link fr.openpeople.rdal2.model.rdal.Modality <em>Modality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Modality</em>'.
	 * @see fr.openpeople.rdal2.model.rdal.Modality
	 * @generated
	 */
	EEnum getModality();

	/**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Normalized Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Normalized Ratio</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='rangeZeroOne'"
	 * @generated
	 */
	EDataType getNormalizedRatio();

	/**
	 * Returns the meta object for data type '{@link java.lang.Float <em>Positive Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Factor</em>'.
	 * @see java.lang.Float
	 * @model instanceClass="java.lang.Float"
	 * @generated
	 */
	EDataType getPositiveFactor();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Positive Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Positive Integer</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	EDataType getPositiveInteger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RdalFactory getRdalFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.IdentifiedElementImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getIdentifiedElement()
		 * @generated
		 */
		EClass IDENTIFIED_ELEMENT = eINSTANCE.getIdentifiedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__NAME = eINSTANCE.getIdentifiedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__ID = eINSTANCE.getIdentifiedElement_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__DESCRIPTION = eINSTANCE.getIdentifiedElement_Description();

		/**
		 * The meta object literal for the '<em><b>Owned User Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES = eINSTANCE.getIdentifiedElement_OwnedUserProperties();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.ElementRefinementImpl <em>Element Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.ElementRefinementImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getElementRefinement()
		 * @generated
		 */
		EClass ELEMENT_REFINEMENT = eINSTANCE.getElementRefinement();

		/**
		 * The meta object literal for the '<em><b>Sub Element Ref Entries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_REFINEMENT__SUB_ELEMENT_REF_ENTRIES = eINSTANCE.getElementRefinement_SubElementRefEntries();

		/**
		 * The meta object literal for the '<em><b>Owned Sub Element Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_REFINEMENT__OWNED_SUB_ELEMENT_REFS = eINSTANCE.getElementRefinement_OwnedSubElementRefs();

		/**
		 * The meta object literal for the '<em><b>Sub Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_REFINEMENT__SUB_ELEMENTS = eINSTANCE.getElementRefinement_SubElements();

		/**
		 * The meta object literal for the '<em><b>Refined Element Entries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_REFINEMENT__REFINED_ELEMENT_ENTRIES = eINSTANCE.getElementRefinement_RefinedElementEntries();

		/**
		 * The meta object literal for the '<em><b>Refined Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_REFINEMENT__REFINED_ELEMENT = eINSTANCE.getElementRefinement_RefinedElement();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.RequirementRefinementImpl <em>Requirement Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.RequirementRefinementImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRequirementRefinement()
		 * @generated
		 */
		EClass REQUIREMENT_REFINEMENT = eINSTANCE.getRequirementRefinement();

		/**
		 * The meta object literal for the '<em><b>Owned Sub Requirement Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_REFINEMENT__OWNED_SUB_REQUIREMENT_REFS = eINSTANCE.getRequirementRefinement_OwnedSubRequirementRefs();

		/**
		 * The meta object literal for the '<em><b>Sub Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_REFINEMENT__SUB_REQUIREMENTS = eINSTANCE.getRequirementRefinement_SubRequirements();

		/**
		 * The meta object literal for the '<em><b>Refined Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_REFINEMENT__REFINED_REQUIREMENT = eINSTANCE.getRequirementRefinement_RefinedRequirement();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.GoalRefinementImpl <em>Goal Refinement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.GoalRefinementImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getGoalRefinement()
		 * @generated
		 */
		EClass GOAL_REFINEMENT = eINSTANCE.getGoalRefinement();

		/**
		 * The meta object literal for the '<em><b>Owned Sub Goal Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_REFINEMENT__OWNED_SUB_GOAL_REFS = eINSTANCE.getGoalRefinement_OwnedSubGoalRefs();

		/**
		 * The meta object literal for the '<em><b>Sub Goals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_REFINEMENT__SUB_GOALS = eINSTANCE.getGoalRefinement_SubGoals();

		/**
		 * The meta object literal for the '<em><b>Refined Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL_REFINEMENT__REFINED_GOAL = eINSTANCE.getGoalRefinement_RefinedGoal();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.TraceableToDesignElementsElementImpl <em>Traceable To Design Elements Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.TraceableToDesignElementsElementImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getTraceableToDesignElementsElement()
		 * @generated
		 */
		EClass TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT = eINSTANCE.getTraceableToDesignElementsElement();

		/**
		 * The meta object literal for the '<em><b>Owned Referenced Design Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS = eINSTANCE.getTraceableToDesignElementsElement_OwnedReferencedDesignElements();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__SPECIFICATION = eINSTANCE.getTraceableToDesignElementsElement_Specification();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.AbstractContractualElementImpl <em>Abstract Contractual Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.AbstractContractualElementImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getAbstractContractualElement()
		 * @generated
		 */
		EClass ABSTRACT_CONTRACTUAL_ELEMENT = eINSTANCE.getAbstractContractualElement();

		/**
		 * The meta object literal for the '<em><b>Stakeholders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTRACTUAL_ELEMENT__STAKEHOLDERS = eINSTANCE.getAbstractContractualElement_Stakeholders();

		/**
		 * The meta object literal for the '<em><b>Owned Rationales</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES = eINSTANCE.getAbstractContractualElement_OwnedRationales();

		/**
		 * The meta object literal for the '<em><b>Contact Information</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTRACTUAL_ELEMENT__CONTACT_INFORMATION = eINSTANCE.getAbstractContractualElement_ContactInformation();

		/**
		 * The meta object literal for the '<em><b>Origin Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONTRACTUAL_ELEMENT__ORIGIN_DATE = eINSTANCE.getAbstractContractualElement_OriginDate();

		/**
		 * The meta object literal for the '<em><b>Schedule Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONTRACTUAL_ELEMENT__SCHEDULE_DATE = eINSTANCE.getAbstractContractualElement_ScheduleDate();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONTRACTUAL_ELEMENT__SOURCES = eINSTANCE.getAbstractContractualElement_Sources();

		/**
		 * The meta object literal for the '<em><b>Evolved To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTRACTUAL_ELEMENT__EVOLVED_TO = eINSTANCE.getAbstractContractualElement_EvolvedTo();

		/**
		 * The meta object literal for the '<em><b>Dropped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONTRACTUAL_ELEMENT__DROPPED = eINSTANCE.getAbstractContractualElement_Dropped();

		/**
		 * The meta object literal for the '<em><b>Owned Dropping Reasons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS = eINSTANCE.getAbstractContractualElement_OwnedDroppingReasons();

		/**
		 * The meta object literal for the '<em><b>Change Uncertainty</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY = eINSTANCE.getAbstractContractualElement_ChangeUncertainty();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.ContactInformationImpl <em>Contact Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.ContactInformationImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getContactInformation()
		 * @generated
		 */
		EClass CONTACT_INFORMATION = eINSTANCE.getContactInformation();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_INFORMATION__ADDRESS = eINSTANCE.getContactInformation_Address();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_INFORMATION__EMAIL = eINSTANCE.getContactInformation_Email();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_INFORMATION__PHONE_NUMBER = eINSTANCE.getContactInformation_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT_INFORMATION__COUNTRY = eINSTANCE.getContactInformation_Country();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.StakeholderImpl <em>Stakeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.StakeholderImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getStakeholder()
		 * @generated
		 */
		EClass STAKEHOLDER = eINSTANCE.getStakeholder();

		/**
		 * The meta object literal for the '<em><b>Contact Information</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAKEHOLDER__CONTACT_INFORMATION = eINSTANCE.getStakeholder_ContactInformation();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.RationaleImpl <em>Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.RationaleImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRationale()
		 * @generated
		 */
		EClass RATIONALE = eINSTANCE.getRationale();

		/**
		 * The meta object literal for the '<em><b>Stakeholders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RATIONALE__STAKEHOLDERS = eINSTANCE.getRationale_Stakeholders();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.TextualContractualElementImpl <em>Textual Contractual Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.TextualContractualElementImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getTextualContractualElement()
		 * @generated
		 */
		EClass TEXTUAL_CONTRACTUAL_ELEMENT = eINSTANCE.getTextualContractualElement();

		/**
		 * The meta object literal for the '<em><b>Owned Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION = eINSTANCE.getTextualContractualElement_OwnedExpression();

		/**
		 * The meta object literal for the '<em><b>Owned Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION = eINSTANCE.getTextualContractualElement_OwnedCondition();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_CONTRACTUAL_ELEMENT__DERIVED_FROM = eINSTANCE.getTextualContractualElement_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTUAL_CONTRACTUAL_ELEMENT__CATEGORY = eINSTANCE.getTextualContractualElement_Category();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTUAL_CONTRACTUAL_ELEMENT__PRIORITY = eINSTANCE.getTextualContractualElement_Priority();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.UncertaintyImpl <em>Uncertainty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.UncertaintyImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getUncertainty()
		 * @generated
		 */
		EClass UNCERTAINTY = eINSTANCE.getUncertainty();

		/**
		 * The meta object literal for the '<em><b>Volatility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY__VOLATILITY = eINSTANCE.getUncertainty_Volatility();

		/**
		 * The meta object literal for the '<em><b>Costs Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY__COSTS_IMPACT = eINSTANCE.getUncertainty_CostsImpact();

		/**
		 * The meta object literal for the '<em><b>Schedule Impact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY__SCHEDULE_IMPACT = eINSTANCE.getUncertainty_ScheduleImpact();

		/**
		 * The meta object literal for the '<em><b>Time Criticality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY__TIME_CRITICALITY = eINSTANCE.getUncertainty_TimeCriticality();

		/**
		 * The meta object literal for the '<em><b>Familiarity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY__FAMILIARITY = eINSTANCE.getUncertainty_Familiarity();

		/**
		 * The meta object literal for the '<em><b>Risk Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY__RISK_INDEX = eINSTANCE.getUncertainty_RiskIndex();

		/**
		 * The meta object literal for the '<em><b>Prop Risk Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY__PROP_RISK_INDEX = eINSTANCE.getUncertainty_PropRiskIndex();

		/**
		 * The meta object literal for the '<em><b>Maturity Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNCERTAINTY__MATURITY_INDEX = eINSTANCE.getUncertainty_MaturityIndex();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.SatisfiableElementImpl <em>Satisfiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.SatisfiableElementImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSatisfiableElement()
		 * @generated
		 */
		EClass SATISFIABLE_ELEMENT = eINSTANCE.getSatisfiableElement();

		/**
		 * The meta object literal for the '<em><b>Satisfaction Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SATISFIABLE_ELEMENT__SATISFACTION_LEVEL = eINSTANCE.getSatisfiableElement_SatisfactionLevel();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.VerifiableElementImpl <em>Verifiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.VerifiableElementImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getVerifiableElement()
		 * @generated
		 */
		EClass VERIFIABLE_ELEMENT = eINSTANCE.getVerifiableElement();

		/**
		 * The meta object literal for the '<em><b>Verified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFIABLE_ELEMENT__VERIFIED = eINSTANCE.getVerifiableElement_Verified();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.SpecificationImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Owned Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__OWNED_PACKAGES = eINSTANCE.getSpecification_OwnedPackages();

		/**
		 * The meta object literal for the '<em><b>Owned Contact Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__OWNED_CONTACT_INFORMATION = eINSTANCE.getSpecification_OwnedContactInformation();

		/**
		 * The meta object literal for the '<em><b>Owned Conflicts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__OWNED_CONFLICTS = eINSTANCE.getSpecification_OwnedConflicts();

		/**
		 * The meta object literal for the '<em><b>Owned Syst Overview</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__OWNED_SYST_OVERVIEW = eINSTANCE.getSpecification_OwnedSystOverview();

		/**
		 * The meta object literal for the '<em><b>Constraint Languages Spec</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__CONSTRAINT_LANGUAGES_SPEC = eINSTANCE.getSpecification_ConstraintLanguagesSpec();

		/**
		 * The meta object literal for the '<em><b>Owned Actor References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__OWNED_ACTOR_REFERENCES = eINSTANCE.getSpecification_OwnedActorReferences();

		/**
		 * The meta object literal for the '<em><b>Primary Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__PRIMARY_ACTORS = eINSTANCE.getSpecification_PrimaryActors();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__VERSION = eINSTANCE.getSpecification_Version();

		/**
		 * The meta object literal for the '<em><b>Owned Non Func Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__OWNED_NON_FUNC_PROPERTIES = eINSTANCE.getSpecification_OwnedNonFuncProperties();

		/**
		 * The meta object literal for the '<em><b>Owned Stakeholders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__OWNED_STAKEHOLDERS = eINSTANCE.getSpecification_OwnedStakeholders();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.RdalOrgPackageImpl <em>Org Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalOrgPackageImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRdalOrgPackage()
		 * @generated
		 */
		EClass RDAL_ORG_PACKAGE = eINSTANCE.getRdalOrgPackage();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDAL_ORG_PACKAGE__SPECIFICATION = eINSTANCE.getRdalOrgPackage_Specification();

		/**
		 * The meta object literal for the '<em><b>Sub Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDAL_ORG_PACKAGE__SUB_PACKAGES = eINSTANCE.getRdalOrgPackage_SubPackages();

		/**
		 * The meta object literal for the '<em><b>Contractual Element Entries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDAL_ORG_PACKAGE__CONTRACTUAL_ELEMENT_ENTRIES = eINSTANCE.getRdalOrgPackage_ContractualElementEntries();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDAL_ORG_PACKAGE__PARENT = eINSTANCE.getRdalOrgPackage_Parent();

		/**
		 * The meta object literal for the '<em><b>Refinement Entries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RDAL_ORG_PACKAGE__REFINEMENT_ENTRIES = eINSTANCE.getRdalOrgPackage_RefinementEntries();

		/**
		 * The meta object literal for the '<em><b>Owned Refinements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDAL_ORG_PACKAGE__OWNED_REFINEMENTS = eINSTANCE.getRdalOrgPackage_OwnedRefinements();

		/**
		 * The meta object literal for the '<em><b>Owned Contractual Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RDAL_ORG_PACKAGE__OWNED_CONTRACTUAL_ELEMENTS = eINSTANCE.getRdalOrgPackage_OwnedContractualElements();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.RequirementsPackageImpl <em>Requirements Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.RequirementsPackageImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRequirementsPackage()
		 * @generated
		 */
		EClass REQUIREMENTS_PACKAGE = eINSTANCE.getRequirementsPackage();

		/**
		 * The meta object literal for the '<em><b>Owned Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS = eINSTANCE.getRequirementsPackage_OwnedRequirements();

		/**
		 * The meta object literal for the '<em><b>Function Used In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_PACKAGE__FUNCTION_USED_IN = eINSTANCE.getRequirementsPackage_FunctionUsedIn();

		/**
		 * The meta object literal for the '<em><b>Owned Requirements Refinements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS_REFINEMENTS = eINSTANCE.getRequirementsPackage_OwnedRequirementsRefinements();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.GoalsPackageImpl <em>Goals Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.GoalsPackageImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getGoalsPackage()
		 * @generated
		 */
		EClass GOALS_PACKAGE = eINSTANCE.getGoalsPackage();

		/**
		 * The meta object literal for the '<em><b>Owned Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOALS_PACKAGE__OWNED_GOALS = eINSTANCE.getGoalsPackage_OwnedGoals();

		/**
		 * The meta object literal for the '<em><b>Owned Goal Refinements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOALS_PACKAGE__OWNED_GOAL_REFINEMENTS = eINSTANCE.getGoalsPackage_OwnedGoalRefinements();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.SystemOverviewImpl <em>System Overview</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.SystemOverviewImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSystemOverview()
		 * @generated
		 */
		EClass SYSTEM_OVERVIEW = eINSTANCE.getSystemOverview();

		/**
		 * The meta object literal for the '<em><b>Owned Capabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_OVERVIEW__OWNED_CAPABILITIES = eINSTANCE.getSystemOverview_OwnedCapabilities();

		/**
		 * The meta object literal for the '<em><b>Global System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_OVERVIEW__GLOBAL_SYSTEM = eINSTANCE.getSystemOverview_GlobalSystem();

		/**
		 * The meta object literal for the '<em><b>System To Be</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_OVERVIEW__SYSTEM_TO_BE = eINSTANCE.getSystemOverview_SystemToBe();

		/**
		 * The meta object literal for the '<em><b>Owned Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_OVERVIEW__OWNED_CONTEXTS = eINSTANCE.getSystemOverview_OwnedContexts();

		/**
		 * The meta object literal for the '<em><b>Owned System Boundary</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_OVERVIEW__OWNED_SYSTEM_BOUNDARY = eINSTANCE.getSystemOverview_OwnedSystemBoundary();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_OVERVIEW__PURPOSE = eINSTANCE.getSystemOverview_Purpose();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.CapabilityImpl <em>Capability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.CapabilityImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getCapability()
		 * @generated
		 */
		EClass CAPABILITY = eINSTANCE.getCapability();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.SystemContextImpl <em>System Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.SystemContextImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSystemContext()
		 * @generated
		 */
		EClass SYSTEM_CONTEXT = eINSTANCE.getSystemContext();

		/**
		 * The meta object literal for the '<em><b>Global System Context</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONTEXT__GLOBAL_SYSTEM_CONTEXT = eINSTANCE.getSystemContext_GlobalSystemContext();

		/**
		 * The meta object literal for the '<em><b>System Context Boundary</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONTEXT__SYSTEM_CONTEXT_BOUNDARY = eINSTANCE.getSystemContext_SystemContextBoundary();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONTEXT__ACTORS = eINSTANCE.getSystemContext_Actors();

		/**
		 * The meta object literal for the '<em><b>System Overview</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONTEXT__SYSTEM_OVERVIEW = eINSTANCE.getSystemContext_SystemOverview();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.VariableImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Design Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__DESIGN_VARIABLE = eINSTANCE.getVariable_DesignVariable();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.InteractionVariableImpl <em>Interaction Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.InteractionVariableImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getInteractionVariable()
		 * @generated
		 */
		EClass INTERACTION_VARIABLE = eINSTANCE.getInteractionVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_VARIABLE__TYPE = eINSTANCE.getInteractionVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Neglected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_VARIABLE__NEGLECTED = eINSTANCE.getInteractionVariable_Neglected();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.ActorReferenceImpl <em>Actor Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.ActorReferenceImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getActorReference()
		 * @generated
		 */
		EClass ACTOR_REFERENCE = eINSTANCE.getActorReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Actors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_REFERENCE__REFERENCED_ACTORS = eINSTANCE.getActorReference_ReferencedActors();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.RefineableElementImpl <em>Refineable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.RefineableElementImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRefineableElement()
		 * @generated
		 */
		EClass REFINEABLE_ELEMENT = eINSTANCE.getRefineableElement();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.AbstractRequirementImpl <em>Abstract Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.AbstractRequirementImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getAbstractRequirement()
		 * @generated
		 */
		EClass ABSTRACT_REQUIREMENT = eINSTANCE.getAbstractRequirement();

		/**
		 * The meta object literal for the '<em><b>Owned Verified By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__OWNED_VERIFIED_BY = eINSTANCE.getAbstractRequirement_OwnedVerifiedBy();

		/**
		 * The meta object literal for the '<em><b>Risk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_REQUIREMENT__RISK = eINSTANCE.getAbstractRequirement_Risk();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_REQUIREMENT__PACKAGE = eINSTANCE.getAbstractRequirement_Package();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.VerificationActivityImpl <em>Verification Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.VerificationActivityImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getVerificationActivity()
		 * @generated
		 */
		EClass VERIFICATION_ACTIVITY = eINSTANCE.getVerificationActivity();

		/**
		 * The meta object literal for the '<em><b>External Refs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_ACTIVITY__EXTERNAL_REFS = eINSTANCE.getVerificationActivity_ExternalRefs();

		/**
		 * The meta object literal for the '<em><b>Passed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFICATION_ACTIVITY__PASSED = eINSTANCE.getVerificationActivity_Passed();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_ACTIVITY__REQUIREMENTS = eINSTANCE.getVerificationActivity_Requirements();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFICATION_ACTIVITY__CATEGORY = eINSTANCE.getVerificationActivity_Category();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.RequirementImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Image Assumptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__IMAGE_ASSUMPTIONS = eINSTANCE.getRequirement_ImageAssumptions();

		/**
		 * The meta object literal for the '<em><b>Function Used In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__FUNCTION_USED_IN = eINSTANCE.getRequirement_FunctionUsedIn();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.AssumptionImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '<em><b>Image Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSUMPTION__IMAGE_REQUIREMENT = eINSTANCE.getAssumption_ImageRequirement();

		/**
		 * The meta object literal for the '<em><b>Image Assumptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSUMPTION__IMAGE_ASSUMPTIONS = eINSTANCE.getAssumption_ImageAssumptions();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.AbstractGoalImpl <em>Abstract Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.AbstractGoalImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getAbstractGoal()
		 * @generated
		 */
		EClass ABSTRACT_GOAL = eINSTANCE.getAbstractGoal();

		/**
		 * The meta object literal for the '<em><b>Conflicts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_GOAL__CONFLICTS = eINSTANCE.getAbstractGoal_Conflicts();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_GOAL__PACKAGE = eINSTANCE.getAbstractGoal_Package();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.SystemFunctionGoalImpl <em>System Function Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.SystemFunctionGoalImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSystemFunctionGoal()
		 * @generated
		 */
		EClass SYSTEM_FUNCTION_GOAL = eINSTANCE.getSystemFunctionGoal();

		/**
		 * The meta object literal for the '<em><b>Use Cases</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_FUNCTION_GOAL__USE_CASES = eINSTANCE.getSystemFunctionGoal_UseCases();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.NonFunctionalGoalImpl <em>Non Functional Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.NonFunctionalGoalImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getNonFunctionalGoal()
		 * @generated
		 */
		EClass NON_FUNCTIONAL_GOAL = eINSTANCE.getNonFunctionalGoal();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.QualityObjectiveImpl <em>Quality Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.QualityObjectiveImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getQualityObjective()
		 * @generated
		 */
		EClass QUALITY_OBJECTIVE = eINSTANCE.getQualityObjective();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_OBJECTIVE__PROPERTY = eINSTANCE.getQualityObjective_Property();

		/**
		 * The meta object literal for the '<em><b>Owned Sensitivity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUALITY_OBJECTIVE__OWNED_SENSITIVITY = eINSTANCE.getQualityObjective_OwnedSensitivity();

		/**
		 * The meta object literal for the '<em><b>Modality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_OBJECTIVE__MODALITY = eINSTANCE.getQualityObjective_Modality();

		/**
		 * The meta object literal for the '<em><b>Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_OBJECTIVE__BOUND = eINSTANCE.getQualityObjective_Bound();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.ConflictImpl <em>Conflict</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.ConflictImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getConflict()
		 * @generated
		 */
		EClass CONFLICT = eINSTANCE.getConflict();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICT__GOAL = eINSTANCE.getConflict_Goal();

		/**
		 * The meta object literal for the '<em><b>Contractual Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFLICT__CONTRACTUAL_ELEMENT = eINSTANCE.getConflict_ContractualElement();

		/**
		 * The meta object literal for the '<em><b>Degree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFLICT__DEGREE = eINSTANCE.getConflict_Degree();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.DesignElementReferenceImpl <em>Design Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.DesignElementReferenceImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getDesignElementReference()
		 * @generated
		 */
		EClass DESIGN_ELEMENT_REFERENCE = eINSTANCE.getDesignElementReference();

		/**
		 * The meta object literal for the '<em><b>Design Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ELEMENT_REFERENCE__DESIGN_ELEMENT = eINSTANCE.getDesignElementReference_DesignElement();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ELEMENT_REFERENCE__PARENT = eINSTANCE.getDesignElementReference_Parent();

		/**
		 * The meta object literal for the '<em><b>Evaluation Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESIGN_ELEMENT_REFERENCE__EVALUATION_RESULT = eINSTANCE.getDesignElementReference_EvaluationResult();

		/**
		 * The meta object literal for the '<em><b>Parent Traceable Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESIGN_ELEMENT_REFERENCE__PARENT_TRACEABLE_ELEMENT = eINSTANCE.getDesignElementReference_ParentTraceableElement();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.VerifiableDesignElementRefImpl <em>Verifiable Design Element Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.VerifiableDesignElementRefImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getVerifiableDesignElementRef()
		 * @generated
		 */
		EClass VERIFIABLE_DESIGN_ELEMENT_REF = eINSTANCE.getVerifiableDesignElementRef();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.SatisfiableDesignElementRefImpl <em>Satisfiable Design Element Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.SatisfiableDesignElementRefImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSatisfiableDesignElementRef()
		 * @generated
		 */
		EClass SATISFIABLE_DESIGN_ELEMENT_REF = eINSTANCE.getSatisfiableDesignElementRef();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.PrioritizedSatDesignElementRefImpl <em>Prioritized Sat Design Element Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.PrioritizedSatDesignElementRefImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getPrioritizedSatDesignElementRef()
		 * @generated
		 */
		EClass PRIORITIZED_SAT_DESIGN_ELEMENT_REF = eINSTANCE.getPrioritizedSatDesignElementRef();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITIZED_SAT_DESIGN_ELEMENT_REF__PRIORITY = eINSTANCE.getPrioritizedSatDesignElementRef_Priority();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITIZED_SAT_DESIGN_ELEMENT_REF__WEIGHT = eINSTANCE.getPrioritizedSatDesignElementRef_Weight();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.SystOverviewDesignElemRefImpl <em>Syst Overview Design Elem Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.SystOverviewDesignElemRefImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSystOverviewDesignElemRef()
		 * @generated
		 */
		EClass SYST_OVERVIEW_DESIGN_ELEM_REF = eINSTANCE.getSystOverviewDesignElemRef();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.SystContextDesignElemRefImpl <em>Syst Context Design Elem Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.SystContextDesignElemRefImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSystContextDesignElemRef()
		 * @generated
		 */
		EClass SYST_CONTEXT_DESIGN_ELEM_REF = eINSTANCE.getSystContextDesignElemRef();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.ReferencedDesignElementsImpl <em>Referenced Design Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.ReferencedDesignElementsImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getReferencedDesignElements()
		 * @generated
		 */
		EClass REFERENCED_DESIGN_ELEMENTS = eINSTANCE.getReferencedDesignElements();

		/**
		 * The meta object literal for the '<em><b>Owned Design Element Refs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS = eINSTANCE.getReferencedDesignElements_OwnedDesignElementRefs();

		/**
		 * The meta object literal for the '<em><b>Agregation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCED_DESIGN_ELEMENTS__AGREGATION_TYPE = eINSTANCE.getReferencedDesignElements_AgregationType();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.RefManuallySelectedDesignElementsImpl <em>Ref Manually Selected Design Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.RefManuallySelectedDesignElementsImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRefManuallySelectedDesignElements()
		 * @generated
		 */
		EClass REF_MANUALLY_SELECTED_DESIGN_ELEMENTS = eINSTANCE.getRefManuallySelectedDesignElements();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.RefQueryCollectedDesignElementsImpl <em>Ref Query Collected Design Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.RefQueryCollectedDesignElementsImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRefQueryCollectedDesignElements()
		 * @generated
		 */
		EClass REF_QUERY_COLLECTED_DESIGN_ELEMENTS = eINSTANCE.getRefQueryCollectedDesignElements();

		/**
		 * The meta object literal for the '<em><b>Query Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_QUERY_COLLECTED_DESIGN_ELEMENTS__QUERY_EXPRESSION = eINSTANCE.getRefQueryCollectedDesignElements_QueryExpression();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.TraceDesignElementRefImpl <em>Trace Design Element Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.TraceDesignElementRefImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getTraceDesignElementRef()
		 * @generated
		 */
		EClass TRACE_DESIGN_ELEMENT_REF = eINSTANCE.getTraceDesignElementRef();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_DESIGN_ELEMENT_REF__CONTAINER = eINSTANCE.getTraceDesignElementRef_Container();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.TraceImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Specifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__SPECIFICATIONS = eINSTANCE.getTrace_Specifications();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.RequirementsCoverageDataImpl <em>Requirements Coverage Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.RequirementsCoverageDataImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getRequirementsCoverageData()
		 * @generated
		 */
		EClass REQUIREMENTS_COVERAGE_DATA = eINSTANCE.getRequirementsCoverageData();

		/**
		 * The meta object literal for the '<em><b>Nb Requirements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS_COVERAGE_DATA__NB_REQUIREMENTS = eINSTANCE.getRequirementsCoverageData_NbRequirements();

		/**
		 * The meta object literal for the '<em><b>Verification Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS_COVERAGE_DATA__VERIFICATION_LEVEL = eINSTANCE.getRequirementsCoverageData_VerificationLevel();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.NonFunctionalPropertyImpl <em>Non Functional Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.NonFunctionalPropertyImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getNonFunctionalProperty()
		 * @generated
		 */
		EClass NON_FUNCTIONAL_PROPERTY = eINSTANCE.getNonFunctionalProperty();

		/**
		 * The meta object literal for the '<em><b>Design Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_FUNCTIONAL_PROPERTY__DESIGN_PROPERTY = eINSTANCE.getNonFunctionalProperty_DesignProperty();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.SensitivityImpl <em>Sensitivity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.SensitivityImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSensitivity()
		 * @generated
		 */
		EClass SENSITIVITY = eINSTANCE.getSensitivity();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.SubElementReferenceImpl <em>Sub Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.SubElementReferenceImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSubElementReference()
		 * @generated
		 */
		EClass SUB_ELEMENT_REFERENCE = eINSTANCE.getSubElementReference();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_ELEMENT_REFERENCE__WEIGHT = eINSTANCE.getSubElementReference_Weight();

		/**
		 * The meta object literal for the '<em><b>Referenced Element Entries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT_ENTRIES = eINSTANCE.getSubElementReference_ReferencedElementEntries();

		/**
		 * The meta object literal for the '<em><b>Referenced Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT = eINSTANCE.getSubElementReference_ReferencedElement();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.SubRequirementReferenceImpl <em>Sub Requirement Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.SubRequirementReferenceImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSubRequirementReference()
		 * @generated
		 */
		EClass SUB_REQUIREMENT_REFERENCE = eINSTANCE.getSubRequirementReference();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_REQUIREMENT_REFERENCE__REQUIREMENT = eINSTANCE.getSubRequirementReference_Requirement();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.SubGoalReferenceImpl <em>Sub Goal Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.SubGoalReferenceImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getSubGoalReference()
		 * @generated
		 */
		EClass SUB_GOAL_REFERENCE = eINSTANCE.getSubGoalReference();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_GOAL_REFERENCE__GOAL = eINSTANCE.getSubGoalReference_Goal();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.impl.UserPropertyImpl <em>User Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.impl.UserPropertyImpl
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getUserProperty()
		 * @generated
		 */
		EClass USER_PROPERTY = eINSTANCE.getUserProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPERTY__NAME = eINSTANCE.getUserProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_PROPERTY__VALUE = eINSTANCE.getUserProperty_Value();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.InteractionVariableType <em>Interaction Variable Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.InteractionVariableType
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getInteractionVariableType()
		 * @generated
		 */
		EEnum INTERACTION_VARIABLE_TYPE = eINSTANCE.getInteractionVariableType();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.AggregationType <em>Aggregation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.AggregationType
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getAggregationType()
		 * @generated
		 */
		EEnum AGGREGATION_TYPE = eINSTANCE.getAggregationType();

		/**
		 * The meta object literal for the '{@link fr.openpeople.rdal2.model.rdal.Modality <em>Modality</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.openpeople.rdal2.model.rdal.Modality
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getModality()
		 * @generated
		 */
		EEnum MODALITY = eINSTANCE.getModality();

		/**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getDate()
		 * @generated
		 */
		EDataType DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em>Normalized Ratio</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getNormalizedRatio()
		 * @generated
		 */
		EDataType NORMALIZED_RATIO = eINSTANCE.getNormalizedRatio();

		/**
		 * The meta object literal for the '<em>Positive Factor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Float
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getPositiveFactor()
		 * @generated
		 */
		EDataType POSITIVE_FACTOR = eINSTANCE.getPositiveFactor();

		/**
		 * The meta object literal for the '<em>Positive Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see fr.openpeople.rdal2.model.rdal.impl.RdalPackageImpl#getPositiveInteger()
		 * @generated
		 */
		EDataType POSITIVE_INTEGER = eINSTANCE.getPositiveInteger();

	}

} //RdalPackage
