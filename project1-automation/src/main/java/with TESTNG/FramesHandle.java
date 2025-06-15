package automationtestingwithudemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day13_Frames_TestNG {

	static WebDriver driver;
	@BeforeClass
	public void lunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void FramesHandle() {

		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		WebElement frameElement = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frameElement);
		Actions action = new Actions(driver);
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		driver.switchTo().defaultContent();	
	}
	@AfterClass
	public void close() {
		driver.close();
	}
}
