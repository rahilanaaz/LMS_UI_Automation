package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class LoginPage extends Base{
	
	@FindBy(id = "Login") 
	WebElement Login;
	
	@FindBy(id ="UserLoginName") 
	WebElement User;
	
	@FindBy(id="UserPassword") 
	WebElement userPassInfo;
	
	@FindBy(id="Submit") 
	WebElement submit;
	
	@FindBy(id="Logout")
	WebElement Logout;
	
	@FindBy(id="errorMessage")
	WebElement ErrorMessage;
	
	@FindBy(id="ForgotPassword")
	WebElement ForgotPassword;
	
	
	
	//constructor
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
		//methods  to do actions on objects
	public void loginClick(){
		Login.click();
	}
	
	public String validateLoginPage(){
		return driver.getTitle();
		
	}
	public HomePage signInPage(String UserName,String Password) {
		User.sendKeys(UserName);
		userPassInfo.sendKeys(Password);
		submit.click();
		
		return new HomePage();
	}	
	public boolean isLogoutDisplayed(){
			return Logout.isDisplayed();
		}
	
	public String getUrl() {
		return driver.getCurrentUrl();
	}
		
	public String getInvalidCredentialErrorMessage() {
	  return	ErrorMessage.getText();
	}
	
	public void forgotPasswordClick() {
		//if this button got clicked  ForgotPassword.click()
		//if()
		driver.navigate().to(prop.getProperty("ansSecurityPage"));
		
	
	}
	
}
