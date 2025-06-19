package automationtestingwithudemy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment8 {

	public static void main(String[] args) {
		String expectedValue = "United Arab Emirates";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement country_Textbox = driver.findElement(By.id("autocomplete"));
		country_Textbox.click();
		country_Textbox.sendKeys("uni");
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
		for (WebElement option : options) { // this is an enhanced for loop
			if (option.getText().equalsIgnoreCase(expectedValue)) {		
				option.click();
				break;
			}	
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String selectedValue = (String) js.executeScript("return document.getElementById('autocomplete').value;");
		System.out.print(selectedValue);
		Assert.assertEquals(selectedValue, expectedValue);
		System.out.println("The selected value is the one we choosen");  
		driver.close();
	}

}
