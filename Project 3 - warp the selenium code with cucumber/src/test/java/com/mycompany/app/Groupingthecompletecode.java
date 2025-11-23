package com.mycompany.app;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import BaseTest.BaseTest;

public class Groupingthecompletecode extends BaseTest {
	ProductCatogry productCatorgy;
	CartProducts cartProducts;
	String productName = "ADIDAS ORIGINAL";
	String mailId = "krishanveni123@krish.com";
	
	@BeforeTest (alwaysRun=true)
	public void login() throws InterruptedException, IOException {
		LandingPage landingPage = launchApplication();
		productCatorgy =landingPage.LoingApplication(mailId,"Qazwsx@123");  //in place of mailid replace with generatedMailId if we run register class.
	}
	@Test (groups = {"AddProduct"})
	public void AddProduct() throws InterruptedException {
		
		List<WebElement> products = productCatorgy.getProductList();
		productCatorgy.getProductName(productName);
	}
		@Test (groups = {"CartPage"})
		public void CartPage() throws InterruptedException {
			
		cartProducts = productCatorgy.addProductToCart(productName);
		System.out.println("Checking for product in the cart...");
		cartProducts.getCartProducts().forEach(p -> System.out.println("Product in cart: " + p.getText()));
		Boolean match = cartProducts.cartProducts(productName);
		Assert.assertTrue(match);
		cartProducts.checkOut();
		}
		@Test (groups = {"placeAnOrder"})
		public void submitorder() throws InterruptedException {
			
		cartProducts.fillTheForm();
		String orderconfirmMess =  cartProducts.orderConfirmationPage();
		System.out.println(orderconfirmMess);
		Assert.assertTrue(orderconfirmMess.equalsIgnoreCase("Thankyou for the order."));
		System.out.println("Test completed successfully!");
	}
	@AfterTest (alwaysRun=true)
	public void close() {
		tearDown();
	}
}