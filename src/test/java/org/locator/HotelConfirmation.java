package org.locator;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelConfirmation extends LibGlobal {

	public HotelConfirmation() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="search_hotel")
	private WebElement searchBtn;
	
	@FindBy(xpath="//input[@value='My Itinerary']")
	private WebElement myItineraryBtn;
	
	@FindBy(id="logout")
	private WebElement logoutBtn;
	
	@FindBy(id="order_no")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getMyItineraryBtn() {
		return myItineraryBtn;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	 
}
