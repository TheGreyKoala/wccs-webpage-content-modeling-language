package de.koalaworks.wccs.wcml.ui

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles

class TypeDefinitionLanguageAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	
	override calculateId(String tokenName, int tokenType) {
		if (tokenName == "RULE_SELECTOR_VALUE")
			HighlightingStyles.STRING_ID
		else
			super.calculateId(tokenName, tokenType)		
	}
}