package seleniumtest;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtil;
import utilities.LogUtil;


public class LoginTest  {  //extends TestInitialize

	@Test
	public void Login()
	{
		LogUtil.logger.info("Inside Login Test");
		HomePage home = new HomePage();
		//Concept of page navigation is used  here. Object of class is returned from navigation point
		LoginPage loginPage = home.clickLoginLink();
		//LoginPage login = new LoginPage();
		//loginPage.Login("admin", "password");
		loginPage.Login(ExcelUtil.ReadCell("UserName",1), ExcelUtil.ReadCell("Password",1));
		
	}
	
	

}
