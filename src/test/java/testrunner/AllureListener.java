package testrunner;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.base.Base;
import org.openqa.selenium.TakesScreenshot;
import io.qameta.allure.Attachment;

public class AllureListener extends Base implements ITestListener{
	
	private static String getTestMethodName(ITestResult iTestResult)
	{
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}

	@Attachment(value ="Page screenshot", type="image/png")
	public byte[] saveScreenshotPng(WebDriver driver)
	{
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
	}
	
	@Attachment(value ="{0}", type="text/plain")
	public static String saveTextLog(String message)
	{
		return message;
		
	}
	
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult iTestResult) {
		
	}
		
	
	public void onTestFailure(ITestResult iTestResult) {
		System.out.println("I am in onTestFailure" + getTestMethodName(iTestResult) + "failed");
		Object testClass = iTestResult.getInstance();
		WebDriver driver = Base.getDriver();
		System.out.println("inside the report code"+driver);
		if(driver instanceof WebDriver)
		{
			System.out.println("Screenshot captured"+ getTestMethodName(iTestResult) + "screenshotCaptured");
			saveScreenshotPng(driver);
		}
		saveTextLog(getTestMethodName(iTestResult)+"Failed and screenshot taken");
		
		//***************************TestNg screenshots*********************************************
		String driverN = "";
		String driverName = driver.toString();
		if(driverName.contains("chrome"))
		{
			driverN = "chrome";
		}
		else if(driverName.contains("edge"))
		{
			driverN = "edge";
		}
		else if(driverName.contains("gecko"))
		{
			driverN = "firefox";
		}
			
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("./LMS_UI_Automation/Screenshots"
																	+driverN+getTestMethodName(iTestResult)+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
}
