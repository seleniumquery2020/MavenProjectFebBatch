package com.Countersign.AutomationUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {

	public static String readProperties(String key) {

		File file = new File("C:\\CountersignTechnology\\MavenProjectFebBatch\\Files\\GlobalRepo.properties");

		FileInputStream fis = null;

		try {
			fis = new FileInputStream(file);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}

		return prop.getProperty(key);
	}
	
	public static String readObjectRepo(String key) {

		File file = new File("C:\\CountersignTechnology\\MavenProjectFebBatch\\Files\\ObjectRepo.properties");

		FileInputStream fis = null;

		try {
			fis = new FileInputStream(file);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}

		return prop.getProperty(key);
	}
}
