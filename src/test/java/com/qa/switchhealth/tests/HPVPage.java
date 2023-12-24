package com.qa.switchhealth.tests;

import java.time.Duration;

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
	public void addToCart() throws InterruptedException {
		hpv.addtoCart();
		
	}
	
		
		
	
	
	/*
	 * //@Test(priority=7) public void varify() { cart.getTitle();
	 * Assert.assertEquals(cart.checkQty(), Appconstant.ProdQTY);
	 * Assert.assertEquals(cart.checkproduct(), Appconstant.ProdName);
	 * cart.chkBackBtn(); }
	 * 
	 * @Test(priority=8) public void check() throws InterruptedException {
	 * 
	 * acc=cart.checkout();
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] getcode(){ return new Object[][] { {"mkh45"},
	 * {"hgy56"}, {"cdsg56"}}; }
	 * 
	 * @Test(dataProvider="getcode",priority=9) public void acc(String discount)
	 * throws InterruptedException { acc.applyCode(discount);
	 * 
	 * }
	 */
	
	
	

}
