package com.qa.switchhealth.tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.switchhealth.base.BaseTest;

public class LoginPage extends BaseTest{
	
	@Test(priority=1)
	public void getTitlePage() {
		String title=login.getTitle();
		System.out.println(title);
		
	}
	
	@Test(priority=2)
	public void getUrlPage() {
		String url=login.getUrl();
		Assert.assertEquals(url, "https://portal.switchhealth.ca/en/login");
	}
	
	@Test(priority=3)
	public void forgotPassword() {
		login.forgotpassword();
	}
	
	@Test(priority=4)
	public void doLogin() throws InterruptedException {
		login.doLogin(prop.getProperty("username"), prop.getProperty("password"),"");
	}

}
