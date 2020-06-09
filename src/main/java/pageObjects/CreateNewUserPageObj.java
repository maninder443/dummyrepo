package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import basePackage.TestBase;

public class CreateNewUserPageObj extends TestBase {
	
	@FindBy(xpath = "//input[@formcontrolname=\"userName\"]")
	WebElement userName;
	
	@FindBy(xpath = "//input[@formcontrolname=\"password\"]")
	WebElement password;
	
	@FindBy(xpath = "//input[@formcontrolname=\"confirmPassword\"]")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@formcontrolname=\"firstName\"]")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@formcontrolname=\"lastName\"]")
	WebElement lastName;
	
	@FindBy(xpath = "//input[@formcontrolname=\"birthDate\"]")
	WebElement birthDate;
	
	@FindBy(xpath = "//select[@formcontrolname=\"roleType\"]")
	WebElement selectRoleType;
	
	@FindBy(xpath = "//input[@formcontrolname=\"phone\"]")
	WebElement phone;
	
	@FindBy(xpath = "//img[@class=\"user-image\"]")
	WebElement selectPhoto;
	
	@FindBy(xpath = "//button[@class=\"save-button\"]")
	WebElement saveButton;
	
	public CreateNewUserPageObj() {
		PageFactory.initElements(driver, this);	
	}
	

	public String verifyCreateNewUserPage() {
		return driver.getTitle();
	}
	

	public void createANewUserForm(
			String username,
			String pwd,
			String retypePassword,
			String fName,
			String LName,
			String dob,
	//		String role,
			String phoneNo
			) throws AWTException{
		userName.sendKeys(username);
		password.sendKeys(pwd);
		confirmPassword.sendKeys(retypePassword);
		
		firstName.sendKeys(fName);
		lastName.sendKeys(LName);
		birthDate.sendKeys(dob);
	//	selectRoleType.sendKeys(role);
		phone.sendKeys(phoneNo);
		selectPhoto.click();
		Select roleType = new Select(selectRoleType);
		roleType.selectByVisibleText("PATIENT");
		
        Robot robot= new Robot();
		
		robot.setAutoDelay(1000);
		StringSelection stringSelection = new StringSelection("C:\\Users\\naushad.alam\\download.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		robot.setAutoDelay(1000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		saveButton.click();
		
	}

}
