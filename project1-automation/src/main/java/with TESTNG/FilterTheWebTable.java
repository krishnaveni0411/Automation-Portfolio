package automationtestingwithudemy;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day23_FilterTheWebTable_TestNG {
static WebDriver driver;
	
	@BeforeClass
	public void launch() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public  void filterTheWebTable() {

driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
driver.findElement(By.id("search-field")).sendKeys("Strawberry");
List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
List<WebElement> filteredList = veggies.stream().filter(v -> v.getText().contains("Strawberry")).collect(Collectors.toList());
Assert.assertEquals(filteredList.size(), veggies.size());

	}
	@AfterClass
	public void terminate() {
		driver.quit();
	}

}
