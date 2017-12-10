package de.koalaworks.wcts.validation

import org.eclipse.xtext.validation.Check
import com.google.inject.Inject
import org.eclipse.xtext.resource.IResourceDescriptions
import de.koalaworks.wcts.typeDefinitionLanguage.TypeDefinitionLanguagePackage
import org.eclipse.emf.ecore.EObject
import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.emf.ecore.resource.Resource
import de.koalaworks.wcts.typeDefinitionLanguage.ClassificationModel

class GlobalNamesAreUniqueValidator extends AbstractTypeDefinitionLanguageValidator {

	@Inject
	private IResourceDescriptions descriptions;

	@Check
	def ensureUniqeNames(ClassificationModel classDeclarations) {
		if (isNotYetValidated(classDeclarations)) {
			val typeNamesInCurrentResource = getTypesByName(classDeclarations)
			createValidationErrorForDuplicateTypeNames(typeNamesInCurrentResource)

			val otherResources = getAllResourceDescriptionsButFor(classDeclarations.eResource)
			otherResources.forEach[otherResource | createValidationErrorForDuplicateTypeNames(typeNamesInCurrentResource, otherResource)]
		}
	}
	
	def private isNotYetValidated(ClassificationModel classificationModel) {
		val uri = classificationModel.eResource.URI.toString
		val notYetValidated = !context.containsKey(uri)
		if (notYetValidated) {
			context.put(uri, classificationModel)
		}
		return notYetValidated
	}

	def private getTypesByName(ClassificationModel classificationModel) {
		val names = HashMultimap.<String, EObject>create()
			classificationModel
				.classes
				.forEach[class | names.put(class.name, class)]
		return names
	}

	def private createValidationErrorForDuplicateTypeNames(Multimap<String, EObject> typesByName) {
		typesByName.asMap
			.values
			.filter[definitionsList | definitionsList.size > 1]
			.flatten
			.forEach[definition | error("A type with this name is already defined in this file.", definition, TypeDefinitionLanguagePackage.Literals.CLASS__NAME, "duplicate_type_definition")]
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
		val parts = uri.split('/');
		return if (parts.length > 3) parts.get(2) else "";
	}

	def private createValidationErrorForDuplicateTypeNames(Multimap<String, EObject> typesByName, IResourceDescription resourceDescription) {
		val typeNames = getTypeNamesFrom(resourceDescription)
		typeNames.forEach[typeName | {
			if (typesByName.containsKey(typeName)) {
				typesByName.get(typeName).forEach[type | {
					error("A type with this name is already defined in " + resourceDescription.URI.toPlatformString(true) + ".", type, TypeDefinitionLanguagePackage.Literals.CLASS__NAME, "duplicate_type_definition")
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
