package org.toolsqa;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewProfile extends LibGlobal{
	
	public ViewProfile() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="searchBox")
	private WebElement txtSearchBox;
	
	@FindBy(xpath="//button[text()='Log out']")
	private WebElement btnLogOut;
	
	@FindBy(id="gotoStore")
	private WebElement gotoStore;
	
	@FindBy(xpath="//button[text()='Delete Account']")
	private WebElement btnDelete;
	
	@FindBy(xpath="(//button[text()='Delete All Books'])[1]")
	private WebElement btnDeleteAll;

	public WebElement getTxtSearchBox() {
		return txtSearchBox;
	}

	public WebElement getBtnLogOut() {
		return btnLogOut;
	}

	public WebElement getGotoStore() {
		return gotoStore;
	}

	public WebElement getBtnDelete() {
		return btnDelete;
	}

	public WebElement getBtnDeleteAll() {
		return btnDeleteAll;
	}
	
	
}
