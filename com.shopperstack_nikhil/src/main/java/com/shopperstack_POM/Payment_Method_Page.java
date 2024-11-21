package com.shopperstack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Method_Page {
	
	public Payment_Method_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='Cash On Delivery (COD)']")
	private WebElement cashondelevery;

	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement proceed;

	public WebElement getCashondelevery() {
		return cashondelevery;
	}

	public WebElement getProceed() {
		return proceed;
	}
}
