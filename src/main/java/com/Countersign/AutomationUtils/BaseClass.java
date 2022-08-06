package com.Countersign.AutomationUtils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static WebDriver driver;
	public static LoggerUtils logggerUtils = new LoggerUtils();
	

	public static void setUp() {

		System.setProperty("webdriver.chrome.driver", 
				"C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		logggerUtils.logMessage("Browser Launch successfully");
		driver.manage().window().maximize();

	}

	public static void startApplication() {
		
		driver.get(PropertiesUtils.readProperties("url"));
		logggerUtils.logMessage("User navigates to "+PropertiesUtils.readProperties("url"));
		driver.manage().window().maximize();
	}
	
	public static void tearDown() {

		driver.close();
	}

}
