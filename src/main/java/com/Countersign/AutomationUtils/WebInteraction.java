package com.Countersign.AutomationUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebInteraction {

	static WebDriver driver = BaseClass.driver;
	public static LoggerUtils logggerUtils = new LoggerUtils();

	public static WebElement findElement(String value) {
		String locatorType = value.split(":")[0];
		String locatorValue = value.split(":")[1];
		logggerUtils.logMessage("Using " + locatorType + " with value " + locatorValue + " finding the element");
		WebElement ele = null;

		if (locatorType.equals("id"))
			ele = driver.findElement(By.id(locatorValue));
		else if (locatorType.equals("xpath"))
			ele = driver.findElement(By.xpath(locatorValue));
		else if (locatorType.equals("name"))
			ele = driver.findElement(By.name(locatorValue));
		logggerUtils.logMessage("Webelement Found");
		return ele;
	}

	public static void clickOnElement(WebElement element) {
		element.click();
		logggerUtils.logMessage("User clicks on the Webelement");

	}

	public static void sendText(WebElement element, String text) {

		element.sendKeys(text);

	}

	public static String getCurrentSystemDate() {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		return simpleDateFormat.format(new Date());
	}

	public static Date getDateInDateClass(String source) {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date date;
		try {
			date = simpleDateFormat.parse(source);
		} catch (ParseException e) {
			date = null;
		}
		return date;
	}

	public static String getTitle() {

		logggerUtils.logMessage("Current Page Title : " + driver.getTitle());
		return driver.getTitle();
	}

	public static String getCurrentUrl() {
		logggerUtils.logMessage("Current Page Url : " + driver.getCurrentUrl());
		return driver.getCurrentUrl();
	}

	public static String getText(WebElement element) {
		logggerUtils.logMessage("WebElement Text : " + element.getText());
		return element.getText();
	}
	
	public static List<WebElement> findElements(String value) {
		String locatorType = value.split(":")[0];
		String locatorValue = value.split(":")[1];
		logggerUtils.logMessage("Using " + locatorType + " with value " + locatorValue + " finding the element");
		List<WebElement> ele = null;

		if (locatorType.equals("id"))
			ele = driver.findElements(By.id(locatorValue));
		else if (locatorType.equals("xpath"))
			ele = driver.findElements(By.xpath(locatorValue));
		else if (locatorType.equals("name"))
			ele = driver.findElements(By.name(locatorValue));
		logggerUtils.logMessage("Webelement Found");
		return ele;
	}
}
