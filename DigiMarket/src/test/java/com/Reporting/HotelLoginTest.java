package com.Reporting;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListners.class)
public class HotelLoginTest {

	ChromeOptions chromeOptions;
	WebDriver driver;
	String appurl;
    
	
	@BeforeTest
	public void LaunchBrowser() throws InterruptedException {
		Reporter.log("Browser launched");
		System.out.println("Launch browser");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver\\chromedriver.exe");
		chromeOptions = new ChromeOptions();
		chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get(appurl);
	}

	@AfterTest
	public void CloseBrowser() throws InterruptedException {
		System.out.println("Close browser");
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void VerifyTitle() {
		
		driver.get(appurl);
		String expectedTitle = "Adactin.com - Hotel Reservation System";
		String actualTitle = driver.getTitle();
		Reporter.log("Comparing actual title and expected title");
		Assert.assertEquals(expectedTitle, actualTitle, "Title are not matching");// comparing two parameters actual and expected
		Reporter.log("Title matched");
	}
	
	@Test
	public void VerifyLogin() throws InterruptedException {
		
		/*System.out.println("Login test called");
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("vtestuser02");// "vtestuser02" is test data for user name
		
		System.out.println("Login test called");
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("selenium");// "selenium" is test data for password
		
		System.out.println("Login test called");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
		Thread.sleep(2000);
		*/
		driver.get(appurl);
		HotelLoginPage lp= new HotelLoginPage(driver);
		Thread.sleep(2000);
		lp.doLogin("duleekatest1","selenium1");
		String expectedTitle = "Adactin.com - Search Hotel";
		String actualTitle = lp.titleText();
		Assert.assertEquals(expectedTitle, actualTitle, "Title are not matching");// comparing two parameters actual and expected
		Reporter.log("Login successfull");
	}
	
	@Test
	public void SkipTest() {
		
		System.out.println("Skip test called");
		throw new SkipException("Skipping the test ");
	}
	
	@Test
	public void FailTest() {
		
		System.out.println("Fail test called");
		Assert.assertEquals(false, true);
	}

	
}
