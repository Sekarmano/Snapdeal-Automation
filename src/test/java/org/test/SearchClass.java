package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SearchClass extends BaseClass{
	public SearchClass () {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="inputValEnter")
	private WebElement searchbar;
	
	@FindBy(xpath="//span[@class='searchTextSpan']")
	private WebElement search;
	
	@FindBy(xpath="//p[@title='boAt Rockerz 255 Neckband Handsfree Wireless Earphones bluetooth headphone With Mic (Black)']")
	private WebElement item;
	
	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getItem() {
		return item;
	}
	
	

}
