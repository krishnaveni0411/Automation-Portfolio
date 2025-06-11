package automationtestingwithudemy;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Day10_fluent_wait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.tagName("button")).click();
		WebElement finish = driver.findElement(By.cssSelector("div[id='finish'] h4"));
		// here i used fluent wait because after click start it loads for some time and then the data is displayed.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		WebElement own = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				// here the element is loaded but not yet displayed so i used if condition to check if the element is displayed in UI then return the element.
				if (finish.isDisplayed()) {
					return finish;
				} else
					return null;
			}
		});
		System.out.println(finish.getText());
        driver.close();
	}

}
