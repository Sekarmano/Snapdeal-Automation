package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address extends BaseClass{
	public Address () {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="zip")
	private WebElement pinNo;
	
	@FindBy(id="fullName")
	private WebElement fullName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="nearestLandmark")
	private WebElement landMark;
	
	@FindBy(xpath="(//span[@class='check sd-icon-checkmark'])[1]")
	private WebElement samemob;
	
	@FindBy(xpath="(//span[@class='circle'])[1]")
	private WebElement home;
	
	@FindBy(xpath="(//span[@class='check sd-icon-checkmark'])[2]")
	private WebElement defaculAdd;
	
	@FindBy(xpath="//span[@class='button-text']")
	private WebElement saveCntue;

	public WebElement getPinNo() {
		return pinNo;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getLandMark() {
		return landMark;
	}

	public WebElement getSamemob() {
		return samemob;
	}

	public WebElement getHome() {
		return home;
	}

	public WebElement getDefaculAdd() {
		return defaculAdd;
	}

	public WebElement getSaveCntue() {
		return saveCntue;
	}
	
	
	
	
	

}
