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
	
	@Test(priority=1)
	public void getURL() {
		Assert.assertEquals(home.getURL(), Appconstant.UrlOfHomepage);
	}
	
	@Test(priority=2)
	public void getTitle() {
		Assert.assertEquals(home.getTitle(), Appconstant.TitleOfHomepage);
	}
	
	@Test(priority=3)
	public void totaltest() {
		List<String>l=home.listTest();
		System.out.println(l.size());
	}
	
	@Test(priority=4)
	public void perform() throws InterruptedException {
		home.sel();
		
	}

}
