package Banking.Thanos;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class AdvanceExtentReport {
	
	@Test
    public void testCase1() {
     
        Assert.assertTrue(true);
        ExtentTestManager.getTest().log(Status.INFO, "Test Case 1");
        
      }   
    @Test
    public void testCase2() {
              
        Assert.assertTrue(true);
        ExtentTestManager.getTest().log(Status.INFO, "Test Case 2");
    
    }
    @Test
    public void testCase3() {
        Assert.assertTrue(true);
        ExtentTestManager.getTest().log(Status.INFO, "Test Case 3");
    }
     
    @Test
    public void testCase4() {
        Assert.assertTrue(false);
        ExtentTestManager.getTest().log(Status.INFO, "Test Case 4");
    }
    @Test
    public void testCase5() {
    
        throw new SkipException("Skipping this test with exception");
        
    }

}
