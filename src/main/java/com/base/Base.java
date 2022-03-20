package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.util.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Base {
	
	public static WebDriver driver;
	public static ThreadLocal<WebDriver> tdriver;
	public static Properties prop;
	
	
	public Base()
	{
		prop = new Properties();
		tdriver = new ThreadLocal<WebDriver>();
		
		try {
			FileInputStream FIS = new FileInputStream("---path");
			prop.load(FIS);
			}
			catch (FileNotFoundException e)
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	
	public static WebDriver initialize(String browserName)
	{
		String url = prop.getProperty("url");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
	
		System.setProperty("webdriver.chrome.driver", "---path");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
		System.setProperty("webdriver.edge.driver","---Path---");
		driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver","---Path---");
		driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.getPageLoadTimeOut()));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.getimplicitWait()));
		driver.get(url);
		return getDriver();
		
	}
	
	public static synchronized WebDriver getDriver()
	{
	
		tdriver.set(driver);
		return tdriver.get();
	}

}
