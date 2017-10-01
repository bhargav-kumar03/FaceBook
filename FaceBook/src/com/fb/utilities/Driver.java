package com.fb.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	
	static WebDriver driver;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Driver.driver = driver;
	}

	public static void openBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("firefox")) {
        	System.setProperty("webdriver.gecko.driver", ".\\lib\\geckodriver.exe");
    		driver=new FirefoxDriver();
        }
        else if (browserName.toLowerCase().contains("ie")) {
        	System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\lib\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();

        }
        else if (browserName.toLowerCase().contains("chrome")) {
        	System.setProperty("webdriver.chrome.driver", "D:\\workspace\\FrameWork_Selenium\\lib\\chromedriver.exe");
            driver = new ChromeDriver();	
        }
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
    }

}
