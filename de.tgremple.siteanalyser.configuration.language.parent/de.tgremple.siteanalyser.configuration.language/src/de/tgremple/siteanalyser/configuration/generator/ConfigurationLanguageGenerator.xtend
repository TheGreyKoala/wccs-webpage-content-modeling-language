/*
 * generated by Xtext 2.12.0
 */
package de.tgremple.siteanalyser.configuration.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import de.tgremple.siteanalyser.configuration.configurationLanguage.ContentType
import de.tgremple.siteanalyser.configuration.configurationLanguage.CssSelector

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ConfigurationLanguageGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile("site-analyser.conf.js", '''
		"use strict;"
		const functions = [];
		«FOR contentType : resource.allContents.filter(ContentType).toIterable»
		«contentType.compile»
		«ENDFOR»
		exports.getFunctions = () => functions;
		''')
	}
	
	def compile(ContentType contentType) {
		if (contentType.selector instanceof CssSelector) {
			'''
			functions.push((document, createAnnotation) => createAnnotation(document, "«(contentType.selector as CssSelector).definition»", "«contentType.name»"));
			'''
		}
	}
}
