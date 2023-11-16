package com.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\dulee\\eclipse-workspace\\Cucumber01\\src\\test\\resources\\TagsDemo.feature", glue = "com.stepDefinition", plugin = {
		"pretty", "html:target/cucumber-reports/cucumber-pretty.html",
		"json:target/cucumber-reports/CucumberTestReport.json", "timeline:target/test-output-thread/"

}, tags = { "@SmokeTest" })

public class TestRunner {

}
