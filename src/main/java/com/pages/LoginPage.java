package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class LoginPage extends Base{
	@FindBy(id = "Login") WebElement Login;
	@FindBy(id ="UserLoginName") WebElement User;
	@FindBy(id="UserPassword") WebElement userPassInfo;
	@FindBy(id="Submit") WebElement submit;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
		
	public void click(){
		Login.click();
	}
	
	public String validateloginpage(){
		return driver.getTitle();
		
	}
	public HomePage signinpage(String UserName,String Password) {
		User.sendKeys(UserName);
		userPassInfo.sendKeys(Password);
		submit.click();
		
		return new HomePage();
		
	}
}
