package steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utilities.CucumberUtil;
import utilities.LogUtil;

import java.util.*;

import org.testng.Assert;

public class LoginSteps {
	@Given("^I see the application opened$")
    public void i_see_the_application_opened() throws Throwable {
		HomePage home = new HomePage();
		Assert.assertTrue(home.verifyURLOpen());
		LogUtil.logger.info("Home page opened");
    }
	
	 @Then("^I click Login link$")
	    public void i_click_login_link() throws Throwable {
		 HomePage home = new HomePage();
		 home.clickLoginLink();
		 //LogUtil.logger.info("Clicked on login");
	    }
	
	@When("^I enter Username and Password$")
    public void i_enter_username_and_password(DataTable data) throws Throwable {
        //List<List<String>> table = data.asLists();
		//List<Map<String,String>> table = data.asMaps();
        LoginPage login = new LoginPage();
        //login.Login(table.get(0).get("Username"),table.get(0).get("Password"));    
        login.Login(CucumberUtil.getFeatureCellData(data, "Username"),CucumberUtil.getFeatureCellData(data, "Password")); 
    }
	
	@Then("^I click Login buton$")
    public void i_click_login_buton() throws Throwable {
		LoginPage login = new LoginPage();
		login.clickLogin();
    }
	
	@Then("^I should see the hello message on home screen$")
    public void i_should_see_the_hello_message_on_home_page() throws Throwable {
		 HomePage home = new HomePage();
		 Assert.assertEquals("Home Page not opened", home.verifyHomePageOpen(), "Hello admin!");
		 LogUtil.logger.info("Login successfull");
    }

}
