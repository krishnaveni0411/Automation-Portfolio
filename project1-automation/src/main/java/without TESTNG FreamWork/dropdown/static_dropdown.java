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
		//String get_value = dropdown_option.getText();
		//System.out.println("default selected option is : " + get_value);
		Thread.sleep(2000);
		static_dropdown.click();
		Select options = new Select(static_dropdown);
		options.selectByIndex(2);
		String selectedoption = options.getFirstSelectedOption().getText();
		System.out.println(selectedoption);
	    // options.selectByVisibleText("INR");
		// options.selectByValue("USD");
		driver.close();
		
	}
}
