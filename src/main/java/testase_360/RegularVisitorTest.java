package testase_360;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BrowserFactory;
import pages_360.LoginPage;
import pages_360.ReguarVisitorLog;

public class RegularVisitorTest {
	

	@Test(priority=1)
	public void RegularVisitors() throws InterruptedException {
		//launch browser
		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://dev.the360.in/login");
		
		//created page object using page factory
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		//call the method
		login_page.login_to_360("surajbiswas@yopmail.com", "suraj8877");
	
		ReguarVisitorLog rVL = PageFactory.initElements(driver, ReguarVisitorLog.class);
		
		rVL.regular_visitors_log_test();
		
		
	}
	
	@Test(priority=2)
	public void RegularVisitorsSort() throws InterruptedException {
		//launch browser
		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://dev.the360.in/login");
		
		//created page object using page factory
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		//call the method
		login_page.login_to_360("surajbiswas@yopmail.com", "suraj8877");
	
		ReguarVisitorLog rVL = PageFactory.initElements(driver, ReguarVisitorLog.class);
		
		rVL.regular_visitors_log_test();

		rVL.regular_visitors_sort_test();
		
	}
	
	@Test(priority=3)
	public void RegularVisitorsSearch() throws InterruptedException {
		//launch browser
		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://dev.the360.in/login");
		
		//created page object using page factory
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		//call the method
		login_page.login_to_360("surajbiswas@yopmail.com", "suraj8877");
	
		ReguarVisitorLog rVL = PageFactory.initElements(driver, ReguarVisitorLog.class);
		
		rVL.searchByNameAndCategoryTest();
		
	}
	
	@Test(priority=4)
	public void RegularVisitorsDetails() throws InterruptedException {
		//launch browser
		
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://dev.the360.in/login");
		
		//created page object using page factory
		LoginPage login_page = PageFactory.initElements(driver, LoginPage.class);
		//call the method
		login_page.login_to_360("surajbiswas@yopmail.com", "suraj8877");
	
		ReguarVisitorLog rVL = PageFactory.initElements(driver, ReguarVisitorLog.class);
		
		rVL.regular_visitors_details_test();
		
	}
	
	
	 @AfterMethod(alwaysRun = true)
	  public void teardown()
	  {
		BrowserFactory.quit();
	  }

}
