package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class AnswerSecurityPage extends Base {

	public AnswerSecurityPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="UserLoginName") 
	WebElement User;
	
	@FindBy(id="ForgotPassword")
	WebElement ForgotPassword;
	
	@FindBy(id="nextButton")
    WebElement NextButton;
	
	@FindBy(id="answerSecurtiy")
	WebElement ansSecurity; 
	
	public String getUrl() {
		return driver.getCurrentUrl();
	}
	
	public void securityPage(String UserName) {
		
		User.sendKeys(UserName);
		String Answer= ansSecurity.getText();
		NextButton.click();
	}
	
    
}
