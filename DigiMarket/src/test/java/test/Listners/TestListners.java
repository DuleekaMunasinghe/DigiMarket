package test.Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListners implements ITestListener {

	public void onStart(ITestContext context) {// Invoked after the test class is instantiated and before any
												// configuration method is called.
		System.out.println("onstart method started");

	}

	public void onTestStart(ITestResult result) {// Invoked each time before a test will be invoked.
		System.out.println("New Test started :" + result.getName());

	}

	public void onTestSuccess(ITestResult result) {// Invoked each time a test succeeds.
		System.out.println("On Test success method:" + result.getName());

	}

	public void onTestFailure(ITestResult result) {// Invoked each time a test fails.
		System.out.println("On Test failure method:" + result.getName());
		Reporter.log("<a href=\"C:\\SeleniumDrivers\\Images\\Error.jpg\" \target=_blank\">Screenshot link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"C:\\SeleniumDrivers\\Images\\Error.jpg\" \target=_blank\"><img height=200 width=200 src=\"C:\\SeleniumDrivers\\Images\\Error.jpg\"></a>");

	}

	public void onTestSkipped(ITestResult result) {// Invoked each time a test is skipped.
		System.out.println("On Test success method:" + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {// Invoked each time a method fails but has
																			// been annotated with successPercentage and
																			// this failure still keeps it within the
																			// success percentage requested.
		System.out.println("on Test Failed But Within Success Percentage:" + result.getName());

	}

}
