package stepDefinitions;

import org.testng.Assert;

import basePackage.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.EduHomePageObj;
import pageObjects.LoginPageObj;
import pageObjects.PatientHomePageObjs;

public class PatientStepDef extends TestBase{
	
	LoginPageObj loginPageObj = new LoginPageObj();
	PatientHomePageObjs patientHomePageObjs = new PatientHomePageObjs();
    EduHomePageObj eduHomePageObj = new EduHomePageObj();
	
	@Given("^user opens browser$")
	public void user_opens_browser() {
		TestBase.initialization();	
	  
	}

	@Then("^user in on login page$")
	public void user_in_on_login_page() {
	  String title = loginPageObj.validateLoginPageTitle();
	  Assert.assertEquals(title, "DaVita-Pilot");
	}

	@Then("^user logs into app$")
	public void user_logs_into_app()  {
		
		loginPageObj.loginPatient(prop.getProperty("usernamePatient"), prop.getProperty("password"));
		
	}


	@Then("^Patient home page is displayed$")
	public void patient_home_page_is_displayed() {
		String patientHomePageTitle=patientHomePageObjs.verifyPatientHomePage();
		Assert.assertEquals(patientHomePageTitle, "DaVita-Pilot");
	}

	@Then("^validate patient home page title$")
	public void validate_patient_home_page_title() {
	   
	}



}
