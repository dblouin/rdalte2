package fr.openpeople.rdalte.service;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import fr.labsticc.framework.constraints.core.ICompletionProposal;
import fr.labsticc.framework.constraints.core.exception.ConstraintException;
import fr.labsticc.framework.constraints.core.exception.ConstraintValidationException;
import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary;
import fr.labsticc.framework.core.exception.SystemException;
import fr.openpeople.rdal2.model.rdal.DesignElementReference;
import fr.openpeople.rdal2.model.rdal.IdentifiedElement;
import fr.openpeople.rdal2.model.rdal.RefManuallySelectedDesignElements;
import fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement;

public interface ITraceableToDesignElementBusinessDelegate {
	
    /**
     * Returns the image for the label of the given element.  The image
     * is owned by the label provider and must not be disposed directly.
     * Instead, dispose the label provider when no longer needed.
     *
     * @param p_element the element for which to provide the label image
     * @return the image used to label the element, or <code>null</code>
     *   if there is no image for the given object
     */
    Object getImage( Object p_element );

    /**
     * Returns the text for the label of the given element.
     *
     * @param p_element the element for which to provide the label text
     * @return the text string used to label the element, or <code>null</code>
     *   if there is no text label for the given object
     */
    String getText( Object p_element );

    /**
     * Sets the collection of model elements references of the collection ref model elements
     * of the satisfiedBy feature.
     * @param p_traceableElement
     * @param p_modelElementRefs
     * @return
     * @throws SystemException
     * @throws InterruptedException
     */
    TraceableToDesignElementsElement setDesignElementRefs( 	TraceableToDesignElementsElement p_traceableElement, 
																	Collection<DesignElementReference> p_modelElementRefs )
    throws SystemException, InterruptedException;

    /**
     * Sets the requirements "satisfiedBy" feature as an expression collected referenced
     * model elements for the given language and query text.
     * @param p_traceableElement
     * @param p_languageId
     * @param p_queryText
     * @return
     * @throws SystemException
     * @throws InterruptedException
     */
    TraceableToDesignElementsElement setDesignElementRefs(	TraceableToDesignElementsElement p_traceableElement, 
															String p_languageId,
															String p_queryText )
    throws SystemException, InterruptedException;
	
	/**
	 * Extracts the model elements from the referenced model elements object.
	 * @param p_refDesignElement
	 * @return
	 */
	List<EObject> designElements( RefManuallySelectedDesignElements p_refDesignElement );

	/**
	 * Calculates the model elements available for the satisfiedBy relation of a requirement. Takes into
	 * account the elements that have already been set for the requirement.
	 * @param p_refDesignElement
	 * @return
	 */
	List<EObject> designElementsChoice( TraceableToDesignElementsElement p_traceableElement,
										RefManuallySelectedDesignElements p_refDesignElement );

    /**
     * Sets the actual model elements that should satisfy the requirement.
     * @param p_traceableElement
     * @param p_selectedElements
     * @return
     * @throws SystemException
     * @throws InterruptedException
     */
	TraceableToDesignElementsElement setDesignElements( TraceableToDesignElementsElement p_traceableElement, 
														Collection<EObject> p_selectedElements )
    throws SystemException, InterruptedException;

	/**
	 * Sets the referenced model elements into the specified requirement.  May include evaluating
	 * the query in case of expression collected references.
	 * @param p_requirement
	 * @return
	 * @throws SystemException
	 * @throws ConstraintException
	 * @throws InterruptedException
	 */
	TraceableToDesignElementsElement setDesignElements( TraceableToDesignElementsElement p_requirement )
	throws SystemException, ConstraintException, InterruptedException;
	
	List<ICompletionProposal> computeRefElementsCompletionProposals( 	TraceableToDesignElementsElement p_traceableElement,
																		String p_constraintText )
	throws ConstraintException, SystemException, InterruptedException;
	
	/**
	 * Extracts the model element references from the referenced model elements object. May imply
	 * query evaluation in case of expression collected referenced model elements.
	 * @param p_refDesignElement
	 * @return
	 */
	Collection<DesignElementReference> designElementReferences( TraceableToDesignElementsElement p_contElement )
	throws SystemException, ConstraintException, InterruptedException;

	String languageFileExtension( 	TraceableToDesignElementsElement p_traceableElement,
									String p_languageId )
	throws ConstraintValidationException;

	String readConstraintText( 	String p_languageId,
								String p_resourceId ) 
	throws SystemException, InterruptedException;

	/**
	 * Sets the text of the "satisfiedBy" feature expression collected referenced model elements
	 * object.
	 * @param p_traceableElement
	 * @param p_languageId
	 * @param p_constraintText
	 * @return
	 * @throws SystemException
	 * @throws InterruptedException
	 */
	TraceableToDesignElementsElement setRefDesignElementsConstraintExprText( 	TraceableToDesignElementsElement p_traceableElement,
																				String p_languageId,
																				String p_constraintText ) 
	throws SystemException, InterruptedException;

	void persistConstraint( String p_languageId,
							String p_resourceId,
							String p_constraintText ) 
	throws ConstraintException, SystemException, InterruptedException;

	TraceableToDesignElementsElement setRefDesignElementsLibraries( TraceableToDesignElementsElement p_traceableElement,
																	Collection<FormalLanguageLibrary> p_libraries ) 
	throws ConstraintValidationException, SystemException, InterruptedException;

	List<FormalLanguageLibrary> librariesChoice( FormalLanguageExpression p_expression )
	throws SystemException, InterruptedException;
	
	TraceableToDesignElementsElement refreshRefDesignElementsLibraries( 	TraceableToDesignElementsElement p_traceableElement, 
																			Collection<String> p_libraryIds )
	throws ConstraintValidationException, SystemException, InterruptedException;
	
	TraceableToDesignElementsElement deleteRefDesignElementsLibraries(	TraceableToDesignElementsElement p_traceableElement,
																		Collection<String> p_libraryIds ) 
    throws SystemException, InterruptedException;
	
	Collection<ConstraintLanguage> definedLanguages( TraceableToDesignElementsElement p_traceableElement );

	/**
	 * Returns the model elements that should satisfy this requirement. May include evaluating
	 * the query in case of expression collected references.
	 * @param p_requirement
	 * @return
	 * @throws SystemException
	 * @throws ConstraintException
	 * @throws InterruptedException
	 */
	Collection<EObject> designElements( TraceableToDesignElementsElement p_traceableElement )
	throws SystemException, ConstraintException, InterruptedException;
	
	IdentifiedElement setDescriptionText( 	IdentifiedElement p_requirement,
											String p_descriptionText )
	throws SystemException, InterruptedException;
	
	boolean canUseQueryToTraceDesignElements( TraceableToDesignElementsElement p_traceableElement );
}
