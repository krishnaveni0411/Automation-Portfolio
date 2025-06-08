package automationtestingwithudemy;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Day6_CheckBox_testng {
	WebDriver driver;
	
	@BeforeClass
	public  void lunch() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
	@Test
	public  void checkbox() {
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		// in this i used relative cssSelector.
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//if you want to print the checkbooks is selected or not in console then go with System.out.println();
		System.out.println( driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		//if you want to print the checkbooks is selected or not in console then go with System.out.println();
		System.out.println( driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.close();
	}

}

