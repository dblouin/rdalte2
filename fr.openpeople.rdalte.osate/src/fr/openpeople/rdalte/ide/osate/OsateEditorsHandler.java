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
package fr.openpeople.rdalte.ide.osate;

import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;
import org.eclipse.xtext.resource.ILocationInFileProvider;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.XtextSourceViewer;
import org.eclipse.xtext.util.ITextRegion;
import org.osate.aadl2.parsesupport.AObject;
import org.osate.aadl2.presentation.Aadl2ModelEditor;

import fr.labsticc.framework.emf.view.ide.EMFEditorUtil;
import fr.openpeople.rdalte.ide.view.IEditorHandler;

public class OsateEditorsHandler implements IEditorHandler {
	
	private static final ILocationInFileProvider locFileProvider = new DefaultLocationInFileProvider();
	
	@Override
	public void openEditor( EObject p_element ) 
	throws PartInitException {
		final IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if ( window != null && window.getActivePage() != null ) {
			final Resource resource = p_element.eResource();
			
			if ( resource != null ) {
				final URI uri = resource.getURI();
				final String uriStr = uri.toPlatformString( true );
				final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile( new Path( uriStr ) );
				
				final IEditorPart editor = IDE.openEditor( window.getActivePage(), file );
				
				if ( editor instanceof Aadl2ModelEditor ) {
					EMFEditorUtil.selectIntoEditor( Collections.singletonList( p_element ), editor );
//					final Aadl2ModelEditor aadlEditor = (Aadl2ModelEditor) editor;
//					final StructuredViewer viewer = (StructuredViewer) aadlEditor.getViewer();
//					final IElementComparer currentComparer = viewer.getComparer();
//					viewer.setComparer( uriComparer );
//					aadlEditor.setSelectionToViewer( Collections.singleton( p_element ) );
//					
//					viewer.setComparer( currentComparer );
				}
				else if ( editor instanceof XtextEditor ) {
					final XtextEditor xtextEditor = (XtextEditor) editor;
					final ITextRegion textRegion = locFileProvider.getSignificantTextRegion( p_element );
					final ITextSelection selection = new TextSelection( textRegion.getOffset(), textRegion.getLength() );
					( (XtextSourceViewer) xtextEditor.getInternalSourceViewer() ).setSelection( selection, true );
				}
			}
		}
	}

	@Override
	public boolean isEditorFor( final EObject p_element ) {
		return p_element instanceof AObject;
	}

}
