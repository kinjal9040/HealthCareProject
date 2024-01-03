package com.qa.switchhealth.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllTest {
	public WebDriver driver;
	
	public AllTest(WebDriver driver) {
		this.driver=driver;
	}
	
	private By sexual=(By.xpath("//div[@class='styles__ButtonOval-sc-1u1ro9i-13 fpAOUU'][normalize-space()='Sexual Health']"));
	private By womens=(By.xpath("//div[contains(text(),'Women’s Health')]"));
	private By mens=(By.xpath("//div[@class='styles__ButtonOval-sc-1u1ro9i-13 fpAOUU'][contains(text(),'Men’s Health')]"));
	private By general=(By.xpath("//div[@class='styles__ButtonOval-sc-1u1ro9i-13 fpAOUU'][normalize-space()='General Health & Wellness']"));
	private By totaltest=(By.xpath("//div[@class='styles__ProductCardContainer-sc-1loucjl-0 diLWfx']"));
	
	public String url() {
		
		String ur=driver.getCurrentUrl();
		System.out.println("current url===>"+ur);
		return ur;
	}
	
	public String title() {
		String ti=driver.getTitle();
		System.out.println("Title of the page===>"+ti);
		return ti;
	}
	
	public int totaltest() {
	 java.util.List<WebElement>tests=driver.findElements(totaltest);
	 System.out.println("Total no of test displayed==>"+tests.size());
	 int total=tests.size();
	 return total;
	}
	
	

}
