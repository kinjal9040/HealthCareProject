package com.qa.switchhealth.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

import com.qa.switchhealth.pages.SignInPage;
import com.qa.swithhealth.factory.DriverFactory;

public class BaseTest {
	DriverFactory df;
	WebDriver driver;
	protected SignInPage sign;
	@BeforeTest
	public void setup() {
		df=new DriverFactory();
		driver=df.initDriver("chrome");
		sign=new SignInPage(driver);
		
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
