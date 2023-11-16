package com.swiggy.utils;
import com.swiggy.utils.ExtentReportListener;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@CucumberOptions(
    // Your Cucumber options here
)

@Listeners(ExtentReportListener.class)
public class TestRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void setUp() {
        ExtentReportListener.setFeature(ExtentManager.getInstance().createTest("Cucumber Features"));
    }

    @AfterClass
    public static void tearDown() {
        ExtentManager.getInstance().flush();
    }
}
