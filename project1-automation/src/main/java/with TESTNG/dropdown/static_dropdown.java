package automationtestingwithudemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Day2_StaticDropdown_TestNG {
	Day1WithTestNG obj = new Day1WithTestNG();
    WebDriver driver;
@BeforeClass
public void launch() {
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
}
    
    @Test
	public void staticdropdown() throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement static_dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Thread.sleep(2000);
		static_dropdown.click();
		Select options = new Select(static_dropdown);
		options.selectByIndex(2);
		String selectedoption = options.getFirstSelectedOption().getText();
		System.out.println(selectedoption);
	    // options.selectByVisibleText("INR");  -> 2nd way to select an option from a static dropdown
		// options.selectByValue("USD");  -> 3rd way to select an option from a static dropdown
		driver.quit();
	}

}
