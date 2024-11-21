package com.shopperstack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	public Login_page(WebDriver driver) {
	 PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	private WebElement emailTextfield;
	
	@FindBy(id="Password")
	private WebElement passwordTextfield;
	
	@FindBy(id="Login")
	private WebElement loginBtn;

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
}	



