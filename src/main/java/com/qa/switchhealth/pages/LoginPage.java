package com.qa.switchhealth.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;
    
	public LoginPage( WebDriver driver) {
		this.driver=driver;
		
	}
	
	private By email=(By.xpath("//input[@id='email']"));
	private By password=(By.xpath("//input[@id='password']"));
	private By login=(By.xpath("//button[normalize-space()='Login']"));
	private By option=(By.xpath("//span[contains(text(),'Send email instead')]"));
	private By otp=(By.xpath("//input[@id='validation_token']"));
	
	
	public String getTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	public String getUrl() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
	
	public void forgotpassword() {
		driver.findElement(By.xpath("//a[contains(text(),'Forgot your password']")).isDisplayed();
	}
	
	public void doLogin(String mail, String pass, String ot) throws InterruptedException {
		driver.findElement(email).sendKeys(mail);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
		Thread.sleep(2000);
		driver.findElement(option).click();
		Thread.sleep(2000);
		driver.findElement(otp).sendKeys(ot);
	}
	
	
	
}
