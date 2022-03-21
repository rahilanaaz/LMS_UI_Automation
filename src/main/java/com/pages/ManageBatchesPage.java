<<<<<<< HEAD
package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class ManageBatchesPage extends Base {
	
	@FindBy(id = "linkBatches")
	WebElement batchesLink;
	
	@FindBy(id = "selBatchProgram")
	WebElement batchProgramDropdown;
	
	@FindBy(id = "btnEditBatch")
	WebElement editIconLink;
	
	@FindBy(id = "btnDelBatch")
	WebElement trashIconLink;
	
	@FindBy(id = "btnAddBatch")
	WebElement addBatchBtn;
	
	@FindBy(id = "txtBatchName")
	WebElement batchNameTxt;
	
	@FindBy(id = "txtBatchDescription")
	WebElement batchDescriptionTxt;
	
	@FindBy(id = "radBatchActiveStatus")
	WebElement activeRadioBtn;
	
	@FindBy(id = "radBatchInActiveStatus")
	WebElement inActiveRadioBtn;
	
	@FindBy(id = "txtBatchNoClasses")
	WebElement batchNoOfClassesTxt;
	
	@FindBy(id = "btnSubmit")
	WebElement submitBtn;
	
	public ManageBatchesPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnBatchesLink() {
		
		batchesLink.click();
	}
	
	public void clickOnAddBatchBtn() {
		
		addBatchBtn.click();
	}
	
	public void clickOnEditBatchIconBtn() {
		
		editIconLink.click();
	}
	
	public void addBatch(String batchName, String batchDesc, String batchStatus, String batchNoOfClasses) {
		
		batchNameTxt.sendKeys(batchName);
		batchDescriptionTxt.sendKeys(batchDesc);
		
		if(batchStatus.equalsIgnoreCase("Active")) {
			
			if(!activeRadioBtn.isSelected())
				activeRadioBtn.click();
		}
		
		else if(batchStatus.equalsIgnoreCase("InActive")) {
			
			if(!inActiveRadioBtn.isSelected())
				inActiveRadioBtn.click();
		}
		
		submitBtn.click();
	}
	
	public void editBatch(String batchName, String batchDesc, String noOfClasses) {
		
		batchNameTxt.clear();
		batchNameTxt.sendKeys(batchName);
		
		batchDescriptionTxt.clear();
		batchDescriptionTxt.sendKeys(batchDesc);
		
		batchNoOfClassesTxt.clear();
		batchNoOfClassesTxt.sendKeys(noOfClasses);
		
		submitBtn.click();
	}
	
	public void deleteBatch() {
		
		trashIconLink.click();
	}
	
	
}
=======
package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class ManageBatchesPage extends Base {
	
	@FindBy(id = "linkBatches")
	WebElement batchesLink;
	
	@FindBy(id = "selBatchProgram")
	WebElement batchProgramDropdown;
	
	@FindBy(id = "btnEditBatch")
	WebElement editIconLink;
	
	@FindBy(id = "btnDelBatch")
	WebElement trashIconLink;
	
	@FindBy(id = "btnAddBatch")
	WebElement addBatchBtn;
	
	@FindBy(id = "txtBatchName")
	WebElement batchNameTxt;
	
	@FindBy(id = "txtBatchDescription")
	WebElement batchDescriptionTxt;
	
	@FindBy(id = "radBatchActiveStatus")
	WebElement activeRadioBtn;
	
	@FindBy(id = "radBatchInActiveStatus")
	WebElement inActiveRadioBtn;
	
	@FindBy(id = "txtBatchNoClasses")
	WebElement batchNoOfClassesTxt;
	
	@FindBy(id = "btnSubmit")
	WebElement submitBtn;
	
	public ManageBatchesPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnBatchesLink() {
		
		batchesLink.click();
	}
	
	public void clickOnAddBatchBtn() {
		
		addBatchBtn.click();
	}
	
	public void clickOnEditBatchIconBtn() {
		
		editIconLink.click();
	}
	
	public void addBatch(String batchName, String batchDesc, String batchStatus, String batchNoOfClasses) {
		
		batchNameTxt.sendKeys(batchName);
		batchDescriptionTxt.sendKeys(batchDesc);
		
		if(batchStatus.equalsIgnoreCase("Active")) {
			
			if(!activeRadioBtn.isSelected())
				activeRadioBtn.click();
		}
		
		else if(batchStatus.equalsIgnoreCase("InActive")) {
			
			if(!inActiveRadioBtn.isSelected())
				inActiveRadioBtn.click();
		}
		
		submitBtn.click();
	}
	
	public void editBatch(String batchName, String batchDesc, String noOfClasses) {
		
		batchNameTxt.clear();
		batchNameTxt.sendKeys(batchName);
		
		batchDescriptionTxt.clear();
		batchDescriptionTxt.sendKeys(batchDesc);
		
		batchNoOfClassesTxt.clear();
		batchNoOfClassesTxt.sendKeys(noOfClasses);
		
		submitBtn.click();
	}
	
	public void deleteBatch() {
		
		trashIconLink.click();
	}
	
	
}
>>>>>>> Branch_Sumathi
