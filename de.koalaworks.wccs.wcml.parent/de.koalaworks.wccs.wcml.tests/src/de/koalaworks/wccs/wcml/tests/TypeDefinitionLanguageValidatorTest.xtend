package de.koalaworks.wccs.wcml.tests

import org.eclipse.xtext.testing.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.InjectWith
import javax.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import de.koalaworks.wccs.wcml.typeDefinitionLanguage.TypeDefinitionLanguagePackage
import de.koalaworks.wccs.wcml.validation.TypeDefinitionLanguageValidator
import de.koalaworks.wccs.wcml.typeDefinitionLanguage.ClassificationModel

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
	
	@Test
	def testEnsureNonEmptyCssSelector() {
		val result =
		'''
		content class cClass1 is recognized by css «SELECTOR_START»   «SELECTOR_END»
		'''.parse
		
		result.assertError(
			TypeDefinitionLanguagePackage::eINSTANCE.cssSelector,
			TypeDefinitionLanguageValidator::EMPTY_CSS_SELECTOR,
			"Selector must not be empty."
		);
	}
	
	@Test
	def testEnsureNonEmptyUrlPatternSelector() {
		val result =
		'''
		page class pClass1 is recognized by url pattern «SELECTOR_START»   «SELECTOR_END»
		'''.parse
		
		result.assertError(
			TypeDefinitionLanguagePackage::eINSTANCE.urlPatternSelector,
			TypeDefinitionLanguageValidator::EMPTY_URL_PATTERN_SELECTOR,
			"Selector must not be empty."
		);
	}
	
	@Test
	def testEnsureNonEmptyXPathSelector() {
		val result =
		'''
		content class cClass1 is recognized by xpath «SELECTOR_START»   «SELECTOR_END»
		'''.parse
		
		result.assertError(
			TypeDefinitionLanguagePackage::eINSTANCE.XPathSelector,
			TypeDefinitionLanguageValidator::EMPTY_XPATH_SELECTOR,
			"Selector must not be empty."
		);
	}
}