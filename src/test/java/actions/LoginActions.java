package actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.awaitility.Awaitility.await;

public class LoginActions extends UIInteractionSteps {

    private LoginPage loginPage;

    private static final Logger log = LogManager.getLogger(LoginActions.class);

    public void openPage() {
        getDriver().get("https://www.saucedemo.com/");
    }

    public void fillLoginInformation(String username, String password) {
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
    }

    public void clearPasswordField() {
        loginPage.getInputPassword().sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);

        await().atMost(5, TimeUnit.SECONDS).until(() ->
                loginPage.getInputPassword().getText().isEmpty()
        );
    }

    public void verifyErrorMessage(String message) {
        String actualMessage = loginPage.getErrorElement().getText();

        assertThat(actualMessage).isEqualTo(message);
    }
}
