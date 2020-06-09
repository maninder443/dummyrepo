package testCases;

import java.awt.AWTException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basePackage.TestBase;
import pageObjects.AdminPageObj;
import pageObjects.CreateNewUserPageObj;
import pageObjects.EduHomePageObj;
import pageObjects.LoginPageObj;
import pageObjects.ManageUsersPageObj;
import pageObjects.PatientHomePageObjs;

public class AdminLoginTest extends TestBase
{

	LoginPageObj loginPageObj;
	AdminPageObj adminPageObj;
	ManageUsersPageObj manageUsersPageObj;
	CreateNewUserPageObj createNewUserPageObj;
	
	 public AdminLoginTest() {           
		  super(); 
		  }
		 
	 @BeforeSuite
	 public void setUP() {
		initialization();
		loginPageObj = new LoginPageObj();
		adminPageObj =loginPageObj.loginAdmin(prop.getProperty("usernameAdmin"), prop.getProperty("password"));
	    manageUsersPageObj = new ManageUsersPageObj();
		createNewUserPageObj = new CreateNewUserPageObj();
	 }
	 
	 @Test(priority = 1)
	  public void varifyClickOnManageUser()
	  {
		 adminPageObj.clickOnManageUsers();
		 
	  }
	  
	  @Test(priority = 2)
	  public void varifyClickOnNewUser() 
	  {	
		  manageUsersPageObj.clickOnNewUsers();
	  }
	  
	  @Test(priority = 3)
	  public void varifyCreateNewUser() 
	  {	
		  createNewUserPageObj.verifyCreateNewUserPage();
	  }
	  
	  
	  @Test(priority = 4)
	  public void varifyCreateNewForm() throws AWTException 
	  {	
		  createNewUserPageObj.createANewUserForm(
				  prop.getProperty("username"),
				  prop.getProperty("pwd"), 
				  prop.getProperty("retypePassword"),
				  prop.getProperty("fName"),
				  prop.getProperty("LName"),
				  prop.getProperty("dob"),
		//		  prop.getProperty("role"),
				  prop.getProperty("phoneNo"));
	  }
	 
	 @AfterSuite
		public void tearDown() {
			//driver.quit();
	 }

}
