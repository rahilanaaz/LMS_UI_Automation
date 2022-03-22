package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;


public class ManageUsersPage extends Base {

	
	@FindBy(id = "btnSearch")
	WebElement searchBtn;
	
	@FindBy(id = "editIcon")
	WebElement iconEdit;
	
	@FindBy(id = "trashIcon")
	WebElement iconTrash;
	
	@FindBy(id = "eyeIcon")
	WebElement iconEye;
	
	@FindBy(id = "userHyperlink")
	WebElement hyperlinkUser;
	
	@FindBy(id = "unregisteredUserEditIcon")
	WebElement editIconUnregisteredUser;
	
	@FindBy(id = "unregisteredTrashIcon")
	WebElement trashIconUnregistered;
	
	@FindBy(id = "txtEmail")
	WebElement emailTxt;
	
	@FindBy(id = "numberBatch")
	WebElement batchNumber;
		
	@FindBy(id = "txtSkill")
	WebElement skillTxt;
	
	@FindBy(id = "txtProgram")
	WebElement programTxt;
	
	
	public ManageUsersPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnbtnSearch(String email, String batch, String skill, String program) {
		
		emailTxt.sendKeys(email);
		batchNumber.sendKeys(batch);
		skillTxt.sendKeys(skill);
		programTxt.sendKeys(program);

		searchBtn.click();
		
	}
	
	
	public void clickOnEditIcon() {
		
		iconEdit.click();
	}
	
		
    public void clickOnTrashIcon() {
		
		iconTrash.click();
	}
	
	
    public void clickOnEyeIcon() {
		
    	iconEye.click();
	}
	
	
    public void  clickOnNewUnassignedUserHyperlink() {
		
    	hyperlinkUser.click();
  	}
   
    public void  clickOnEditIconUnregisteredUser() {
		
    	editIconUnregisteredUser.click();
  	}
   
    
    public void    clickOnTrashIconUnregistered() {
		
    	trashIconUnregistered.click();
  	}
    
//    public void  deleteUsers() {
//		
//    	
//  	}
//   
  
	
 }
