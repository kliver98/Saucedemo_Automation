package pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@data-test='username']")
    private WebElement inputUsername;

    @FindBy(xpath = "//input[@data-test='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@data-test='login-button']")
    private WebElement inputLogin;

    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement errorElement;
}
