package com.qa.switchhealth.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	
	private WebDriver driver;
	
	//constructor
		public SignInPage(WebDriver driver) {
			this.driver=driver;
			return;
		} 
		
	//private By locators
	private By FirstName=(By.xpath("//input[@id='first_name']"));
	private By LastName=(By.xpath("//input[@id='last_name']"));
	private By Email=(By.xpath("//input[@id='email']"));
	private By ConfirmEmail=(By.xpath("//input[@id='confirm_email']"));
	private By Submit=(By.xpath("//button[normalize-space()='Next']"));
	
	//methods
	public String getRegistrationPageTitle() {
		String title=driver.getTitle();
		System.out.println("Title of the Page:-"+title);
		return title;
	}
	
	public String getRegistrationPageURL() {
		String url=driver.getCurrentUrl();
		System.out.println("URL of the Page:-"+url);
		return url;
	}
	
	public void doRegistration(String FN,String LN,String email,String CE) {
		driver.findElement(FirstName).sendKeys(FN);
		driver.findElement(LastName).sendKeys(LN);
		driver.findElement(Email).sendKeys(email);
		driver.findElement(ConfirmEmail).sendKeys(CE);
		driver.findElement(Submit).click();
	}
	
	
	
	
	

}
