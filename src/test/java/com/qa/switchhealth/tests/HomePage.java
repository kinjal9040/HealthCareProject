package com.qa.switchhealth.tests;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.switchhealth.base.BaseTest;
import com.qa.swithhealth.factory.Appconstant;


public class HomePage extends BaseTest{
	
	@Test(priority=0)
	public void handleAlert() {
		home.alert();
	}
	//@Test(priority=0)
	public void getURL() {
		Assert.assertEquals(home.getURL(), Appconstant.UrlOfHomepage);
	}
	
	@Test(priority=1)
	public void getTitle() {
		Assert.assertEquals(home.getTitle(), Appconstant.TitleOfHomepage);
	}
	
		
	//@Test(priority=4)
	public void perform() throws InterruptedException {
		home.sel();
		
	}
	
	@Test(priority=2)
	public void validateTest() {
		Assert.assertEquals(home.testDropdown(), Appconstant.totalOptions);
		
	}
	
	@Test(priority=3)
	public void validateSexualHealth() {
		Assert.assertEquals(home.sexualHealthoptions(), Appconstant.totalSexualHealthOptions);
		
	}
	
	@Test(priority=4)
	public void validatemensHealth() {
		Assert.assertEquals(home.mensHealthoptions(), Appconstant.totalmensHealthOptions);
	}
	
	@Test(priority=5)
	public void validateSign() {
		Assert.assertTrue(home.signIn());
	}
	
	//@Test(priority=6)
	public void validateViewall() {
		Assert.assertTrue(home.viewAll());
	}
	
	@Test(priority=7)
	public void validateSupport() throws InterruptedException {
		Assert.assertEquals(home.supportCenter(), Appconstant.urlOfSupportPage);
	}


}
