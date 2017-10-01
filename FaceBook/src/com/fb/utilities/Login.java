package com.fb.utilities;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	static WebDriver driver;
	public static Properties testdata = null;
	public static Properties object = null;
	
	
	
	
	public static void FBLogin(String username, String password)
	{
		object = LoadProperties.getObject();
		driver = Driver.getDriver();
		driver.get(object.getProperty("FB_URL"));
		driver.findElement(By.xpath(object.getProperty("FB_Username"))).sendKeys(username);
		driver.findElement(By.xpath(object.getProperty("FB_password"))).sendKeys(password);
		driver.findElement(By.xpath(object.getProperty("FB_siginin"))).click();	
	}
}
