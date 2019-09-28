package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage () {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='accountInner']")
	private WebElement singnin;
	
	@FindBy(xpath="(//a[@href='https://www.snapdeal.com/login'])[1]")
	private WebElement loginin;
	
	@FindBy(id="userName")
	private WebElement username;
	
	@FindBy(id="checkUser")
	private WebElement cntue;
	
	@FindBy(id="j_password_login_uc")
	private WebElement pass;
		
    @FindBy (name="iframeLogin")
    private WebElement switchframe;
    
    @FindBy (id="submitLoginUC")
    private WebElement finalSubmit;
    

	public WebElement getSingnin() {
		return singnin;
	}

	public WebElement getLoginin() {
		return loginin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}
	public WebElement getCntue() {
		return cntue;
	}

	public WebElement getSwitchframe() {
		return switchframe;
	}

	public WebElement getFinalSubmit() {
		return finalSubmit;
	}

	
	
	
	


	

}
