package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Cucumber", glue="CucumberStepDefination", monochrome=true, tags = "@Regression", plugin= {"html:CucumberReports/cucumber.html"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

	
	
}
