package automationtestingwithudemy;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingProductstoCartusingJavaStream {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] itemNeededToAdd = { "Brocolli", "Tomato", "Pumpkin", "Mango", "Pomegranate", "Almonds", "Cashews" };
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		List<WebElement> addToCartButtons = driver.findElements(By.xpath("//div[@class='product-action']/button"));
		ArrayList<String> productNames = products.stream().map(p -> p.getText().split("-")[0].trim())
				.collect(Collectors.toCollection(ArrayList::new));
		ArrayList<String> clickedItems = new ArrayList<>();
		List<String> itemsToAdd = Arrays.asList(itemNeededToAdd);
		for (int i = 0; i < productNames.size(); i++) {
			if (itemsToAdd.contains(productNames.get(i))) {
				addToCartButtons.get(i).click();
				clickedItems.add(productNames.get(i));
				System.out.println("Clicked on: " + productNames.get(i));
			}

		}

		if (clickedItems.containsAll(itemsToAdd) && itemsToAdd.containsAll(clickedItems)) {
			System.out.println("All expected items were clicked successfully!");
		} else {
			System.out.println("Mismatch found!");
			System.out.println("Expected: " + itemsToAdd);
			System.out.println("Clicked: " + clickedItems);
		}
		driver.quit();
	}

}
