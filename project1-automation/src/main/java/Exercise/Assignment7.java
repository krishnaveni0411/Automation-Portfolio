package automationtestingwithudemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// Scrolling the page to reach the table
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		// Get the total Row count in the table with heading
		List<WebElement> row = driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr"));
		int sizeOfTheRow = row.size();
		System.out.println("Total count of the rows in this table: " + sizeOfTheRow);
		// Get the total Column count in the table
		List<WebElement> column = driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr/th"));
		int sizeOfTheColumn = column.size();
		System.out.println("Total count of the column in this table: " + sizeOfTheColumn);
		// Print the record form the row of the table.
		int rowIndex = 3; // we are getting the index of the row including the heading
		WebElement targetRow = driver.findElement(By.xpath("(//table[@id='product'])[1]/tbody/tr[" + rowIndex + "]"));
		List<WebElement> columns = targetRow.findElements(By.tagName("td"));
		for (WebElement column1 : columns) {
			System.out.println(column1.getText());
		}
		// Get all the data's form the price column.
		List<WebElement> columnValues = driver.findElements(By.xpath("(//table[@id='product'])[1]/tbody/tr/td[3]"));
		System.out.println("The List of values form the 3rd coulmn Price: ");
		for (int i = 0; i < columnValues.size(); i++) {
			int feactedValue = Integer.parseInt(columnValues.get(i).getText());

			System.out.println(feactedValue);
		}
		driver.quit();

	}

}
