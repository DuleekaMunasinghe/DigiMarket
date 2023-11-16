package com.swiggy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    // Web Elements
    private By searchBoxLocator = By.cssSelector("input[class*='searchBar']");
    private By searchButtonLocator = By.cssSelector("button[class*='searchButton']");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void enterSearchQuery(String query) {
        WebElement searchBox = driver.findElement(searchBoxLocator);
        searchBox.sendKeys(query);
        searchBox.sendKeys(Keys.RETURN);  // Press Enter after entering the search query
    }

    public void clickSearchButton() {
        WebElement searchButton = driver.findElement(searchButtonLocator);
        searchButton.click();
    }

    // Add more methods as needed for interacting with elements on the home page
}
