package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser extends Base {

	public WebDriver _driver;
	
	@FindBy(linkText="Login")
	private WebElement lnkLogin;
	
	public Browser(WebDriver driver)
	{
		_driver = driver;
	}
	
	//enum obj
	public BrowserType Type;
	
	public void goToUrl(String url) throws InterruptedException
	{
		_driver.get(url);
		Thread.sleep(5000);
	}
	
	public void maximizeWindow()
	{
		_driver.manage().window().maximize();
	}
	
	public void globalWait()
	{
		_driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
}

