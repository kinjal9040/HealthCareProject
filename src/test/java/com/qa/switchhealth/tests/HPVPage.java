package com.qa.switchhealth.tests;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.switchhealth.base.BaseTest;
import com.qa.swithhealth.factory.Appconstant;

public class HPVPage extends BaseTest {
	
	@BeforeClass
	public void homepage() throws InterruptedException {
		hpv=home.sel();
		
	}
	
	@Test(priority=1)
	public void getTitle() {		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000)); // Adjust the timeout as needed  
        wait.until(ExpectedConditions.titleIs(Appconstant.TitleOfHpv));       
        Assert.assertEquals(hpv.getTitle(), Appconstant.TitleOfHpv);
       
	}
	
	@Test(priority=2)
	public void getURL() throws InterruptedException {
		Assert.assertEquals(hpv.getURL(), Appconstant.urlOfHpv);
	}
	
	@Test(priority=3)
	public void checklink1() throws InterruptedException {
		hpv.link1();
	}
	
	@Test(priority=4)
	public void checklink2() throws InterruptedException {
		hpv.link2();
	}
	
	@Test(priority=5)
	
	public void productInfo() {
		Map<String, String>infoo=hpv.info();
		Assert.assertEquals(infoo.get("Catogary"), Appconstant.catogary);
		Assert.assertEquals(infoo.get("Price"), Appconstant.price);
		
		
	}
	
	@Test(priority=6)
	public void addToCart() throws InterruptedException {
		hpv.addtoCart();
		
	}
	
		
		
	
	
	
	 
	  
	  
	  
	 
	
	
	

}
