package com.qa.switchhealth.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class account {
	
	public WebDriver driver;
	
	public account(WebDriver driver) {
		this.driver=driver;
	}
	
	private By code=(By.xpath("//input[@id='checkout_reduction_code']"));
	private By apply=(By.xpath("//button[@id='checkout_submit']"));
	private By email=(By.xpath("//input[@id='checkout_email']"));
	private By firstname=(By.xpath("//input[@id='checkout_shipping_address_first_name']"));
	private By lastname=(By.xpath("//input[@id='checkout_shipping_address_last_name']"));
	private By company=(By.xpath("//input[@id='checkout_shipping_address_company']"));
	private By address=(By.xpath("//input[@id='checkout_shipping_address_address1']"));
	private By apartment=(By.xpath("//input[@id='checkout_shipping_address_address2']"));
	private By city=(By.xpath("//div[@data-address-field='city']//div[@class='field__input-wrapper']"));
	private By postalCode=(By.xpath("//div[@data-address-field='zip']//div[@class='field__input-wrapper']"));
	private By num=(By.xpath("//input[@id='checkout_shipping_address_phone']"));
	private By savethis=(By.xpath("//input[@id='checkout_remember_me']"));
	private By next=(By.xpath("//button[@id='continue_button']"));
	
	
	
	
	
	public void applyCode(String discount) throws InterruptedException {
		driver.findElement(code).sendKeys(discount);
		Thread.sleep(2000);
		driver.findElement(apply).click();
		Thread.sleep(2000);
		driver.findElement(apply).clear();
	}
	
	public String getURL() {
		String url=driver.getCurrentUrl();
		System.out.println("URL of account page==>"+url);
		return url;
	}
	
	public String getTitle() {
		String title=driver.getTitle();
		System.out.println("Title of account Page==>"+title);
		return title;
	}
	
	public int  validateTotal() {
		WebElement Subtotal=driver.findElement(By.xpath("//td[@class='total-line__price']//span[@class='order-summary__emphasis skeleton-while-loading'][normalize-space()='$99.00']"));
		String subtotal=Subtotal.getText();
		subtotal=subtotal.replace("$", "").replace(".", "").trim();
		int total=Integer.parseInt(subtotal);
		System.out.println("subtotal==>"+subtotal);
		
		  WebElement
		  taxes=driver.findElement(By.xpath("//span[normalize-space()='$14.83']"));
		  String T=taxes.getText(); 
		  T=T.replace("$", "").replace(".","").trim();
		  int tax=Integer.parseInt(T);
		  System.out.println("tax===>"+T);
		 
		
		int Total=total +tax;
		System.out.println("Total amount==>"+Total);
		return Total;		
		
		
	}
	
	public String currencyFormate() {
		WebElement type=driver.findElement(By.xpath("//span[@class='payment-due__currency remove-while-loading']"));
		String Currency=type.getText();
		System.out.println("Currency type ===>"+Currency);
		return Currency;
	}
	
	public ShippingPage doEdit(String mail, String FN, String LN, String com, String Address, String apt, String phone) throws InterruptedException {
		driver.findElement(email).sendKeys(mail);
		Thread.sleep(2000);
		driver.findElement(firstname).sendKeys(FN);
		driver.findElement(lastname).sendKeys(LN);
		driver.findElement(company).sendKeys(com);
		driver.findElement(address).sendKeys(Address);
		driver.findElement(address).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(address).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		Thread.sleep(4000);
		
		driver.findElement(apartment).sendKeys(apt);
		Thread.sleep(2000);
		driver.findElement(num).sendKeys(phone);
		driver.findElement(savethis).click();
		driver.findElement(next).click();
		return new ShippingPage(driver);
		
	}
	
	public boolean validateCity() {
		return driver.findElement(city).isEnabled();
	}
	
	public boolean validateProvince() {
		return driver.findElement(city).isEnabled();
	}
	
	public boolean validatePostalCode() {
		return driver.findElement(postalCode).isEnabled();
	}
	

}
