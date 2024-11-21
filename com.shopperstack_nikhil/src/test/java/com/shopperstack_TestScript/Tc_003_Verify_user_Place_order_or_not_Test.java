package com.shopperstack_TestScript;


import java.io.IOException;

import org.testng.annotations.Test;

import com.shoppersstack_Generic_Utility.Base_Test;
import com.shopperstack_POM.Cart_Page;
import com.shopperstack_POM.DeleveryAddress_page;
import com.shopperstack_POM.Payment_Method_Page;


public class Tc_003_Verify_user_Place_order_or_not_Test extends Base_Test{
	
	@Test
	public void orderProduct() throws InterruptedException, IOException {

		webDriverUtility.javaScript(driver, homePage.getFeaturedProduct());
    	Thread.sleep(3000);
		homePage.getAddtocartBtn().click();
		homePage.getCarticon().click();
		Thread.sleep(3000);
		Cart_Page cartpage = new Cart_Page(driver);
		cartpage.getBynow().click();
		
		DeleveryAddress_page deleveryaddrespage = new DeleveryAddress_page(driver);
		deleveryaddrespage.getRadioBtn().click();
		deleveryaddrespage.getProceedBtn().click();
		Thread.sleep(3000);
		
		Payment_Method_Page paymentmtdpage = new Payment_Method_Page(driver);
		paymentmtdpage.getCashondelevery().click();
		Thread.sleep(1000);
		paymentmtdpage.getProceed().click();;
		Thread.sleep(2000);
		webDriverUtility.webPageScreenShot(driver);

	
		Thread.sleep(7000);
		
	
		
	}

}
