package com.mycompany.app;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CompleteCode2 {
	public static void main(String[] args) throws InterruptedException {
		String productName = "ADIDAS ORIGINAL";
		String mailId = "krishanveni123@krish.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client/");
		// To Register an account
		/*
		 * driver.findElement(By.cssSelector(".text-reset")).click();
		 * driver.findElement(By.id("firstName")).sendKeys("Krishan");
		 * driver.findElement(By.id("lastName")).sendKeys("veni");
		 * driver.findElement(By.id("userEmail")).sendKeys("krishanveni123@krish.com");
		 * driver.findElement(By.id("userMobile")).sendKeys("1234567890"); WebElement
		 * occupationDropDown = driver.findElement(By.cssSelector("*.custom-select"));
		 * occupationDropDown.click(); Select options = new Select(occupationDropDown);
		 * options.selectByValue("3: Engineer");
		 * driver.findElement(By.xpath("//input[@value='Female']")).click();
		 * driver.findElement(By.id("userPassword")).sendKeys("Qazwsx@123");
		 * driver.findElement(By.id("confirmPassword")).sendKeys("Qazwsx@123");
		 * driver.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();
		 * driver.findElement(By.id("login")).click(); String text =
		 * driver.findElement(By.cssSelector(".headcolor")).getText();
		 * Assert.assertEquals(text, "Account Created Successfully");
		 * driver.findElement(By.cssSelector(".btn-primary")).click();
		 */
		// login page
		driver.findElement(By.id("userEmail")).sendKeys(mailId);
		driver.findElement(By.id("userPassword")).sendKeys("Qazwsx@123");
		driver.findElement(By.id("login")).click();
		List<WebElement> products = driver.findElements(By.cssSelector("*.col-lg-4"));
		WebElement prod = products.stream()
				.filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productName))
				.findFirst().orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// 	WebElement toasterMessage = driver.findElement(By.cssSelector("*.toast-success"));
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("*.toast-success")));
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
			List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
		Boolean match =	cartProducts.stream().anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));
		Assert.assertTrue(match);
		driver.findElement(By.xpath("//button[text()='Checkout']")).click();
		String shippingMailId = driver.findElement(By.cssSelector(".payment__shipping .input")).getText();
		//Assert.assertEquals(mailId, shippingMailId);
	WebElement selectCountry =	driver.findElement(By.xpath("//input[@placeholder='Select Country']"));
	selectCountry.click();
	Actions action = new Actions(driver);
	action.sendKeys(selectCountry, "india").build().perform();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
	driver.findElement(By.cssSelector(".ta-item:nth-of-type(2)")).click();
	driver.findElement(By.cssSelector(".action__submit")).click();
	String confirmMess = driver.findElement(By.cssSelector(".hero-primary")).getText();
	//Assert.assertTrue(confirmMess.equalsIgnoreCase("Thankyou for the order"));
	driver.close();
	
	
	}

}
