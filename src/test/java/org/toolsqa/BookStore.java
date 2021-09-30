package org.toolsqa;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookStore extends LibGlobal {

	public BookStore() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Git Pocket Guide']")
	private WebElement gitPocket;
	
	@FindBy(xpath="//a[text()='Understanding ECMAScript 6']")
	private WebElement eCMAScript;
	
	@FindBy(xpath="//a[text()='Eloquent JavaScript, Second Edition']")
	private WebElement eloquentJs;
	
	@FindBy(xpath="//a[text()='Designing Evolvable Web APIs with ASP.NET']")
	private WebElement evolvableWebAPIs;
	
	@FindBy(xpath="Programming JavaScript Applications")
	private WebElement programmingJs;
	
	@FindBy(xpath="//a[text()='Speaking JavaScript']")
	private WebElement speakingJs;
	
	@FindBy(xpath="//a[text()='Learning JavaScript Design Patterns']")
	private WebElement learningJSDesigns;
	
	@FindBy(id="searchBox")
	private WebElement searchBtn;
	
	@FindBy(xpath="//button[text()='Log out']")
	private WebElement btnLogOut;

	public WebElement getBtnLogOut() {
		return btnLogOut;
	}

	public WebElement getGitPocket() {
		return gitPocket;
	}

	public WebElement geteCMAScript() {
		return eCMAScript;
	}

	public WebElement getEloquentJs() {
		return eloquentJs;
	}

	public WebElement getEvolvableWebAPIs() {
		return evolvableWebAPIs;
	}

	public WebElement getProgrammingJs() {
		return programmingJs;
	}

	public WebElement getSpeakingJs() {
		return speakingJs;
	}

	public WebElement getLearningJSDesigns() {
		return learningJSDesigns;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	
	
}
