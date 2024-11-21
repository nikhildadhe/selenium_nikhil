package com.shopperstack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {

	public Cart_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeSmall css-892d40')]")
	private WebElement removefromcart;
	
	@FindBy(xpath="//span[text()='Buy Now']")
	private WebElement bynow;
	
	@FindBy(xpath="//span[text()='Continue Shopping']")
	private WebElement contuneshopping;
	
	public WebElement getRemovefromcart() {
		return removefromcart;
	}

	public WebElement getBynow() {
		return bynow;
	}

	public WebElement getContuneshopping() {
		return contuneshopping;
	}
	
}
