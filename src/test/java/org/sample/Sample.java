package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {

	public static void main(String[] args) throws IOException, InvalidFormatException {

		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\NewMavenProject\\TestData\\Database.xlsx");
		FileInputStream inpStr = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(inpStr);
		Sheet sheet = wb.getSheet("Sheet1");
		int lastRowNum = sheet.getLastRowNum();
		Row row = sheet.createRow(++lastRowNum);
		row.createCell(0).setCellValue(12);
		row.createCell(1).setCellValue("Arun");
		try
		{
		FileOutputStream outStr = new FileOutputStream(f);
		wb.write(outStr);
		outStr.close();
		System.out.println("Row added successfully...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}