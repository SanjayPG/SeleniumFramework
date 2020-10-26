package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;
import base.BasePage;

public class LoginPage extends BasePage {
	
	public LoginPage() {

	}

	@FindBy(name="UserName")
	private WebElement txtUserName;
	
	@FindBy(name="Password")
	private WebElement txtPassword;
	
	@FindBy(xpath="//input[@class='btn btn-default']")
	private WebElement btnLogin;
	

	public HomePage Login(String uName,String password)
	{
		txtUserName.sendKeys(uName);
		txtPassword.sendKeys(password);	
		return new HomePage();
	}
	
	public void clickLogin()
	{
		btnLogin.submit();
	}
	
}
