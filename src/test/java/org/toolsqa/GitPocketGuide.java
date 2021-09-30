package org.toolsqa;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitPocketGuide extends LibGlobal {

	public GitPocketGuide() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[text()='Log out']")
	private WebElement btnLogOut;
	
	@FindBy(xpath="//label[text()='http://chimera.labs.oreilly.com/books/1230000000561/index.html']")
	private WebElement gitPocket;
	
	@FindBy(xpath="//button[text()='Back To Book Store']")
	private WebElement backBtn;
	
	@FindBy(xpath="//button[text()='Add To Your Collection']")
	private WebElement addcollections;

	public WebElement getBtnLogOut() {
		return btnLogOut;
	}

	public WebElement getGitPocket() {
		return gitPocket;
	}

	public WebElement getBackBtn() {
		return backBtn;
	}

	public WebElement getAddcollections() {
		return addcollections;
	}
	
	

}
