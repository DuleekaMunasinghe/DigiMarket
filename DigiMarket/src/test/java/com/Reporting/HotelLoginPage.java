package com.Reporting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class HotelLoginPage {

	// Create a web driver reference variable

	WebDriver driver;

	public HotelLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// identify all web elements
	By username = By.xpath("//input[@id='username']");// locators
	By password = By.xpath("//input[@id='password']");
	By btnLogin = By.xpath("//input[@id='login']");

	public void setUsername(String strUsername) throws InterruptedException {
		driver.findElement(username).sendKeys(strUsername);
		Thread.sleep(2000);
	}

	public void setPassword(String strPassword) throws InterruptedException {
		driver.findElement(password).sendKeys(strPassword);
		Thread.sleep(2000);
	}

	public void clickLogin() throws InterruptedException {
		driver.findElement(btnLogin).click();
		Thread.sleep(2000);
	}

	public String titleText() {

		String strtitle = driver.getTitle();
		return strtitle;
	}

	public void doLogin(String strUsername, String strPassword) throws InterruptedException {
		this.setUsername(strUsername);
		this.setPassword(strPassword);
		Thread.sleep(2000);
		this.clickLogin();

	}

}
