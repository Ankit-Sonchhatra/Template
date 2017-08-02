package com.statravel.autoqa;


import com.statravel.autoqa.commons.WebDriverFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * 
 * @author STA Development Team
 *
 */
public class Hooks {

    /**
     * Before each feature scenario starts the WebDriver.
     */
    @Before(order = 1)
    public void start() {

        WebDriverFactory.initWebDriver();

    }

    /**
     * After each feature scenario shuts down the WebDriver.
     */
    @After
    public void closeBrowser() {

        WebDriverFactory.quitWebDriver();
    }
}
