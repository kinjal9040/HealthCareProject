package com.qa.swithhealth.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {
	public WebDriver driver;
	public Properties prop;
	public OptionsManager optionsmanager;

	/**
	 * this method is used to intializing the driver on the basis of given browser
	 * name
	 * 
	 * @param browserName
	 * @return this method return driver
	 */
	public WebDriver initDriver(Properties prop) {

		optionsmanager = new OptionsManager(prop);
		String browserName = prop.getProperty("browser").toLowerCase().trim();
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver(optionsmanager.getChromeOptions());
		}

		if (browserName.equals("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

		return driver;
	}

	/**
	 * this method is reading the properties from the .properties file
	 * 
	 * @return
	 */
	public Properties initProp() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("./resources/config.properties");
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;

	}

}
