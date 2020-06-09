package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.TestBase;

public class EduHomePageObj extends TestBase{
	
	@FindBy(xpath="//div[@class=\"image-overlay\"]")
	WebElement clickOnVid;
	
	
	public EduHomePageObj() {
		PageFactory.initElements(driver, this);
		
	}
	

	public String verifyPatientHomePage() {
		return driver.getTitle();
	}
	
	public void clickOnVideo() {
		clickOnVid.click();
		 
	}

}
