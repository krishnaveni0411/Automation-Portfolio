package automationtestingwithudemy;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Day20_WebTableSorting {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		Set<String> windows =driver.getWindowHandles();
		Iterator<String> iterate = windows.iterator();
		String parentwindow = iterate.next();
		String childwindow = iterate.next();
		driver.switchTo().window(childwindow);
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> listOfItems = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> nameOfList= listOfItems.stream().map(i->i.getText()).collect(Collectors.toList());
		List<String> sortedList= nameOfList.stream().sorted().collect(Collectors.toList());
		if(nameOfList.containsAll(sortedList)) {
			System.out.println("the name of the items are sorted correctly");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("the name of the items are not sorted correctly");
			Assert.assertTrue(false);
		}
		driver.quit();
	}

}
