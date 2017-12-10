package de.koalaworks.wcts.tests

import org.eclipse.xtext.testing.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.InjectWith
import javax.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import de.koalaworks.wcts.typeDefinitionLanguage.TypeDefinitionLanguagePackage
import de.koalaworks.wcts.validation.TypeDefinitionLanguageValidator
import de.koalaworks.wcts.typeDefinitionLanguage.ClassificationModel

@RunWith(typeof(XtextRunner))
@InjectWith(TypeDefinitionLanguageInjectorProvider)
class TypeDefinitionLanguageValidatorTest {
	
	@Inject
	extension ParseHelper<ClassificationModel>
	
	@Inject
	extension ValidationTestHelper

	private val SELECTOR_START = "«"
	private val SELECTOR_END = "»"

	@Test
	def testEnsureInferableFeatureSelector() {
		val result = 
		'''
		content class cType1
		reference class rType1
		page class pType1 is recognized by url pattern «SELECTOR_START»123«SELECTOR_END»
		    classifies f1 as cType1
		              f2 as rType1
		'''.parse

		result.assertError(
			TypeDefinitionLanguagePackage::eINSTANCE.feature,
			TypeDefinitionLanguageValidator::NO_INFERABLE_FEATURE_SELECTOR,
			"f1 requires an inferable selector. Either specify a selector for this particular feature, or a default selector for the class cType1."
		);
		
		result.assertError(
			TypeDefinitionLanguagePackage::eINSTANCE.feature,
			TypeDefinitionLanguageValidator::NO_INFERABLE_FEATURE_SELECTOR,
			"f2 requires an inferable selector. Either specify a selector for this particular feature, or a default selector for the class rType1."
		);
	}
	
	@Test
	def testEnsureFeatureSelectorTypeMatch() {
		val result = 
		'''
		content class cType1
		reference class rType1
		page class pType1 is recognized by url pattern «SELECTOR_START»123«SELECTOR_END»
		    classifies f1 as cType1 by url pattern «SELECTOR_START»abc«SELECTOR_END»
		'''.parse
		
		result.assertError(
			TypeDefinitionLanguagePackage::eINSTANCE.feature,
			TypeDefinitionLanguageValidator::INVALID_CUSTOM_FEATURE_SELECTOR,
			"Content can not be recognized by an url pattern."
		);
	}
}