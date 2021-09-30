package org.toolsqa;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal{

	public LoginPage() {
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//input[@id='userName']")
	private WebElement txtUserName;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement txtPassword;
	
	@FindBy(xpath="//button[@id='login']")
	private WebElement loginBtn;
	
	@FindBy(id="newUser")
	private WebElement newUserBtn; 

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getNewUserBtn() {
		return newUserBtn;
	}
	
	
}
