package automationtestingwithudemy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
List<WebElement> checkboxList = driver.findElements(By.cssSelector("input[type='checkbox']"));
checkboxList.get(1).click();
String selectedCheckbox = checkboxList.get(1).getDomAttribute("value");
System.out.println(selectedCheckbox);
WebElement dropdownOptions = driver.findElement(By.id("dropdown-class-example"));
dropdownOptions.click();
Select options = new Select(dropdownOptions);
options.selectByValue(selectedCheckbox);

driver.findElement(By.id("name")).sendKeys(selectedCheckbox);
driver.findElement(By.id("alertbtn")).click();
String alertValue = driver.switchTo().alert().getText();
if(alertValue.contains(selectedCheckbox)) {
	System.out.println(alertValue);
	System.out.println("Alert message successfully has your send value");
}
else
	System.out.println("Alert message doesn't has your send value and something is wrong with your execution");
driver.switchTo().alert().accept();
driver.close();

	}

}
