package steps;

import actions.LoginActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoginSteps {

    private LoginActions loginActions;

    @Given("I am on the Saucedemo home page")
    public void openPage() {
        loginActions.openPage();
    }

    @When("I fill credentials with username {string} and password {string}")
    public void fillLoginCredentials(String username, String password) {
        loginActions.fillLoginInformation(username, password);
    }

    @When("I clear the input fields")
    public void clearInputFields() {
        loginActions.clearInputFields();
    }

    @When("I clear the password field")
    public void clearPasswordField() {
        loginActions.clearPasswordField();
    }

    @When("I click login button")
    public void clickLoginButton() {
        loginActions.clickLoginButton();
    }

    @Then("I should see error message {string}")
    public void verifyErrorMessage(String message) {
        loginActions.verifyErrorMessage(message);
    }
}
