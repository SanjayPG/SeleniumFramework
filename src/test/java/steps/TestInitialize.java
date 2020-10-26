package steps;

import java.io.IOException;



import base.BrowserType;
import base.DriverContext;
import base.FrameworkInitialize;
import config.ConfigReader;
import config.Settings;
import io.cucumber.java.Before;
import utilities.ExcelUtil;
import utilities.LogUtil;

public class TestInitialize extends FrameworkInitialize {
	
	@Before
	public void Initialize()  throws IOException
	{
		//Initialize Config
		ConfigReader.populateSettings();
//		Connection conn = DatabaseUtil.fnOpen();
//		DatabaseUtil.fnExecuteQuery("select * from Employee", conn);
		try 
		{
			LogUtil log = new LogUtil("LoginTest");					
			InitializeBrowser(BrowserType.Chrome);
			LogUtil.logger.info("Browser Initialized");
			DriverContext.Browser.goToUrl(Settings.appURL);
			LogUtil.logger.info("URL Opened");
			DriverContext.Browser.maximizeWindow();
			DriverContext.Browser.globalWait();
	
			//Initialize excel connection - Calling Constructor of ExcelUtil
			ExcelUtil xlUtil = new ExcelUtil(Settings.testDataFile);
			LogUtil.logger.info("Excel util Initialized");
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
