package com.CounterSign.StepDefination;

import java.io.PrintWriter;
import java.io.StringWriter;

import com.Countersign.AutomationUtils.BaseClass;

public class DemoTestcase extends BaseClass {

	static String msg;

	public static void exceptionMethod() {

		int arr[] = new int[0];
		arr[0] = 10;
	}

	public static void main(String[] args) {
		
		logggerUtils.logMessage("statement 1");
		try {
			exceptionMethod();
		} catch (ArrayIndexOutOfBoundsException e) {
			StringWriter write = new StringWriter();
			PrintWriter print = new PrintWriter(write);
			e.printStackTrace(print);
			msg = write.toString();
		}
		logggerUtils.logErrorMessage(msg);
		logggerUtils.logMessage("statement 2");
	}
}
