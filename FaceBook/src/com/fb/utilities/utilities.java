package com.fb.utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utilities {
	
	public static void getFBMenu(WebDriver driver, String clickname) throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@id='userNavigationLabel']")).click();
		Thread.sleep(5000);
		List<WebElement> menu = driver.findElements(By.cssSelector(".uiScrollableAreaContent>ul>li a>span"));
		
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
