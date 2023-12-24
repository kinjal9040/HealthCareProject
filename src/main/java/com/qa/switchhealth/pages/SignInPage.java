package com.qa.switchhealth.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SignInPage {

	private WebDriver driver;

	// constructor
	public SignInPage(WebDriver driver) {
		this.driver = driver;
		
	}

	// private By locators
	private By FirstName = (By.xpath("//input[@id='first_name']"));
	private By LastName = (By.xpath("//input[@id='last_name']"));
	private By Email = (By.xpath("//input[@id='email']"));
	private By ConfirmEmail = (By.xpath("//input[@id='confirm_email']"));
	private By Submit = (By.xpath("//button[normalize-space()='Next']"));
	private By password = (By.xpath("//input[@id='password']"));
	private By confirmPassword = (By.xpath("//input[@id='confirm_password']"));
	private By next = (By.xpath("//button[normalize-space()='Next']"));
	private By search=(By.xpath("//div[@class='sc-hkgtus hKfjwc sc-gnnDb cisVRI']//div[@class=' css-tlfecz-indicatorContainer']"));
	private By address = (By.xpath("//input[@id='react-select-3-input']"));
	private By streetNumber = (By.xpath("//input[@id='street_number']"));
	private By streetName = (By.xpath("//input[@id='route']"));
	private By Apt = (By.xpath("//input[@id='subpremise']"));
	private By Ci = (By.xpath("//input[@id='locality']"));
	private By pro = (By.xpath("//div[contains(text(),'Manitoba')]"));
	private By postalcode = (By.xpath("//input[@id='postal_code']"));
	private By next1 = (By.xpath("//button[normalize-space()='Next']"));
	private By date=(By.xpath("//input[@id='date_of_birth']"));
	private By number=(By.xpath("//input[@id='phone']"));
	private By sex=(By.xpath("//input[@id='react-select-6-input']"));
	private By next2=(By.xpath("//button[normalize-space()='Next']"));
	private By agree=(By.xpath("//div[@class='sc-bdvvtL sc-dwsnSq gMPKmO gDmCbh']//div[1]//button[1]"));
	private By agree2=(By.xpath("//img[@id='policy-accept']"));
	private By agree3=(By.xpath("//img[@id='updateme-accept']"));
	private By register=(By.xpath("//button[normalize-space()='Register']"));
	
	
	

	// methods
	public String getRegistrationPageTitle() {
		String title = driver.getTitle();
		System.out.println("Title of the Page:-" + title);
		return title;
	}

	public String getRegistrationPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("URL of the Page:-" + url);
		return url;
	}

	public void doRegistration(String FN, String LN, String email, String CE) throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(FirstName).sendKeys(FN);
		Thread.sleep(2000);
		driver.findElement(LastName).sendKeys(LN);
		Thread.sleep(2000);
		driver.findElement(Email).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(ConfirmEmail).sendKeys(CE);
		Thread.sleep(2000);
		driver.findElement(Submit).click();
	}

	public void confirmPassoword(String pass, String confirm) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(password).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(confirmPassword).sendKeys(confirm);
		Thread.sleep(2000);
		driver.findElement(next).click();

	}

	public void registrationPro(String add, String apt, String cit) throws InterruptedException {
		driver.findElement(search).click();
		Thread.sleep(1000);
		driver.findElement(address).sendKeys(add);
		Thread.sleep(2000);
		driver.findElement(address).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(address).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(Apt).sendKeys(apt);
		driver.findElement(Ci).clear();
		Thread.sleep(1000);
		driver.findElement(Ci).sendKeys(cit);
		driver.findElement(next1).click();

	}
	
	public void registrationprocesslast(String D, String N,String S) throws InterruptedException {
		
		driver.findElement(date).sendKeys(D);
		Thread.sleep(1000);
		driver.findElement(number).sendKeys(N);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']")).click();
		//Thread.sleep(2000);
		driver.findElement(sex).sendKeys(S);
		Thread.sleep(2000);
		driver.findElement(sex).sendKeys(Keys.ENTER);
		driver.findElement(next2).click();
		
	}
	
	public void registrationAgreement() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(agree).click();
		Thread.sleep(1000);
		driver.findElement(agree2).click();
		Thread.sleep(1000);
		driver.findElement(agree3).click();
		driver.findElement(register).click();
	}

}
