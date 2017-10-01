package com.fb.utilities;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utilities {
	public static Properties testdata = null;
	public static Properties object = null;
	
	
	public static void getFBMenu(WebDriver driver, String clickname) throws InterruptedException
	{
		object = LoadProperties.getObject();
		driver.findElement(By.xpath(object.getProperty("FB_MenuDropDownButton"))).click();
		Thread.sleep(5000);
		List<WebElement> menu = driver.findElements(By.cssSelector(object.getProperty("FB_MenucssUl")));
		
		for(int i=0; i<menu.size(); i++)
		{
			System.out.println("value of this tag : "+ menu.get(i).getText());
			if(menu.get(i).getText().equals(clickname))
			{
				menu.get(i).click();
			}
		}
	
	}

}
