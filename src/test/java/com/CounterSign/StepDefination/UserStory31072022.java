package com.CounterSign.StepDefination;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Countersign.AutomationUtils.BaseClass;
import com.Countersign.AutomationUtils.PropertiesUtils;
import com.Countersign.AutomationUtils.WebInteraction;

public class UserStory31072022 extends BaseClass {

	@BeforeSuite
	public static void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\CountersignTechnology\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		logggerUtils.logMessage("Browser Launch successfully");
		driver.manage().window().maximize();

	}

	@BeforeTest
	public static void startApplication() {

		driver.get(PropertiesUtils.readProperties("demoUrl"));
		logggerUtils.logMessage("User navigates to " + PropertiesUtils.readProperties("demoUrl"));
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void login() {

		WebElement usernameFld = WebInteraction.findElement(PropertiesUtils.readObjectRepo("usernameFld"));
		WebInteraction.sendText(usernameFld, PropertiesUtils.readProperties("usernamedemo"));
		logggerUtils.logMessage("User enters username in Username field");

		WebElement passwordFld = WebInteraction.findElement(PropertiesUtils.readObjectRepo("passwordFld"));
		WebInteraction.sendText(passwordFld, PropertiesUtils.readProperties("passworddemo"));
		logggerUtils.logMessage("User enters password in Password field");

		WebElement loginBtn = WebInteraction.findElement(PropertiesUtils.readObjectRepo("loginBtn"));
		WebInteraction.clickOnElement(loginBtn);
		logggerUtils.logMessage("User clicks on Login button");

		WebElement dashboardHdr = WebInteraction.findElement(PropertiesUtils.readObjectRepo("dashboardHdr"));
		if (WebInteraction.getText(dashboardHdr).equals(PropertiesUtils.readObjectRepo("dashboardTxt")))
			logggerUtils.logMessage("User navigates to Dashboard Screen");
		else
			logggerUtils.logErrorMessage("User is not navigate to Dashboard Screen");

	}

	@Test(priority = 1)
	public void enterTheDetailsInMyInfoSection() {

		WebInteraction.clickOnElement(WebInteraction.findElement(PropertiesUtils.readObjectRepo("myInfoTab")));
		WebElement personalDetailsHdr = WebInteraction
				.findElement(PropertiesUtils.readObjectRepo("personalDetailsHdr"));
		if (WebInteraction.getText(personalDetailsHdr).equals(PropertiesUtils.readObjectRepo("personalDetailsTxt")))
			logggerUtils.logMessage("User able to see Personal details tab");
		else
			logggerUtils.logErrorMessage("User not able to see Personal details tab");
	}

	@Test(priority = 2)
	public void getAllDetailsTabs() {
		List<WebElement> options = WebInteraction.findElements(PropertiesUtils.readObjectRepo("detailsOption"));
		for (WebElement option : options) {
			WebInteraction.getText(option);
		}
	}
	
	@Test(priority = 3)
	public void addAttachement() throws InterruptedException {
		
		WebInteraction.clickOnElement(WebInteraction.findElement(PropertiesUtils.readObjectRepo("addAttachmentBtn")));
		Thread.sleep(5000);
		
		WebElement chooseFileBtn = WebInteraction.findElement(PropertiesUtils.readObjectRepo("chooseFileFld"));
		
		WebInteraction.sendText(chooseFileBtn,PropertiesUtils.readProperties("uploadFilePath"));
				
		Thread.sleep(5000);
	}

	@AfterClass
	public void logout() throws InterruptedException {

		WebInteraction.clickOnElement(WebInteraction.findElement(PropertiesUtils.readObjectRepo("welcomeUser")));
		Thread.sleep(3000);
		WebInteraction.clickOnElement(WebInteraction.findElement(PropertiesUtils.readObjectRepo("logoutBtn")));
	}

	@AfterTest
	public static void tearDown() {

		driver.close();
	}

}
