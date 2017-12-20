package de.koalaworks.wcts.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import com.google.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Test
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.generator.IGenerator2
import de.koalaworks.wcts.generator.TypeDefinitionLanguageGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import static org.junit.Assert.assertEquals
import de.koalaworks.wcts.typeDefinitionLanguage.ClassificationModel

@RunWith(XtextRunner)
@InjectWith(TypeDefinitionLanguageInjectorProvider)
class TypeDefinitionLanguageGeneratorTest {
	
	@Inject
	IGenerator2 generator
	
	@Inject
	extension ParseHelper<ClassificationModel>
	
	@Inject
	extension ValidationTestHelper

	private val SELECTOR_START = "«"
	private val SELECTOR_END = "»"
	

	@Test
	def testGenerate() {
		val result =
		'''
		page class pType1 is recognized by url pattern «SELECTOR_START» \/service\?q=\$test\$$ «SELECTOR_END»
		page class pType2 is recognized by url pattern «SELECTOR_START»http:\/\/www\.mysite\.de\/«SELECTOR_END»
			classifies pType2_f1 as cType2
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
		content class cType1
		content class cType2 is recognized by css «SELECTOR_START»div.c2«SELECTOR_END»
		content class cType3
			classifies cType3_f1 as cType1 by css «SELECTOR_START»div.cType3.f1«SELECTOR_END»
			          cType3_f2 as cType2
			          cType3_f3 as rType1 by css «SELECTOR_START»div.cType3.f3«SELECTOR_END»
			          cType3_f4 as rType1 by url pattern «SELECTOR_START»http://cType3/f4«SELECTOR_END»
			          cType3_f5 as rType2
			          cType3_f6 as cType2 by css «SELECTOR_START»div.cType3.f6«SELECTOR_END»
			          cType3_f7 as rType2 by url pattern «SELECTOR_START»http://cType3/f7«SELECTOR_END»
			          cType3_f8 as rType2 by css «SELECTOR_START»div.cType3.f8«SELECTOR_END»
			          cType3_f9 as cType1 by xpath «SELECTOR_START».//h4«SELECTOR_END»
			          cType3_f10 as many cType1 each by xpath «SELECTOR_START».//cType3/f10«SELECTOR_END»
			          cType3_f11 as rType1 by xpath «SELECTOR_START».//h4«SELECTOR_END»
			          cType3_f12 as many rType1 each by xpath «SELECTOR_START».//cType3/f10«SELECTOR_END»
			          cType3_f13 as cType1 by xpath «SELECTOR_START»substring-before(substring-after(.//div[2]/div[@class="team-member-des"], "Tel.: "), "\n")«SELECTOR_END»
		reference class rType1
		reference class rType2 is recognized by css «SELECTOR_START»div.r2[data-test='abc']«SELECTOR_END»
		reference class rType3 is recognized by url pattern «SELECTOR_START»http://rType3«SELECTOR_END»
		reference class rType4
		'''.parse
		
		result.assertNoErrors
		val fsa = new InMemoryFileSystemAccess()	
		val definitionsByType = result.classes.groupBy[class | class.eClass]
		
		(generator as TypeDefinitionLanguageGenerator).doGenerate("test", definitionsByType, fsa)
		
		val actualResult = fsa.allFiles.get(IFileSystemAccess2::DEFAULT_OUTPUT + "test.json").toString
		val expectedResult =
		'''
		{
			"pageClasses": {
				"pType1": {
					"name": "pType1",
					"selector": { "type": "UrlPatternSelector", "value": "\\\/service\\?q=\\$test\\$$" },
					"contents": {
					},
					"references": {
					}
				},
				"pType2": {
					"name": "pType2",
					"selector": { "type": "UrlPatternSelector", "value": "http:\\\/\\\/www\\.mysite\\.de\\\/" },
					"contents": {
						"pType2_f1": { "name": "pType2_f1", "class": "cType2", "isCollection": false, "selector": {} },
						"pType2_f2": { "name": "pType2_f2", "class": "cType3", "isCollection": false, "selector": { "type": "CssSelector", "value": "div.pType2.f2" } },
						"pType2_f3": { "name": "pType2_f3", "class": "cType2", "isCollection": false, "selector": { "type": "CssSelector", "value": "div.pType2.f3" } },
						"pType2_f8": { "name": "pType2_f8", "class": "cType2", "isCollection": true, "selector": {} },
						"pType2_f9": { "name": "pType2_f9", "class": "cType2", "isCollection": true, "selector": { "type": "CssSelector", "value": "div.pType2.f9" } }
					},
					"references": {
						"pType2_f4": { "name": "pType2_f4", "class": "rType1", "isCollection": false, "selector": { "type": "CssSelector", "value": "div.pType2.f4" } },
						"pType2_f5": { "name": "pType2_f5", "class": "rType1", "isCollection": false, "selector": { "type": "UrlPatternSelector", "value": "http:\/\/pType2\/f5" } },
						"pType2_f6": { "name": "pType2_f6", "class": "rType2", "isCollection": false, "selector": {} },
						"pType2_f7": { "name": "pType2_f7", "class": "rType2", "isCollection": false, "selector": { "type": "UrlPatternSelector", "value": "http:\/\/pType2\/f7" } },
						"pType2_f10": { "name": "pType2_f10", "class": "rType2", "isCollection": true, "selector": {} },
						"pType2_f11": { "name": "pType2_f11", "class": "rType2", "isCollection": true, "selector": { "type": "UrlPatternSelector", "value": "http:\/\/pType2\/f11" } }
					}
				}
			},
			"contentClasses": {
				"cType1": {
					"name": "cType1",
					"selector": {},
					"contents": {
					},
					"references": {
					}
				},
				"cType2": {
					"name": "cType2",
					"selector": { "type": "CssSelector", "value": "div.c2" },
					"contents": {
					},
					"references": {
					}
				},
				"cType3": {
					"name": "cType3",
					"selector": {},
					"contents": {
						"cType3_f1": { "name": "cType3_f1", "class": "cType1", "isCollection": false, "selector": { "type": "CssSelector", "value": "div.cType3.f1" } },
						"cType3_f2": { "name": "cType3_f2", "class": "cType2", "isCollection": false, "selector": {} },
						"cType3_f6": { "name": "cType3_f6", "class": "cType2", "isCollection": false, "selector": { "type": "CssSelector", "value": "div.cType3.f6" } },
						"cType3_f9": { "name": "cType3_f9", "class": "cType1", "isCollection": false, "selector": { "type": "XPathSelector", "value": ".\/\/h4" } },
						"cType3_f10": { "name": "cType3_f10", "class": "cType1", "isCollection": true, "selector": { "type": "XPathSelector", "value": ".\/\/cType3\/f10" } },
						"cType3_f13": { "name": "cType3_f13", "class": "cType1", "isCollection": false, "selector": { "type": "XPathSelector", "value": "substring-before(substring-after(.\/\/div[2]\/div[@class=\"team-member-des\"], \"Tel.: \"), \"\n\")" } }
					},
					"references": {
						"cType3_f3": { "name": "cType3_f3", "class": "rType1", "isCollection": false, "selector": { "type": "CssSelector", "value": "div.cType3.f3" } },
						"cType3_f4": { "name": "cType3_f4", "class": "rType1", "isCollection": false, "selector": { "type": "UrlPatternSelector", "value": "http:\/\/cType3\/f4" } },
						"cType3_f5": { "name": "cType3_f5", "class": "rType2", "isCollection": false, "selector": {} },
						"cType3_f7": { "name": "cType3_f7", "class": "rType2", "isCollection": false, "selector": { "type": "UrlPatternSelector", "value": "http:\/\/cType3\/f7" } },
						"cType3_f8": { "name": "cType3_f8", "class": "rType2", "isCollection": false, "selector": { "type": "CssSelector", "value": "div.cType3.f8" } },
						"cType3_f11": { "name": "cType3_f11", "class": "rType1", "isCollection": false, "selector": { "type": "XPathSelector", "value": ".\/\/h4" } },
						"cType3_f12": { "name": "cType3_f12", "class": "rType1", "isCollection": true, "selector": { "type": "XPathSelector", "value": ".\/\/cType3\/f10" } }
					}
				}
			},
			"referenceClasses": {
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
		}
		'''

		assertEquals(expectedResult, actualResult)
	}
}