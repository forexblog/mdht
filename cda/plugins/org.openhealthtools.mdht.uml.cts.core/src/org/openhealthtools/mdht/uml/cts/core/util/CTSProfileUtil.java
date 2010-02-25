/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cts.core.util;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;

public class CTSProfileUtil {

	/**
	 * Load CTS profile into provided resource set and return Profile.
	 */
	public static Profile getCTSProfile(ResourceSet resourceSet) {
		Profile profile = null;
		Resource profileResource = resourceSet.getResource(URI
				.createURI(CTSResource.CTS_PROFILE_URI), true);
		
		if (profileResource != null) {
			profile = (Profile) EcoreUtil.getObjectByType(
					profileResource.getContents(), 
					UMLPackage.eINSTANCE.getProfile());
		}
		
		return profile;
	}

	/**
	 * Returns stereotype if applied, or first sub-stereotype applied that is a
	 * specialization of the given stereotype.
	 * 
	 * @return stereotype, or null if not applied
	 */
	public static Stereotype getAppliedCTSStereotype(Element element, String stereotypeName) {	
		Stereotype stereotype = null;
		Profile profile = getCTSProfile(element.eResource().getResourceSet());
		if (profile != null) {
			stereotype = profile.getOwnedStereotype(stereotypeName);
			if (stereotype != null) {
				if (!element.isStereotypeApplied(stereotype)) {
					List<Stereotype> stereotypes = element.getAppliedSubstereotypes(stereotype);
					if (!stereotypes.isEmpty()) {
						stereotype = stereotypes.get(0);
					}
				}
			}
		}	
		
		return element.isStereotypeApplied(stereotype) ? stereotype : null;
	}

	/**
	 * Applies stereotype if it is not already applied to given model element,
	 * and applies CTS profile if necessary.
	 */
	public static Stereotype applyCTSStereotype(Element element, String stereotypeName) {
		Stereotype stereotype = null;
		Profile profile = getCTSProfile(element.eResource().getResourceSet());
		if (profile != null) {
			stereotype = profile.getOwnedStereotype(stereotypeName);
			if (stereotype != null && !element.isStereotypeApplied(stereotype)) {
				UMLUtil.safeApplyStereotype(element, stereotype);
			}
		}
		return stereotype;
	}

	public static void unapplyCTSStereotype(Element element, String stereotypeName) {
		String qname = ICTSProfileConstants.CTS_PROFILE_NAME + NamedElement.SEPARATOR + stereotypeName;
		Stereotype stereotype = element.getApplicableStereotype(qname);
		if (stereotype != null && element.isStereotypeApplied(stereotype)) {
			element.unapplyStereotype(stereotype);
		}
	}

	/**
	 * Use when stereotype property value refers to another stereotyped element.
	 * Returns the underlying base element of the property's stereotype application.
	 */
	public static Object getStereotypeApplicationValue(Element element, 
			String stereotypeName, String propertyName) {
		Object value = null;
		Stereotype stereotype = CTSProfileUtil.getAppliedCTSStereotype(element, stereotypeName);
		if (stereotype != null) {
			Object stereoAppl = element.getValue(stereotype, propertyName);
			if (stereoAppl instanceof EObject) {
				value = UMLUtil.getBaseElement((EObject)stereoAppl);
			}
		}
		return value;
	}
	
	/**
	 * Set an element's stereotype property value, when that property is typed by a stereotyped element.
	 */
	public static void setStereotypeApplicationValue(Element element,
			Stereotype stereotype, String propertyName,
			Element value, String valueStereotypeName) {
		Stereotype valueStereotype = getAppliedCTSStereotype(value, valueStereotypeName);
		if (valueStereotype != null) {
			EObject stereotypeApplication = value.getStereotypeApplication(valueStereotype);
			element.setValue(stereotype, propertyName, stereotypeApplication);
		}
	}
	
	/**
	 * Check all containing packages for applied profile.
	 */
	public static Profile getAppliedCTSProfile(Element element) {		
		return org.openhealthtools.mdht.uml.common.util.UMLUtil.getAppliedProfile(CTSResource.CTS_PROFILE_URI,element);
				
	}
}