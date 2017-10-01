package com.fb.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	static WebDriver driver;
	
	public static void FBLogin(String username, String password)
	{
		driver = Driver.getDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();	
	}
}
