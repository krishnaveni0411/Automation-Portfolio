package ToolsQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ToolsQAPracticeForm {
	WebDriver driver;
@Test
	public void practiceForm() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("QA Testing");
		driver.findElement(By.id("lastName")).sendKeys("person");
		driver.findElement(By.id("userEmail")).sendKeys("qatesting@testing.com");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//label[@for='gender-radio-3']"))));
		driver.findElement(By.xpath("//label[@for='gender-radio-3']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("1234567890");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector(".subjects-auto-complete__value-container"))).click().sendKeys("QA Testing", Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']")).click();
		driver.findElement(By.id("submit")).click();
		String confimMess = driver.findElement(By.id("example-modal-sizes-title-lg")).getText();
		Assert.assertSame(confimMess, confimMess.equalsIgnoreCase("Thanks for submitting the form"));
			
		
	}
	
@AfterClass
public void teardown() {
	driver.close();
}

	
}
