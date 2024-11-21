package com.shopperstack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_AddressesFrom_page {

	public Add_AddressesFrom_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id="Name")
	private WebElement nametextfield; 
	
	@FindBy(id="House/Office Info")
	private WebElement Housetextfield;
	
	public WebElement getHousetextfield() {
		return Housetextfield;
	}


	@FindBy(id="Street Info")
	private WebElement streenfield;
	
	@FindBy(id="Landmark")
	private WebElement landmarktextfield;
	
	@FindBy(id="Country")
	private WebElement countryDD;
	
	@FindBy(id="State")
	private WebElement stateDD;
	
	@FindBy(id="City")
	private WebElement cityDD;
	
	@FindBy(id="Pincode")
	private WebElement pincodeTextfiled;
	
	@FindBy(id="Phone Number")
	private WebElement phonenumbertextfield;
	
	@FindBy(id="addAddress")
	private WebElement addressbtn;

	public WebElement getNametextfield() {
		return nametextfield;
	}

	public WebElement getStreenfield() {
		return streenfield;
	}

	public WebElement getLandmarktextfield() {
		return landmarktextfield;
	}

	public WebElement getCountryDD() {
		return countryDD;
	}

	public WebElement getStateDD() {
		return stateDD;
	}

	public WebElement getCityDD() {
		return cityDD;
	}

	public WebElement getPincodeTextfiled() {
		return pincodeTextfiled;
	}

	public WebElement getPhonenumbertextfield() {
		return phonenumbertextfield;
	}

	public WebElement getAddressbtn() {
		return addressbtn;
	}

}
