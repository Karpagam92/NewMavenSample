package org.locator;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary extends LibGlobal {

	public BookedItinerary() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@value='Cancel O2B8WW3G92']")
	private WebElement cancelItinerary;
	
	@FindBy(name="cancelall")
	private WebElement cancelSelected;
	
	@FindBy(id="search_hotel")
	private WebElement searchBtn;
	
	@FindBy(id="logout")
	private WebElement logoutBtn;
	
	@FindBy(id="order_no")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getCancelItinerary() {
		return cancelItinerary;
	}

	public WebElement getCancelSelected() {
		return cancelSelected;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
}
