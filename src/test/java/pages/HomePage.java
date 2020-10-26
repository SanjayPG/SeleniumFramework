package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Base;
import base.BasePage;

public class HomePage extends BasePage{

	public HomePage() 
	{
		
	}
	
	@FindBy(linkText="Login")
	private WebElement lnkLogin;
	
	@FindBy(linkText="Employee List")
	private WebElement lnkEmpList;
	
	@FindBy(linkText="Hello admin!")
	private WebElement lnkHelloAdmin;
	
	@FindBy(linkText="Employee List")
	private WebElement lnkEmplyeeList;
	
	public LoginPage clickLoginLink()
	{
		lnkLogin.click();
		return new LoginPage();
	}
	
	public boolean verifyURLOpen()
	{
		return lnkLogin.isDisplayed();
	}
	
	
	public String verifyHomePageOpen()
	{
		return lnkHelloAdmin.getText();
	}
	
	public void clickEmployeeList()
	{
		lnkEmplyeeList.click();
	}
		

}
