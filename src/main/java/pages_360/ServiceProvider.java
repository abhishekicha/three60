package pages_360;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ServiceProvider {
	
	
	WebDriver driver;
	public ServiceProvider(WebDriver ldriver) {
		this.driver= ldriver;
	}
	
	@FindBy(xpath="(//ul[@class='nav navbar-nav navbar-left ']//a)[8]")
    WebElement supportStaff;
	
	@FindBy(xpath="(//ul[@class='dropdown-menu drop-white-arrow fadeInDown']//a)[5]")
    WebElement serviceProvider;
	
	@FindBy(xpath="(//img)[5]")
    WebElement img;
	
	@FindBy(xpath="//button[@class='close']")
    WebElement close;
	
	@FindBy(xpath="//a[@class='pull-right']")
    WebElement next;
	
	@FindBy(xpath="(//button[@class='btn btn-success btn-table-header pull-right'])[1]")
    WebElement downloadReport;
	
	public  void serviceProvider_test() throws InterruptedException {
		    
			Thread.sleep(7000);
			Actions actions = new Actions(driver);
	        WebElement menuOption = supportStaff;
	        Thread.sleep(3000);
		  	actions.moveToElement(menuOption).perform();
	        Thread.sleep(3000);
		  	WebElement subMenuOption = serviceProvider; 
		  	actions.moveToElement(subMenuOption).perform();
			subMenuOption.click();
			Thread.sleep(3000);
		}


	public  void serviceProviderListFunctionality_test() throws InterruptedException {
		
		img.click();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(3000);
		next.click();
		Thread.sleep(3000);
		downloadReport.click();
		Thread.sleep(3000);
		
		
	}
}
