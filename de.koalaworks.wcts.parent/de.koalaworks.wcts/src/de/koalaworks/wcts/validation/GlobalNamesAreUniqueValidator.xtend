package de.koalaworks.wcts.validation

import org.eclipse.xtext.validation.Check
import com.google.inject.Inject
import org.eclipse.xtext.resource.IResourceDescriptions
import de.koalaworks.wcts.typeDefinitionLanguage.TypeDefinitionLanguagePackage
import de.koalaworks.wcts.typeDefinitionLanguage.SiteStructure
import org.eclipse.emf.ecore.EObject
import de.koalaworks.wcts.typeDefinitionLanguage.PageType
import com.google.common.collect.HashMultimap
import com.google.common.collect.Iterables
import com.google.common.collect.Multimap
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.emf.ecore.resource.Resource

class GlobalNamesAreUniqueValidator extends AbstractTypeDefinitionLanguageValidator {
	
	@Inject
	private IResourceDescriptions descriptions;
	
	@Check
	def ensureUniqeNames(SiteStructure siteStructure) {
		if (isNotYetValidated(siteStructure)) {
			val typeNamesInCurrentResource = getContentAndReferenceTypesByName(siteStructure)
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
	
	def private getContentAndReferenceTypesByName(SiteStructure siteStructure) {
		val names = HashMultimap.<String, EObject>create()
			siteStructure
				.typeDefinitions
				.filter[definition | !(definition instanceof PageType)]
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
		return descriptions
			.allResourceDescriptions
			.filter[otherResourceDescription | otherResourceDescription.URI.toString != uri]
	}
	
	def private createValidationErrorForDuplicateTypeNames(Multimap<String, EObject> typesByName, IResourceDescription resourceDescription) {
		val uniqueTypeNamesInOtherResource = getContentAndReferenceTypeNamesFrom(resourceDescription)
		uniqueTypeNamesInOtherResource.forEach[typeName | {
			if (typesByName.containsKey(typeName)) {
				typesByName.get(typeName).forEach[type | {
					error("A type with this name is already defined in " + resourceDescription.URI.path + ".", type, TypeDefinitionLanguagePackage.Literals.TYPE__NAME, "duplicate_type_definition")
				}]
			}
		}]
	}
	
	def private getContentAndReferenceTypeNamesFrom(IResourceDescription resourceDescription) {
		val types = Iterables.concat(
			resourceDescription.getExportedObjectsByType(TypeDefinitionLanguagePackage.Literals.CONTENT_TYPE),
			resourceDescription.getExportedObjectsByType(TypeDefinitionLanguagePackage.Literals.REFERENCE_TYPE)
		)
		return types.map[type | type.name.toString].toSet
	}
}