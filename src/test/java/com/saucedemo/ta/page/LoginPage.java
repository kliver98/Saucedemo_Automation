package com.saucedemo.ta.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement inputUsername;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@data-test='login-button']")
    private WebElement inputLogin;

    protected LoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(this.driver, this);
    }

    public InventoryPage login(String username, String password) {
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        inputLogin.click();
        return new InventoryPage(driver);
    }
}
