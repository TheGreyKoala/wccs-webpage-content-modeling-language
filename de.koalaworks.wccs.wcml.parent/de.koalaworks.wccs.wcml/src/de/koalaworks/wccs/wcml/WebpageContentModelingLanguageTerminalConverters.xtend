package de.koalaworks.wccs.wcml

import org.eclipse.xtext.common.services.DefaultTerminalConverters
import org.eclipse.xtext.conversion.ValueConverter
import org.eclipse.xtext.conversion.IValueConverter
import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.nodemodel.INode
import com.google.common.escape.Escaper
import com.google.common.escape.Escapers
import de.koalaworks.wccs.wcml.webpageContentModelingLanguage.XPathSelector

class WebpageContentModelingLanguageTerminalConverters extends DefaultTerminalConverters {

	// Escape characters in json http://www.ecma-international.org/publications/files/ECMA-ST/ECMA-404.pdf

	private static val Escaper escaper
		= Escapers.builder()
			.addEscape('"', "\\\"")
			.addEscape('\\', "\\\\")
			.addEscape('/', "\\/")
			.build

	/*
	 * XPath does not know escape sequences like \n.
	 * And XPath 1.0 (that is used by document.evaluate) does not know codepoints-to-string either.
	 * Therefore it is not possible write line feeds etc. in an one line expression.
	 * But we can still achieve this, by not escaping the backslash.
	 * E.g. \n will be literally included in the generated json and the xpath expressions will therefore match a line feed.
	 */
	private static val Escaper xpathEscaper
		= Escapers.builder()
			.addEscape('"', "\\\"")
			.addEscape('/', "\\/")
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