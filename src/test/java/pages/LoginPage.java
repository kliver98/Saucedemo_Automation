package pages;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement inputUsername;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@data-test='login-button']")
    private WebElement inputLogin;

    @FindBy(xpath = "//h3[@data-test='error']")
    private WebElement errorElement;
}
