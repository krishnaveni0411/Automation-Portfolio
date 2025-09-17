package BaseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.mycompany.app.LandingPage;

public class BaseTest {
	protected WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
		
		Properties pros = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\GlobalData.properties");
		pros.load(fis);
		String browserName = pros.getProperty("browser");
		System.out.println("Browser from properties = " + browserName);
		
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
	
	public void tearDown() {
		driver.quit();
	}

}
