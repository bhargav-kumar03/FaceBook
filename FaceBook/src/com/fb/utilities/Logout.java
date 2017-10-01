package com.fb.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {
	
	public static void FBLogout(WebDriver driver) throws Exception
	{
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("._54nh")).click();
	}

}
