package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyNow extends BaseClass{
	public BuyNow () {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@data-state='Buy Now']")
	private WebElement buynow;
	

	public WebElement getBuynow() {
		return buynow;
		
		
	}
	
	
	

}
