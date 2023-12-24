package com.qa.switchhealth.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HPVPage {

	public WebDriver driver;

	public HPVPage(WebDriver driver) {
		this.driver = driver;
	}

	private By add = (By.xpath("//button[normalize-space()='Add to cart']"));
	private By price = (By.xpath(
			"//div[@class='styles__BannerSubTitle-sc-1o2fajc-16 styles__PromotionalPriceLabel-sc-1o2fajc-17 gFzRRs gLCIxS']"));
	private By instructionPage = (By.xpath("//u[contains(text(),'visit our HPV')]"));
	private By educationPage = (By.linkText("visit our HPV Education page"));
	private By age = (By.xpath("(//button[@type='button'])[1]"));
	private By submit = (By.xpath("(//button[normalize-space()='Next'])[1]"));
	private By cervix2 = (By.xpath(
			"//div[@class='flexBox__FlexBox-sc-1muuicf-0 styles__TopRow-sc-1uv0cmz-6 dcZnTd JBotN']//div[2]//button[1]"));
	private By cervix1 = (By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]"));
	private By next = (By.xpath("//button[normalize-space()='Next']"));
	private By pragnant = (By.xpath("//div[@class='flexBox__FlexBox-sc-1muuicf-0 styles__TopRow-sc-1uv0cmz-6 dcZnTd JBotN']//div[2]//button[1]"));
	private By next2 = (By.xpath("//button[normalize-space()='Next']"));
	private By symptomp = (By.xpath("//div[@class='flexBox__FlexBox-sc-1muuicf-0 styles__TopRow-sc-1uv0cmz-6 dcZnTd JBotN']//div[2]//button[1]"));
	private By next3= (By.xpath("//button[normalize-space()='Next']"));
	

	public String getTitle() {
		String title = driver.getTitle();
		System.out.println("Title of the Page:--" + title);
		return title;
	}

	public String getURL() {
		String url = driver.getCurrentUrl();
		System.out.println("URL of the Page:--" + url);
		return url;
	}

	public String price() {
		String pr = driver.findElement(price).getText();
		System.out.println("Price:--" + pr);
		return pr;

	}

	public boolean link1() throws InterruptedException {
//		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000)); // Adjust the timeout as needed
		WebElement l = wait.until(ExpectedConditions.elementToBeClickable(instructionPage));
		return l.isEnabled();

	}

	public boolean link2() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		WebElement l1 = wait.until(ExpectedConditions.elementToBeClickable(educationPage));
		return l1.isEnabled();
	}

	public cartPage addtoCart() throws InterruptedException {
		
		
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		  WebElement add1 = wait.until(ExpectedConditions.elementToBeClickable(add));
		  
		 
		
		
		  driver.findElement(By.xpath("//*[@id=\"onetrust-close-btn-container\"]/button")).click();
			/*
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("javascript:window.scrollBy(250,350)"); Thread.sleep(1000);
			 * driver.findElement(add).click(); Thread.sleep(2000);
			 */
		  JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].click();",add1);
		 

		//JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", driver.findElement(age));

		driver.findElement(submit).click();

		j.executeScript("arguments[0].click();", driver.findElement(cervix2));

		driver.findElement(submit).click();
		j.executeScript("arguments[0].click();", driver.findElement(cervix1));

		driver.findElement(next).click();
		
		
		j.executeScript("arguments[0].click();", driver.findElement(pragnant));

		driver.findElement(next2).click();
		
		j.executeScript("arguments[0].click();", driver.findElement(symptomp));

		driver.findElement(next3).click();
		return new cartPage(driver);
		

	}

	/*
	 * public String checkerrormsg() {
	 * 
	 * WebElement msg = driver.findElement(By.
	 * xpath("//div[@class='error__ErrorBody-sc-g6x2cc-3 cswkGQ']")); String error =
	 * msg.getText(); return error; }
	 */

	
}
