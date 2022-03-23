package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;


public class ManageUsersPage extends Base {

	@FindBy(id = "Userbtn")
	WebElement btnUser;
	
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
	
	@FindBy(id = "saveBtn")
	WebElement btnSave;
	
	@FindBy(id = "txtEmail")
	WebElement emailTxt;
	
	@FindBy(id = "numberBatch")
	WebElement batchNumber;
		
	@FindBy(id = "txtSkill")
	WebElement skillTxt;
	
	@FindBy(id = "txtProgram")
	WebElement programTxt;
	
	@FindBy(id = "btnUnRegUser")
	WebElement unRegUserBtn;
	
	
		
	@FindBy(id = "txtTimeZone")
	WebElement timeZoneTxt;
	
	@FindBy(id = "txtroleUser")
	WebElement userRoleTxt;
	
	@FindBy(id = "txtBatch")
	WebElement batchTxt;
	
	@FindBy(id = "txtPrg")
	WebElement prgTxt;
	
	List<WebElement> row;
	WebElement tablerow;
	
	
	
	public ManageUsersPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnBtnRegUser() {
		
		btnUser.click();
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
   
    
    public void   clickOnTrashIconUnregistered() {
    	    	
    	trashIconUnregistered.click();
    }
    	
  	    
   
  public void  editUsrDetails(String timeZomne, String userRole, String batch, String prg){
	   
		timeZoneTxt.sendKeys(timeZomne);
		userRoleTxt.sendKeys(userRole);
		batchTxt.sendKeys(batch);
		prgTxt.sendKeys(prg);

		btnSave.click();
			
	}
  
  
  public void clickOnUnRegUserBtn() {
	  
	  unRegUserBtn.click();
  }
  
  
  public Integer DeleteRegUserThen() {
		
	  return row.size();

	}
   
  
  public Integer DeleteUnRegUserThen() {
	
	  return row.size();

	}

public String registeredEmail() {
	
	return null;
}

public String registeredBatch() {
	
	return null;
}

public String registeredSkill() {
	
	return null;
}

public String registeredProgram() {
	
	return null;
}

public Object UnregisteredEmail() {
	
	return null;
}

public Object UnregisteredUserName() {
	
	return null;
}

}
	
 
	
 