package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.TestBase;

public class AdminPageObj extends TestBase{
	
	
	@FindBy(linkText = "Manage Users")
	WebElement ManageUsers;
	
	public AdminPageObj() {
		PageFactory.initElements(driver, this);	
	}
	

	public String verifyManageUsersHomePage() {
		return driver.getTitle();
	}
	
	public ManageUsersPageObj clickOnManageUsers() {
		ManageUsers.click();
		return new ManageUsersPageObj();
		 
	}
	
	

}
