package com.qa.swithhealth.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
	public WebDriver driver;
	
	public WebDriver initDriver(String browserName) {
		if(browserName.trim().equals("chrome")) {
			driver=new ChromeDriver();
		}
		
		if(browserName.trim().equals("edge")) {
			driver=new EdgeDriver();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://portal.switchhealth.ca/en/register");
		
		return driver;
	}

}
