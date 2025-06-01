package automationtestingwithudemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class Day1WithTestNG {
// for singup alone
	String returnedPD;
	
String name = "Testing";

WebDriver driver;

@BeforeClass
public void steup() {
driver = new ChromeDriver();
//implementing implicitlywait 
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.manage().window().maximize();
}

@Test(priority = 1)
public void loginWithInvalidCredentials() throws InterruptedException {
	
driver.get("https://rahulshettyacademy.com/locatorspractice/");

WebElement username = driver.findElement(By.id("inputUsername"));
username.click();
username.sendKeys(name);

WebElement Password = driver.findElement(By.name("inputPassword"));
Password.click();
Password.sendKeys("Testing");

driver.findElement(By.className("signInBtn")).click();

String error = driver.findElement(By.cssSelector("p.error")).getText();

if(error.contains("Incorrect"))
{
	//driver.findElement(By.xpath("//a[contains(text(),'Forgot your password')]")).click();
	driver.findElement(By.linkText("Forgot your password?")).click();
	
}
Thread.sleep(2000);

Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Forgot password");

}
@Test(priority = 2, dependsOnMethods = {"loginWithInvalidCredentials"})
public void resetPassword() throws InterruptedException {

WebElement Name =driver.findElement(By.xpath("//input[@placeholder='Name']"));
Name.click();
Name.sendKeys(name);
WebElement Email =driver.findElement(By.xpath("//input[@placeholder='Email']"));
Email.click();
Email.sendKeys("example@gmail.com");
WebElement PhoneNumber =driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
PhoneNumber.click();
PhoneNumber.sendKeys("1234567890");

driver.findElement(By.className("reset-pwd-btn")).click();
String InfoMss = driver.findElement(By.cssSelector("p.infoMsg")).getText();
System.out.println(InfoMss);

String[] PDfromMess = InfoMss.split("'");
returnedPD = PDfromMess[1];
System.out.println(returnedPD);

driver.findElement(By.xpath("//button[text()='Go to Login']")).click();

Thread.sleep(2000);
}
@Test(priority = 3, dependsOnMethods = {"resetPassword"})
public void loginwithvalidCredentials() throws InterruptedException {

	WebElement username = driver.findElement(By.id("inputUsername"));
username.click();
username.sendKeys(name);
WebElement Password = driver.findElement(By.name("inputPassword"));
Password.click();
Password.sendKeys(returnedPD);

driver.findElement(By.className("signInBtn")).click();

Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/p")).getText(), "You are successfully logged in.");
Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");

driver.findElement(By.cssSelector("button.logout-btn"));

}
@AfterClass
public void teardown() {

driver.quit();
}


}

