package de.koalaworks.wcts

import com.google.common.escape.Escapers
import com.google.common.escape.Escaper

class JsonEscaper {

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
	
	private new() {	}
	
	static def escape(String string) {
		return escaper.escape(string)
	}
}