/*******************************************************************************
 * Copyright (c) 2011 Lab-STICC Universite de Bretagne Sud, Lorient.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-B license available
 * at :
 * en : http://www.cecill.info/licences/Licence_CeCILL-B_V1-en.html
 * fr : http://www.cecill.info/licences/Licence_CeCILL-B_V1-fr.html
 * 
 * Contributors:
 * Dominique BLOUIN (Lab-STICC UBS), dominique.blouin@univ-ubs.fr
 ******************************************************************************/
package fr.openpeople.rdalte.ide;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;

import fr.labsticc.framework.constraints.ide.ConstraintsIDEPlugin;
import fr.labsticc.framework.constraints.service.IConstraintInterpretationAS;
import fr.labsticc.framework.constraints.service.IConstraintPersistenceAS;
import fr.labsticc.framework.core.exception.ResourceAccessException;
import fr.labsticc.framework.ide.viewpart.IViewPageBusinessDelegate;
import fr.labsticc.framework.settings.ide.SettingsPlugin;
import fr.openpeople.rdalte.ide.view.contractelement.ContractualElementBusinessDelegate;
import fr.openpeople.rdalte.ide.view.traceability.IDEReqTraceabilityBusinessDelegate;
import fr.openpeople.rdalte.service.IContractualElementBusinessDelegate;
import fr.openpeople.rdalte.service.IContractualElementTraceabilityBusinessDelegate;

public class RdalBusinessDelegateFactory {

	private static final RdalBusinessDelegateFactory instance = new RdalBusinessDelegateFactory();
	
	private final Collection<IViewPageBusinessDelegate> businessDelegates;
	
	private RdalBusinessDelegateFactory() {
		businessDelegates = new ArrayList<IViewPageBusinessDelegate>();
	}
	
	public static RdalBusinessDelegateFactory getInstance() {
		return instance;
	}
	
	public IContractualElementBusinessDelegate getRequirementBusinessDelegate()
	throws ResourceAccessException {
		for ( final IViewPageBusinessDelegate delegate : businessDelegates ) {
			if ( delegate instanceof IContractualElementBusinessDelegate ) {
				return (IContractualElementBusinessDelegate) delegate;
			}
		}
		
		try {
			final IContractualElementBusinessDelegate delegate = createRequirementBusinessDelegate();
	 		businessDelegates.add( (IViewPageBusinessDelegate) delegate );
	 		
	 		return delegate;
		}
		catch ( final CoreException p_ex ) {
			throw new ResourceAccessException( p_ex );
		}
	}
	
	public IContractualElementTraceabilityBusinessDelegate getTraceabilityBusinessDelegate()
	throws ResourceAccessException {
		for ( final IViewPageBusinessDelegate delegate : businessDelegates ) {
			if ( delegate instanceof IContractualElementTraceabilityBusinessDelegate ) {
				return (IContractualElementTraceabilityBusinessDelegate) delegate;
			}
		}

		final IContractualElementTraceabilityBusinessDelegate delegate = createRequirementTraceabilityBusinessDelegate();
	 	businessDelegates.add( (IViewPageBusinessDelegate) delegate );
	 		
	 	return delegate;
	}
	
	private IContractualElementTraceabilityBusinessDelegate createRequirementTraceabilityBusinessDelegate() 
	throws ResourceAccessException { 
		return new IDEReqTraceabilityBusinessDelegate( getRequirementBusinessDelegate(), SettingsPlugin.getDefault().getSettingsDelegate() );
	}
	
	private static IContractualElementBusinessDelegate createRequirementBusinessDelegate() 
	throws CoreException {
		final ConstraintsIDEPlugin cstPlugin = ConstraintsIDEPlugin.getDefault();
		
		final Map<String, IConstraintInterpretationAS> reqInterpreters = cstPlugin.getConstraintInterpretationServicesByLanguageId();//new HashMap<String, IConstraintInterpretationAS>();
		final Map<String, IConstraintPersistenceAS> reqPersistenceServices = cstPlugin.getConstraintPersistenceServicesByLanguageId();//new HashMap<String, IConstraintPersistenceAS>();
		
		return new ContractualElementBusinessDelegate( reqInterpreters, reqPersistenceServices );
	}
}
