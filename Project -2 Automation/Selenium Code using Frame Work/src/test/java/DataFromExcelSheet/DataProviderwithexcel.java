package com.mycompany.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import BaseTest.Retry;
import BaseTest.BaseTest;

public class CompleteCodeDataProviderwithexcel extends BaseTest {
	DataFormatter formatter = new DataFormatter();
	
	@Test (dataProvider= "getDataFromExcel")
	public void submitOrder(String UserName, String Password, String ProductName) throws InterruptedException, IOException {
		
		LandingPage landingPage = launchApplication();
		ProductCatogry productCatorgy =landingPage.LoingApplication(UserName, Password); 
		List<WebElement> products = productCatorgy.getProductList();
		productCatorgy.getProductName(ProductName);
		CartProducts cartProducts = productCatorgy.addProductToCart(ProductName);
		System.out.println("Checking for product in the cart...");
		cartProducts.getCartProducts().forEach(p -> System.out.println("Product in cart: " + p.getText()));
		Boolean match = cartProducts.cartProducts(ProductName);
		Assert.assertTrue(match);
		cartProducts.checkOut();
		cartProducts.fillTheForm();
		String orderconfirmMess =  cartProducts.orderConfirmationPage();
		System.out.println(orderconfirmMess);
		Assert.assertTrue(orderconfirmMess.equalsIgnoreCase("Thankyou for the order."));
		System.out.println("Test completed successfully!");
		tearDown();	
	}
	
	 @DataProvider
	   public Object[][] getDataFromExcel() throws IOException {
		 FileInputStream file = new FileInputStream("C:\\Users\\Waffor\\Downloads\\Exceldriven.xlsx");
			XSSFWorkbook workBook = new XSSFWorkbook(file);
			XSSFSheet sheet = workBook.getSheetAt(0);
			int rowCount= sheet.getPhysicalNumberOfRows();
			XSSFRow row =sheet.getRow(0);
			int columnCount =	row.getLastCellNum();
			Object data[][] = new Object[rowCount-1][columnCount];
			for(int i=0; i<rowCount-1;i++) {
				 XSSFRow rows =sheet.getRow(i+1);
				for(int j=0; j<columnCount; j++) {
					XSSFCell cell =rows.getCell(j);
					data[i][j] = formatter.formatCellValue(cell);
					System.out.println(data[i][j]);
					
				}
			}
		return data;
		
	}

}
