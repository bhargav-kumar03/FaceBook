package FbTest;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.fb.utilities.Driver;
import com.fb.utilities.ExtentReport;
import com.fb.utilities.Login;
import com.fb.utilities.Logout;
import com.fb.utilities.utilities;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FbTest1 {

	static WebDriver driver;
	static ExtentTest logger;

@BeforeTest
public static void init()
{
	ExtentReport.initReport("Login FB");
	logger = ExtentReport.getLogger();
	Driver.openBrowser("chrome");
	logger.log(LogStatus.PASS, "Browser has opened");
	Login.FBLogin("ch.bhargav.kumar@gmail.com", "abcdef");
	logger.log(LogStatus.PASS, "Login to FB is successfull");
}
	
@Test
public static void main() throws InterruptedException
{
	driver = Driver.getDriver();
	Thread.sleep(5000);
}

@AfterMethod
public static void tearDown(ITestResult result) throws Exception
{
	if(!result.isSuccess())
	{
		logger.log(LogStatus.FAIL, "failed test case");
	}
	//Logout.FBLogout(driver);
	utilities.getFBMenu(driver,"Settings");
	ExtentReport.endReport();
	Thread.sleep(3000);
	driver.close();

}
	
}
