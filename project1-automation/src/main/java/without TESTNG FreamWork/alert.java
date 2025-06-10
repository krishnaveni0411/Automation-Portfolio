package automationtestingwithudemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_alert {

	public static void main(String[] args) {
		String name = "krishnaveni";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
driver.findElement(By.name("enter-name")).sendKeys("name");
driver.findElement(By.id("alertbtn")).click();
String alertValue = driver.switchTo().alert().getText();
if(alertValue.contains(name)) {
	System.out.println(alertValue);
}
driver.switchTo().alert().accept();
driver.findElement(By.id("confirmbtn")).click();
driver.switchTo().alert().dismiss();

	}

}
