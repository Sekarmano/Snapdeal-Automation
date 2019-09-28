package org.test;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.remote.server.handler.SwitchToWindow;

public class MainClass extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		launchBrowser();
		loadUrl("https://www.snapdeal.com/");
		
		LoginPage l=new LoginPage();
		mve(l.getSingnin());
		btnClick(l.getLoginin());
		
		switchframe(l.getSwitchframe());
		Thread.sleep(5000);
		type(l.getUsername(), getData(0,0));
		btnClick(l.getCntue());
		Thread.sleep(5000);
		type(l.getPass(), getData(0,1));
		btnClick(l.getFinalSubmit());
		
		SearchClass s=new SearchClass();
		Thread.sleep(2000);
		type(s.getSearchbar(),getData(0,2));
		Thread.sleep(2000);
		btnClick(s.getSearch());
		btnClick(s.getItem());
		
		
		
		BuyNow b=new BuyNow();
		Thread.sleep(5000);
		String h = driver.getWindowHandle();
		Set<String> p = driver.getWindowHandles();
		for (String x : p) {
			if(!h.equalsIgnoreCase(x)) {
				driver.switchTo().window(x);}}
				btnClick(b.getBuynow());
		
		Address a=new Address();
		type(a.getPinNo(), getData(0, 3));
		type(a.getFullName(), getData(0, 4));
		type(a.getAddress(), getData(0, 5));
		type(a.getLandMark(), getData(0, 6));
//		btnClick(a.getSamemob());
		btnClick(a.getHome());
//		btnClick(a.getDefaculAdd());
		btnClick(a.getSaveCntue());
		
		ProceedtoPayment w =new ProceedtoPayment();
		Thread.sleep(2000);
		btnClick(w.getMakePay());
		
		
		
		
		
		
		
		
		
		
		
	}

}
