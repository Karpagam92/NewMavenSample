package org.launch;
import org.base.LibGlobal;
import org.locator.BookHotel;
import org.locator.BookedItinerary;
import org.locator.HotelConfirmation;
import org.locator.LoginPage;
import org.locator.SearchHotel;
import org.locator.SelectHotel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdactinHotelApp extends LibGlobal {
	
		@BeforeClass
		public void browserLaunch() {
			LibGlobal lib = new LibGlobal();
			lib.getDriver("chrome");
			lib.getURL("http://adactinhotelapp.com/index.php");
			lib.getMaximize();
		}
		
		@Test(priority = 1)
		public void loginPage() {
			LoginPage page = new LoginPage();
			WebElement txtUserName = page.getTxtUserName();
			page.enterText(txtUserName, "Karpagam92");
			WebElement txtPassword = page.getTxtPassword();
			page.enterText(txtPassword, "K1PDIT");
			WebElement btnLogin = page.getBtnLogin();
			page.clickButton(btnLogin);
		}
		@Test(priority = 2)
		public void searchHotel() {
			SearchHotel hotel = new SearchHotel();
			WebElement location = hotel.getLocation();
			hotel.dropBySelect(location, "value", "Melbourne");
			WebElement hotels = hotel.getHotels();
			hotel.dropBySelect(hotels, "value", "Hotel Sunshine");
			WebElement roomType = hotel.getRoomType();
			hotel.dropBySelect(roomType, "value", "Super Deluxe");
			WebElement roomNos = hotel.getRoomNos();
			hotel.dropBySelect(roomNos, "value", "3");
			WebElement dateIn = hotel.getDateIn();
			hotel.enterText(dateIn, "23/08/2020");
			WebElement dateOut = hotel.getDateOut();
			hotel.enterText(dateOut, "24/08/2020");
			WebElement adultRoom = hotel.getAdultRoom();
			hotel.dropBySelect(adultRoom, "value", "2");
			WebElement childRoom = hotel.getChildRoom();
			hotel.dropBySelect(childRoom, "value", "1");
			WebElement submitBtn = hotel.getSubmitBtn();
			clickButton(submitBtn);
		}
		@Test(priority=3)
		public void selectHotel() {
			SelectHotel selectHotel = new SelectHotel();
			WebElement selectRadioBtn = selectHotel.getSelectRadioBtn();
			selectHotel.clickButton(selectRadioBtn);
			WebElement continueBtn = selectHotel.getContinueBtn();
			selectHotel.clickButton(continueBtn);		
		}
		
		@Test(priority=4)
		public void SearchHotel() {
			BookHotel bookHotel = new BookHotel();
			WebElement txtFirstName = bookHotel.getTxtFirstName();
			bookHotel.enterText(txtFirstName, "Jitendraa");
			WebElement txtLastName = bookHotel.getTxtLastName();
			bookHotel.enterText(txtLastName, "Kumaran");
			WebElement address = bookHotel.getAddress();
			bookHotel.enterText(address, "Parakkal Pudur, Kurukkapuram");
			WebElement creditCardNo = bookHotel.getCreditCardNo();
			bookHotel.enterText(creditCardNo, "3456789012342034");
			WebElement creditCardType = bookHotel.getCreditCardType();
			bookHotel.dropBySelect(creditCardType, "value", "VISA");
			WebElement selectMonth = bookHotel.getSelectMonth();
			bookHotel.dropBySelect(selectMonth, "value", "10");
			WebElement selectYear = bookHotel.getSelectYear();
			bookHotel.dropBySelect(selectYear, "value", "2022");
			WebElement cvvNo = bookHotel.getCvvNo();
			bookHotel.enterText(cvvNo, "131");
			WebElement bookNowBtn = bookHotel.getBookNowBtn();
			bookHotel.clickButton(bookNowBtn);
		}
		@Test(priority=5)
		public void hotelConfirm() {
			HotelConfirmation confirmation = new HotelConfirmation();
			WebElement myItineraryBtn = confirmation.getMyItineraryBtn();
			confirmation.waitForElementToAppear(By.xpath("//input[@value='My Itinerary']"));
			confirmation.clickButton(myItineraryBtn);
		}
		@Test(priority=6)
		public void bookedhotels() {
			BookedItinerary booked = new BookedItinerary();
			WebElement cancelItinerary = booked.getCancelItinerary();
			booked.clickButton(cancelItinerary);
			booked.confirmAlert("ok");
			WebElement logoutBtn = booked.getLogoutBtn();
			booked.clickButton(logoutBtn);
		}
		
	}

