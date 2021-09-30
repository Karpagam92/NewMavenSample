package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectMavenAug {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\NewMavenProject\\TestData\\Database.xlsx");
		FileInputStream inputStr = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputStr);
		Sheet sheet = workbook.getSheet("Sheet2");
		WebElement txtUsername = driver.findElement(By.id("username"));
		WebElement txtPassword = driver.findElement(By.id("password"));
		WebElement txtConfirmPwd = driver.findElement(By.id("re_password"));
		WebElement txtFullName = driver.findElement(By.id("full_name"));
		WebElement txtEmailId = driver.findElement(By.id("email_add"));
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			txtUsername.sendKeys(row.getCell(0).getStringCellValue());
			txtPassword.sendKeys(row.getCell(1).getStringCellValue());
			txtConfirmPwd.sendKeys(row.getCell(2).getStringCellValue());
			txtFullName.sendKeys(row.getCell(3).getStringCellValue());
			txtEmailId.sendKeys(row.getCell(4).getStringCellValue());
			driver.findElement(By.id("tnc_box")).click();
			driver.findElement(By.id("Submit")).click();
			txtUsername.clear();
			txtPassword.clear();
			txtConfirmPwd.clear();
			txtFullName.clear();
			txtEmailId.clear();
		}
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\DELL\\eclipse-workspace\\NewMavenProject\\Screenshots\\test.png");
		FileUtils.copyFile(src, desc);
		
	}
}
