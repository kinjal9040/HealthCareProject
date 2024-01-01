package com.qa.switchhealth.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.qa.switchhealth.pages.HPVPage;
import com.qa.switchhealth.pages.HomePage;
import com.qa.switchhealth.pages.LoginPage;
import com.qa.switchhealth.pages.SignInPage;
import com.qa.switchhealth.pages.account;
import com.qa.switchhealth.pages.cartPage;
import com.qa.swithhealth.factory.DriverFactory;

public class BaseTest {
	DriverFactory df;
	protected WebDriver driver;
	protected SignInPage sign;
	protected LoginPage login;
	protected HomePage home;
	protected HPVPage hpv;
	protected Properties prop;
	protected cartPage cart;
	protected account acc;
	protected SoftAssert softAssert;
	@BeforeTest
	public void setup() {
		df=new DriverFactory();
		prop=df.initProp();
		driver=df.initDriver(prop);
		sign=new SignInPage(driver);
		login=new LoginPage(driver);
		home=new HomePage(driver);
		hpv=new HPVPage(driver);
		acc=new account(driver);
		
		
	}
	
	//@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
