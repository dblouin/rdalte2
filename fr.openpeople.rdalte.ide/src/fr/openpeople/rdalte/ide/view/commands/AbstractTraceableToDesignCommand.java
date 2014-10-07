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
package fr.openpeople.rdalte.ide.view.commands;

import org.eclipse.emf.ecore.EObject;

import fr.labsticc.framework.emf.view.editor.AbstractEditorCommand;
import fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement;

public abstract class AbstractTraceableToDesignCommand extends AbstractEditorCommand<TraceableToDesignElementsElement> {

	public AbstractTraceableToDesignCommand( final EObject p_context ) {
		super( p_context );
	}
}
