package org.toolsqa;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserPage extends LibGlobal {
	
	public NewUserPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="firstname")
	private WebElement txtFirstName;
	
	@FindBy(id="lastname")
	private WebElement txtLastName;
	
	@FindBy(id="userName")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="register")
	private WebElement btnRegister;
	
	@FindBy(id="gotologin")
	private WebElement backBtn;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnRegister() {
		return btnRegister;
	}

	public WebElement getBackBtn() {
		return backBtn;
	}
	
	

}
