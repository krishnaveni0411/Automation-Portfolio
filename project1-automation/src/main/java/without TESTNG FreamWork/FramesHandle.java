package automationtestingwithudemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day13_Frames {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
	System.out.println(driver.findElements(By.tagName("iframe")).size());
	WebElement frameElement = driver.findElement(By.cssSelector(".demo-frame"));
	driver.switchTo().frame(frameElement);
	Actions action = new Actions(driver);
	action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
	driver.switchTo().defaultContent();
	driver.close();
	}

}
