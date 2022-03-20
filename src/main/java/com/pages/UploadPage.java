package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.Base;

public class UploadPage extends Base{
	
	@FindBy(id = "ManageRecordings") WebElement Recording;
	@FindBy(id = "BatchRecording") WebElement Batch;
	@FindBy(id = "RecordingTopic") WebElement Topic;
	@FindBy(id = "UploadRecording") WebElement UPLOADRecording;
	@FindBy(id = "UploadResources") WebElement UPLOADResources;
	@FindBy(id= "alert") WebElement alert;
	
	public UploadPage() {
		PageFactory.initElements(driver,this);
		
	}
	
	public void UploadRecordingGiven() {
		Recording.click();
		System.out.println("In Manage Recording Page");
			}
	
	public void UploadeRecordingWhen(String BatchId,String Details,String FilePath) {
		Select batch = new Select(Batch);
		batch.selectByVisibleText(BatchId);
		
		Select topic = new Select(Topic);
		topic.selectByVisibleText(Details);
		UPLOADRecording.sendKeys(FilePath);
	}
	
	
	public String CapturetextThen() {
		return alert.getText();
	}
	public void UploadeResourceswhen(String BatchId,String Details,String FilePath) {
		Select batch = new Select(Batch);
		batch.selectByVisibleText(BatchId);
		
		Select topic = new Select(Topic);
		topic.selectByVisibleText(Details);
		UPLOADResources.sendKeys(FilePath);
	}
	
	public void UploadResourceGiven() {
		Recording.click();
		System.out.println("In Manage Recording Page");
			}
}
