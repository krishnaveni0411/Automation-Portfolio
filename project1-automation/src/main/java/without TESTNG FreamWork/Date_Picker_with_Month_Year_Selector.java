package automationtestingwithudemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

public class Day15_Date_Picker_with_Month_Year_Selector {

	public static void main(String[] args) {
		String month = "6";
		String date = "13";
		String year = "2024";
		String[] expectedList = { month, date, year };
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"))
				.get(Integer.parseInt(month) - 1).click();
		driver.findElement(By.xpath("//abbr[text()='" + date + "']")).click();
		String selcteddate = driver
				.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']/input[@name='date']"))
				.getDomAttribute("value");
		System.out.println(selcteddate);
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for (int i = 0; i < actualList.size(); i++) {
			System.out.println(actualList.get(i).getDomAttribute("value"));

			Assert.assertEquals(actualList.get(i).getDomAttribute("value"), expectedList[i]);
		}
		driver.close();
	}

}
