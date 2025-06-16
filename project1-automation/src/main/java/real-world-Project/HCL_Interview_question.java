package automationtestingwithudemy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day14_LinksHandle_TestNG {

	static WebDriver driver;
	@BeforeClass
	public void launch() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void LinksHandle() {
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer =driver.findElement(By.cssSelector("#gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement column = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(column.findElements(By.tagName("a")).size());
		for(int i=1; i<column.findElements(By.tagName("a")).size(); i++) {
			String clickonlinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			column.findElements(By.tagName("a")).get(i).sendKeys(clickonlinks);
		}
			Set<String> windows = driver.getWindowHandles();
			Iterator<String> iterate = windows.iterator();
			while(iterate.hasNext()) {
				driver.switchTo().window(iterate.next());
				System.out.println(driver.getTitle());
			}	
			
		}
	@AfterClass
	public void close() {
		driver.quit();
	}
}
