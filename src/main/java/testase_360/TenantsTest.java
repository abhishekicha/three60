package testase_360;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import pages_360.LoginPage;
import pages_360.TenantsPage;

public class TenantsTest {
	
	@Test
	public void Property() throws InterruptedException {
		//launch browser
		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://dev.the360.in/login");
		
		//created page object using page factory
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		//call the method
		login_page.login_to_360("surajbiswas@yopmail.com", "suraj8877");
	
		TenantsPage tPage = PageFactory.initElements(driver, TenantsPage.class);
		
		tPage.tenants_test();
		
		tPage.add_tenants_test();
		
		tPage.add_tenants_test_withoutName();
		
		tPage.add_tenants_test_withoutProperNumber();
		
		tPage.add_tenants_test_withoutkyc();
		
		tPage.tenants_list_test();
		
	}

	@AfterMethod(alwaysRun = true)
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }

}
