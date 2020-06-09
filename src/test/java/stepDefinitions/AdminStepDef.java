package stepDefinitions;

import org.testng.Assert;

import basePackage.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.AdminPageObj;
import pageObjects.CreateNewUserPageObj;
import pageObjects.LoginPageObj;
import pageObjects.ManageUsersPageObj;

public class AdminStepDef extends TestBase{
	
	LoginPageObj loginPageObj = new LoginPageObj();
	AdminPageObj adminPageObj = new AdminPageObj();
	ManageUsersPageObj manageUsersPageObj = new ManageUsersPageObj();
	CreateNewUserPageObj createNewUserPageObj = new CreateNewUserPageObj();


	@Given("^user on login with admin page$")
	public void user_in_on_login_page() {
		TestBase.initialization();
	  String title = loginPageObj.validateLoginPageTitle();
	  Assert.assertEquals(title, "DaVita-Pilot");
	}
	


	@Then("^Admin home page is displayed")
	public void admin_home_page_is_displayed() {
	   
	}

	@Then("^validate Admin home page title$")
	public void validate_Admin_home_page_title() {
	  
	}

	@Then("click on manage user$")
	public void click_on_manage_user() {
	   
	}

	@Then("^click on new user$")
	public void click_on_new_user() {
	  
	}

	@Then("^create new user$")
	public void create_new_user() {
	   
	}
}
