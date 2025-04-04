package steps;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("the user is on the login page")
    public void user_is_on_login_page() {
        System.out.println("User is on the login page");
    }

    @When("the user enters valid credentials")
    public void user_enters_valid_credentials() {
        System.out.println("User enters valid username and password");
    }

    @Then("the user should see the homepage")
    public void user_sees_homepage() {
        System.out.println("User is redirected to homepage");
    }
}
