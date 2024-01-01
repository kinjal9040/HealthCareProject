package com.qa.switchhealth.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class account {
	
	public WebDriver driver;
	
	public account(WebDriver driver) {
		this.driver=driver;
	}
	
	private By code=(By.xpath("//input[@id='checkout_reduction_code']"));
	private By apply=(By.xpath("//button[@id='checkout_submit']"));
	
	public boolean applyCode(String discount) throws InterruptedException {
		driver.findElement(code).sendKeys(discount);
		Thread.sleep(2000);
		driver.findElement(apply).click();
		Thread.sleep(2000);
		driver.findElement(code).clear();
		Thread.sleep(2000);
		return false;
	}

}
