package com.swiggy.utils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.swiggy.locators.LandingPageLocators;

public class HelperClass {

    private static HelperClass helperClass;
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static final int TIMEOUT_IMP = 10;

    private HelperClass() {
    }

    public static HelperClass getInstance() {
        if (helperClass == null) {
            helperClass = new HelperClass();
        }
        return helperClass;
    }

    public WebDriver getDriver() {
        return driver;
    }

    // Initiate driver
    public void setUpDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT_IMP));
    }

    // Open page
    public void openPage(String url) {
        driver.get(url);
    }

    // Wait until element is visible
    public void waitForVisibilityOfElement(By locator, long time) throws IOException {
        wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Tear down the driver
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        helperClass = null;
    }
}
