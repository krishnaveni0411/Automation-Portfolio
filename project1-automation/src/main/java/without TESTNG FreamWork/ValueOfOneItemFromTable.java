package automationtestingwithudemy;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day21_ValueOfOneItemFromTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
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
		List<String> price = listOfItems.stream().filter(i -> i.getText().contains("Banana")).map(i -> getPrice(i)).collect(Collectors.toList());
		price.forEach(a -> System.out.println(a));
		driver.quit();
	}
	public static String getPrice(WebElement s) {
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}
}
