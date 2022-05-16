package testase_360;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import pages_360.VehicleSetupPage;
import pages_360.LoginPage;


public class VehicleSetupTest {
	
	@Test (groups = { "sanity" })
	public void VehicleSetup() throws InterruptedException {
		//launch browser
		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://dev.the360.in/login");
		
		//created page object using page factory
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		//call the method
		login_page.login_to_360("securnyx360@aol.com", "The360@2022");

		
		VehicleSetupPage vehicle_setup_test  = PageFactory.initElements(driver, VehicleSetupPage.class);
		
		vehicle_setup_test.VehicleSetupPageTest();
		
		vehicle_setup_test.VehicleTypeAddTest();
		
		vehicle_setup_test.VehicleTypeFunctionality();

		vehicle_setup_test.VehicleTypeAddTestWithoutOwner();
		
		vehicle_setup_test.VehicleTypeResetButton();
	}
	
	@AfterMethod(alwaysRun = true)
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }

}
