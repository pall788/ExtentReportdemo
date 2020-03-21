package com.as.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.as.Constant.LoginConstant;
import com.as.Pages.loginPage;
import com.as.basePackage.BaseClass;

public class LoginPageTest extends BaseClass implements LoginConstant {
	
	loginPage loginPage;
	String S;
	
	public LoginPageTest() {
		super();
		
	}
	
	@Test(priority=0)
	public void TestWithSuccessCredentials() {
		loginPage=new loginPage(driver);
		
		loginPage.ClickOnLoginBTN(prop.getProperty("username"),prop.getProperty("password"));
		Assert.assertEquals("You have Logged In successfully.", "You have Logged In successfully.");
	}
	/*@Test(priority = 1)
	public void TestWithBlankCredentials() {
		loginPage=new loginPage(driver);
		loginPage.ClickOnLoginBTN("","");
		
	}
	@Test(priority = 2)
	public void TestWithInvalidCredentials() {
		
		loginPage=new loginPage(driver);
		loginPage.ClickOnLoginBTN("yyy@gmail.com","okok");
		
	}
	
	@Test(priority = 3)
	public void TestInvalidPasswordCredentials() {
		
		loginPage=new loginPage(driver);
		loginPage.ClickOnLoginBTN("lavisharma22@gmail.com","okok");
		
	}
	
	@Test(priority = 4)
	public void TestwithSpecialBothCharacter() {
		
		loginPage=new loginPage(driver);
		loginPage.ClickOnLoginBTN("@#@!","!@#");
		
	}
	
	@Test(priority = 5)
	public void TestwithSpecialPassCharacter() {
		
		loginPage=new loginPage(driver);
		loginPage.ClickOnLoginBTN("lavisharma22@gmail.com","!@#");
		
	}
	
    @Test(priority = 6)
	public void TestwithSpecialEmailCharacter() {
		
    	loginPage=new loginPage(driver);
    	loginPage.ClickOnLoginBTN("!@#","saaregama");
		
	}*/

}
