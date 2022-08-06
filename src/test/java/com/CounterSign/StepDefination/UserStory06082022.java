package com.CounterSign.StepDefination;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserStory06082022 {

	@DataProvider(name = "inputValuesForUsername")
	public static String[] inputData() {

		String usernames[] = { "Abc", "Xyz", "Pqr", "Lmn", "Wow" };

		return usernames;
	}

	@Test(dataProvider = "inputValuesForUsername")
	public static void getData(String a) {

		System.out.println("User landed on Login Page");
		System.out.println("User enters username " + a);
		System.out.println("User clicks on Login button");

	}

}
