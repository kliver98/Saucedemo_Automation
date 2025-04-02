package com.saucedemo.ta.test;

import com.saucedemo.ta.driver.DriverSingleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseTest {

    protected WebDriver driver;
    protected static final String USERNAME = "";
    protected static final String PASSWORD = "";

    @BeforeEach()
    public void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @Test
    void test() {
        // Exercise
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        String title = driver.getTitle();

        // Verify
        assertThat(title).contains("Selenium WebDriver");
    }

    @AfterEach
    public void stopBrowser() {
        DriverSingleton.closeDriver();
    }
}
