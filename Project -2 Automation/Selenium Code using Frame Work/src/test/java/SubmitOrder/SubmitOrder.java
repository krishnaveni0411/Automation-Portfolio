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
		Boolean match = cartProducts.cartProducts(productName);
		Assert.assertTrue(match);
		cartProducts.cartProducts(productName);
		cartProducts.checkOut();
		String shippingMailId = cartProducts.fillTheForm();
		Assert.assertTrue(mailId.equalsIgnoreCase(shippingMailId));
		String orderconfirmMess =  cartProducts.orderConfirmationPage();
		Assert.assertTrue(orderconfirmMess.equalsIgnoreCase("Thankyou for the order"));
		tearDown();
			

		}
	
		
	
		
		
		
		
		


	}



