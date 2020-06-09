package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.TestBase;

public class ManageUsersPageObj extends TestBase{
	
	@FindBy(xpath = "//button[@class=\"new-button\"]")
	WebElement createNewUser;
	
	
	public ManageUsersPageObj() {
		PageFactory.initElements(driver, this);	
	}
	

	public String verifyManageUsersPage() {
		return driver.getTitle();
	}
	
	public CreateNewUserPageObj clickOnNewUsers() {
		createNewUser.click();
		return new CreateNewUserPageObj();
		 
	}
	

}
