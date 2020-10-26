package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import base.BrowserType;

public class ConfigReader {
	
	public static void populateSettings() throws IOException
	{
		ConfigReader reader = new ConfigReader();
		reader.PropertyRead();
	}
	
	
	public void PropertyRead() throws IOException
	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\config\\GlobalConfig.properties");
		p.load(fis);
		Settings.appURL = p.getProperty("AppURL");
		Settings.testDataFile = p.getProperty("TestDataFile");
		Settings.dbConnectionString = p.getProperty("DBConnectionString");
		Settings.driverType = p.getProperty("DriverType");
		Settings.browserType = BrowserType.valueOf(p.getProperty("BrowserType"));
	}

}
