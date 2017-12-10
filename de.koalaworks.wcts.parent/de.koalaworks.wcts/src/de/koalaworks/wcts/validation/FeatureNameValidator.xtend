package de.koalaworks.wcts.validation

import de.koalaworks.wcts.validation.AbstractTypeDefinitionLanguageValidator
import org.eclipse.xtext.validation.Check
import de.koalaworks.wcts.typeDefinitionLanguage.Feature
import com.google.common.collect.HashMultimap
import de.koalaworks.wcts.typeDefinitionLanguage.TypeDefinitionLanguagePackage
import de.koalaworks.wcts.typeDefinitionLanguage.FeatureCapableClass

class FeatureNameValidator extends AbstractTypeDefinitionLanguageValidator {
	
	@Check
	def ensureUniqueFeatureNames(FeatureCapableClass type) {
		val featuresByName = HashMultimap.<String, Feature>create()
		type.features.forEach[feature | featuresByName.put(feature.name, feature)]
		
		featuresByName
			.asMap
			.values
			.filter[featureList | featureList.size > 1]
			.flatten
			.forEach[feature | error("Feature names must be unique within a type.", feature, TypeDefinitionLanguagePackage.Literals.FEATURE__NAME, "duplicate_feature_name")]
	}
}