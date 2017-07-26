package de.koalaworks.wcts

import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode
import com.google.common.escape.Escaper
import com.google.common.escape.Escapers

class TypeDefinitionLanguageTerminalConverters extends DefaultTerminalConverters {
	
	// Escape characters in json http://www.ecma-international.org/publications/files/ECMA-ST/ECMA-404.pdf
	
	private static val Escaper escaper
		= Escapers.builder()
			.addEscape('"', "\\\"")
			.addEscape('\\', "\\\\")
			.addEscape('/', "\\/")
			.addEscape('\u0008', "\\\b")
			.addEscape('\u000C', "\\\f")
			.addEscape('\u000A', "\\\n")
			.addEscape('\u000D', "\\\r")
			.addEscape('\u0009', "\\\t")
			.build
	
	@ValueConverter(rule = "SELECTOR_VALUE")
	def IValueConverter<String> convertSelectorValue() {
		return new IValueConverter<String>() {
			override toString(String value) throws ValueConverterException {
				val string = value.substring(1, value.length - 1)
				return escaper.escape(string)
			}
			
			override toValue(String string, INode node) throws ValueConverterException {
				return toString(string)
			}
		}
	}
}