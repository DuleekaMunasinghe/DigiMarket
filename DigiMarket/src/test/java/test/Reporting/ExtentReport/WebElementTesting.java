 package test.Reporting.ExtentReport;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTesting {
	// ChromeOptions chromeOptions;
	WebDriver driver;
	String appurl = "https://www.letskodeit.com/practice";

	@Test(priority = 1)
	public void VerifyRadioButton() throws InterruptedException {
		System.out.println(" priority = 1 is executing");
		WebElement Radiobmw = driver.findElement(By.id("bmwradio"));//
		Reporter.log("Clicking on BMW radio button");
		Radiobmw.click();
		Thread.sleep(1000);
		Reporter.log("Verify selected radio button");
	}

	@Test(priority = 2)
	public void VerifyCheckbox() throws InterruptedException {
		System.out.println(" priority = 2 is executing");
		WebElement Radiobmw = driver.findElement(By.id("bmwcheck"));//
		Radiobmw.click();
		Thread.sleep(1000);
	}
	@Test(priority = 3)
	public void VerifyTitle() {
		System.out.println(" Verify Title of the page");
		driver.get(appurl);
		//String expectedTitle = "Adactin.com - Hotel Reservation System";
		//String actualTitle = driver.getTitle();
		//Reporter.log("Comparing actual title and expected title");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Practice Page");// comparing two parameters actual and expected
		Assert.fail();
		//Reporter.log("Title matched");
	}
	@Test(priority = 4)
	public void VerifyHomePage() {
		System.out.println("Runs after each test is executed");
		System.out.println(driver.getTitle());
		/*
		Reporter.log("<a href=\"C:\\SeleniumDrivers\\Images\\Error.jpg\" \target=_blank\">Screenshot link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"C:\\SeleniumDrivers\\Images\\Error.jpg\" \target=_blank\"><img height=200 width=200 src=\"C:\\SeleniumDrivers\\Images\\Error.jpg\"></a>");
		*/
		Assert.assertTrue(true);
		//driver.get(appurl);
		//String expectedTitle = "Adactin.com - Hotel Reservation System";
		//String actualTitle = driver.getTitle();
		//Reporter.log("Comparing actual title and expected title");
		//Assert.assertEquals(expectedTitle, actualTitle, "Title are not matching");// comparing two parameters actual and expected
		//Reporter.log("Title matched");
	}
	
	@Test(priority = 5)
	public void SkipTest() {
		
		System.out.println("Skip test called");
		throw new SkipException("Skipping the test ");
	}
	@BeforeTest
	public void LaunchBrowser() throws InterruptedException {
		System.out.println("Launch browser");
		// ...
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver(); // Assign to the class-level variable
		driver.manage().window().maximize();
		driver.get(appurl);
		Reporter.log("Navigate to application");
		System.setProperty("org.uncommons.reportng.escape-output", "false");
	}

	@AfterTest
	public void CloseBrowser() throws InterruptedException {
		System.out.println("CloseBrowser");
		Thread.sleep(1000);
		driver.close();
	}

}
