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
package fr.openpeople.rdalte.service;

import fr.openpeople.rdal2.model.rdal.Requirement;
import fr.openpeople.rdal2.model.rdal.util.RdalSwitch;

public class SatisfyingRequirementsSwitch extends RdalSwitch<Object> {

	@Override
	public Object caseRequirement( final Requirement p_requirement ) {
		return null;
	}
}
