package automationtestingwithudemy;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12_WindowHandling {

	public static void main(String[] args) {
		
		// in this window handling i switched to child window and fetched the email id and return to parent window and used that "email id" in "username" field.
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
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

}
