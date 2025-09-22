package com.mycompany.app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BeforeClass;

public class CartProducts extends BeforeClass {
	
	//WebDriver driver;

	public CartProducts(WebDriver driver) {
		super(driver);
		// this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(css=".cartSection h3")
	List<WebElement> cartProducts;
	
	@FindBy(css="[routerlink*='cart']")
	WebElement cartButton;
	
	@FindBy(xpath="//button[text()='Checkout']")
	WebElement checkOut;
	
	@FindBy(xpath="//input[@placeholder='Select Country']")
	WebElement selectCountry;
	
	@FindBy(css=".payment__shipping .input")
	WebElement mailIDTextBox;
	
	@FindBy(css=".ta-item:nth-of-type(2)")
	WebElement chooseCountryFromList;
	
	@FindBy(css=".action__submit")
	WebElement placeOrder;
	
	@FindBy(css=".hero-primary")
	WebElement orderConfirmationPage;
	
	By getCountryList = By.cssSelector(".ta-results");
	
	
	public List<WebElement> getCartProducts() {
	    return cartProducts;
	}
	
	public Boolean cartProducts(String productName) {
		cartButton.click();
		waitForVisibilityOfAllElements(cartProducts);
		Boolean match =	cartProducts.stream().anyMatch(cartProduct -> cartProduct.getText().equalsIgnoreCase(productName));
	return match;
	}
	
	public void checkOut() {
		checkOut.click();
		
	}
	
	public void fillTheForm() {
		String shippingMailId = mailIDTextBox.getText();
		selectCountry.click();
		Actions action = new Actions(driver);
		action.sendKeys(selectCountry, "india").build().perform();
		waitForWebElementToAppear(getCountryList);
		chooseCountryFromList.click();
		placeOrder.click();
		//return shippingMailId;
	}
	public String orderConfirmationPage() {
		String confirmMess = orderConfirmationPage.getText();
		return confirmMess;
	}
	
}
