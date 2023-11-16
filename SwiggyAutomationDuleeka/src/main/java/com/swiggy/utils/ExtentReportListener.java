package com.swiggy.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.Scenario;
import io.cucumber.java.api.event.ConcurrentEventListener;
import io.cucumber.java.api.event.EventHandler;
import io.cucumber.java.api.event.EventPublisher;

public class ExtentReportListener implements ConcurrentEventListener {

    private static ExtentReports extent = ExtentManager.getInstance();
    private static ThreadLocal<ExtentTest> feature = new ThreadLocal<>();
    private static ThreadLocal<ExtentTest> scenario = new ThreadLocal<>();

    private final EventHandler<io.cucumber.java.api.event.TestCaseStarted> testCaseStartedHandler = event -> {
        ExtentTest extentTest = feature.get().createNode(event.getTestCase().getName());
        scenario.set(extentTest);
    };

    private final EventHandler<io.cucumber.java.api.event.TestStepFinished> testStepFinishedHandler = event -> {
        if (event.getResult().getError().isPresent()) {
            scenario.get().log(Status.FAIL, event.getResult().getError().get());
        } else {
            scenario.get().log(Status.PASS, "Step passed");
        }
    };

    private final EventHandler<io.cucumber.java.api.event.TestCaseFinished> testCaseFinishedHandler = event -> {
        extent.flush();
    };

    public ExtentReportListener() {
    }

    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(io.cucumber.java.api.event.TestCaseStarted.class, testCaseStartedHandler);
        publisher.registerHandlerFor(io.cucumber.java.api.event.TestStepFinished.class, testStepFinishedHandler);
        publisher.registerHandlerFor(io.cucumber.java.api.event.TestCaseFinished.class, testCaseFinishedHandler);
    }

    public static void setFeature(ExtentTest extentTest) {
        feature.set(extentTest);
    }
}
