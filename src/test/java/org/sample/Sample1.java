package org.sample;

import java.io.IOException;
import java.util.Date;
import org.base.LibGlobal;
import org.locator.BookHotel;
import org.locator.HotelConfirmation;
import org.locator.LoginPage;
import org.locator.SearchHotel;
import org.locator.SelectHotel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample1 extends LibGlobal {
	
	static LibGlobal global;
	@BeforeClass
	public static void beforeClass() {
		global = new LibGlobal();
		global.getDriver("chrome");
		global.getURL("http://adactinhotelapp.com/");
		global.getMaximize();
	}
	

	@Test(priority = 1)
	public void login() throws IOException {
		LoginPage page = new LoginPage();
		WebElement txtUserName = page.getTxtUserName();
		enterText(txtUserName, global.getExcelData("LoginData", 1, 0));
		WebElement txtPassword = page.getTxtPassword();
		enterText(txtPassword, global.getExcelData("LoginData", 1, 1));
		WebElement btnLogin = page.getBtnLogin();
		clickButton(btnLogin);
	}
	@Test(priority = 2)
	public void searchPage() throws IOException {
		SearchHotel hotel = new SearchHotel();
		WebElement location = hotel.getLocation();
		dropBySelect(location, "value", "Sydney");
		WebElement hotels = hotel.getHotels();
		dropBySelect(hotels, "value", "Hotel Cornice");
		WebElement roomType = hotel.getRoomType();
		dropBySelect(roomType, "value", "Standard");
		WebElement roomNos = hotel.getRoomNos();
		dropBySelect(roomNos, "value", "5");
		WebElement dateIn = hotel.getDateIn();
		enterText(dateIn, global.getExcelData("Search Hotel", 1, 4));
		WebElement dateOut = hotel.getDateOut();
		enterText(dateOut, global.getExcelData("Search Hotel", 1, 5));
		WebElement adultRoom = hotel.getAdultRoom();
		dropBySelect(adultRoom, "value", "2");
		WebElement childRoom = hotel.getChildRoom();
		dropBySelect(childRoom, "value", "1");
		WebElement submitBtn = hotel.getSubmitBtn();
		clickButton(submitBtn);
	}
	@Test(priority = 3)
	public void selectPage() {
		SelectHotel selectHotel = new SelectHotel();
		WebElement selectRadioBtn = selectHotel.getSelectRadioBtn();
		clickButton(selectRadioBtn);
		WebElement continueBtn = selectHotel.getContinueBtn();
		clickButton(continueBtn);
	}
	@Test(priority = 4)
	public void bookhotel() throws IOException {
		BookHotel bookHotel = new BookHotel();
		WebElement txtFirstName = bookHotel.getTxtFirstName();
		enterText(txtFirstName, global.getExcelData("Book Hotel", 6, 0));
		WebElement txtLastName = bookHotel.getTxtLastName();
		enterText(txtLastName, global.getExcelData("Book Hotel", 6, 1));
		WebElement address = bookHotel.getAddress();
		enterText(address, global.getExcelData("Book Hotel", 6, 2));
		WebElement creditCardNo = bookHotel.getCreditCardNo();
		enterText(creditCardNo, global.getExcelData("Book Hotel", 6, 3));
		WebElement creditCardType = bookHotel.getCreditCardType();
		dropBySelect(creditCardType, "value", "VISA");
		WebElement selectMonth = bookHotel.getSelectMonth();
		dropBySelect(selectMonth, "value", "10");
		WebElement selectYear = bookHotel.getSelectYear();
		dropBySelect(selectYear, "value", "2022");
		WebElement cvvNo = bookHotel.getCvvNo();
		enterText(cvvNo, global.getExcelData("Book Hotel", 2, 7));
		WebElement bookNowBtn = bookHotel.getBookNowBtn();
		clickButton(bookNowBtn);
	}
	@Test(priority = 5)
	public void hotelconfirm() {
		HotelConfirmation confirmation = new HotelConfirmation();	
		waitForPresenceofElement(By.xpath("//input[@value='My Itinerary']"));
		WebElement orderNo = confirmation.getOrderNo();
		System.out.println("Order Id is : "+getAttribute(orderNo));
		WebElement myItineraryBtn = confirmation.getMyItineraryBtn();
		clickButton(myItineraryBtn);
		waitForPresenceofElement(By.name("cancelall"));
		WebElement logoutBtn = confirmation.getLogoutBtn();
		clickButton(logoutBtn);
	}
	@AfterMethod
	public void afterMethod() {
		Date date = new Date();
		System.out.println(date);
	}
}
 