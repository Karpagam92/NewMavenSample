package org.locator;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends LibGlobal{
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement selectRadioBtn;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	@FindBy(id="cancel")
	private WebElement cancelBtn;

	public WebElement getSelectRadioBtn() {
		return selectRadioBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	
	

}
