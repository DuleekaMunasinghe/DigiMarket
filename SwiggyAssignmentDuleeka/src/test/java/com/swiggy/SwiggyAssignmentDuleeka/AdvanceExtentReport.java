package com.swiggy.SwiggyAssignmentDuleeka;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class AdvanceExtentReport {
	
	@Test
    public void TestCase1() {
     
        Assert.assertTrue(true);
        ExtentTestManager.getTest().log(Status.INFO, "Test Case 1");
        
      }   
    @Test
    public void TestCase2() {
              
        Assert.assertTrue(true);
        ExtentTestManager.getTest().log(Status.INFO, "Test Case 2");
    
    }
    @Test
    public void TestCase3() {
        Assert.assertTrue(true);
        ExtentTestManager.getTest().log(Status.INFO, "Test Case 3");
    }
     
    @Test
    public void TestCase4() {
        Assert.assertTrue(false);
        ExtentTestManager.getTest().log(Status.INFO, "Test Case 4");
    }
    @Test
    public void TestCase5() {
    
        throw new SkipException("Skipping this test with exception");
        
    }

}
