package day16;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentreportmanager implements ITestListener{
	public ExtentSparkReporter sparkReporter;//ui of the report
	public ExtentReports extent;//populate common info on the report
	public ExtentTest test;//create testcase entries in the report and update status of the test methods
	
	public void OnStart(ITestContext context) {
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myreport.html");
		sparkReporter.config().setDocumentTitle("Automation report");//title of the report
		sparkReporter.config().setReportName("functional testing");
		sparkReporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		
		extent.setSystemInfo("computer name", "localhost");
		extent.setSystemInfo("environment", "QA");
		extent.setSystemInfo("Tester name", "pavan");
		extent.setSystemInfo("os", "windows");

	}
	  public void onTestSuccess(ITestResult result) {
		  test=extent.createTest(result.getName());//create new entry in report
		  test.log(Status.PASS, "testcase passed is:"+result.getName());//update status p/f/s
	  }

	  public void onTestFailure(ITestResult result) {
		  test=extent.createTest(result.getName());//create new entry in report
		  test.log(Status.FAIL, "testcase failed is:"+result.getName());//update status p/f/s
	      test.log(Status.FAIL, result.getThrowable());
		  
	  }
	  public void onTestSkipped(ITestResult result) {

	  test=extent.createTest(result.getName());//create new entry in report
	  test.log(Status.PASS, "testcase passed is:"+result.getName());//update status p/f/s
	  }
	  public  void onFinish(ITestContext context) {
		    // not implemented
		  extent.flush();
		  }
}
