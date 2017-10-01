package com.fb.utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReport {
	
	static ExtentReports extent;
	static ExtentTest logger;
	
	public static ExtentTest getLogger() {
		return logger;
	}

	public static void setLogger(ExtentTest logger) {
		ExtentReport.logger = logger;
	}

	public static void initReport(String testname)
	{
		
		 extent = new ExtentReports("D:\\workspace\\FaceBook\\report\\report.html");
		 logger = extent.startTest(testname);
	}
	
	public static void endReport()
	{
		extent.endTest(logger);
		extent.flush();
		extent.close();
	}

}
