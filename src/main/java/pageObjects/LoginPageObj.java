package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.TestBase;

public class LoginPageObj extends TestBase{
	

	@FindBy(name = "userType")
	WebElement selectUserType;
	
	@FindBy(xpath="//*[text()=' Patient ']")
	WebElement selectPatient;
	
	@FindBy(xpath="//*[text()=' Admin ']")
	WebElement selectAdmin;
	
	@FindBy(id="mat-input-0")
	WebElement userName;
	
	@FindBy(id="mat-input-1")
	WebElement passwordr;
	
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-raised-button mat-button-base']")
	WebElement loginBttn;
	
	
	@FindBy(xpath = "//img[@alt=\"davita logo\"]")
	WebElement davitaLogo;

	public WebElement un;

	public WebElement pwd;
	
	public LoginPageObj() {
		PageFactory.initElements(driver, this);
		
	}

	//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public boolean validatedavitaLogo(){
			return davitaLogo.isDisplayed();
		}
		
		public PatientHomePageObjs clickOnLogin(){
			loginBttn.click();
			return new PatientHomePageObjs();
		}
		
		       // landing page
		public PatientHomePageObjs loginPatient(String un, String pwd){
		  // this.un=userName; this.pwd=passwordr;
			
		  selectUserType.click();
		  selectPatient.click();
		  
		/*
		 * userName.clear(); userName.sendKeys(un); passwordr.clear();
		 * userName.sendKeys(pwd);
		 */

			loginBttn.click();
			
			return new PatientHomePageObjs();
		}
	
		public AdminPageObj loginAdmin(String un, String pwd){
		
		  this.un=userName; 
		  this.pwd=passwordr;
		 
			selectUserType.click();
			selectAdmin.click();
			userName.clear();
			userName.sendKeys(un);
			passwordr.clear();
			passwordr.sendKeys(pwd);
			loginBttn.click();
			
			return new AdminPageObj();
		}
}
