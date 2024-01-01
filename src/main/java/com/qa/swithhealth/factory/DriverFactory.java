package com.qa.swithhealth.factory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class DriverFactory {
	public static WebDriver driver;
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
	
	public static String getScreenshot() {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png";
		File destination=new File(path);
		try {
			FileHandler.copy(srcFile, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
		
	}
	
	
	/*
	 * public static String getScreenshot1(String tname) throws IOException {
	 * 
	 * String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	 * 
	 * TakesScreenshot takesScreenshot = (TakesScreenshot) driver; File sourceFile =
	 * takesScreenshot.getScreenshotAs(OutputType.FILE);
	 * 
	 * String
	 * targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "
	 * _" + timeStamp + ".png"; File targetFile=new File(targetFilePath);
	 * 
	 * sourceFile.renameTo(targetFile);
	 * 
	 * return targetFilePath;
	 * 
	 * }
	 */
}
