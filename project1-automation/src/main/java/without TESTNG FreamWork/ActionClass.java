package automationtestingwithudemy;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day11_ActionClass {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	driver.get("https://www.nykaa.com/");
	driver.findElement(By.name("search-suggestions-nykaa")).click();
	Actions action = new Actions(driver);
	//we are sending the value in capital letter in the search box and the we are double clicking the typed text
	action.moveToElement(driver.findElement(By.name("search-suggestions-nykaa"))).click().keyDown(Keys.SHIFT).sendKeys("face masks").doubleClick().build().perform();
	//we are mouse hover on the Eye glasses tab
	action.moveToElement(driver.findElement(By.id("nykaaNetwork"))).build().perform();
	// to right click on a element 
	action.moveToElement(driver.findElement(By.id("nykaaNetwork"))).contextClick().build().perform();
	
	}
}
