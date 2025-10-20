package BaseTest;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Resources.ExtentReportNG;

public class Listeners extends BaseTest implements ITestListener {
	ExtentTest test;
	ExtentReports extent = ExtentReportNG.configration();
	
	@Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
       test= extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getMethod().getMethodName());
        test.log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
    	 
        System.out.println("Test Failed: " + result.getMethod().getMethodName());
        System.out.println("Reason: " + result.getThrowable());
        test.log(Status.FAIL, "Test Failed");
        test.fail(result.getThrowable());
        BaseTest base = (BaseTest) result.getInstance();
        WebDriver driver = base.getDriver();

        if (driver != null) {
            try {
            	String screenshotPath = base.getScreenShot(result.getMethod().getMethodName(), driver);
                System.out.println("📸 Screenshot saved at: " + screenshotPath);
             // 🧪 Add screenshot to Extent Report
                test.addScreenCaptureFromPath(screenshotPath, "Failed at: " + result.getMethod().getMethodName());

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Driver is null, cannot capture screenshot.");
        }
        
    }

      /*  try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        String filePath = null;
		try {
			filePath = getScreenShot(result.getMethod().getMethodName(), driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        test.addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());
    */
    

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test Failed but within success percentage: " + result.getMethod().getMethodName());
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Execution Started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Execution Finished: " + context.getName());
       extent.flush();
    }

}
