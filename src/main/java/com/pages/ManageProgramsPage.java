package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class ManageProgramsPage extends Base{
	
	@FindBy(id = "btnAddProgram")
	WebElement addProgramBtn;
	
	@FindBy(id = "linkPrograms ")
	WebElement programsLink;
	
	@FindBy(id = "btnEditProgram")
	WebElement editIconLink;
	
	@FindBy(id = "btnDelProgram")
	WebElement trashIconLink;
	
	@FindBy(id = "txtProgramName")
	WebElement programNameTxt;
	
	@FindBy(id = "txtProgramDescription")
	WebElement ProgramDescriptionTxt;
	
	@FindBy(id = "radPrgmActiveStatus")
	WebElement activeRadioBtn;
	
	@FindBy(id = "radPrgmInActiveStatus")
	WebElement inActiveRadioBtn;
	
	@FindBy(id = "btnProgramSubmit")
	WebElement submitBtn;
	
	public ManageProgramsPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnProgramsLink() {
		
		programsLink.click();
	}
	
	public void clickOnAddProgramBtn() {
		
		addProgramBtn.click();
	}
	
	public void addProgram(String progName, String progDesc, String status) {
		
		programNameTxt.sendKeys(progName);
		ProgramDescriptionTxt.sendKeys(progDesc);
		if(status.equalsIgnoreCase("Active")) {
			
			if(!activeRadioBtn.isSelected())
				activeRadioBtn.click();
			}
		
		else if(status.equalsIgnoreCase("InActive")) {
			
			if(!inActiveRadioBtn.isSelected())
				inActiveRadioBtn.click();
			}
		
		submitBtn.click();
	}
	
	public void clickOnEditIconLink() {
		
		editIconLink.click();
	}
	
	public void editProgram(String progName, String progDesc, String progStatus) {
		
		programNameTxt.clear();
		programNameTxt.sendKeys(progName);
		
		ProgramDescriptionTxt.clear();
		ProgramDescriptionTxt.sendKeys(progDesc);
		
        if(progStatus.equalsIgnoreCase("Active")) {
			
			if(!activeRadioBtn.isSelected())
				activeRadioBtn.click();
			}
		
		else if(progStatus.equalsIgnoreCase("InActive")) {
			
			if(!inActiveRadioBtn.isSelected())
				inActiveRadioBtn.click();
			}
		
		submitBtn.click();
	}
	
	public void deleteProgram() {
		
		trashIconLink.click();
	}

	
	
}
