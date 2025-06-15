package automationtestingwithudemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		// in this page we have a frameset in that we have 2 frames 1. frame-top and frame-bottom
		// switch to frame-top
		driver.switchTo().frame("frame-top");
		//switch to middle frame
		driver.switchTo().frame("frame-middle");
		//  get the string inside the middle frame
		String textInMiddleFrame = driver.findElement(By.id("content")).getText();
		System.out.println(textInMiddleFrame);
		//switch to the page
		driver.switchTo().defaultContent();
		driver.close();
	}

}
