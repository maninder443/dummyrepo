package testCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basePackage.TestBase;
import pageObjects.EduHomePageObj;
import pageObjects.LoginPageObj;
import pageObjects.PatientHomePageObjs;

public class PatientTest extends TestBase
{

	LoginPageObj loginPageObj;
	PatientHomePageObjs patientHomePageObjs;
    EduHomePageObj eduHomePageObj;
	
	 public PatientTest() {           
		  super(); 
		  }
		 
	 @BeforeSuite
	 public void setUP() throws InterruptedException {
		initialization();
		loginPageObj = new LoginPageObj();
		patientHomePageObjs =loginPageObj.loginPatient(prop.getProperty("usernamePatient"), prop.getProperty("password"));
		eduHomePageObj = new EduHomePageObj();
	 }
	 
	
	/*
	 * @Test(priority = 1) public void loginPageTitleTest() {
	 * 
	 * }
	 */
	  
	  @Test(priority = 1)
	  public void varifyClickOnEducation()
	  {
		  patientHomePageObjs.clickOnEducation();
		 
	  }
	  
	  @Test(priority = 2)
	  public void varifyClickOnVideo() throws InterruptedException
	  {	
		  Thread.sleep(5000);
		  eduHomePageObj.clickOnVideo();
	  }
	 
	 
	 @AfterSuite
		public void tearDown() {
			//driver.quit();
	 }
}


