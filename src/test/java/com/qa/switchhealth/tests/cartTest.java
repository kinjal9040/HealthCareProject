package com.qa.switchhealth.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.switchhealth.base.BaseTest;
import com.qa.swithhealth.factory.Appconstant;

public class cartTest extends BaseTest{
	
	@BeforeClass
	public void previous() {
		try {
			hpv=home.sel();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(priority=1)
	public void setuphpv() {
		try {
			cart=hpv.addtoCart();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}


	//@Test(priority=2)
	public void getTitle() {
		Assert.assertEquals(cart.getTitle(), Appconstant.titleOfCart);
	}
	

	//@Test(priority=3)
	public void getURL() {
		Assert.assertEquals(cart.getURL(), Appconstant.urlOfCart);
	}
	

	//@Test(priority=4)
	public void checkQTY() {
		Assert.assertEquals(cart.checkQty(), Appconstant.ProdQTY);
	}
	

	//@Test(priority=5)
	public void checkPro() {
		Assert.assertEquals(cart.checkproduct(), Appconstant.ProdName);
	}
	

	@Test(priority=6)
	public void checkout() {
		cart.checkout();
	}

}
