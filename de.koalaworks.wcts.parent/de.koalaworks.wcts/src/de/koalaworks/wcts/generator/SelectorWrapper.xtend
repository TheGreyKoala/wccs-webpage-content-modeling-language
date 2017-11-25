package de.koalaworks.wcts.generator

import de.koalaworks.wcts.typeDefinitionLanguage.CssSelector
import de.koalaworks.wcts.typeDefinitionLanguage.UrlPatternSelector
import de.koalaworks.wcts.typeDefinitionLanguage.XPathSelector

class SelectorWrapper {
	private val String typeName
	private val String value
	private val boolean present
	
	private static val EMPTY_SELECTOR = new SelectorWrapper("", "", false)
	
	private new(String typeName, String value) {
		this(typeName, value, true)
	}
	
	private new(String typeName, String value, boolean present) {
		this.typeName = typeName
		this.value = value
		this.present = present
	}
	
	def dispatch static create(Void nullSelector) {
		return EMPTY_SELECTOR
	}
	
	def dispatch static create(CssSelector cssSelector) {
		return new SelectorWrapper(cssSelector.eClass.name, cssSelector.definition)
	}
	
	def dispatch static create(UrlPatternSelector urlPatternSelector) {
		return new SelectorWrapper(urlPatternSelector.eClass.name, urlPatternSelector.definition)
	}
	
	def dispatch static create(XPathSelector xPathSelector) {
		return new SelectorWrapper(xPathSelector.eClass.name, xPathSelector.definition)
	}
	
	def String getTypeName() {
		return typeName
	}
	
	def String getValue() {
		return value
	}
	
	def boolean isPresent() {
		return present
	}
}