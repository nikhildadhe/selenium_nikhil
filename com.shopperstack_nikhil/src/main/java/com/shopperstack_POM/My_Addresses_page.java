package com.shopperstack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Addresses_page {

	public My_Addresses_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-co')]")
	private WebElement addaddressbtn;
	
	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textError MuiButton-sizeSmall MuiButton-textSizeSmall  css-1bhv')]")
	private WebElement  deletebtn;
	
	@FindBy(xpath="(//button[text()='Yes'])[1]")
	private WebElement yesbtn;

	public WebElement getAddaddressbtn() {
		return addaddressbtn;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	public WebElement getYesbtn() {
		return yesbtn;
	}
	
	
}
