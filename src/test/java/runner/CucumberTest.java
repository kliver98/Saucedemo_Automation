package runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")  // ✅ Tell JUnit 5 to use Cucumber
@SelectClasspathResource("features")  // ✅ Path to your feature files (adjust if needed)
@ConfigurationParameter(key = "cucumber.glue", value = "steps")  // ✅ Step definitions package
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, html:target/cucumber-reports.html")  // ✅ Reporting
public class CucumberTest {
}
