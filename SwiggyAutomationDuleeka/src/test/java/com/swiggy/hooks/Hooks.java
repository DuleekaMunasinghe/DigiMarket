package com.swiggy.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@OrderPlacement")
    public void setupOrderPlacement() {
        // Code to run before the "User places an order on Swiggy" scenario
        System.out.println("Setting up before the order placement scenario...");
    }

    @Before("@OrderTracking")
    public void setupOrderTracking() {
        // Code to run before the "User tracks the Swiggy order" scenario
        System.out.println("Setting up before the order tracking scenario...");
    }

    @After
    public void teardown() {
        // Code to run after each scenario
        System.out.println("Tearing down after scenario...");
    }
}
