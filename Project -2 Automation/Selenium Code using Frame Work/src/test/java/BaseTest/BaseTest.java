package BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mycompany.app.LandingPage;

public class BaseTest {
	protected WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
		
		Properties pros = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\GlobalData.properties");
		pros.load(fis);
		String browserName =System.getProperty("browser")!=null? System.getProperty("browser"): pros.getProperty("browser") ;
		//String browserName	 = pros.getProperty("browser");
				//System.out.println("Browser from properties = " + browserName);)
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			}
			if(browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
				}
			if(browserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
				}
			return driver;
	}
	
	
		
		public void ManageTheBrowser() {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
		}
		public WebDriver getDriver() {
		    return driver;
		}
	
	public LandingPage launchApplication() throws IOException {
		driver = initializeDriver();
		ManageTheBrowser();
		LandingPage landingPage = new LandingPage(driver);
		landingPage.goTo();
			return landingPage;
	}
//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	
//	public void waitForWebElementToAppear(By findBy) {
//	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
//}
	
	public static List<HashMap<String, String>> getJsonToMap(String filePath) throws IOException {
		//read json file to string
		String jsonContent = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);
		//System.getProperty("user.dir")+"\\src\\test\\java\\TestData\\TestDataForExpense.json" -> file path
	System.out.println(jsonContent);
	//string to HashMap
	//to change the string to hashmap then we need "jackson databind" dependence 
	ObjectMapper mapper = new ObjectMapper();
	List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>(){	
	});
	return data;
	}
	
	public String getScreenShot(String TestCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		File DestinationFile = new File(System.getProperty("user.dir")+ "//ScreenShotReport//" + TestCaseName + ".png");
		FileUtils.copyFile(Source, DestinationFile);
		//return DestinationFile;
		//return System.getProperty("user.dir")+ "//ScreenShotReport//" + TestCaseName + ".png";
		return "../ScreenShotReport/" + TestCaseName + ".png";
	}
@AfterMethod(alwaysRun = true)	
	public void tearDown() {
		driver.quit();
	}

}
