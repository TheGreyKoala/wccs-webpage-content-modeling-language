/**
 * generated by Xtext 2.12.0
 */
package de.tgremple.siteanalyser.configuration.validation;

import de.tgremple.siteanalyser.configuration.configurationLanguage.ConfigurationLanguagePackage;
import de.tgremple.siteanalyser.configuration.configurationLanguage.Property;
import de.tgremple.siteanalyser.configuration.validation.AbstractConfigurationLanguageValidator;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class ConfigurationLanguageValidator extends AbstractConfigurationLanguageValidator {
  public final static String NO_CONTENT_SELECTOR = "noContentSelector";
  
  @Check
  public void checkPropertyOrContentTypeDefineSelector(final Property property) {
    if (((property.getSelector() == null) && (property.getType().getSelector() == null))) {
      String _name = property.getType().getName();
      String _plus = ("Content type " + _name);
      String _plus_1 = (_plus + " does not specify a default selector.");
      this.error(_plus_1, property, ConfigurationLanguagePackage.Literals.PROPERTY__SELECTOR, 
        ConfigurationLanguageValidator.NO_CONTENT_SELECTOR);
    }
  }
}
