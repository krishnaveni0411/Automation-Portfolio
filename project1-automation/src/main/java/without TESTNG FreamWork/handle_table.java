package automationtestingwithudemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Day17_handle_table_grid {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,500)");
Thread.sleep(2000);
js.executeScript("document.querySelector('.tableFixHead').scrollTop=4000");
List<WebElement> column4Values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
int sum =0;
for(int i = 0; i<column4Values.size(); i++) {
	sum = sum + Integer.parseInt(column4Values.get(i).getText());
}
System.out.println(sum);
int totalInUI = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
Assert.assertEquals(sum, totalInUI);
driver.quit();
	}

}
