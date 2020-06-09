package SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportsBasicDemo {

	private static WebDriver driver;
	public static void main(String[] args) {
		
		 
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./target/extent-reports/extentReport.html");
		
		//Create extent Reports and attached reports
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		// Creating Tests
		ExtentTest test1 = extent.createTest("Davita login test", "This is a test to validate Davita login functionality");
		test1.pass("details");

		/*
		 * // short-hand extent.createTest("MyFirstTest").pass("details");
		 * 
		 * // description extent.createTest("MyFirstTest",
		 * "Test Description").pass("details");
		 */
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\naushad.alam\\eclipse-workspace\\DaVitaCucumberFramework\\exeFiles\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 test1.log(Status.INFO, "Starting Test Cases");
		 driver.get("https://staging-dot-davita-pilot.appspot.com");
		 test1.pass("Navigated to DaVita-Pilot");
		 WebElement loginBttn = driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base']"));
		 loginBttn.click();
		 test1.pass("Successfully Navigated to DaVita-Pilot");
		 driver.quit();
		 test1.pass("Closed the browser");
		 
		test1.info("Test Completed");
		// calling Flush writes everything to the log file
		extent.flush();

	}

}
