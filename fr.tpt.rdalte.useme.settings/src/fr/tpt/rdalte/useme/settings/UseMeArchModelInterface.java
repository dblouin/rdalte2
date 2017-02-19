package fr.tpt.rdalte.useme.settings;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;

import fr.labsticc.framework.settings.model.settings.impl.AbstractEcoreModelInterface;
import fr.tpt.useme.architecture.model.usemearch.ContextInstanceElement;
import fr.tpt.useme.architecture.model.usemearch.UsemearchPackage;

public class UseMeArchModelInterface extends AbstractEcoreModelInterface {

	public UseMeArchModelInterface() {
		super( UsemearchPackage.Literals.IDENTIFIED_ELEMENT );
		
		addLanguage( UsemearchPackage.eINSTANCE, UsemearchPackage.eNS_PREFIX );
	}

	@Override
	public Object getPropertyValue(Object p_component, Object p_property) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getPropertyValue(Object p_component, Object p_property, Object p_unit) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getDefaultPropertyValue(Object p_property) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setPropertyValue(Object p_component, Object p_property, Object p_value, Object p_unit) {
	}

	@Override
	public boolean isComponent( Object p_object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isPropertyValue(Object p_object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getPropertyFromValue(Object p_propValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public EList<Object> componentTypes( final Object p_component ) {
		final EList<Object> types =  new BasicEList<Object>();
		
		if ( p_component instanceof ContextInstanceElement ) {
			types.add( ( (ContextInstanceElement) p_component ).getElementType() );
		}
		
		return types;
	}

	@Override
	public String getLanguageName() {
		return UsemearchPackage.eNS_PREFIX;
	}

	@Override
	public ResourceSet getCustomResourcet() {
		return null;
	}
}
