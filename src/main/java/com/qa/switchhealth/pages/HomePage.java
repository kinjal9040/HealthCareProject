package com.qa.switchhealth.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	private By testOptions=(By.xpath("//div[@class='styles__RowContainer-sc-8ig833-3 styles__TestTypeDropdownRow-sc-8ig833-36 bXUkMO kexpTq']"));
	private By sexualHealth=(By.xpath("//a/div[@class='styles__RowContainer-sc-8ig833-3 bXUkMO']"));
	private By sexualHealthButton=(By.xpath("//div[@class='styles__RowContainer-sc-8ig833-3 styles__TestTypeDropdownRow-sc-8ig833-36 bXUkMO kexpTq'][normalize-space()='Sexual Health']"));
	private By mensHealthButton=(By.xpath("//div[@class='styles__ModalContainerContent-sc-8ig833-19 hClevu']//div[2]//img[1]"));
	private By mensHealth=(By.xpath("//a/div[@class='styles__RowContainer-sc-8ig833-3 bXUkMO']"));
	private By acceptCookies=(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
	
	
	public void alert() {
		driver.findElement(acceptCookies).click();
	}
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
	
		
	
	
	public int testDropdown() {
		driver.findElement(test).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		WebElement add1 = wait.until(ExpectedConditions.elementToBeClickable(testOptions));
		List<WebElement>op=driver.findElements(testOptions);
		System.out.println("Total test====>"+op.size());
		int total=op.size();
		return total;
	
		
	}
	
	public int sexualHealthoptions() {
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofMillis(5000));
		wait1.until(ExpectedConditions.elementToBeClickable(sexualHealthButton));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", driver.findElement(sexualHealthButton));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(5000));
		wait.until(ExpectedConditions.elementToBeClickable(sexualHealth));
		List<WebElement>sh=driver.findElements(sexualHealth);
		int totalOptions=sh.size();
		return totalOptions;
		
	}
	
	public int mensHealthoptions() {
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofMillis(5000));
		wait1.until(ExpectedConditions.elementToBeClickable(mensHealthButton));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", driver.findElement(mensHealthButton));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(5000));
		wait.until(ExpectedConditions.elementToBeClickable(mensHealth));
		List<WebElement>sh=driver.findElements(mensHealth);
		int totalOptions=sh.size();
		driver.findElement(test).click();
		return totalOptions;
	}
	
	public boolean signIn() {
		WebElement sign=driver.findElement(By.xpath("//a[normalize-space()='Sign In']"));
		return sign.isEnabled();
	}
	
	public boolean viewAll() {
		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofMillis(5000));
		wait1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='styles__ButtonOval-sc-1u1ro9i-13 djbemp']"))));
		WebElement sign=driver.findElement(By.xpath("//div[@class='styles__ButtonOval-sc-1u1ro9i-13 djbemp']"));
		return sign.isEnabled();
	}
	
	public String supportCenter() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='styles__ButtonBanner-sc-c2dm56-36 cYHrqZ']")).click();
		Thread.sleep(5000);
		String url1=driver.getCurrentUrl();
		Thread.sleep(3000);
		driver.navigate().back();
		return url1;
		
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
	
	

}
