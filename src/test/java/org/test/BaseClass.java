package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	static WebDriver driver;
	
	public static WebDriver launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saravanan\\Desktop\\Selenium Tasks\\Selenium\\Drivers\\chromedriver.exe");
	     driver=new ChromeDriver();
		return driver;
		
	}	
	public static void loadUrl(String url) {
		driver.get(url);
		
	}
	public static void gettitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void getCurrentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
		
	public static  void type(WebElement input, String value) {
		input.sendKeys(value);

	}
	 public static void btnClick(WebElement btn) {
		 btn.click();
		 

	}
	 public static void sbi(WebElement e, int index) {
		 Select s=new Select(e);
		 s.selectByIndex(index);
	 }
	 public static void sbv(WebElement e, String value) {
		 Select s=new Select(e);
		 s.selectByValue(value);;
	 }
	 public static void sbvt(WebElement e, String text) {
		 Select s=new Select(e);
		 s.selectByVisibleText(text);
	 }
	public static void quitBrowser() {
		driver.quit();

	}
	
	public  static void text(WebElement e) {
		System.out.println(e.getText());
	}
		
		public  static void attribute(WebElement e, String value) {
			System.out.println(e.getAttribute(value));
			}
		public static void mve(WebElement e) {
			Actions a=new Actions(driver);
			a.moveToElement(e).perform();
		}
		public static void switchframe(WebElement frameid) {
			driver.switchTo().frame(frameid);
		}
		
		public static void switchWindow(String url) {
			driver.switchTo().window(url);

		}
		public static void windowsId() {
			String h = driver.getWindowHandle();
			Set<String> s = driver.getWindowHandles();
			for (String x : s) {
				if(! h.equalsIgnoreCase(x)) {
					driver.switchTo().window(x);
				}
				
			}
			
		}
		public static String getData(int rowNo,int cellNo) throws IOException{

			File f=new File("C:\\Users\\Saravanan\\Desktop\\Selenium Tasks\\SnapdealAutomation\\Excel\\Mk snapDeals.xlsx");
			FileInputStream stream=new FileInputStream(f);
			Workbook w= new XSSFWorkbook(stream);
			Sheet s = w.getSheet("MK");
			Row r = s.getRow(rowNo);
			Cell c = r.getCell(cellNo);
			int type=c.getCellType();
			String name=null;
			
			if(type==1) {
				name = c.getStringCellValue();
			}
			else if (type==0) {
			name = String.valueOf((long)c.getNumericCellValue());

			
			}
			
			else { if(DateUtil.isCellDateFormatted(c));
			Date d=c.getDateCellValue();
			SimpleDateFormat g=new SimpleDateFormat("dd-MMM-yy");
					name=g.format(d);
								}
			return name;
		}
			
		}

