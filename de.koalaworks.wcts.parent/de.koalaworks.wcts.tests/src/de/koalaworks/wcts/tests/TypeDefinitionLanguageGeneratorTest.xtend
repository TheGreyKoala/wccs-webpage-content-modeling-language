package de.koalaworks.wcts.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import com.google.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import de.koalaworks.wcts.typeDefinitionLanguage.SiteStructure
import org.junit.Test
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.generator.IGenerator2
import de.koalaworks.wcts.generator.TypeDefinitionLanguageGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import static org.junit.Assert.assertEquals

@RunWith(XtextRunner)
@InjectWith(TypeDefinitionLanguageInjectorProvider)
class TypeDefinitionLanguageGeneratorTest {
	
	@Inject
	IGenerator2 generator
	
	@Inject
	extension ParseHelper<SiteStructure>
	
	@Inject
	extension ValidationTestHelper

	private val SELECTOR_START = "«"
	private val SELECTOR_END = "»"
	

	@Test
	def testGenerate() {
		val result =
		'''
		page type pType1 is recognized by url pattern «SELECTOR_START» \/service\?q=\$test\$$ «SELECTOR_END»
		page type pType2 is recognized by css «SELECTOR_START»body.pType2«SELECTOR_END»
			recognize pType2_f1 as cType2
			          pType2_f2 as cType3 by css «SELECTOR_START»div.pType2.f2«SELECTOR_END»
			          pType2_f3 as cType2 by css «SELECTOR_START»div.pType2.f3«SELECTOR_END»
			          pType2_f4 as rType1 by css «SELECTOR_START»div.pType2.f4«SELECTOR_END»
			          pType2_f5 as rType1 by url pattern «SELECTOR_START»http://pType2/f5«SELECTOR_END»
			          pType2_f6 as rType2
			          pType2_f7 as rType2 by url pattern «SELECTOR_START»http://pType2/f7«SELECTOR_END»
			          pType2_f8 as many cType2
			          pType2_f9 as many cType2 each by css «SELECTOR_START»div.pType2.f9«SELECTOR_END»
			          pType2_f10 as many rType2
			          pType2_f11 as many rType2 each by url pattern «SELECTOR_START»http://pType2/f11«SELECTOR_END»
		content type cType1
		content type cType2 is recognized by css «SELECTOR_START»div.c2«SELECTOR_END»
		content type cType3
			recognize cType3_f1 as cType1 by css «SELECTOR_START»div.cType3.f1«SELECTOR_END»
			          cType3_f2 as cType2
			          cType3_f3 as rType1 by css «SELECTOR_START»div.cType3.f3«SELECTOR_END»
			          cType3_f4 as rType1 by url pattern «SELECTOR_START»http://cType3/f4«SELECTOR_END»
			          cType3_f5 as rType2
			          cType3_f6 as cType2 by css «SELECTOR_START»div.cType3.f6«SELECTOR_END»
			          cType3_f7 as rType2 by url pattern «SELECTOR_START»http://cType3/f7«SELECTOR_END»
			          cType3_f8 as rType2 by css «SELECTOR_START»div.cType3.f8«SELECTOR_END»
		reference type rType1
		reference type rType2 is recognized by css «SELECTOR_START»div.r2[data-test='abc']«SELECTOR_END»
		reference type rType3 is recognized by url pattern «SELECTOR_START»http://rType3«SELECTOR_END»
		reference type rType4
		'''.parse
		
		result.assertNoErrors
		val fsa = new InMemoryFileSystemAccess()	
		val definitionsByType = result.typeDefinitions.groupBy[type | type.eClass]
		
		(generator as TypeDefinitionLanguageGenerator).doGenerate("test", definitionsByType, fsa)
		
		val actualResult = fsa.allFiles.get(IFileSystemAccess2::DEFAULT_OUTPUT + "test.js").toString
		val expectedResult =
		'''
		"use strict;"
		module.exports = {
			"pageTypes": {
				"pType1": {
					"name": "pType1",
					"selector": { "type": "UrlPatternSelector", "value": "\\\/service\\?q=\\$test\\$$" },
					"properties": {
					},
					"references": {
					}
				},
				"pType2": {
					"name": "pType2",
					"selector": { "type": "CssSelector", "value": "body.pType2" },
					"properties": {
						"pType2_f1": { "name": "pType2_f1", "type": "cType2", "isCollection": false, "selector": {} },
						"pType2_f2": { "name": "pType2_f2", "type": "cType3", "isCollection": false, "selector": { "type": "CssSelector", "value": "div.pType2.f2" } },
						"pType2_f3": { "name": "pType2_f3", "type": "cType2", "isCollection": false, "selector": { "type": "CssSelector", "value": "div.pType2.f3" } },
						"pType2_f8": { "name": "pType2_f8", "type": "cType2", "isCollection": true, "selector": {} },
						"pType2_f9": { "name": "pType2_f9", "type": "cType2", "isCollection": true, "selector": { "type": "CssSelector", "value": "div.pType2.f9" } }
					},
					"references": {
						"pType2_f4": { "name": "pType2_f4", "type": "rType1", "isCollection": false, "selector": { "type": "CssSelector", "value": "div.pType2.f4" } },
						"pType2_f5": { "name": "pType2_f5", "type": "rType1", "isCollection": false, "selector": { "type": "UrlPatternSelector", "value": "http:\/\/pType2\/f5" } },
						"pType2_f6": { "name": "pType2_f6", "type": "rType2", "isCollection": false, "selector": {} },
						"pType2_f7": { "name": "pType2_f7", "type": "rType2", "isCollection": false, "selector": { "type": "UrlPatternSelector", "value": "http:\/\/pType2\/f7" } },
						"pType2_f10": { "name": "pType2_f10", "type": "rType2", "isCollection": true, "selector": {} },
						"pType2_f11": { "name": "pType2_f11", "type": "rType2", "isCollection": true, "selector": { "type": "UrlPatternSelector", "value": "http:\/\/pType2\/f11" } }
					}
				}
			},
			"contentTypes": {
				"cType1": {
					"name": "cType1",
					"selector": {},
					"properties": {
					},
					"references": {
					}
				},
				"cType2": {
					"name": "cType2",
					"selector": { "type": "CssSelector", "value": "div.c2" },
					"properties": {
					},
					"references": {
					}
				},
				"cType3": {
					"name": "cType3",
					"selector": {},
					"properties": {
						"cType3_f1": { "name": "cType3_f1", "type": "cType1", "isCollection": false, "selector": { "type": "CssSelector", "value": "div.cType3.f1" } },
						"cType3_f2": { "name": "cType3_f2", "type": "cType2", "isCollection": false, "selector": {} },
						"cType3_f6": { "name": "cType3_f6", "type": "cType2", "isCollection": false, "selector": { "type": "CssSelector", "value": "div.cType3.f6" } }
					},
					"references": {
						"cType3_f3": { "name": "cType3_f3", "type": "rType1", "isCollection": false, "selector": { "type": "CssSelector", "value": "div.cType3.f3" } },
						"cType3_f4": { "name": "cType3_f4", "type": "rType1", "isCollection": false, "selector": { "type": "UrlPatternSelector", "value": "http:\/\/cType3\/f4" } },
						"cType3_f5": { "name": "cType3_f5", "type": "rType2", "isCollection": false, "selector": {} },
						"cType3_f7": { "name": "cType3_f7", "type": "rType2", "isCollection": false, "selector": { "type": "UrlPatternSelector", "value": "http:\/\/cType3\/f7" } },
						"cType3_f8": { "name": "cType3_f8", "type": "rType2", "isCollection": false, "selector": { "type": "CssSelector", "value": "div.cType3.f8" } }
					}
				}
			},
			"referenceTypes": {
				"rType1": {
					"name": "rType1",
					"selector": {}
				},
				"rType2": {
					"name": "rType2",
					"selector": { "type": "CssSelector", "value": "div.r2[data-test='abc']" }
				},
				"rType3": {
					"name": "rType3",
					"selector": { "type": "UrlPatternSelector", "value": "http:\/\/rType3" }
				},
				"rType4": {
					"name": "rType4",
					"selector": {}
				}
			}
		};
		'''

		assertEquals(expectedResult, actualResult)
	}
}