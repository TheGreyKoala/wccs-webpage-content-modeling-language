/*
 * generated by Xtext 2.12.0
 */
package de.koalaworks.wcts.validation

import org.eclipse.xtext.validation.Check
import de.koalaworks.wcts.typeDefinitionLanguage.Feature
import de.koalaworks.wcts.typeDefinitionLanguage.TypeDefinitionLanguagePackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class TypeDefinitionLanguageValidator extends AbstractTypeDefinitionLanguageValidator {
	
	public static val NO_CONTENT_SELECTOR = 'noContentSelector'

	/* @Check
	def checkPropertyOrContentTypeDefineSelector(Feature feature) {
		if (feature.selector === null && feature.type.selector === null) {
			error("Content type " + feature.type.name + " does not specify a default selector.",
				feature, TypeDefinitionLanguagePackage.Literals.PROPERTY__SELECTOR,
				NO_CONTENT_SELECTOR
			);
		}
	}*/
	
}
