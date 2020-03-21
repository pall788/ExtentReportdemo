package com.as.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.as.Constant.LoginConstant;
import com.as.basePackage.BaseClass;

public class loginPage extends BaseClass implements LoginConstant {
	
	//pagefactory object repository
	
	@FindBy(name=Email_Name_Locators)// locators
	WebElement EmailID;
	
	@FindBy(name=Password_Name_Locators)
	WebElement Password;
	
	@FindBy(linkText=Login_Link_Text_Locators)
	WebElement LoginBtn;
	
	//initializing the page object
	public loginPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	

	public void ClickOnLoginBTN(String email, String pWD) {
		EmailID.sendKeys(email);
		 Password.sendKeys(pWD);
		 LoginBtn.click();
		
		
	}
	

}
