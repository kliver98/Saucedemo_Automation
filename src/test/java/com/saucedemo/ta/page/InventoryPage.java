package com.saucedemo.ta.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends BasePage{

    protected InventoryPage(WebDriver diver) {
        super(diver);
        PageFactory.initElements(this.driver, this);
    }


}
