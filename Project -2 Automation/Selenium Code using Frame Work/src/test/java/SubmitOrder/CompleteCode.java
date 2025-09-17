package com.mycompany.app;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import BaseTest.BaseTest;

public class CompleteCode extends BaseTest {
	@Test
	public void submitOrder() throws InterruptedException, IOException {
		String productName = "ADIDAS ORIGINAL";
		String mailId = "krishanveni123@krish.com";
		
		/*for Register
		 CreateAnAccount createAccount = new CreateAnAccount(driver);
				createAccount.goToPage();
				String generatedMailId = createAccount.registerForm("1234567890", "Qazwsx@123");
				String confirmMess= createAccount.confirmationPage();
				Assert.assertTrue(confirmMess.equalsIgnoreCase("Account Created Successfully"));
				createAccount.backToLogin();
				*/
		
		LandingPage landingPage = launchApplication();
		ProductCatogry productCatorgy =landingPage.LoingApplication(mailId,"Qazwsx@123");  //in place of mailid replace with generatedMailId if we run register class.
		List<WebElement> products = productCatorgy.getProductList();
		productCatorgy.getProductName(productName);
		CartProducts cartProducts = productCatorgy.addProductToCart(productName);
		System.out.println("Checking for product in the cart...");
		cartProducts.getCartProducts().forEach(p -> System.out.println("Product in cart: " + p.getText()));
		Boolean match = cartProducts.cartProducts(productName);
		Assert.assertTrue(match);
		cartProducts.checkOut();
		cartProducts.fillTheForm();
		String orderconfirmMess =  cartProducts.orderConfirmationPage();
		System.out.println(orderconfirmMess);
		Assert.assertTrue(orderconfirmMess.equalsIgnoreCase("Thankyou for the order."));
		System.out.println("Test completed successfully!");
		tearDown();
		
	}

}
