package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNG {
	public static ExtentReports configration() {
		/*class name to remember when we use extent reports are 1. ExtentReports 2. ExtentSparkReporter, need to create objects for these class and use them.
		 ExtentSparkReporter is expecting a path where your report should be created. 
		ExtentSparkReporter -> is used for configure the report
		ExtentReports is the main class which is responsible for all your reporting execution 
		The ExtentReport is the main class so we need to attach report what ever you created in the ExtentSparkReporter 	
		The method createTest is added at the top of the test and the flush method is added at the end of the test it's mandatory. (the flush method can be used after all the test)
		The flush method is used to update the status of the report whether it's pass or fail unless using the flush method the report will be listing.
		*/
		
		String reporterpath =System.getProperty("user.dir")+ "//reporter//index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(reporterpath);
		reporter.config().setReportName("Web Automation Report");
		reporter.config().setDocumentTitle("QA Miosalon Test Results");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Krishnaveni");
		return extent;
	}
}
