package com.qa.switchhealth.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.switchhealth.base.BaseTest;

public class SignInPage extends BaseTest {
	
	@Test(priority=1)
	public void getTitlePage() throws InterruptedException {
		String actual=sign.getRegistrationPageTitle();
		Thread.sleep(2000);
		Assert.assertEquals(actual, "Switch Health - ASMO");
		
		
	}
	
	@Test(priority=2)
	public void getUrl() {
		String actualurl=sign.getRegistrationPageURL();
		Assert.assertEquals(actualurl, "https://portal.switchhealth.ca/en/register");
	}
	
	@Test(priority=3)
	public void doRegistration() throws InterruptedException {
		sign.doRegistration("Neha", "Patel", "nehapatel9040@gmail.com", "nehapatel9040@gmail.com");
	}
	
	@Test(priority=4)
	public void setPassword() throws InterruptedException {
		Thread.sleep(2000);
		sign.confirmPassoword("nehapatel@9040", "nehapatel@9040");
	}
	
	@Test(priority=5)
	public void setadress() throws InterruptedException {
		Thread.sleep(2000);
		sign.registrationPro("399 markham rd, scarborough", "1410", "scarborough");}
	
	@Test(priority=6)
	public void setBirth() throws InterruptedException {
		Thread.sleep(2000);
		sign.registrationprocesslast("19980819", "4387564567", "male");
	}
	@Test(priority=7)
	public void agreement() throws InterruptedException {
		sign.registrationAgreement();
	}

}
