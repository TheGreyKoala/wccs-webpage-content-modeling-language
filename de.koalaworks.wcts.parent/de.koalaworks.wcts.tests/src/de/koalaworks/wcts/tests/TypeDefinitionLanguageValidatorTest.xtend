package de.koalaworks.wcts.tests

import org.eclipse.xtext.testing.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.InjectWith
import javax.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import de.koalaworks.wcts.typeDefinitionLanguage.SiteStructure
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import de.koalaworks.wcts.typeDefinitionLanguage.TypeDefinitionLanguagePackage
import de.koalaworks.wcts.validation.TypeDefinitionLanguageValidator

@RunWith(typeof(XtextRunner))
@InjectWith(TypeDefinitionLanguageInjectorProvider)
class TypeDefinitionLanguageValidatorTest {
	
	@Inject
	extension ParseHelper<SiteStructure>
	
	@Inject
	extension ValidationTestHelper

	private val SELECTOR_START = "«"
	private val SELECTOR_END = "»"

	@Test
	def testEnsureInferableFeatureSelector() {
		val result = 
		'''
		content class cType1
		content class cType2
			classifies cType2_f1 as cType1 by css «SELECTOR_START»123«SELECTOR_END»
		reference class rType1
		page class pType1 is recognized by url pattern «SELECTOR_START»123«SELECTOR_END»
		    classifies f1 as cType1
		              f2 as rType1
		              f3 as cType2 // Should not provoke an error, since its own feature has a selector
		'''.parse

		result.assertError(
			TypeDefinitionLanguagePackage::eINSTANCE.feature,
			TypeDefinitionLanguageValidator::NO_INFERABLE_FEATURE_SELECTOR,
			"f1 requires an inferable selector. Either specify a selector for this particular feature, or a default selector for the type cType1."
		);
		
		result.assertError(
			TypeDefinitionLanguagePackage::eINSTANCE.feature,
			TypeDefinitionLanguageValidator::NO_INFERABLE_FEATURE_SELECTOR,
			"f2 requires an inferable selector. Either specify a selector for this particular feature, or a default selector for the type rType1."
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
	def testCheckCollectionFeatures_negativeTest() {
		val result = 
		'''
		content class Section is recognized by css «SELECTOR_START»123«SELECTOR_END»
		content class Article
			classifies sections as many Section
		              sections2 as many Section each by css «SELECTOR_START»123«SELECTOR_END»
		
		page class TestPage is recognized by url pattern «SELECTOR_START»123«SELECTOR_END»
			classifies articles as many Article
		'''.parse
		
		result.assertError(
			TypeDefinitionLanguagePackage::eINSTANCE.feature,
			TypeDefinitionLanguageValidator::REQUIRE_SCRIPT_SELECTOR,
			"As articles has no inferable selector and is a collection, sections in Article is required to be selected by a script."
		);
		
		result.assertError(
			TypeDefinitionLanguagePackage::eINSTANCE.feature,
			TypeDefinitionLanguageValidator::REQUIRE_SCRIPT_SELECTOR,
			"As articles has no inferable selector and is a collection, sections2 in Article is required to be selected by a script."
		);
	}
	
	@Test
	def testCheckCollectionFeatures_positiveTest() {
		val result = 
		'''
		content class Section is recognized by css «SELECTOR_START»123«SELECTOR_END»
		content class Article
			classifies sections as many Section each by executing «SELECTOR_START»123«SELECTOR_END»
		
		page class TestPage is recognized by url pattern «SELECTOR_START»123«SELECTOR_END»
			classifies articles as many Article
		'''.parse
		
		val result2 = 
		'''
		content class Section is recognized by css «SELECTOR_START»123«SELECTOR_END»
		content class Article
			classifies sections as many Section
		
		page class TestPage is recognized by url pattern «SELECTOR_START»123«SELECTOR_END»
			classifies articles as many Article each by css «SELECTOR_START»123«SELECTOR_END»
		'''.parse
		
		val result3 = 
		'''
		content class Section is recognized by css «SELECTOR_START»123«SELECTOR_END»
		content class Article
			classifies sections as Section
		
		page class TestPage is recognized by url pattern «SELECTOR_START»123«SELECTOR_END»
			classifies articles as many Article
		'''.parse
		
		val result4 = 
		'''
		content class Section is recognized by css «SELECTOR_START»123«SELECTOR_END»
		content class Article
			classifies sections as many Section
		
		page class TestPage is recognized by url pattern «SELECTOR_START»123«SELECTOR_END»
			classifies articles as Article
		'''.parse
		
		result.assertNoErrors
		result2.assertNoErrors
		result3.assertNoErrors
		result4.assertNoErrors
	}
}