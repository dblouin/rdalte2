/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.util;

import fr.openpeople.rdal2.model.rdal.*;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage
 * @generated
 */
public class RdalValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final RdalValidator INSTANCE = new RdalValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "fr.openpeople.rdal2.model.rdal";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdalValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return RdalPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case RdalPackage.IDENTIFIED_ELEMENT:
				return validateIdentifiedElement((IdentifiedElement)value, diagnostics, context);
			case RdalPackage.ELEMENT_REFINEMENT:
				return validateElementRefinement((ElementRefinement)value, diagnostics, context);
			case RdalPackage.REQUIREMENT_REFINEMENT:
				return validateRequirementRefinement((RequirementRefinement)value, diagnostics, context);
			case RdalPackage.GOAL_REFINEMENT:
				return validateGoalRefinement((GoalRefinement)value, diagnostics, context);
			case RdalPackage.TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT:
				return validateTraceableToDesignElementsElement((TraceableToDesignElementsElement)value, diagnostics, context);
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT:
				return validateAbstractContractualElement((AbstractContractualElement)value, diagnostics, context);
			case RdalPackage.CONTACT_INFORMATION:
				return validateContactInformation((ContactInformation)value, diagnostics, context);
			case RdalPackage.STAKEHOLDER:
				return validateStakeholder((Stakeholder)value, diagnostics, context);
			case RdalPackage.RATIONALE:
				return validateRationale((Rationale)value, diagnostics, context);
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT:
				return validateTextualContractualElement((TextualContractualElement)value, diagnostics, context);
			case RdalPackage.UNCERTAINTY:
				return validateUncertainty((Uncertainty)value, diagnostics, context);
			case RdalPackage.SATISFIABLE_ELEMENT:
				return validateSatisfiableElement((SatisfiableElement)value, diagnostics, context);
			case RdalPackage.VERIFIABLE_ELEMENT:
				return validateVerifiableElement((VerifiableElement)value, diagnostics, context);
			case RdalPackage.SPECIFICATION:
				return validateSpecification((Specification)value, diagnostics, context);
			case RdalPackage.RDAL_ORG_PACKAGE:
				return validateRdalOrgPackage((RdalOrgPackage)value, diagnostics, context);
			case RdalPackage.REQUIREMENTS_PACKAGE:
				return validateRequirementsPackage((RequirementsPackage)value, diagnostics, context);
			case RdalPackage.GOALS_PACKAGE:
				return validateGoalsPackage((GoalsPackage)value, diagnostics, context);
			case RdalPackage.SYSTEM_OVERVIEW:
				return validateSystemOverview((SystemOverview)value, diagnostics, context);
			case RdalPackage.CAPABILITY:
				return validateCapability((Capability)value, diagnostics, context);
			case RdalPackage.SYSTEM_CONTEXT:
				return validateSystemContext((SystemContext)value, diagnostics, context);
			case RdalPackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case RdalPackage.INTERACTION_VARIABLE:
				return validateInteractionVariable((InteractionVariable)value, diagnostics, context);
			case RdalPackage.ACTOR_REFERENCE:
				return validateActorReference((ActorReference)value, diagnostics, context);
			case RdalPackage.REFINEABLE_ELEMENT:
				return validateRefineableElement((RefineableElement)value, diagnostics, context);
			case RdalPackage.ABSTRACT_REQUIREMENT:
				return validateAbstractRequirement((AbstractRequirement)value, diagnostics, context);
			case RdalPackage.VERIFICATION_ACTIVITY:
				return validateVerificationActivity((VerificationActivity)value, diagnostics, context);
			case RdalPackage.REQUIREMENT:
				return validateRequirement((Requirement)value, diagnostics, context);
			case RdalPackage.ASSUMPTION:
				return validateAssumption((Assumption)value, diagnostics, context);
			case RdalPackage.ABSTRACT_GOAL:
				return validateAbstractGoal((AbstractGoal)value, diagnostics, context);
			case RdalPackage.SYSTEM_FUNCTION_GOAL:
				return validateSystemFunctionGoal((SystemFunctionGoal)value, diagnostics, context);
			case RdalPackage.NON_FUNCTIONAL_GOAL:
				return validateNonFunctionalGoal((NonFunctionalGoal)value, diagnostics, context);
			case RdalPackage.QUALITY_OBJECTIVE:
				return validateQualityObjective((QualityObjective)value, diagnostics, context);
			case RdalPackage.CONFLICT:
				return validateConflict((Conflict)value, diagnostics, context);
			case RdalPackage.REFERENCED_DESIGN_ELEMENTS:
				return validateReferencedDesignElements((ReferencedDesignElements)value, diagnostics, context);
			case RdalPackage.DESIGN_ELEMENT_REFERENCE:
				return validateDesignElementReference((DesignElementReference)value, diagnostics, context);
			case RdalPackage.VERIFIABLE_DESIGN_ELEMENT_REF:
				return validateVerifiableDesignElementRef((VerifiableDesignElementRef)value, diagnostics, context);
			case RdalPackage.SATISFIABLE_DESIGN_ELEMENT_REF:
				return validateSatisfiableDesignElementRef((SatisfiableDesignElementRef)value, diagnostics, context);
			case RdalPackage.PRIORITIZED_SAT_DESIGN_ELEMENT_REF:
				return validatePrioritizedSatDesignElementRef((PrioritizedSatDesignElementRef)value, diagnostics, context);
			case RdalPackage.SYST_OVERVIEW_DESIGN_ELEM_REF:
				return validateSystOverviewDesignElemRef((SystOverviewDesignElemRef)value, diagnostics, context);
			case RdalPackage.SYST_CONTEXT_DESIGN_ELEM_REF:
				return validateSystContextDesignElemRef((SystContextDesignElemRef)value, diagnostics, context);
			case RdalPackage.REF_MANUALLY_SELECTED_DESIGN_ELEMENTS:
				return validateRefManuallySelectedDesignElements((RefManuallySelectedDesignElements)value, diagnostics, context);
			case RdalPackage.REF_QUERY_COLLECTED_DESIGN_ELEMENTS:
				return validateRefQueryCollectedDesignElements((RefQueryCollectedDesignElements)value, diagnostics, context);
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF:
				return validateTraceDesignElementRef((TraceDesignElementRef)value, diagnostics, context);
			case RdalPackage.TRACE:
				return validateTrace((Trace)value, diagnostics, context);
			case RdalPackage.REQUIREMENTS_COVERAGE_DATA:
				return validateRequirementsCoverageData((RequirementsCoverageData)value, diagnostics, context);
			case RdalPackage.NON_FUNCTIONAL_PROPERTY:
				return validateNonFunctionalProperty((NonFunctionalProperty)value, diagnostics, context);
			case RdalPackage.SENSITIVITY:
				return validateSensitivity((Sensitivity)value, diagnostics, context);
			case RdalPackage.SUB_ELEMENT_REFERENCE:
				return validateSubElementReference((SubElementReference)value, diagnostics, context);
			case RdalPackage.SUB_REQUIREMENT_REFERENCE:
				return validateSubRequirementReference((SubRequirementReference)value, diagnostics, context);
			case RdalPackage.SUB_GOAL_REFERENCE:
				return validateSubGoalReference((SubGoalReference)value, diagnostics, context);
			case RdalPackage.USER_PROPERTY:
				return validateUserProperty((UserProperty)value, diagnostics, context);
			case RdalPackage.INTERACTION_VARIABLE_TYPE:
				return validateInteractionVariableType((InteractionVariableType)value, diagnostics, context);
			case RdalPackage.AGGREGATION_TYPE:
				return validateAggregationType((AggregationType)value, diagnostics, context);
			case RdalPackage.MODALITY:
				return validateModality((Modality)value, diagnostics, context);
			case RdalPackage.DATE:
				return validateDate((Date)value, diagnostics, context);
			case RdalPackage.POSITIVE_FACTOR:
				return validatePositiveFactor((Float)value, diagnostics, context);
			case RdalPackage.POSITIVE_INTEGER:
				return validatePositiveInteger((Long)value, diagnostics, context);
			case RdalPackage.NORMALIZED_RATIO:
				return validateNormalizedRatio((Float)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiedElement(IdentifiedElement identifiedElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifiedElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementRefinement(ElementRefinement elementRefinement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementRefinement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementRefinement(RequirementRefinement requirementRefinement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirementRefinement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalRefinement(GoalRefinement goalRefinement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goalRefinement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraceableToDesignElementsElement(TraceableToDesignElementsElement traceableToDesignElementsElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(traceableToDesignElementsElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractContractualElement(AbstractContractualElement abstractContractualElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractContractualElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContactInformation(ContactInformation contactInformation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contactInformation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractRequirement(AbstractRequirement abstractRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractRequirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractRequirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefineableElement_deepUniqueDesignElements(abstractRequirement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirement(Requirement requirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(requirement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(requirement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefineableElement_deepUniqueDesignElements(requirement, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemFunctionGoal(SystemFunctionGoal systemFunctionGoal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systemFunctionGoal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systemFunctionGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systemFunctionGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systemFunctionGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systemFunctionGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systemFunctionGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systemFunctionGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systemFunctionGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systemFunctionGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefineableElement_deepUniqueDesignElements(systemFunctionGoal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonFunctionalGoal(NonFunctionalGoal nonFunctionalGoal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(nonFunctionalGoal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(nonFunctionalGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(nonFunctionalGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(nonFunctionalGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(nonFunctionalGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(nonFunctionalGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(nonFunctionalGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(nonFunctionalGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(nonFunctionalGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefineableElement_deepUniqueDesignElements(nonFunctionalGoal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityObjective(QualityObjective qualityObjective, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(qualityObjective, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(qualityObjective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(qualityObjective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(qualityObjective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(qualityObjective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(qualityObjective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(qualityObjective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(qualityObjective, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(qualityObjective, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefineableElement_deepUniqueDesignElements(qualityObjective, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUncertainty(Uncertainty uncertainty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(uncertainty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerifiableElement(VerifiableElement verifiableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verifiableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSatisfiableElement(SatisfiableElement satisfiableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(satisfiableElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecification(Specification specification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRdalOrgPackage(RdalOrgPackage rdalOrgPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rdalOrgPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemOverview(SystemOverview systemOverview, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemOverview, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapability(Capability capability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRationale(Rationale rationale, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rationale, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextualContractualElement(TextualContractualElement textualContractualElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textualContractualElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionVariable(InteractionVariable interactionVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionVariable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActorReference(ActorReference actorReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actorReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefineableElement(RefineableElement refineableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(refineableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(refineableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(refineableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(refineableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(refineableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(refineableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(refineableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(refineableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(refineableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefineableElement_deepUniqueDesignElements(refineableElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the deepUniqueDesignElements constraint of '<em>Refineable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefineableElement_deepUniqueDesignElements(RefineableElement refineableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "deepUniqueDesignElements", getObjectLabel(refineableElement, context) },
						 new Object[] { refineableElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemContext(SystemContext systemContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConflict(Conflict conflict, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conflict, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStakeholder(Stakeholder stakeholder, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stakeholder, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementsPackage(RequirementsPackage requirementsPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirementsPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGoalsPackage(GoalsPackage goalsPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(goalsPackage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssumption(Assumption assumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(assumption, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(assumption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assumption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assumption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(assumption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assumption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assumption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assumption, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assumption, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefineableElement_deepUniqueDesignElements(assumption, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractGoal(AbstractGoal abstractGoal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(abstractGoal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(abstractGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(abstractGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(abstractGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(abstractGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(abstractGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(abstractGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(abstractGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(abstractGoal, diagnostics, context);
		if (result || diagnostics != null) result &= validateRefineableElement_deepUniqueDesignElements(abstractGoal, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerificationActivity(VerificationActivity verificationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(verificationActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferencedDesignElements(ReferencedDesignElements referencedDesignElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referencedDesignElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefManuallySelectedDesignElements(RefManuallySelectedDesignElements refManuallySelectedDesignElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(refManuallySelectedDesignElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefQueryCollectedDesignElements(RefQueryCollectedDesignElements refQueryCollectedDesignElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(refQueryCollectedDesignElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraceDesignElementRef(TraceDesignElementRef traceDesignElementRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(traceDesignElementRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(traceDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(traceDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(traceDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(traceDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(traceDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(traceDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(traceDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(traceDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateDesignElementReference_designElementsContainedInSpecifedArchSpecs(traceDesignElementRef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignElementReference(DesignElementReference designElementReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(designElementReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(designElementReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(designElementReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(designElementReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(designElementReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(designElementReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(designElementReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(designElementReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(designElementReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateDesignElementReference_designElementsContainedInSpecifedArchSpecs(designElementReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the designElementsContainedInSpecifedArchSpecs constraint of '<em>Design Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesignElementReference_designElementsContainedInSpecifedArchSpecs(DesignElementReference designElementReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "designElementsContainedInSpecifedArchSpecs", getObjectLabel(designElementReference, context) },
						 new Object[] { designElementReference },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVerifiableDesignElementRef(VerifiableDesignElementRef verifiableDesignElementRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(verifiableDesignElementRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(verifiableDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(verifiableDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(verifiableDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(verifiableDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(verifiableDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(verifiableDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(verifiableDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(verifiableDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateDesignElementReference_designElementsContainedInSpecifedArchSpecs(verifiableDesignElementRef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSatisfiableDesignElementRef(SatisfiableDesignElementRef satisfiableDesignElementRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(satisfiableDesignElementRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(satisfiableDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(satisfiableDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(satisfiableDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(satisfiableDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(satisfiableDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(satisfiableDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(satisfiableDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(satisfiableDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateDesignElementReference_designElementsContainedInSpecifedArchSpecs(satisfiableDesignElementRef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrioritizedSatDesignElementRef(PrioritizedSatDesignElementRef prioritizedSatDesignElementRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(prioritizedSatDesignElementRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(prioritizedSatDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(prioritizedSatDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(prioritizedSatDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(prioritizedSatDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(prioritizedSatDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(prioritizedSatDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(prioritizedSatDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(prioritizedSatDesignElementRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateDesignElementReference_designElementsContainedInSpecifedArchSpecs(prioritizedSatDesignElementRef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystOverviewDesignElemRef(SystOverviewDesignElemRef systOverviewDesignElemRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systOverviewDesignElemRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systOverviewDesignElemRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systOverviewDesignElemRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systOverviewDesignElemRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systOverviewDesignElemRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systOverviewDesignElemRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systOverviewDesignElemRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systOverviewDesignElemRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systOverviewDesignElemRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateDesignElementReference_designElementsContainedInSpecifedArchSpecs(systOverviewDesignElemRef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystContextDesignElemRef(SystContextDesignElemRef systContextDesignElemRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(systContextDesignElemRef, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(systContextDesignElemRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(systContextDesignElemRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(systContextDesignElemRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(systContextDesignElemRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(systContextDesignElemRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(systContextDesignElemRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(systContextDesignElemRef, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(systContextDesignElemRef, diagnostics, context);
		if (result || diagnostics != null) result &= validateDesignElementReference_designElementsContainedInSpecifedArchSpecs(systContextDesignElemRef, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrace(Trace trace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementsCoverageData(RequirementsCoverageData requirementsCoverageData, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirementsCoverageData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonFunctionalProperty(NonFunctionalProperty nonFunctionalProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonFunctionalProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensitivity(Sensitivity sensitivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sensitivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubElementReference(SubElementReference subElementReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subElementReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubRequirementReference(SubRequirementReference subRequirementReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subRequirementReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubGoalReference(SubGoalReference subGoalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subGoalReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserProperty(UserProperty userProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionVariableType(InteractionVariableType interactionVariableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregationType(AggregationType aggregationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModality(Modality modality, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveFactor(Float positiveFactor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePositiveInteger(Long positiveInteger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDate(Date date, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalizedRatio(Float normalizedRatio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNormalizedRatio_rangeZeroOne(normalizedRatio, diagnostics, context);
		return result;
	}

	/**
	 * Validates the rangeZeroOne constraint of '<em>Normalized Ratio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNormalizedRatio_rangeZeroOne(Float normalizedRatio, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "rangeZeroOne", getValueLabel(RdalPackage.Literals.NORMALIZED_RATIO, normalizedRatio, context) },
						 new Object[] { normalizedRatio },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //RdalValidator
