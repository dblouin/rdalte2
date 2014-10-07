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

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;

import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.RefManuallySelectedDesignElements;

public class DesignElementsSelectionDialog extends FeatureEditorDialog {

	public DesignElementsSelectionDialog( final Shell p_parent,
											final ILabelProvider p_labelProvider,
											final RefManuallySelectedDesignElements p_refDesignElement,
											final List<EObject> p_currentValues,
											final List<EObject> p_refElementsChoice ) {
		super( 	p_parent, 
				p_labelProvider, 
				p_refDesignElement, 
				RdalPackage.eINSTANCE.getDesignElementReference_DesignElement().getEType(),
				p_currentValues,
				"Select Design Model Elements",
				p_refElementsChoice,
				true,
				true,
				true );
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getResult() {
	    return (EList<EObject>) super.getResult();
	}
}
