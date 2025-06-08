package automationtestingwithudemy;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day5_Custom_Dropdown_Testng {
	WebDriver driver;
	@BeforeClass
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
	}
	
	@Test
	public  void custom_dropdown() throws InterruptedException {
		// in this we are going to handle "Custom Dropdown with Increment/Decrement Controls"
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dropdown = driver.findElement(By.id("divpaxinfo"));
		System.out.println(dropdown.getText());
		dropdown.click();
	// here i want to click the increment button for 4 time iam going to do it in two ways 
		//1st way -> to incrementing it
		int i=1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		Assert.assertEquals(dropdown.getText(), "5 Adult");
		//if you want to print the value in console then go with System.out.println();
		System.out.println(dropdown.getText());
		Thread.sleep(1000);
		// here iam again click the dropdown and decreasing the count
		dropdown.click();
		//2nd way -> to decrement it
		for(int j=1; j<5; j++) {
			driver.findElement(By.id("hrefDecAdt")).click();
		}
		driver.findElement(By.xpath("//input[@value='Done']")).click();	
		Assert.assertEquals(dropdown.getText(), "1 Adult");
		//if you want to print the value in console then go with System.out.println();
		System.out.println(dropdown.getText());
		driver.close();
	}

}
