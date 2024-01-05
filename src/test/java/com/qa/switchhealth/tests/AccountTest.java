package com.qa.switchhealth.tests;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.switchhealth.base.BaseTest;
import com.qa.swithhealth.factory.Appconstant;

public class AccountTest extends BaseTest {

	@BeforeClass
	public void homePage() {
		try {
			hpv = home.sel();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    @Test(priority=1)
	public void hpv() {
		try {
			cart = hpv.addtoCart();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
    
    @Test(priority=2)
	public void cart() {
		acc = cart.checkout();
	}

	//@DataProvider
	public Object[][] getcode() {
		return new Object[][] { { "mkh45" }, { "hgy56" }, { "cdsg56" } };
	}

	//@Test(dataProvider = "getcode", priority = 3)
	public void acc(String discount) throws InterruptedException {
		acc.applyCode(discount);

	}
    
	@Test(priority=3)
	public void validateTotalAmount() {
		acc.validateTotal();
		Assert.assertEquals(acc.validateTotal(), Appconstant.totalAmount);
		
		
	}
	
	@Test(priority=4)
	public void validateCurrency() {
		Assert.assertEquals(acc.currencyFormate(), Appconstant.currencyFormate);
	}
	
	@Test(priority=5)
	public void doRegister() throws InterruptedException {
		acc.doEdit("patelkinjal9080@gmail.com", "neha", "patel", "webtech", "399 markham road", "1410", "8796786789");
	}
	
	@Test(priority=6)
	public void validateFields() {
		assertFalse(acc.validateCity());
		
	}
	
	@Test(priority=7)
	public void validateFields2() {
		assertFalse(acc.validatePostalCode());
		
	}
	
	@Test(priority=8)
	public void validateFields3() {
		assertFalse(acc.validateProvince());
		
	}
}
