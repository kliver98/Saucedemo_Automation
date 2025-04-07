package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import utils.ConfigReader;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class LoginActions extends UIInteractionSteps {

    private LoginPage loginPage;

    private static final Logger log = LogManager.getLogger(LoginActions.class);

    public void openPage() {
        log.info("Driver Session: {} - Thread ID: {}", getDriver().toString(), Thread.currentThread().getId());
        String url = ConfigReader.getProperty("webdriver.base.url");
        log.info("Navigate to: {}", url);
        loginPage.open();
    }

    public void fillLoginInformation(String username, String password) {
        log.info("Send credentials: {} {}", username, password);
        loginPage.getInputUsername().sendKeys(username);
        loginPage.getInputPassword().sendKeys(password);
    }

    public void clickLoginButton() {
        loginPage.getInputLogin().click();
    }

    public void clearInputFields() {
        clearUsernameField();
        clearPasswordField();
    }

    public void clearUsernameField() {
        loginPage.getInputUsername().sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);

        await().atMost(5, TimeUnit.SECONDS).until(() ->
                loginPage.getInputUsername().getText().isEmpty()
        );
        log.warn("Username input field was erased");
    }

    public void clearPasswordField() {
        loginPage.getInputPassword().sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);

        await().atMost(5, TimeUnit.SECONDS).until(() ->
                loginPage.getInputPassword().getText().isEmpty()
        );
        log.warn("Password input field was erased");
    }

    public void verifyErrorMessage(String message) {
        String actualMessage = loginPage.getErrorElement().getText();

        assertThat(actualMessage).isEqualTo(message);
    }
}
