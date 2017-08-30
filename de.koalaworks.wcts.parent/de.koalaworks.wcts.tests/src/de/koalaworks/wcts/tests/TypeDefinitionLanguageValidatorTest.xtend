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
		content type cType1
		reference type rType1
		page type pType1 is recognized by url pattern «SELECTOR_START»123«SELECTOR_END»
		    recognize f1 as cType1
		              f2 as rType1
		'''.parse

		result.assertError(
			TypeDefinitionLanguagePackage::eINSTANCE.feature,
			TypeDefinitionLanguageValidator::NO_INFERABLE_FEATURE_SELECTOR,
			"Type cType1 does not specify a default selector."
		);
		
		result.assertError(
			TypeDefinitionLanguagePackage::eINSTANCE.feature,
			TypeDefinitionLanguageValidator::NO_INFERABLE_FEATURE_SELECTOR,
			"Type rType1 does not specify a default selector."
		);
	}
	
	@Test
	def testEnsureFeatureSelectorTypeMatch() {
		val result = 
		'''
		content type cType1
		reference type rType1
		page type pType1 is recognized by url pattern «SELECTOR_START»123«SELECTOR_END»
		    recognize f1 as cType1 by url pattern «SELECTOR_START»abc«SELECTOR_END»
		'''.parse
		
		result.assertError(
			TypeDefinitionLanguagePackage::eINSTANCE.feature,
			TypeDefinitionLanguageValidator::INVALID_CUSTOM_FEATURE_SELECTOR,
			"Content can not be recognized by an url pattern."
		);
	}
	
	@Test
	def testEnsureReferencesHaveNoReferences() {
		val result = 
		'''
		reference type rType1 is recognized by css «SELECTOR_START»a.test«SELECTOR_END»
		reference type rType2 is recognized by css «SELECTOR_START»a.test2«SELECTOR_END»
		    recognize f1 as rType1
		'''.parse
		
		result.assertError(
			TypeDefinitionLanguagePackage::eINSTANCE.feature,
			TypeDefinitionLanguageValidator::REFERENCE_MUST_NOT_HAVE_REFERENCE,
			"References are not capable of owning a reference themselves."
		);
	}
}