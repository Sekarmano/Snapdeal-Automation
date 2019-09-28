package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedtoPayment extends BaseClass{
	public ProceedtoPayment () {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="make-payment")
	private WebElement makePay;

	public WebElement getMakePay() {
		return makePay;
	}
	
	
	

}
