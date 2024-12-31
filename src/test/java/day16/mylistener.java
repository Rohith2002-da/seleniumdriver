package day16;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class mylistener implements ITestListener {
	
	  public void onStart(ITestContext context) {
		    // not implemented
		  System.out.println("test execution started");
		  }
	
	  public void onTestStart(ITestResult result) {
		    // not implemented
		  System.out.println("test started");

		  }
	  
	  public void onTestSuccess(ITestResult result) {
		    // not implemented
		  System.out.println("test passed");

		  }
	  
	  public void onTestFailure(ITestResult result) {
		    // not implemented
		  System.out.println("test failed");

		  }
	  
	  public void onTestSkipped(ITestResult result) {
		    // not implemented
		  System.out.println("test skipped");

		  }
	  public void onFinish(ITestContext context) {
		    // not implemented
		  System.out.println("test finished");

		  }
	  
	 


}
