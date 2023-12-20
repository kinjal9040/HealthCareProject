package com.qa.switchhealth.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.switchhealth.base.BaseTest;

public class SignInPage extends BaseTest {
	
	@Test
	public void getTitlePage() {
		String actual=sign.getRegistrationPageTitle();
		Assert.assertEquals(actual, "Switch Health - ASMO");
		
		
	}
	
	@Test
	public void getUrl() {
		String actualurl=sign.getRegistrationPageURL();
		Assert.assertEquals(actualurl, "https://portal.switchhealth.ca/en/register");
	}
	
	public void doRegistration() {
		sign.doRegistration("Neha", "Patel", "nehapatel9040@gmail.com", "nehapatel9040@gmail.com");
	}

}
