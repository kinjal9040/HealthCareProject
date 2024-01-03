package com.qa.switchhealth.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.switchhealth.base.BaseTest;
import com.qa.swithhealth.factory.Appconstant;

public class AllTestTest extends BaseTest {
	
	@Test
	public void checkURL() throws InterruptedException {
		home.viewalltest();
		Thread.sleep(3000);
		Assert.assertEquals(test.url(), "https://www.switchhealth.ca/tests/all/");
	}
	
	@Test
	public void checkTitle() {
		Assert.assertEquals(test.title(), "All Tests | Switch Health");
	}
	
	@Test
	public void totalTest() {
		Assert.assertEquals(test.totaltest(), Appconstant.totaltest);
	}
	
	

}
