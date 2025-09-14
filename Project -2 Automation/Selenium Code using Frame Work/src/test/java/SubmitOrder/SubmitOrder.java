package SubmitOrder;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import BaseTest.BaseTest;
import POMClass.CartPage;
import POMClass.CheckoutPage;
import POMClass.ConfirmationPage;

import POMClass.ProductCatalogue;

public class SubmitOrder extends BaseTest {

		String productName = "ZARA COAT 3";
		String MailId = "krishanveni123@krish.com";
		String Password = "Qazwsx@123";
		

		@Test
		public void submitOrder() throws IOException, InterruptedException
		{

			
			ProductCatalogue productCatalogue = landingPage.loginApplication(MailId, Password);
			List<WebElement> products = productCatalogue.getProductList();
			productCatalogue.addProductToCart(productName);
			CartPage cartPage = productCatalogue.goToCartPage();

			Boolean match = cartPage.VerifyProductDisplay(productName);
			Assert.assertTrue(match);
			CheckoutPage checkoutPage = cartPage.goToCheckout();
			checkoutPage.selectCountry("india");
			ConfirmationPage confirmationPage = checkoutPage.submitOrder();
			String confirmMessage = confirmationPage.getConfirmationMessage();
			Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
			

		}
	
		
	
		
		
		
		
		


	}


