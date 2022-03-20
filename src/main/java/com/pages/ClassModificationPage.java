package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;

public class ClassModificationPage extends Base {
	
	@FindBy (id = "ManageClasses") WebElement ManageClass;
	@FindBy(id = "AddClass") WebElement AddClass;
	@FindBy(id = "Add") WebElement Add;
	@FindBy(id = "ClassTopic") WebElement ClassTopic;
	@FindBy (id = "ClassDate") WebElement ClassDate;
	@FindBy (id = "ClassStaffName") WebElement Staffselect;
	@FindBy(id = "ClassDescription") WebElement ClassDescription;
	@FindBy(id = "Comments") WebElement Classcomments;
	@FindBy(xpath="//button[contains,text()'Submit']") WebElement Submit;
	@FindBy(id = "EditClass") WebElement Edit;
	@FindBy(id = "DelClass")WebElement Delete;
	
	//Initializing th Page Object
	
	
	public ClassModificationPage() {
			PageFactory.initElements(driver,this);
			
		}
	
	public void AddClassGiven () {
		ManageClass.click(); // after homePage created, delete this
		AddClass.click();
		Add.click();
			}
	public void AddClassWhen(String Topic,String Date,String Name,String Descrip,String Details) {
		ClassTopic.sendKeys(Topic);
		ClassDate.sendKeys(Date);
		Select StaffName = new Select(Staffselect);
	    StaffName.selectByVisibleText(Name);
	    ClassDescription.sendKeys(Descrip);
	    Classcomments.sendKeys(Details);
	    Submit.click();
	}
	public String AddClassThen() {
			return ClassTopic.getText();
		}
	
	public void EditClassGiven() {
		ManageClass.click(); // after homePage created, delete this
		Edit.click();
	}
	public void EditClassWhen(String Topic,String Date,String Name,String Descrip,String Details) {
		ClassTopic.clear();
		ClassTopic.sendKeys(Topic);
		ClassDate.sendKeys(Date);
		Select StaffName = new Select(Staffselect);
	    StaffName.selectByVisibleText(Name);
	    ClassDescription.sendKeys(Descrip);
	    Classcomments.sendKeys(Details);
	    Submit.click();
	}
	public String EditClassThen() {
		return ClassTopic.getText();
	}
	
	public void DeleteClassGiven() {
		ManageClass.click();
		
	}
	public void DeleteClassWhen() {
		Delete.click();
	}
	public String DeleteClassThen() {
		return ClassTopic.getText();
	}
	
	
	
	
	
	
	
	
	

}
