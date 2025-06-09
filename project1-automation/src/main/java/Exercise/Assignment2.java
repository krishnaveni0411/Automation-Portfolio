package automationtestingwithudemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		String name = "krishnaveni";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("krishanveni@assignemnt.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement gender_dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		gender_dropdown.click();
		Select option= new Select(gender_dropdown);
		option.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		String Employment_Status = driver.findElement(By.xpath("(//label[@class='form-check-label'])[2]")).getText();
		System.out.println(Employment_Status);
		driver.findElement(By.xpath("(//div[@class='form-group']/input[@class='form-control'])[2]")).sendKeys("04-03-1990");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		String submit_message = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
		submit_message = submit_message.replace("×", "").trim();
		System.out.println(submit_message);
		driver.close();

	}

}
