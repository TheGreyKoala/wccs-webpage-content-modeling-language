/*
 * generated by Xtext 2.12.0
 */
package de.koalaworks.wccs.wcml.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class WebContentModelingLanguageUiModule extends AbstractWebContentModelingLanguageUiModule {
	
	def Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return WebContentModelingLanguageAntlrTokenToAttributeIdMapper
	}
}