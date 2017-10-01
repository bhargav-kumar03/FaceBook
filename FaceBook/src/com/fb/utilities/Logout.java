package com.fb.utilities;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	
	public static Properties testdata = null;
	public static Properties object = null;

	
	public static void FBLogout(WebDriver driver) throws Exception
	{
		object = LoadProperties.getObject();
	
		driver.findElement(By.xpath(object.getProperty("FB_LogoutMenu"))).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(object.getProperty("FB_LogOut"))).click();
	}

}
