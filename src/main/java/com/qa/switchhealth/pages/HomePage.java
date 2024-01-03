package com.qa.switchhealth.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By test=(By.xpath("//div[@class='styles__ColumnContainer-sc-8ig833-4 cOhypL']//div//button[@class='styles__MenuButton-sc-8ig833-33 fdCNlg']"));
	private By female=(By.xpath("//div[@class='styles__RowContainer-sc-8ig833-3 styles__TestTypeDropdownRow-sc-8ig833-36 bXUkMO kexpTq'][contains(text(),'Women’s Health')]"));
	private By options=(By.xpath("//div[@class='styles__RowContainer-sc-8ig833-3 styles__TestTypeDropdownRow-sc-8ig833-36 bXUkMO kexpTq']"));
	private By select1=(By.xpath("//div[normalize-space()='Human Papillomavirus (HPV)']"));
	private By options1=(By.xpath("//a[@class='styles__TestLink-sc-8ig833-34 gQWxpl']"));
	private By totaltest=(By.xpath("//div[@class='styles__RowContainer-sc-8ig833-3 styles__TestTypeDropdownRow-sc-8ig833-36 bXUkMO kexpTq']"));
	private By alltest=(By.xpath("//div[@class='styles__RowContainer-sc-8ig833-3 styles__TestTypeDropdownRow-sc-8ig833-36 bXUkMO kexpTq'][normalize-space()='View all tests']"));
	
	public String getTitle() {
		String title=driver.getTitle();
		System.out.println("Title of the Page:-"+title);
		return title;
	}
	
	public String getURL() {
		String ul=driver.getCurrentUrl();
		System.out.println("URL of the Page"+ul);
		return ul;
	}
	
	public List<String> listTest(){
		List<WebElement>list1=driver.findElements(By.xpath("//div[@class='styles__RowContainer-sc-8ig833-3 styles__TestTypeDropdownRow-sc-8ig833-36 bXUkMO kexpTq']"));
		List<String>list2=new ArrayList<>();
		for(WebElement i:list1) {
			String text=i.getText();
			list2.add(text);
			System.out.println(text);
		}
		return list2;
		
	}
	
	
	public HPVPage sel() throws InterruptedException {
		Thread.sleep(1000);
		
		driver.findElement(test).click();
		Thread.sleep(1000);
		driver.findElement(female).click();
		Thread.sleep(1000);
		
		driver.findElement(select1).click();
		return new HPVPage(driver);
		
		
	}
	
	public AllTest viewalltest() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(test).click();
		Thread.sleep(2000);
		driver.findElement(alltest).click();
		Thread.sleep(2000);
		return new AllTest(driver);
		
	}
	
	

}
