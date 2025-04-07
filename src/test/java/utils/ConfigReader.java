package utils;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.serenitybdd.core.di.SerenityInfrastructure;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.util.EnvironmentVariables;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConfigReader {

  private static final EnvironmentSpecificConfiguration CONFIG = loadConfig();

  public static String getProperty(String propertyName) {
    return CONFIG.getProperty(propertyName);
  }

  private static EnvironmentSpecificConfiguration loadConfig() {
    EnvironmentVariables variables = SerenityInfrastructure.getEnvironmentVariables();
    return EnvironmentSpecificConfiguration.from(variables);
  }
}

