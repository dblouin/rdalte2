/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.util;

import fr.openpeople.rdal2.model.rdal.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage
 * @generated
 */
public class RdalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RdalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdalSwitch() {
		if (modelPackage == null) {
			modelPackage = RdalPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RdalPackage.IDENTIFIED_ELEMENT: {
				IdentifiedElement identifiedElement = (IdentifiedElement)theEObject;
				T result = caseIdentifiedElement(identifiedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.ELEMENT_REFINEMENT: {
				ElementRefinement elementRefinement = (ElementRefinement)theEObject;
				T result = caseElementRefinement(elementRefinement);
				if (result == null) result = caseIdentifiedElement(elementRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.REQUIREMENT_REFINEMENT: {
				RequirementRefinement requirementRefinement = (RequirementRefinement)theEObject;
				T result = caseRequirementRefinement(requirementRefinement);
				if (result == null) result = caseElementRefinement(requirementRefinement);
				if (result == null) result = caseSatisfiableElement(requirementRefinement);
				if (result == null) result = caseVerifiableElement(requirementRefinement);
				if (result == null) result = caseIdentifiedElement(requirementRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.GOAL_REFINEMENT: {
				GoalRefinement goalRefinement = (GoalRefinement)theEObject;
				T result = caseGoalRefinement(goalRefinement);
				if (result == null) result = caseElementRefinement(goalRefinement);
				if (result == null) result = caseSatisfiableElement(goalRefinement);
				if (result == null) result = caseIdentifiedElement(goalRefinement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT: {
				TraceableToDesignElementsElement traceableToDesignElementsElement = (TraceableToDesignElementsElement)theEObject;
				T result = caseTraceableToDesignElementsElement(traceableToDesignElementsElement);
				if (result == null) result = caseIdentifiedElement(traceableToDesignElementsElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT: {
				AbstractContractualElement abstractContractualElement = (AbstractContractualElement)theEObject;
				T result = caseAbstractContractualElement(abstractContractualElement);
				if (result == null) result = caseTraceableToDesignElementsElement(abstractContractualElement);
				if (result == null) result = caseIdentifiedElement(abstractContractualElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.CONTACT_INFORMATION: {
				ContactInformation contactInformation = (ContactInformation)theEObject;
				T result = caseContactInformation(contactInformation);
				if (result == null) result = caseIdentifiedElement(contactInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.STAKEHOLDER: {
				Stakeholder stakeholder = (Stakeholder)theEObject;
				T result = caseStakeholder(stakeholder);
				if (result == null) result = caseIdentifiedElement(stakeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.RATIONALE: {
				Rationale rationale = (Rationale)theEObject;
				T result = caseRationale(rationale);
				if (result == null) result = caseIdentifiedElement(rationale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.TEXTUAL_CONTRACTUAL_ELEMENT: {
				TextualContractualElement textualContractualElement = (TextualContractualElement)theEObject;
				T result = caseTextualContractualElement(textualContractualElement);
				if (result == null) result = caseAbstractContractualElement(textualContractualElement);
				if (result == null) result = caseTraceableToDesignElementsElement(textualContractualElement);
				if (result == null) result = caseIdentifiedElement(textualContractualElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.UNCERTAINTY: {
				Uncertainty uncertainty = (Uncertainty)theEObject;
				T result = caseUncertainty(uncertainty);
				if (result == null) result = caseIdentifiedElement(uncertainty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.SATISFIABLE_ELEMENT: {
				SatisfiableElement satisfiableElement = (SatisfiableElement)theEObject;
				T result = caseSatisfiableElement(satisfiableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.VERIFIABLE_ELEMENT: {
				VerifiableElement verifiableElement = (VerifiableElement)theEObject;
				T result = caseVerifiableElement(verifiableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.SPECIFICATION: {
				Specification specification = (Specification)theEObject;
				T result = caseSpecification(specification);
				if (result == null) result = caseAbstractContractualElement(specification);
				if (result == null) result = caseVerifiableElement(specification);
				if (result == null) result = caseSatisfiableElement(specification);
				if (result == null) result = caseTraceableToDesignElementsElement(specification);
				if (result == null) result = caseIdentifiedElement(specification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.RDAL_ORG_PACKAGE: {
				RdalOrgPackage rdalOrgPackage = (RdalOrgPackage)theEObject;
				T result = caseRdalOrgPackage(rdalOrgPackage);
				if (result == null) result = caseIdentifiedElement(rdalOrgPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.REQUIREMENTS_PACKAGE: {
				RequirementsPackage requirementsPackage = (RequirementsPackage)theEObject;
				T result = caseRequirementsPackage(requirementsPackage);
				if (result == null) result = caseRdalOrgPackage(requirementsPackage);
				if (result == null) result = caseSatisfiableElement(requirementsPackage);
				if (result == null) result = caseVerifiableElement(requirementsPackage);
				if (result == null) result = caseIdentifiedElement(requirementsPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.GOALS_PACKAGE: {
				GoalsPackage goalsPackage = (GoalsPackage)theEObject;
				T result = caseGoalsPackage(goalsPackage);
				if (result == null) result = caseRdalOrgPackage(goalsPackage);
				if (result == null) result = caseSatisfiableElement(goalsPackage);
				if (result == null) result = caseIdentifiedElement(goalsPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.SYSTEM_OVERVIEW: {
				SystemOverview systemOverview = (SystemOverview)theEObject;
				T result = caseSystemOverview(systemOverview);
				if (result == null) result = caseAbstractContractualElement(systemOverview);
				if (result == null) result = caseTraceableToDesignElementsElement(systemOverview);
				if (result == null) result = caseIdentifiedElement(systemOverview);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.CAPABILITY: {
				Capability capability = (Capability)theEObject;
				T result = caseCapability(capability);
				if (result == null) result = caseIdentifiedElement(capability);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.SYSTEM_CONTEXT: {
				SystemContext systemContext = (SystemContext)theEObject;
				T result = caseSystemContext(systemContext);
				if (result == null) result = caseAbstractContractualElement(systemContext);
				if (result == null) result = caseTraceableToDesignElementsElement(systemContext);
				if (result == null) result = caseIdentifiedElement(systemContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseIdentifiedElement(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.INTERACTION_VARIABLE: {
				InteractionVariable interactionVariable = (InteractionVariable)theEObject;
				T result = caseInteractionVariable(interactionVariable);
				if (result == null) result = caseVariable(interactionVariable);
				if (result == null) result = caseIdentifiedElement(interactionVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.ACTOR_REFERENCE: {
				ActorReference actorReference = (ActorReference)theEObject;
				T result = caseActorReference(actorReference);
				if (result == null) result = caseIdentifiedElement(actorReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.REFINEABLE_ELEMENT: {
				RefineableElement refineableElement = (RefineableElement)theEObject;
				T result = caseRefineableElement(refineableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.ABSTRACT_REQUIREMENT: {
				AbstractRequirement abstractRequirement = (AbstractRequirement)theEObject;
				T result = caseAbstractRequirement(abstractRequirement);
				if (result == null) result = caseTextualContractualElement(abstractRequirement);
				if (result == null) result = caseRefineableElement(abstractRequirement);
				if (result == null) result = caseSatisfiableElement(abstractRequirement);
				if (result == null) result = caseVerifiableElement(abstractRequirement);
				if (result == null) result = caseAbstractContractualElement(abstractRequirement);
				if (result == null) result = caseTraceableToDesignElementsElement(abstractRequirement);
				if (result == null) result = caseIdentifiedElement(abstractRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.VERIFICATION_ACTIVITY: {
				VerificationActivity verificationActivity = (VerificationActivity)theEObject;
				T result = caseVerificationActivity(verificationActivity);
				if (result == null) result = caseIdentifiedElement(verificationActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseAbstractRequirement(requirement);
				if (result == null) result = caseTextualContractualElement(requirement);
				if (result == null) result = caseRefineableElement(requirement);
				if (result == null) result = caseSatisfiableElement(requirement);
				if (result == null) result = caseVerifiableElement(requirement);
				if (result == null) result = caseAbstractContractualElement(requirement);
				if (result == null) result = caseTraceableToDesignElementsElement(requirement);
				if (result == null) result = caseIdentifiedElement(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.ASSUMPTION: {
				Assumption assumption = (Assumption)theEObject;
				T result = caseAssumption(assumption);
				if (result == null) result = caseAbstractRequirement(assumption);
				if (result == null) result = caseTextualContractualElement(assumption);
				if (result == null) result = caseRefineableElement(assumption);
				if (result == null) result = caseSatisfiableElement(assumption);
				if (result == null) result = caseVerifiableElement(assumption);
				if (result == null) result = caseAbstractContractualElement(assumption);
				if (result == null) result = caseTraceableToDesignElementsElement(assumption);
				if (result == null) result = caseIdentifiedElement(assumption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.ABSTRACT_GOAL: {
				AbstractGoal abstractGoal = (AbstractGoal)theEObject;
				T result = caseAbstractGoal(abstractGoal);
				if (result == null) result = caseTextualContractualElement(abstractGoal);
				if (result == null) result = caseSatisfiableElement(abstractGoal);
				if (result == null) result = caseRefineableElement(abstractGoal);
				if (result == null) result = caseAbstractContractualElement(abstractGoal);
				if (result == null) result = caseTraceableToDesignElementsElement(abstractGoal);
				if (result == null) result = caseIdentifiedElement(abstractGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.SYSTEM_FUNCTION_GOAL: {
				SystemFunctionGoal systemFunctionGoal = (SystemFunctionGoal)theEObject;
				T result = caseSystemFunctionGoal(systemFunctionGoal);
				if (result == null) result = caseAbstractGoal(systemFunctionGoal);
				if (result == null) result = caseTextualContractualElement(systemFunctionGoal);
				if (result == null) result = caseSatisfiableElement(systemFunctionGoal);
				if (result == null) result = caseRefineableElement(systemFunctionGoal);
				if (result == null) result = caseAbstractContractualElement(systemFunctionGoal);
				if (result == null) result = caseTraceableToDesignElementsElement(systemFunctionGoal);
				if (result == null) result = caseIdentifiedElement(systemFunctionGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.NON_FUNCTIONAL_GOAL: {
				NonFunctionalGoal nonFunctionalGoal = (NonFunctionalGoal)theEObject;
				T result = caseNonFunctionalGoal(nonFunctionalGoal);
				if (result == null) result = caseAbstractGoal(nonFunctionalGoal);
				if (result == null) result = caseTextualContractualElement(nonFunctionalGoal);
				if (result == null) result = caseSatisfiableElement(nonFunctionalGoal);
				if (result == null) result = caseRefineableElement(nonFunctionalGoal);
				if (result == null) result = caseAbstractContractualElement(nonFunctionalGoal);
				if (result == null) result = caseTraceableToDesignElementsElement(nonFunctionalGoal);
				if (result == null) result = caseIdentifiedElement(nonFunctionalGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.QUALITY_OBJECTIVE: {
				QualityObjective qualityObjective = (QualityObjective)theEObject;
				T result = caseQualityObjective(qualityObjective);
				if (result == null) result = caseNonFunctionalGoal(qualityObjective);
				if (result == null) result = caseAbstractGoal(qualityObjective);
				if (result == null) result = caseTextualContractualElement(qualityObjective);
				if (result == null) result = caseSatisfiableElement(qualityObjective);
				if (result == null) result = caseRefineableElement(qualityObjective);
				if (result == null) result = caseAbstractContractualElement(qualityObjective);
				if (result == null) result = caseTraceableToDesignElementsElement(qualityObjective);
				if (result == null) result = caseIdentifiedElement(qualityObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.CONFLICT: {
				Conflict conflict = (Conflict)theEObject;
				T result = caseConflict(conflict);
				if (result == null) result = caseIdentifiedElement(conflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.REFERENCED_DESIGN_ELEMENTS: {
				ReferencedDesignElements referencedDesignElements = (ReferencedDesignElements)theEObject;
				T result = caseReferencedDesignElements(referencedDesignElements);
				if (result == null) result = caseIdentifiedElement(referencedDesignElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.DESIGN_ELEMENT_REFERENCE: {
				DesignElementReference designElementReference = (DesignElementReference)theEObject;
				T result = caseDesignElementReference(designElementReference);
				if (result == null) result = caseIdentifiedElement(designElementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.VERIFIABLE_DESIGN_ELEMENT_REF: {
				VerifiableDesignElementRef verifiableDesignElementRef = (VerifiableDesignElementRef)theEObject;
				T result = caseVerifiableDesignElementRef(verifiableDesignElementRef);
				if (result == null) result = caseDesignElementReference(verifiableDesignElementRef);
				if (result == null) result = caseVerifiableElement(verifiableDesignElementRef);
				if (result == null) result = caseIdentifiedElement(verifiableDesignElementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.SATISFIABLE_DESIGN_ELEMENT_REF: {
				SatisfiableDesignElementRef satisfiableDesignElementRef = (SatisfiableDesignElementRef)theEObject;
				T result = caseSatisfiableDesignElementRef(satisfiableDesignElementRef);
				if (result == null) result = caseDesignElementReference(satisfiableDesignElementRef);
				if (result == null) result = caseSatisfiableElement(satisfiableDesignElementRef);
				if (result == null) result = caseIdentifiedElement(satisfiableDesignElementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.PRIORITIZED_SAT_DESIGN_ELEMENT_REF: {
				PrioritizedSatDesignElementRef prioritizedSatDesignElementRef = (PrioritizedSatDesignElementRef)theEObject;
				T result = casePrioritizedSatDesignElementRef(prioritizedSatDesignElementRef);
				if (result == null) result = caseSatisfiableDesignElementRef(prioritizedSatDesignElementRef);
				if (result == null) result = caseDesignElementReference(prioritizedSatDesignElementRef);
				if (result == null) result = caseSatisfiableElement(prioritizedSatDesignElementRef);
				if (result == null) result = caseIdentifiedElement(prioritizedSatDesignElementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.SYST_OVERVIEW_DESIGN_ELEM_REF: {
				SystOverviewDesignElemRef systOverviewDesignElemRef = (SystOverviewDesignElemRef)theEObject;
				T result = caseSystOverviewDesignElemRef(systOverviewDesignElemRef);
				if (result == null) result = caseDesignElementReference(systOverviewDesignElemRef);
				if (result == null) result = caseIdentifiedElement(systOverviewDesignElemRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.SYST_CONTEXT_DESIGN_ELEM_REF: {
				SystContextDesignElemRef systContextDesignElemRef = (SystContextDesignElemRef)theEObject;
				T result = caseSystContextDesignElemRef(systContextDesignElemRef);
				if (result == null) result = caseDesignElementReference(systContextDesignElemRef);
				if (result == null) result = caseIdentifiedElement(systContextDesignElemRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.REF_MANUALLY_SELECTED_DESIGN_ELEMENTS: {
				RefManuallySelectedDesignElements refManuallySelectedDesignElements = (RefManuallySelectedDesignElements)theEObject;
				T result = caseRefManuallySelectedDesignElements(refManuallySelectedDesignElements);
				if (result == null) result = caseReferencedDesignElements(refManuallySelectedDesignElements);
				if (result == null) result = caseIdentifiedElement(refManuallySelectedDesignElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.REF_QUERY_COLLECTED_DESIGN_ELEMENTS: {
				RefQueryCollectedDesignElements refQueryCollectedDesignElements = (RefQueryCollectedDesignElements)theEObject;
				T result = caseRefQueryCollectedDesignElements(refQueryCollectedDesignElements);
				if (result == null) result = caseReferencedDesignElements(refQueryCollectedDesignElements);
				if (result == null) result = caseIdentifiedElement(refQueryCollectedDesignElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF: {
				TraceDesignElementRef traceDesignElementRef = (TraceDesignElementRef)theEObject;
				T result = caseTraceDesignElementRef(traceDesignElementRef);
				if (result == null) result = caseDesignElementReference(traceDesignElementRef);
				if (result == null) result = caseRequirementsCoverageData(traceDesignElementRef);
				if (result == null) result = caseVerifiableElement(traceDesignElementRef);
				if (result == null) result = caseIdentifiedElement(traceDesignElementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.TRACE: {
				Trace trace = (Trace)theEObject;
				T result = caseTrace(trace);
				if (result == null) result = caseReferencedDesignElements(trace);
				if (result == null) result = caseIdentifiedElement(trace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.REQUIREMENTS_COVERAGE_DATA: {
				RequirementsCoverageData requirementsCoverageData = (RequirementsCoverageData)theEObject;
				T result = caseRequirementsCoverageData(requirementsCoverageData);
				if (result == null) result = caseIdentifiedElement(requirementsCoverageData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.NON_FUNCTIONAL_PROPERTY: {
				NonFunctionalProperty nonFunctionalProperty = (NonFunctionalProperty)theEObject;
				T result = caseNonFunctionalProperty(nonFunctionalProperty);
				if (result == null) result = caseIdentifiedElement(nonFunctionalProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.SENSITIVITY: {
				Sensitivity sensitivity = (Sensitivity)theEObject;
				T result = caseSensitivity(sensitivity);
				if (result == null) result = caseTraceableToDesignElementsElement(sensitivity);
				if (result == null) result = caseIdentifiedElement(sensitivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.SUB_ELEMENT_REFERENCE: {
				SubElementReference subElementReference = (SubElementReference)theEObject;
				T result = caseSubElementReference(subElementReference);
				if (result == null) result = caseIdentifiedElement(subElementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.SUB_REQUIREMENT_REFERENCE: {
				SubRequirementReference subRequirementReference = (SubRequirementReference)theEObject;
				T result = caseSubRequirementReference(subRequirementReference);
				if (result == null) result = caseSubElementReference(subRequirementReference);
				if (result == null) result = caseIdentifiedElement(subRequirementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.SUB_GOAL_REFERENCE: {
				SubGoalReference subGoalReference = (SubGoalReference)theEObject;
				T result = caseSubGoalReference(subGoalReference);
				if (result == null) result = caseSubElementReference(subGoalReference);
				if (result == null) result = caseIdentifiedElement(subGoalReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RdalPackage.USER_PROPERTY: {
				UserProperty userProperty = (UserProperty)theEObject;
				T result = caseUserProperty(userProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedElement(IdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementRefinement(ElementRefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementRefinement(RequirementRefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal Refinement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalRefinement(GoalRefinement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traceable To Design Elements Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traceable To Design Elements Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceableToDesignElementsElement(TraceableToDesignElementsElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Contractual Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Contractual Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractContractualElement(AbstractContractualElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContactInformation(ContactInformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRequirement(AbstractRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Function Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Function Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemFunctionGoal(SystemFunctionGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Functional Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Functional Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonFunctionalGoal(NonFunctionalGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualityObjective(QualityObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uncertainty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uncertainty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUncertainty(Uncertainty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verifiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerifiableElement(VerifiableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satisfiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satisfiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatisfiableElement(SatisfiableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecification(Specification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Org Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Org Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRdalOrgPackage(RdalOrgPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Overview</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Overview</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemOverview(SystemOverview object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapability(Capability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rationale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRationale(Rationale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textual Contractual Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textual Contractual Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextualContractualElement(TextualContractualElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionVariable(InteractionVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActorReference(ActorReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refineable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refineable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefineableElement(RefineableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemContext(SystemContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConflict(Conflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStakeholder(Stakeholder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsPackage(RequirementsPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goals Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goals Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoalsPackage(GoalsPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssumption(Assumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGoal(AbstractGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verification Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verification Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificationActivity(VerificationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Referenced Design Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenced Design Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencedDesignElements(ReferencedDesignElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Manually Selected Design Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Manually Selected Design Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefManuallySelectedDesignElements(RefManuallySelectedDesignElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Query Collected Design Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Query Collected Design Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefQueryCollectedDesignElements(RefQueryCollectedDesignElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace Design Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace Design Element Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTraceDesignElementRef(TraceDesignElementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignElementReference(DesignElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verifiable Design Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verifiable Design Element Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerifiableDesignElementRef(VerifiableDesignElementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satisfiable Design Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satisfiable Design Element Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatisfiableDesignElementRef(SatisfiableDesignElementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prioritized Sat Design Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prioritized Sat Design Element Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrioritizedSatDesignElementRef(PrioritizedSatDesignElementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syst Overview Design Elem Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syst Overview Design Elem Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystOverviewDesignElemRef(SystOverviewDesignElemRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Syst Context Design Elem Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Syst Context Design Elem Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystContextDesignElemRef(SystContextDesignElemRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrace(Trace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Coverage Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Coverage Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsCoverageData(RequirementsCoverageData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Functional Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Functional Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonFunctionalProperty(NonFunctionalProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensitivity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensitivity(Sensitivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubElementReference(SubElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Requirement Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Requirement Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubRequirementReference(SubRequirementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Goal Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Goal Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubGoalReference(SubGoalReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserProperty(UserProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RdalSwitch
