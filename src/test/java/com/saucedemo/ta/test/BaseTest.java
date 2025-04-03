package com.saucedemo.ta.test;

import com.saucedemo.ta.driver.DriverSingleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest{

    protected WebDriver driver;
    protected static final Logger log = LogManager.getLogger(BaseTest.class);

    @BeforeEach()
    public void setUp() {
        driver = DriverSingleton.getDriver();
    }

    @AfterEach
    public void stopBrowser() {
        DriverSingleton.closeDriver();
    }
}
