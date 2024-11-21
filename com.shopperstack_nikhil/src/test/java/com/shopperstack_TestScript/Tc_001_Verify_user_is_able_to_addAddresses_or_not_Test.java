package com.shopperstack_TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.shoppersstack_Generic_Utility.Base_Test;
import com.shopperstack_POM.Add_AddressesFrom_page;
import com.shopperstack_POM.MyProfile_page;
import com.shopperstack_POM.My_Addresses_page;

public class Tc_001_Verify_user_is_able_to_addAddresses_or_not_Test extends Base_Test {

	@Test
	public void addAddress() throws InterruptedException, EncryptedDocumentException, IOException {
		Thread.sleep(3000);
		homePage.getSettingbtn().click();
		homePage.getMyprofilebtn().click();

		MyProfile_page myprofilepage = new MyProfile_page(driver);
		myprofilepage.getMyAdderesses().click();
		Thread.sleep(3000);
		My_Addresses_page myaddresspage = new My_Addresses_page(driver);
		myaddresspage.getAddaddressbtn().click();

		Add_AddressesFrom_page addressFromePage = new Add_AddressesFrom_page(driver);
		addressFromePage.getNametextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 0));
		addressFromePage.getHousetextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 1));
		addressFromePage.getStreenfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 2));
		
		addressFromePage.getLandmarktextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 3));
		
		webDriverUtility.selectByValue(addressFromePage.getCountryDD(), fileUtility.readPropertyFile("country"));
		webDriverUtility.selectByValue(addressFromePage.getStateDD(), fileUtility.readPropertyFile("state"));
		webDriverUtility.selectByValue(addressFromePage.getCityDD(), fileUtility.readPropertyFile("city"));
		addressFromePage.getPincodeTextfiled().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 4));
		addressFromePage.getPhonenumbertextfield().sendKeys(fileUtility.readExcelFile("Sheet1", 1, 5));
		addressFromePage.getAddressbtn().click();
	}

}
