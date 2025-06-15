package automationtestingwithudemy;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day12_WindowHandling_TestNG {
	static WebDriver driver;
	// in this window handling i switched to child window and fetched the email id and return to parent window and used that "email id" in "user name" field.
	@BeforeClass
	public void lauch() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	@Test
	public  void windowHandle() {
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector(".float-right .blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterate = windows.iterator();
		String parentWindow = iterate.next();
		String childWindow = iterate.next();
		driver.switchTo().window(childWindow);
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(emailId);
		driver.switchTo().window(parentWindow);
		driver.findElement(By.cssSelector("#username")).sendKeys(emailId);
	}
	
	@AfterClass
	public void closeBrowsers() {
		driver.close();
	}

}
