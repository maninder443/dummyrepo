package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.TestBase;

public class PatientHomePageObjs extends TestBase {
	
	@FindBy(linkText = "Education")
	WebElement clickOnEduTab;
	
	
	
	public PatientHomePageObjs() {
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyPatientHomePage() {
		return driver.getTitle();
	}
	
	public EduHomePageObj clickOnEducation() {
		 clickOnEduTab.click();
		 return new EduHomePageObj();
	}

}
