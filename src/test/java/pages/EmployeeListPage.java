package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Base;
import base.BasePage;

public class EmployeeListPage extends BasePage {

	public EmployeeListPage() 
	{
	
	}
	
	@FindBy(linkText="Create New")
	private WebElement lnkCreateNew;
	
	
	
}
