package com.qa.switchhealth.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.switchhealth.base.BaseTest;
import com.qa.swithhealth.factory.Appconstant;
import com.qa.swithhealth.factory.Excelutility;

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

	@Test(dataProvider = "getcode", priority = 3)
	public void acc(String discount) throws InterruptedException {
		acc.applyCode(discount);

	}
	//excel utility*****************************************
	/*
	 * public String randomcode(){
	 * Random rand=new Random(){
	 * String code="automation"+System.currentTimeMillis()+"@gmail.com"
	 * return code;
	 * }
	 * 
	 * @DataProvider public Object exceldata() { Object
	 * data=Excelutility.getTestData(Appconstant.Sheet_name); return data;
	 * 
	 * }
	 * 
	 * @Test(dataProvider="exceldata"){ public void acc(String discount) {
	 * acc.applyCode(discount); } }
	 */
	
}
