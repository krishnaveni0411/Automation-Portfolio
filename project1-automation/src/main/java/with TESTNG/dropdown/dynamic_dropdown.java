package automationtestingwithudemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day3_dynamic_dropdown_1_testng {
	WebDriver driver;
	
	@BeforeClass
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
	@Test
	public void dynamic_dropdown() throws InterruptedException{
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click(); // in this i used parent child relationship xpath locator.
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='GOI'])[2]")).click(); // in this i used the index for the xpath locator 
		driver.close();
		
		
	}

}
