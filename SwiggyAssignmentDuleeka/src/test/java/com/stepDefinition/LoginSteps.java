package com.stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;

//import com.sun.tools.javac.util.List;

import io.cucumber.core.gherkin.vintage.internal.gherkin.ast.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTableType;

public class LoginSteps {
	WebDriver driver;
	// String appurl = "https://opensourse-demo.orangehrmlive.com";
	String appurl = "https://www.swiggy.com/search";

	@Given("the login screen is opened")
	public void the_login_screen_is_opened() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step1: User is on Searchpage");
		System.out.println("Launch browser");
		// ...
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDrivers\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver(); // Assign to the class-level variable
		driver.manage().window().maximize();
		driver.get(appurl);
	}
/*
	@When("user enters credentails using DataTable")
	public void user_enters_credentials_using_DataTable(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("step2: User enters username and password");
	    List<List<String>> data = dataTable.cells();
	    driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
	    driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}
*/
	@Given("This is Scenario1")
	public void this_is_Scenario1() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("This is Scenario1");
		//Assert.assertTrue(getDriver().getTitle().equals("Restaurants with online food delivery in Mumbai"));
	}

	@Given("This is Scenario2")
	public void this_is_Scenario2() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("This is Scenario2");
	}

	@Given("This is Scenario3")
	public void this_is_Scenario3() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("This is Scenario3");
	}

	@Given("This is Scenario4")
	public void this_is_Scenario4() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("This is Scenario4");
	}

	@Given("This is Scenario5")
	public void this_is_Scenario5() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("This is Scenario6")
	public void this_is_Scenario6() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("user enters (.*) and (.*)$")
	public void user_enters_and(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step2: User enters username and password");
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@And("clicks on Login button")
	public void clicks_on_Login_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step3: Click on Login button");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
	}

	@Then("user should be navigated to Home Page.")
	public void user_should_be_navigated_to_Home_Page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step4: Click on Save");
		driver.close();
	}

}
