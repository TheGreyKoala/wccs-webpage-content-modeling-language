/*
 * generated by Xtext 2.12.0
 */
package de.koalaworks.wcts.ide

import com.google.inject.Guice
import de.koalaworks.wcts.TypeDefinitionLanguageRuntimeModule
import de.koalaworks.wcts.TypeDefinitionLanguageStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class TypeDefinitionLanguageIdeSetup extends TypeDefinitionLanguageStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new TypeDefinitionLanguageRuntimeModule, new TypeDefinitionLanguageIdeModule))
	}
	
}
