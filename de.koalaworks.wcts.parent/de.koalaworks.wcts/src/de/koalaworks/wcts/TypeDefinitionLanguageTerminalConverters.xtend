package de.koalaworks.wcts

import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode

class TypeDefinitionLanguageTerminalConverters extends DefaultTerminalConverters {
	
	@ValueConverter(rule = "SELECTOR_VALUE")
	def IValueConverter<String> convertSelectorValue() {
		return new IValueConverter<String>() {
			override toString(String value) throws ValueConverterException {
				return if (value === null) null else JsonEscaper.escape(value.substring(1, value.length - 1))
			}
			
			override toValue(String string, INode node) throws ValueConverterException {
				return toString(string)
			}
		}
	}
}