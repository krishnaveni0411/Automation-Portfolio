package BaseTest;

import org.testng.annotations.AfterMethod;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import POMClass.LandingPage;

public class BaseTest {


		public WebDriver driver;
		public LandingPage landingPage;

		public WebDriver initializeDriver() throws IOException

		{
			// properties class

			 Properties pros = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
					+ "//src//main//java//Resources//GlobalData.properties");
			pros.load(fis);
			String browserName = pros.getProperty("browser");
			System.out.println("Browser from properties = " + browserName);
			//prop.getProperty("browser");

			if(browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
				}
				if(browserName.equalsIgnoreCase("firefox")) {
					driver = new FirefoxDriver();
					}
				if(browserName.equalsIgnoreCase("edge")) {
					driver = new EdgeDriver();
					}

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			return driver;

		}
	
		
	
		
		@BeforeMethod
		public LandingPage launchApplication() throws IOException
		{
			
			 driver = initializeDriver();
			  landingPage = new LandingPage(driver);
			landingPage.goTo();
			return landingPage;
		
			
		}
		
		@AfterMethod
		
		public void tearDown()
		{
			driver.close();
		}
	}

	

