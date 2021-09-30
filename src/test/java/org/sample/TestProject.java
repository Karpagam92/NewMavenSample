package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestProject {
	
	public static void main(String[] args) throws AWTException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptops");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebDriverWait w = new WebDriverWait(driver, 10);
		List<WebElement> lapLists = w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")));
		File f = new File("C:\\Users\\DELL\\eclipse-workspace\\NewMavenProject\\TestData\\Database.xlsx");
		FileInputStream fileInp = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fileInp);
		Sheet newSheet = wb.createSheet("Amazon Laptop Lists");
		for (int i = 0; i < lapLists.size(); i++) {
			
			Row row = newSheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(lapLists.get(i).getText());
			
		}
		FileOutputStream fileOut = new FileOutputStream(f);
		wb.write(fileOut);
		System.out.println("Details are entered successfully..");
		
		
		
		
	}

}
