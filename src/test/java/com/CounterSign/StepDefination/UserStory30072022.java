/*
 * package com.CounterSign.StepDefination;
 * 
 * import org.testng.annotations.Test;
 * 
 * import com.Countersign.AutomationUtils.BaseClass; import
 * com.Countersign.AutomationUtils.PropertiesUtils; import
 * com.Countersign.AutomationUtils.WebInteraction;
 * 
 * public class UserStory30072022 extends BaseClass {
 * 
 * @Test(priority = 1) public static void verifyTheTitleOfCurrentPage() {
 * 
 * 
 * String actualTitle = WebInteraction.getTitle(); String expectedTitle =
 * PropertiesUtils.readProperties("title"); if
 * (actualTitle.equals(expectedTitle)) {
 * logggerUtils.logMessage("Actual Title is same as Expected Title : Actual [" +
 * actualTitle + "] Expected [" + expectedTitle + "]"); } else {
 * 
 * logggerUtils.
 * logErrorMessage("Actual Title is not same as Expected Title : Actual [" +
 * actualTitle + "] Expected [" + expectedTitle + "]"); }
 * 
 * }
 * 
 * @Test(priority = 2) public static void verifyTheUrlOfCurrentPage() {
 * 
 * String actualUrl = WebInteraction.getCurrentUrl(); String expectedUrl =
 * PropertiesUtils.readProperties("url"); if (actualUrl.equals(expectedUrl)) {
 * logggerUtils.logMessage( "Actual URL is same as Expected URL : Actual [" +
 * actualUrl + "] Expected [" + expectedUrl + "]"); } else {
 * 
 * logggerUtils.
 * logErrorMessage("Actual URL is not same as Expected URL : Actual [" +
 * actualUrl + "] Expected [" + expectedUrl + "]"); }
 * 
 * }
 * 
 * @Test(priority = 3) public void closeLoginPopup() {
 * 
 * WebInteraction.clickOnElement(WebInteraction.findElement("xpath",
 * "//button[@class='_2KpZ6l _2doB4z']")); } }
 */