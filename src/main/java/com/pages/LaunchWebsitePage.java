package com.pages;

import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class LaunchWebsitePage extends Base {
	
	
	public LaunchWebsitePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String Url() {
		return driver.getCurrentUrl();
	}
}
