package automationtestingwithudemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2_StaticDropdown {
	 static WebDriver driver;
	 
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
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
		driver.close();
		
	}
}
