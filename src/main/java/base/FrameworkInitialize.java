package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameworkInitialize extends Base {
	
	public void InitializeBrowser(BrowserType browserType)
	{
		WebDriver driver = null;
		switch(browserType)
		{
			case Chrome:
			{
				WebDriverManager.chromedriver().setup();
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramdas.prabhudesai\\Desktop\\EudemyFramework\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			}
			
			case Firefox:
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\ramdas.prabhudesai\\Desktop\\EudemyFramework\\gickodriver.exe");
				driver = new FirefoxDriver();
				break;
						
		}
		
		//Set the driver using DriverContext static method
		DriverContext.setDriver(driver);
		//Set Browser- gives call to browser constructor
		DriverContext.Browser=new Browser(driver);
	}

}
