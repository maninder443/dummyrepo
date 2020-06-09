package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import basePackage.TestBase;
import pageObjects.AdminPageObj;
import pageObjects.LoginPageObj;
import pageObjects.PatientHomePageObjs;

public class LoginPageTest extends TestBase {

	LoginPageObj loginPageObj;
	AdminPageObj patientHomePageObjs;
	AdminPageObj adminPageObj;
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	
	//// for calling of super class of properties files 
	  public LoginPageTest() { 
	  super(); }
	 

	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void setUP() {
		initialization();
		loginPageObj = new LoginPageObj();
		adminPageObj = new AdminPageObj();
		
	//	htmlReporter = new  ExtentHtmlReporter("./target/extent-reports/DaVitaExtentReport.html");
		htmlReporter = new  ExtentHtmlReporter("//C:\\Users\\naushad.alam\\eclipse-workspace\\DaVitaCucumberFramework\\target\\extent-reports\\first.html");
	//C:\Users\naushad.alam\eclipse-workspace\DaVitaCucumberFramework\target\extent-reports	
		  //Create extent Reports and attached reports ExtentReports
		  extent = new ExtentReports(); 
		  extent.attachReporter(htmlReporter);
		 
	}

	@Test(priority = 1)
	public void loginPageTitleTest() throws IOException {
		String title = loginPageObj.validateLoginPageTitle();
		Assert.assertEquals(title, "DaVita-Pilot");

		
		ExtentTest test2 = extent.createTest("Davita login test", "This is a test to validate Davita login functionality");
		test2.pass("details");
		test2.log(Status.INFO, "Starting Test Cases");
//		test2.info("Test Completed");
//		test2.addScreenCaptureFromPath("./target/extent-reports");
	}

	@Test(priority = 2)
	public void daVitaLogoTest() {
		boolean flag = loginPageObj.validatedavitaLogo();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3)
	public void loginTest() {
		patientHomePageObjs = loginPageObj.loginAdmin(prop.getProperty("usernamePatient"), prop.getProperty("password"));

	}

	@AfterSuite
	public void tearDown() {
		//driver.quit();
		// extent.flush();

	}

}
