package automationtestingwithudemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

	public class Practice_checkbox_udemy {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
	        // to check if the checkbooks is not selected when we launch the page.
			Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
			//if you want to print the checkbooks is selected or not in console then go with System.out.println();
			System.out.println( "The checkbox status after launch the page: " + driver.findElement(By.id("checkBoxOption1")).isSelected());
			
	        // select the first checkbox
			driver.findElement(By.id("checkBoxOption1")).click();
			// to check if the checkbooks is  selected	
			Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
			//if you want to print the checkbooks is selected or not in console then go with System.out.println();
			System.out.println("The checkbox status after select the first option: " +  driver.findElement(By.id("checkBoxOption1")).isSelected());
			
			// de-select the first checkbox
			driver.findElement(By.id("checkBoxOption1")).click();
			// to check if the checkbooks is not selected
			Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
			//if you want to print the checkbooks is selected or not in console then go with System.out.println();
			System.out.println("The checkbox status after de-select the first option: " +  driver.findElement(By.id("checkBoxOption1")).isSelected());	
		
		// check the size of the checkboxs
		System.out.println("The Number of Check box: " + driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.close();
	}
}
