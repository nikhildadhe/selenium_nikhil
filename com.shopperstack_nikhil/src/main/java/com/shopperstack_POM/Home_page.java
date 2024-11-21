package com.shopperstack_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {

	public Home_page(WebDriver driver) {
		PageFactory.initElements(driver,this );
		
		
	}
	@FindBy(xpath="//button[contains(@class,'MuiButtonBase-root MuiIconButton-root ')]")
	private WebElement settingbtn;
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myprofilebtn;
	
	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logoutbtn;
	

	public WebElement getSettingbtn() {
		return settingbtn;
	}

	public WebElement getMyprofilebtn() {
		return myprofilebtn;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	@FindBy(id="addToCart")
    private WebElement addtocartBtn;
	
	@FindBy(id="cartIcon")
	private WebElement carticon;
	
	@FindBy(xpath="//h1[text()='Featured Products']")
	private WebElement featuredProduct;

	public WebElement getAddtocartBtn() {
		return addtocartBtn;
	}

	public WebElement getFeaturedProduct() {
		return featuredProduct;
	}

	public WebElement getCarticon() {
		return carticon;
	}
	
}
