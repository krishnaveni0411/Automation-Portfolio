package automationtestingwithudemy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day4_sugestive_dropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement country_Textbox = driver.findElement(By.id("autosuggest"));
		country_Textbox.click();
		country_Textbox.sendKeys("ind");
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for(WebElement option : options) {   // this is an enhanced for loop
			if(option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}
driver.close();
	}

}

