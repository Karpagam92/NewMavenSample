package org.launch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.base.LibGlobal;
import org.locator.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LaunchClass extends LibGlobal{
	public static void main(String[] args) throws IOException, AWTException {
		LibGlobal libGlobal = new LibGlobal();
		libGlobal.getDriver("chrome");
		libGlobal.getURL("http://www.greenstechnologys.com/");
		libGlobal.getMaximize();
		
		WebElement certificationBtn = libGlobal.locators("xpath", "//a[text()='Certifications']");
		libGlobal.clickButton(certificationBtn);
		WebElement seleniumBtn = libGlobal.locators("xpath", "(//a[@href='selenium-course-content.html'])[1]");
		libGlobal.clickButton(seleniumBtn);
		WebElement text = libGlobal.locators("xpath", "//h2[text()='\"Call us for course fees and attractive discounts\"']");
		System.out.println(libGlobal.getText(text));
		WebElement text1 = libGlobal.locators("xpath", "//h2[text()='Selenium Training in Chennai']");
		System.out.println(libGlobal.getText(text1));
		
		
	}

}
