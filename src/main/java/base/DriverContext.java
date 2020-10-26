package base;

import org.openqa.selenium.WebDriver;

public class DriverContext extends Base{
		public static WebDriver Driver;
		//getting page accessible to all to be used without obj
		public static Browser Browser;
		
		public static void setDriver(WebDriver driver)
		{
			Driver = driver;
		}
} 
