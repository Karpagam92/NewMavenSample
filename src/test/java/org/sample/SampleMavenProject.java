package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleMavenProject {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\NewMavenProject\\TestData\\Database.xlsx");
		FileInputStream fileIp = new FileInputStream(f);
		Workbook workbook = new XSSFWorkbook(fileIp);
		Sheet sheet = workbook.getSheet("Sheet1");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row rows = sheet.getRow(i); 
			for (int j = 0; j < rows.getPhysicalNumberOfCells(); j++) {
				Cell cell = rows.getCell(j);
				int cellType = cell.getCellType();
				if (cellType == 1) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				} 
				else if(DateUtil.isCellDateFormatted(cell))
				{
					Date date = cell.getDateCellValue();
					SimpleDateFormat dd = new SimpleDateFormat("MMM-dd-yyyy");
					String format = dd.format(date);
					System.out.println(format);
						
				}
				else if(cell.getBooleanCellValue())
				{
					
				}
				else
				{
					double cellValue = cell.getNumericCellValue();
					long l = (long) cellValue;
					String numValue = String.valueOf(l);
					System.out.println(numValue);
				}
			}

		}

	}
}
