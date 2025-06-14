package automationtestingwithudemy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String text = driver.findElement(By.cssSelector(".text-center.text-white")).getText();
		System.out.println(text);
		text = text.replace("(", "").replace(")", "");
		String[] parts = text.split("and");
		String username = parts[0].split("is")[1].trim();
		String password = parts[1].split("is")[1].trim();
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("(//span[@class='radiotextsty'])[last()]")).click();
	
		WebElement dropdownOptions = driver.findElement(By.xpath("//div[@class='form-group']/select"));
		Select options = new Select(dropdownOptions);
		options.selectByVisibleText("Consultant");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		driver.findElement(By.cssSelector("#signInBtn")).click();
		List<WebElement> items = driver.findElements(By.cssSelector(".col-lg-3.col-md-6.mb-3"));
		
		wait.until(ExpectedConditions.visibilityOfAllElements(items));

		for (int i = 0; i < items.size(); i++) {
			driver.findElements(By.xpath("//div[@class='card-footer']/button")).get(i).click();
		}
		System.out.println("all the items in the page are added to the cart");
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();

	}

}
