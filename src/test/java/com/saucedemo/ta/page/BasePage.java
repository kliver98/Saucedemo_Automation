package com.saucedemo.ta.page;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {

    protected WebDriver driver;
    protected final int WAIT_TIMEOUT_MS = 10 * 1000;

    protected BasePage(WebDriver diver) {
        this.driver = diver;
    }
}
