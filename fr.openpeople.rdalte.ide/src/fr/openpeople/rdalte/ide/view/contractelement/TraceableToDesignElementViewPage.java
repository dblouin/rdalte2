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
package fr.openpeople.rdalte.ide.view.contractelement;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import fr.labsticc.framework.constraints.view.IConstraintViewersConfiguration;
import fr.labsticc.framework.core.exception.IExceptionHandler;
import fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement;
import fr.openpeople.rdalte.ide.view.AbstractRdalEditorViewPage;
import fr.openpeople.rdalte.service.IContractualElementBusinessDelegate;

public class TraceableToDesignElementViewPage extends AbstractRdalEditorViewPage<TraceableToDesignElementsElement> {
	
	private final IContractualElementBusinessDelegate businessDelegate;

	private DesignElementsPanel pnlRefModelElements;
	private final Image externalImage;
	
	public TraceableToDesignElementViewPage( 	final Composite p_parent,
											final IContractualElementBusinessDelegate p_businessDelegate,
											final IConstraintViewersConfiguration p_constraintViewsConfig,
											final IExceptionHandler p_execeptionHandler ) {
		super( p_parent, SWT.NULL, p_execeptionHandler );
		
		businessDelegate = p_businessDelegate;

		pnlRefModelElements = null;
		externalImage = createImage( "expressionsView.gif" );
		createControls( p_constraintViewsConfig );
	}
	
	@Override
	public String getExternalTitle() {
		return "Design Elements";
	}
	
	@Override
	public Image getExternalImage() {
		return externalImage;
	}
	
	@Override
	public void dispose() {
		super.dispose();

		if ( !externalImage.isDisposed() ) {
			externalImage.dispose();
		}
	}

	private void createControls( final IConstraintViewersConfiguration p_constraintViewsConfig ) {
		setLayout( new FillLayout() );
		pnlRefModelElements = new DesignElementsPanel( 	this, 
														SWT.NULL, 
														p_constraintViewsConfig,
														businessDelegate, 
														getExceptionHandler() );
	}
	
	@Override
	public void displayData( final TraceableToDesignElementsElement p_traceableToDesign ) {
		// Parent class sets the selected object
		super.displayData( p_traceableToDesign );

		if ( pnlRefModelElements != null ) {
			pnlRefModelElements.displayData( getSelectedObject() );
		}
	}
}
