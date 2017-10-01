package com.fb.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {
	
	public static Properties object = null;
	public static Properties getObject() {
		return object;
	}


	public static void setObject(Properties object) {
		LoadProperties.object = object;
	}


	public static Properties getTestdata() {
		return testdata;
	}


	public static void setTestdata(Properties testdata) {
		LoadProperties.testdata = testdata;
	}


	public static Properties testdata = null;
	
	
	public static void main() throws Exception
	{
	     object = new Properties();
		InputStream input = new FileInputStream("D:\\workspace\\FaceBook\\src\\com\\fb\\utilities\\objects.properties");
		object.load(input);
		
		testdata = new Properties();
		InputStream input1 = new FileInputStream("D:\\workspace\\FaceBook\\src\\com\\fb\\utilities\\testdata.properties");
		testdata.load(input1);
	}
	

}
