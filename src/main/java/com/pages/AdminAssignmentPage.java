package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;

public class AdminAssignmentPage extends Base {
	@FindBy (id = "ManageAssigns") WebElement ManageAssigns;
	@FindBy(id = "AddAssign") WebElement AddAssign;
	@FindBy(id = "AssignmentBatch") WebElement AssignBatch ;
	@FindBy(xpath="//button[contains,text()'AssignmentName']") WebElement AssignName ;
	@FindBy(xpath="//button[contains,text()'AssignmentDesc']") WebElement AssignDesc ;
	@FindBy(xpath="//button[contains,text()'AssignmentDate']") WebElement AssignDate ;


	



	public AdminAssignmentPage() {
		PageFactory.initElements(driver,this);
		
	}
	
	public void ManageAssignments () {
		ManageAssigns.click(); //can be replaced with loginpage details
		AddAssign.click();
			}
	

	public void AddAssignments (String batchId, String assignName, String assignDesc , String assignDate, String uploadassign) {
		Select batchNo = new Select(AssignBatch);
		batchNo.selectByVisibleText(batchId);
		AssignName.sendKeys(assignName);
		AssignDesc.sendKeys(assignDesc);
		AssignDate.sendKeys(assignDate);
		

			}
}
