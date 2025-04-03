package com.saucedemo.ta.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneralTest extends BaseTest{

    @Test
    @DisplayName("My Test Case")
    void googleTitleTest() {
        driver.get("https://www.google.com");
        log.info("Going to Google.com");
        assertEquals("Google", driver.getTitle());
        log.warn("It finished");
    }
}
