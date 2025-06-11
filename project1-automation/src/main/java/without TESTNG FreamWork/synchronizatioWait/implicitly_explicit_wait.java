package automationtestingwithudemy;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day9_synchronization_wait {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		String[] itemNeeded = { "Brocolli", "Tomato", "Pumpkin", "Mango", "Pomegranate", "Almonds", "Cashews" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int j = 0;
		List listOfItemsNeeded = Arrays.asList(itemNeeded);
		for (int i = 0; i < products.size(); i++) {
			String[] productNames = products.get(i).getText().split("-");
			String formatedProductName = productNames[0].trim();
			if (listOfItemsNeeded.contains(formatedProductName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemNeeded.length) {
					break;
				}
			}
		}
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		// here the page loads for 1 to 2 seconds by applying the implicitly wait the code is passed successful
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		// here it takes around 4 to 5 seconds so the implicitly wait fails to satisfies to i applied the explicit wait concept here.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		driver.close();
	}
}
