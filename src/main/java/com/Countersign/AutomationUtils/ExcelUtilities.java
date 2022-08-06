package com.Countersign.AutomationUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {

	static File file;
	static XSSFWorkbook workbook;
	static Sheet sheet;

	public static int getLastRow() {

		file = new File("C:\\CountersignTechnology\\MavenProjectFebBatch\\Files\\TestData.xlsx");

		try {
			workbook = new XSSFWorkbook(file);
		} catch (InvalidFormatException | IOException e) {
			System.err.println("File Not Found");
		}

		sheet = workbook.getSheetAt(0);

		int row = sheet.getLastRowNum();
		System.out.println("Row Count : " + row);
		return row;
	}

	public static int getCellCount() {

		file = new File("C:\\CountersignTechnology\\MavenProjectFebBatch\\Files\\TestData.xlsx");

		try {
			workbook = new XSSFWorkbook(file);
		} catch (InvalidFormatException | IOException e) {
			System.err.println("File Not Found");
		}

		sheet = workbook.getSheetAt(0);

		int col = sheet.getRow(0).getLastCellNum();
		System.out.println("Cell Count : " + col);

		return col;
	}

	public static String getExcelData(int row, int cell) {

		file = new File("C:\\CountersignTechnology\\MavenProjectFebBatch\\Files\\TestData.xlsx");

		try {
			workbook = new XSSFWorkbook(file);
		} catch (InvalidFormatException | IOException e) {
			System.err.println("File Not Found");
		}

		sheet = workbook.getSheetAt(0); // sheet = workbook.getSheet("UserDetails");
		DataFormatter formatter = new DataFormatter();
		String value = formatter.formatCellValue(sheet.getRow(row).getCell(cell));
		System.out.println(value);
		return value;
	}

	public static void main(String[] args) {

		getExcelData(5, 2);

	}

}
