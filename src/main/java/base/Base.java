package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class Base {
	 
	public Base()
	{
		PageFactory.initElements(DriverContext.Driver, this);
	}

}
