package org.base;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LibGlobal {

	public static WebDriver driver;
	Alert alert;
	public static WebDriverWait wait;
	public static String filePathName = "C:\\Users\\DELL\\eclipse-workspace\\NewMavenProject\\TestData\\Database.xlsx";
	public static String screenShotPath = "C:\\Users\\DELL\\eclipse-workspace\\NewMavenProject\\Screenshots\\";
	
	public void getDriver(String browser) {
		try {
			if (browser.equalsIgnoreCase(browser)) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\DELL\\eclipse-workspace\\NewMavenProject\\driver\\chromedriverr.exe");
				driver = new ChromeDriver();

			} else if (browser.equalsIgnoreCase(browser)) {
				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\DELL\\eclipse-workspace\\NewMavenProject\\driver\\geckodriver.exe");
				driver = new FirefoxDriver();

			} else {
				System.out.println("Pls enter correct Browser");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void getMaximize() {
		driver.manage().window().maximize();
	}

	public void getURL(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void enterText(WebElement element, String data) {
		try {
			if(element.isDisplayed() && element.isEnabled()) {
			element.sendKeys(data);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void clickButton(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void clear(WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void takeScreenshot(String name) throws IOException {
		try {
			TakesScreenshot tk = (TakesScreenshot) driver;
			File src = tk.getScreenshotAs(OutputType.FILE);
			File desc = new File(screenShotPath+name+".png");
			FileUtils.copyFile(src, desc);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public String getCurrentUrl() {
		String currentUrl = null;
		try {
			currentUrl = driver.getCurrentUrl();

		} catch (Exception e) {
			System.out.println(e);
		}
		return currentUrl;
	}

	public String getPageSource() {
		String pageSource = null;
		try {
			pageSource = driver.getPageSource();
		} catch (Exception e) {
			System.out.println(e);
		}
		return pageSource;
	}

	public String getTitle() {
		String title = null;
		try {
			title = driver.getTitle();

		} catch (Exception e) {
			System.out.println(e);
		}
		return title;
	}

	public void navigateToUrl(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void navigateBack() {
		try {
			driver.navigate().back();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void navigateForward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void refreshPage() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void parentFrame() {
		try {
			driver.switchTo().parentFrame();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void defaultCont() {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void dragAndDrop(WebElement element, WebElement target) {
		try {
			Actions action = new Actions(driver);
			action.dragAndDrop(element, target).perform();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public WebElement locators(String loc, String data) {
		WebElement element = null;
		try {
			if (loc.equalsIgnoreCase("id")) {
				element = driver.findElement(By.id(data));
			} else if (loc.equalsIgnoreCase("name")) {
				element = driver.findElement(By.name(data));
			} else if (loc.equalsIgnoreCase("xpath")) {
				element = driver.findElement(By.xpath(data));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	public String getText(WebElement element) {
		String text = "";
		try {
			text = element.getText();
		} catch (Exception e) {
			System.out.println(e);
		}
		return text;
	}

	public String getAttribute(WebElement element) {
		String attribute = "";
		try {
			attribute = element.getAttribute("value");
		} catch (Exception e) {
			System.out.println(e);
		}
		return attribute;
	}

	public void submit(WebElement element) {
		try {
			element.submit();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void moveToElement(WebElement element) {
		Actions action = new Actions(driver);
		try {
			action.moveToElement(element).perform();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public String simpleAlert() {
		String alertMessage = driver.switchTo().alert().getText();
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println(e);
		}
		return alertMessage;
	}

	public void confirmAlert(String text) {
		try {
			if (text.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().accept();
			} else if (text.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void promptAlert(String data, String text) {
		driver.switchTo().alert().sendKeys(data);
		try {
			if (text.equalsIgnoreCase("ok")) {
				driver.switchTo().alert().accept();
			} else if (text.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			js.executeScript("arguments[0].scrollIntoView(false);", element);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public String getTextByJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String executeScript = "";
		try {
			executeScript = (String) js.executeScript("return arguments[0].innerText", element);
		} catch (Exception e) {
			System.out.println(e);
		}
		return executeScript;
	}

	public String enterTextByJs(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String executeScript = "";
		try {
			executeScript = (String) js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
		} catch (Exception e) {
			System.out.println(e);
		}
		return executeScript;
	}

	public String returnTextByJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String executeScript = "";
		try {
			executeScript = (String) js.executeScript("return arguments[0].getAttribute('value')", element);
		} catch (Exception e) {
			System.out.println(e);
		}
		return executeScript;
	}

	public void clickTextByJs(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			js.executeScript("arguments[0].click()", element);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void dropBySelect(WebElement element, String data, String value) {
		Select s = new Select(element);
		try {
			if (data.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			} else if (data.equalsIgnoreCase("text")) {
				s.selectByVisibleText(value);
			} else if (data.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(value));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public String getExcelData(String sheetName, int rowNum, int colNum) throws IOException {
		String value = "";
		try {
			File file = new File(filePathName);
			FileInputStream inputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(inputStream);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(colNum);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
			} else if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("MMM-dd-yyyy");
				value = dateFormat.format(date);
			} else {
				double cellValue = cell.getNumericCellValue();
				long value1 = (long) cellValue;
				value = String.valueOf(value1);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return value;
	}

	public void moveBtnWindows(String windowName) {
		try {
			driver.switchTo().window(windowName);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void moveBtnWindows(int i) {
		try {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> l = new ArrayList<String>(allWindows);
			driver.switchTo().window(l.get(i));

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public String getCurrentWindowName() {
		String windowName = "";
		try {
			windowName = driver.getWindowHandle();
		} catch (Exception e) {
			System.out.println(e);
		}
		return windowName;
	}

	public void getWebTableValues(List<WebElement> rows) {
		for (WebElement i : rows) {
			List<WebElement> cols = i.findElements(By.tagName("td"));
			for (WebElement x : cols) {
				System.out.println(x.getText());
			}
		}

	}

	public List<WebElement> locatorsFindElements(String loc, String data) {
		List<WebElement> element = null;
		try {
			if (loc.equalsIgnoreCase("id")) {
				element = driver.findElements(By.id(data));
			} else if (loc.equalsIgnoreCase("name")) {
				element = driver.findElements(By.name(data));
			} else if (loc.equalsIgnoreCase("xpath")) {
				element = driver.findElements(By.xpath(data));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return element;
	}

	public void moveBtnFrames(String loc, String data) {
		try {
			if (loc.equalsIgnoreCase("id")) {
				driver.switchTo().frame(data);
			} else if (loc.equalsIgnoreCase("name")) {
				driver.switchTo().frame(data);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void moveBtnFrames(String loc, WebElement element) {
		try {
			if (loc.equalsIgnoreCase("webelement")) {
				driver.switchTo().frame(element);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void moveBtnFrames(String loc, int i) {
		try {
			if (loc.equalsIgnoreCase("index")) {
				driver.switchTo().frame(i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void waitForElementToClick(WebElement element) {
		wait = new WebDriverWait(driver, 40);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void waitForElementToClick(By locator) {
		wait = new WebDriverWait(driver, 40);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void waitForPresenceofElement(By locator) {
		wait = new WebDriverWait(driver, 40);
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public boolean waitTillAlert() {
		wait = new WebDriverWait(driver, 40);
		boolean foundAlert = false;
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			foundAlert = true;
		} catch (Exception e) {
			System.out.println(e);
			foundAlert = false;
		}
		return foundAlert;
	}

	public void waitForElementToAppear(By locator) {
		wait = new WebDriverWait(driver, 40);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void waitForElement(WebElement element) {
		wait = new WebDriverWait(driver, 40);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void writeDataToExcel(String sheetName, int rowNum, int colNum, String value) {
		try {
			File file = new File(filePathName);
			FileInputStream fileInp = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(fileInp);
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			Cell cell = row.getCell(colNum);
			cell.setCellValue(value);
			FileOutputStream fileOut = new FileOutputStream(file);
			workbook.write(fileOut);
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
