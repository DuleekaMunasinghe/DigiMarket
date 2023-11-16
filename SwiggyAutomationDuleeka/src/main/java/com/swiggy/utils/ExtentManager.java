package com.swiggy.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {

    private static ExtentReports extent;
    private static ExtentHtmlReporter htmlReporter;

    public static ExtentReports getInstance() {
        if (extent == null) {
            extent = new ExtentReports();
            htmlReporter = new ExtentHtmlReporter("extent-report.html"); // Specify the report file name/path
            extent.attachReporter(htmlReporter);
        }
        return extent;
    }
}
