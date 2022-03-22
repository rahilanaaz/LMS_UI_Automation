package com.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;

public class AdminAssignmentPage extends Base {
	@FindBy(linkText = "manageSubmissions")
	WebElement manageSubmissionsLink;
	// @FindBy (id = "ManageAssigns") WebElement ManageAssigns;
	@FindBy(id = "AddAssign")
	WebElement addAssign;
	@FindBy(id = "AssignmentBatch")
	WebElement assignBatch;
	@FindBy(xpath = "//button[contains,text()'AssignmentName']")
	WebElement assignName;
	@FindBy(xpath = "//button[contains,text()'AssignmentDesc']")
	WebElement assignDesc;
	@FindBy(xpath = "//button[contains,text()'AssignmentDate']")
	WebElement assignDate;
	@FindBy(xpath = "//a[contains(text()='AssignmentFile1')")
	WebElement uploadFile;
	@FindBy(xpath = "//button[contains,text()'AddAssignSubmit']")
	WebElement submit;
	@FindBy(id = "EditAssignment")
	WebElement editAssignment;
	@FindBy(id = "DelAssignment")
	WebElement delAssignment;
	@FindBy(xpath = "//div[@class='add_assignment']")
	List<WebElement> assignmentElements;
	
	
	private int currentAssignmentCount;
	private String assignmentDescription;

	public AdminAssignmentPage() {
		PageFactory.initElements(driver, this);

	}

	public void manageAssignments() {
		manageSubmissionsLink.click(); // can be replaced with loginpage details

	}

	public void addAssignmentbt() {
		currentAssignmentCount();
		addAssign.click();
	}

	public void currentAssignmentCount() {
		this.currentAssignmentCount = assignmentElements.size();

	}

	public void addAssignments(String batchId, String assignNamestr, String assignDescstr, String assignDate,
			String uploadassign) {
		Select batchNo = new Select(assignBatch);
		batchNo.selectByVisibleText(batchId);
		assignName.sendKeys(assignNamestr);
		assignDesc.sendKeys(assignDescstr);
		uploadFile.sendKeys(uploadassign);

		submit.click();
	}

	public void assertAddAssignments() {
		int assignmentNewCount = assignmentElements.size();
		assertEquals(this.currentAssignmentCount++, assignmentNewCount);
//    			
	}

	public void editAssignmentbt() {
		editAssignment.click();
	}

	public void editAssignments(String batchId, String assignDescstr) {
		Select batchNo = new Select(assignBatch);
		batchNo.selectByVisibleText(batchId);
		assignDesc.sendKeys(assignDescstr);
		this.assignmentDescription = assignDescstr;
		submit.click();
	}

	public void assertEditAssignments() {
		for (int j = 1; j <= assignmentElements.size(); j++) {
			WebElement assignmentRow = assignmentElements.get(j);
			WebElement assignmentDescElement = assignmentRow.findElement(By.xpath("//div[@class='assignment_desc']"));
			if (assignmentDescription.equals(assignmentDescElement.getText())) {
				assertTrue(true);
			
				return;
			}
		}
		assertTrue(false);
	}

	public void deleteAssign() {
		manageSubmissionsLink.click();
		delAssignment.click();
	}

}
