package automationtestingwithudemy;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_interview_question {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		// declaring the items that are need to add to cart in a array.
		String[] itemNeeded = {"Brocolli", "Tomato", "Pumpkin", "Mango", "Pomegranate", "Almonds", "Cashews" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//getting all the products in the page as a list.
		List <WebElement> products =driver.findElements(By.xpath("//h4[@class='product-name']"));
		int j=0;
		//need to convert the array into array list
		List listOfItemsNeeded = Arrays.asList(itemNeeded);
		//iterating the loop of products in the page
		for(int i=0; i<products.size(); i++) {
			//fetching the product names
			String[] productNames= products.get(i).getText().split("-");
			//getting only the name of the products
			String formatedProductName = productNames[0].trim();
			//validating if the product is matching to the items that we need to add them in the cart
			if(listOfItemsNeeded.contains(formatedProductName)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				//checking if all the items are added then stop the loop. 
				if(j==itemNeeded.length) {
					break;
				}
			}
			
		}
		
		driver.close();

	}

}
