package de.koalaworks.wccs.wcml

import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode
import com.google.common.escape.Escaper
import com.google.common.escape.Escapers
import de.koalaworks.wccs.wcml.typeDefinitionLanguage.XPathSelector

class TypeDefinitionLanguageTerminalConverters extends DefaultTerminalConverters {

	// Escape characters in json http://www.ecma-international.org/publications/files/ECMA-ST/ECMA-404.pdf

	private static val Escaper escaper
		= Escapers.builder()
			.addEscape('"', "\\\"")
			.addEscape('\\', "\\\\")
			.addEscape('/', "\\/")
			.addEscape('\u0008', "\\b")
			.addEscape('\u000C', "\\f")
			.addEscape('\u000A', "\\n")
			.addEscape('\u000D', "\\r")
			.addEscape('\u0009', "\\t")
			.build
	
	private static val Escaper xpathEscaper
		= Escapers.builder()
			.addEscape('"', "\\\"")
			.addEscape('/', "\\/")
			.addEscape('\u0008', "\\b")
			.addEscape('\u000C', "\\f")
			.addEscape('\u000A', "\\n")
			.addEscape('\u000D', "\\r")
			.addEscape('\u0009', "\\t")
			.build

	@ValueConverter(rule = "SELECTOR_VALUE")
	def IValueConverter<String> convertSelectorValue() {
		return new IValueConverter<String>() {
			override toString(String value) throws ValueConverterException {
			}

			override toValue(String value, INode node) throws ValueConverterException {
				val correctEscaper = 
				if (node.parent.semanticElement instanceof XPathSelector)
					xpathEscaper
				 else
				 	escaper

				return if (value === null) null else correctEscaper.escape(value.substring(1, value.length - 1))
			}
		}
	}
}