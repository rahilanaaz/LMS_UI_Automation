package com.pages;

import java.util.List;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

//import stepdefinitions.PaginationPage;

public class ManagePaginationPage {

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
	
//	public PaginationPage() {
//		
//		SearchContext driver;
//		PageFactory.initElements(driver, this);
	}
	

