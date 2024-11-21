package com.shopperstack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleveryAddress_page {
	
	public DeleveryAddress_page(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	@FindBy(xpath =  "//input[@type='radio']")
	private WebElement radioBtn;
	
	@FindBy(xpath="//button[contains(@class,'selectaddress_proceed__qiGsK')]")
	private WebElement proceedBtn;

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getProceedBtn() {
		return proceedBtn;
	}

}
