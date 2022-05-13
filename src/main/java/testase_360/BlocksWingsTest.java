package testase_360;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import pages_360.LoginPage;
import pages_360.BlocksWingsPage;


public class BlocksWingsTest {
	
	@Test (groups = { "sanity" })
	public void BlockTests() throws InterruptedException {
		//launch browser
		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://dev.the360.in/login");
		
		//created page object using page factory
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		//call the method
		login_page.login_to_360("securnyx360@aol.com", "The360@2022");

		
		BlocksWingsPage b_page = PageFactory.initElements(driver, BlocksWingsPage.class);
		b_page.BlocksTest();
	}

	@AfterMethod(alwaysRun = true)
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }
}
