package automationtestingwithudemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Endtoend {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector(".css-1cwyjr8.r-homxoj.r-ubezar.r-10paoce.r-13qz1uu")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='CJB']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='MAA']")).click();

		// to select the current date in calendar
		driver.findElement(By.cssSelector(
				".css-1dbjc4n.r-1awozwy.r-19m6qjp.r-156aje7.r-y47klf.r-1phboty.r-1d6rzhh.r-1pi2tsx.r-1777fci.r-13qz1uu"))
				.click();

		// to check if the element is disabled or not
		WebElement todate = driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']"));
		String styleValue = todate.getDomAttribute("style");
		System.out.println("the value in the selected attribute: " + styleValue);
		if (styleValue.contains("background-color: rgb(238, 238, 238)")) {
			System.out.println("the to date calendary is not enabled");
			Assert.assertFalse(false);
		} else {
			System.out.println("the to date calendary is enabled");
			Assert.assertFalse(true);
		}
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();

		int i = 1;
		while (i < 3) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		driver.findElement(By.xpath("//div[text()='Family & Friends']")).click();
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		System.out.println("We successfully clicked the search flight.");
		driver.quit();
	}

}
