package testase_360;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import pages_360.LoginPage;
import pages_360.GuardPetrollingCheckpoint;


public class GuardPetrollingCheckpointTest {
	
	@Test
	public void GuardPetrollingCheckpoint() throws InterruptedException {
		//launch browser
		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://dev.the360.in/login");
		
		//created page object using page factory
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		//call the method
		login_page.login_to_360("surajbiswas@yopmail.com", "suraj8877");
		
		GuardPetrollingCheckpoint gpc = PageFactory.initElements(driver, GuardPetrollingCheckpoint.class);
		
		gpc.guardPetrollingCheckpoint_test();
		
		gpc.checkFunctionality_test();
	}
	
	 @AfterMethod(alwaysRun = true)
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }

}
