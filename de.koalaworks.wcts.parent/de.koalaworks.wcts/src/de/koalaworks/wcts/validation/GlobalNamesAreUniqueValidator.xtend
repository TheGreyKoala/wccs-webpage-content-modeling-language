package de.koalaworks.wcts.validation

import org.eclipse.xtext.validation.Check
import com.google.inject.Inject
import org.eclipse.xtext.resource.IResourceDescriptions
import de.koalaworks.wcts.typeDefinitionLanguage.TypeDefinitionLanguagePackage
import de.koalaworks.wcts.typeDefinitionLanguage.SiteStructure
import org.eclipse.emf.ecore.EObject
import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.emf.ecore.resource.Resource

class GlobalNamesAreUniqueValidator extends AbstractTypeDefinitionLanguageValidator {

	@Inject
	private IResourceDescriptions descriptions;

	@Check
	def ensureUniqeNames(SiteStructure siteStructure) {
		if (isNotYetValidated(siteStructure)) {
			val typeNamesInCurrentResource = getTypesByName(siteStructure)
			createValidationErrorForDuplicateTypeNames(typeNamesInCurrentResource)

			val otherResources = getAllResourceDescriptionsButFor(siteStructure.eResource)
			otherResources.forEach[otherResource | createValidationErrorForDuplicateTypeNames(typeNamesInCurrentResource, otherResource)]
		}
	}
	
	def private isNotYetValidated(SiteStructure siteStructure) {
		val uri = siteStructure.eResource.URI.toString
		val notYetValidated = !context.containsKey(uri)
		if (notYetValidated) {
			context.put(uri, siteStructure)
		}
		return notYetValidated
	}

	def private getTypesByName(SiteStructure siteStructure) {
		val names = HashMultimap.<String, EObject>create()
			siteStructure
				.typeDefinitions
				.forEach[definition | names.put(definition.name, definition)]
		return names
	}

	def private createValidationErrorForDuplicateTypeNames(Multimap<String, EObject> typesByName) {
		typesByName.asMap
			.values
			.filter[definitionsList | definitionsList.size > 1]
			.flatten
			.forEach[definition | error("A type with this name is already defined in this file.", definition, TypeDefinitionLanguagePackage.Literals.TYPE__NAME, "duplicate_type_definition")]
	}

	def private getAllResourceDescriptionsButFor(Resource resource) {
		val uri = resource.URI.toString
		val resourceProject = getProjectNameFromResourceUri(uri)
		return descriptions
			.allResourceDescriptions
			.filter[otherResourceDescription | otherResourceDescription.URI.toString != uri]
			.filter[otherResourceDescription | getProjectNameFromResourceUri(otherResourceDescription.URI.toString) == resourceProject]
	}

	def private getProjectNameFromResourceUri(String uri) {
		return uri.split('/').get(2);
	}

	def private createValidationErrorForDuplicateTypeNames(Multimap<String, EObject> typesByName, IResourceDescription resourceDescription) {
		val typeNames = getTypeNamesFrom(resourceDescription)
		typeNames.forEach[typeName | {
			if (typesByName.containsKey(typeName)) {
				typesByName.get(typeName).forEach[type | {
					error("A type with this name is already defined in " + resourceDescription.URI.toPlatformString(true) + ".", type, TypeDefinitionLanguagePackage.Literals.TYPE__NAME, "duplicate_type_definition")
				}]
			}
		}]
	}

	def private getTypeNamesFrom(IResourceDescription resourceDescription) {
		return resourceDescription
				.exportedObjects
				.map[type | type.name.toString]
				.toSet
	}
}
