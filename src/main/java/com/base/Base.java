package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static ThreadLocal<WebDriver> tdriver;
	public static Properties prop;
	public static String filepath = "./config/config.properties";
	
	public Base()
	{
		prop = new Properties();
		tdriver = new ThreadLocal<WebDriver>();
		
		try {
			FileInputStream FIS = new FileInputStream(filepath);
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
		prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
	
		System.setProperty("webdriver.chrome.driver", filepath);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
		System.setProperty("webdriver.edge.driver",filepath);
		driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
		System.setProperty("webdriver.gecko.driver",filepath);
		driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Constants.getPageLoadTimeOut()));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.getimplicitWait()));
		driver.get(url);
		System.out.println("Hello World");
		System.out.println("Hello Universe");
		
		return getDriver();
		
	}
	
	public static synchronized WebDriver getDriver()
	{
	
		tdriver.set(driver);
		return tdriver.get();
	}

}
