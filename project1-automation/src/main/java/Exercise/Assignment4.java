package automationtestingwithudemy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		// Click to open new window
		driver.findElement(By.linkText("Click Here")).click();
		// Get all window handles
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterate = windows.iterator();
		// iterating the windows to get the id of each window	
		String parentWindow = iterate.next();
		String childWindow = iterate.next();
		// Switch to child window
		driver.switchTo().window(childWindow);
		String textFromChildWindow = driver.findElement(By.tagName("h3")).getText();
		System.out.println("The text we fetched from Child Window is: " + textFromChildWindow);
		//Switch back to parent window
		driver.switchTo().window(parentWindow);
		String textFromParentWindow = driver.findElement(By.tagName("h3")).getText();
		System.out.println("The text we fetched from Parent Window is: " + textFromParentWindow);
		driver.close();
		

	}

}
