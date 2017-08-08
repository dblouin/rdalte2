package fr.tpt.rdalte.useme.settings;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;

import fr.labsticc.framework.settings.model.settings.impl.AbstractEcoreModelInterface;
import fr.tpt.mem4csd.dssl.model.dssl.DsslPackage;
import fr.tpt.mem4csd.dssl.model.dssl.EntityInstance;

public class DsslModelInterface extends AbstractEcoreModelInterface {

	public DsslModelInterface() {
		super( DsslPackage.Literals.IDENTIFIED_ELEMENT );
		
		addLanguage( DsslPackage.eINSTANCE, DsslPackage.eNS_PREFIX );
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
		
		if ( p_component instanceof EntityInstance ) {
			types.add( ( (EntityInstance) p_component ).getEntityType() );
		}
		
		return types;
	}

	@Override
	public String getLanguageName() {
		return DsslPackage.eNS_PREFIX;
	}

	@Override
	public ResourceSet getCustomResourcet() {
		return null;
	}
}
