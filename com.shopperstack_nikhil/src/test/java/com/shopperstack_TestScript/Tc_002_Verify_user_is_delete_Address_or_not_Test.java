package com.shopperstack_TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.shoppersstack_Generic_Utility.Base_Test;
import com.shopperstack_POM.MyProfile_page;
import com.shopperstack_POM.My_Addresses_page;

public class Tc_002_Verify_user_is_delete_Address_or_not_Test extends Base_Test {

	@Test
	public void deleteAddress() throws InterruptedException, IOException {

		Thread.sleep(2000);
		homePage.getSettingbtn().click();
		homePage.getMyprofilebtn().click();

		MyProfile_page myProfilepage = new MyProfile_page(driver);
		myProfilepage.getMyAdderesses().click();

		Thread.sleep(3000);
		My_Addresses_page myaddressPage = new My_Addresses_page(driver);
		myaddressPage.getDeletebtn().click();
		Thread.sleep(3000);
		myaddressPage.getYesbtn().click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		webDriverUtility.webPageScreenShot(driver);
	}

}
