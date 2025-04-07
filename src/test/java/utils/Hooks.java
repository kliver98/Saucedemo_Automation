package utils;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Hooks {

    private static final Logger log = LogManager.getLogger(Hooks.class);

    @After
    public void tearDown(Scenario scenario) {
        log.info("Finishing scenario {} - {}", scenario.getName(), scenario.getStatus());
        if (scenario.isFailed()) {
            ThucydidesWebDriverSupport.getDriver().quit();
        }
    }
}
