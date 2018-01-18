package de.koalaworks.wccs.wcml.validation

import de.koalaworks.wccs.wcml.validation.AbstractWebContentModelingLanguageValidator
import org.eclipse.xtext.validation.Check
import de.koalaworks.wccs.wcml.webContentModelingLanguage.Feature
import com.google.common.collect.HashMultimap
import de.koalaworks.wccs.wcml.webContentModelingLanguage.WebContentModelingLanguagePackage
import de.koalaworks.wccs.wcml.webContentModelingLanguage.FeatureCapableClass

class FeatureNameValidator extends AbstractWebContentModelingLanguageValidator {
	
	@Check
	def ensureUniqueFeatureNames(FeatureCapableClass type) {
		val featuresByName = HashMultimap.<String, Feature>create()
		type.features.forEach[feature | featuresByName.put(feature.name, feature)]
		
		featuresByName
			.asMap
			.values
			.filter[featureList | featureList.size > 1]
			.flatten
			.forEach[feature | error("Feature names must be unique within a type.", feature, WebContentModelingLanguagePackage.Literals.FEATURE__NAME, "duplicate_feature_name")]
	}
}