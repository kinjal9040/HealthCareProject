package com.qa.switchhealth.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cartPage {
	public WebDriver driver;

	public cartPage(WebDriver driver) {
		this.driver = driver;
	}

	private By Qnt = (By.xpath(
			"//div[@class='styles__DesktopContent-sc-avgyh7-32 koiJfr']//div//div[@class='styles__BannerSubTitle-sc-avgyh7-24 bgjQbn'][normalize-space()='2']"));
	private By prodName = (By.xpath(
			"//div[@class='styles__ResponsiveRow-sc-4ebs9h-59 euAbcd']//div//div[@class='styles__BannerSubTitle-sc-avgyh7-24 bgjQbn'][normalize-space()='HPV Collection Kit']"));
	private By checkout = (By.xpath(
			"//div[@class='styles__RowContainer-sc-avgyh7-2 ghluKr']//img[@class='styles__ArrowImgLeft-sc-avgyh7-17 jcGAIh']"));
	private By back = (By.xpath(
			"//div[@class='styles__RowContainer-sc-avgyh7-2 ghluKr']//button[@role='button'][normalize-space()='Back']"));

	public String getTitle() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public String getURL() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}

	public Boolean chkBackBtn() {

		return driver.findElement(back).isDisplayed();
	}

	public String checkQty() {
		WebElement q = driver.findElement(Qnt);
		String qt = q.getText();
		System.out.println("Total QTY of product:-" + q.getText());
		return qt;
	}

	public String checkproduct() {

		WebElement p = driver.findElement(prodName);
		String pr = p.getText();
		System.out.println("Name of Product:-" + p.getText());
		return pr;
	}

	public account checkout() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(checkout).click();
		return new account(driver);

	}

}
