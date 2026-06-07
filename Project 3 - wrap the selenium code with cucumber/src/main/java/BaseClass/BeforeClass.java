package BaseClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mycompany.app.LandingPage;

public class BeforeClass {
	protected WebDriverWait wait;
	protected WebDriver driver;
	public BeforeClass(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void waitForVisibilityOfAllElements (List<WebElement> cartProducts) {
	wait.until(ExpectedConditions.visibilityOfAllElements(cartProducts));
	}
	
	public void waitForWebElementToAppear(By findBy) {
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	public void waitForElementToBeCliable(WebElement findBy) {
	wait.until(ExpectedConditions.elementToBeClickable(findBy));
}
	
}