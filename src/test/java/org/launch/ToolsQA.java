package org.launch;

import org.base.LibGlobal;
import org.toolsqa.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ToolsQA extends LibGlobal{

	public static void main(String[] args) {
		
		LibGlobal lib = new LibGlobal();
		lib.getDriver("chrome");
		lib.getURL("https://demoqa.com/login");
		lib.getMaximize();
		
		LoginPage page = new LoginPage();
		page.waitForElementToAppear(By.xpath("//input[@id='userName']"));
		WebElement txtUserName = page.getTxtUserName();
		page.enterText(txtUserName, "Karpagam_S");
		WebElement txtPassword = page.getTxtPassword();
		page.enterText(txtPassword, "Jithu$15");
		WebElement btnLogin = page.getLoginBtn();
		page.clickButton(btnLogin);
		
		
	}
}
