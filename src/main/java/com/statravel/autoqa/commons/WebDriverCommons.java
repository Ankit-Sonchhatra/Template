package com.statravel.autoqa.commons;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.stereotype.Component;

/**
 * 
 * @author STA Development Team
 *
 */
@Component
public class WebDriverCommons {

    private static final int WEBDRIVER_PAUSE_TIME = 60;

    /**
     * Pauses the WebDriver process for a specific time.
     * 
     * @param element
     *            element to wait for
     */
    public void waitForElementToBeVisible(final WebElement element) {

        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getWebDriver(), WEBDRIVER_PAUSE_TIME);

        wait.until(ExpectedConditions.visibilityOf(element));

    }

    /**
     * Scrolls the driver to the element given.
     * 
     * @param element
     *            element to scroll to
     */
    public void scrollTo(final WebElement element) {

        JavascriptExecutor jse = (JavascriptExecutor) WebDriverFactory.getWebDriver();

        jse.executeScript("arguments[0].scrollIntoView();", element);

    }

    /**
     * Selects and item from a drop down element.
     * 
     * @param element
     *            element to manage
     * @param text
     *            text
     */
    public void selectFromDropdown(final WebElement element, final String text) {

        Select select = new Select(element);

        select.selectByVisibleText(text);
    }

    /**
     * Get alert pop up.
     * 
     * @return Alert pop up
     */
    public Alert getAlertPopUp() {

        Alert alert = WebDriverFactory.getWebDriver()
                                      .switchTo()
                                      .alert();

        return alert;

    }

}
