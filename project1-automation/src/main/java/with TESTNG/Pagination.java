package automationtestingwithudemy;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day22_Pagination_TestNG {
	static WebDriver driver;
	List<String> price;

	@BeforeClass
	public void launch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void veggie() {

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterate = windows.iterator();
		String parentwindow = iterate.next();
		String childwindow = iterate.next();
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> listOfItems = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> nameOfList = listOfItems.stream().map(i -> i.getText()).collect(Collectors.toList());
		List<String> sortedList = nameOfList.stream().sorted().collect(Collectors.toList());
	}

	public static String getPrice(WebElement s) {
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

	@Test(priority = 2, dependsOnMethods = "veggie")
	public void pagination() {

		do {
			List<WebElement> listOfItems = driver.findElements(By.xpath("//tr/td[1]"));
			price = listOfItems.stream().filter(i -> i.getText().contains("Tomato")).map(i -> getPrice(i)).collect(Collectors.toList());
			price.forEach(i -> System.out.println(i));
			if (price.size() < 1) {
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();

			}
		} while (price.size() < 1);
	}

	@AfterClass
	public void terminate() {
		driver.quit();
	}
}
