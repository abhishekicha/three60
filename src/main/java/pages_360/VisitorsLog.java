package pages_360;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class VisitorsLog {
	
	WebDriver driver;
	public VisitorsLog(WebDriver ldriver) {
		this.driver= ldriver;
	}
	@FindBy(xpath="(//ul[@class='nav navbar-nav navbar-left ']//a)[18]")
    WebElement logs;
	
	@FindBy(xpath="(//ul[@class='dropdown-menu drop-white-arrow fadeInDown']//a)[1]")
    WebElement visitors;
	
	@FindBy(xpath="(//div[@class='col-md-3'])[3]")
    WebElement visitorDetailsLog;
	
	@FindBy(xpath="//button[@class='close']")
    WebElement visitorDetailsLogClose;
	
	@FindBy(xpath="//a[@class='btn btn-success btn-table-header pull-right']")
    WebElement seeCurrentlyInsideVisitors;
	
	@FindBy(xpath="(//div[@class='col-md-2']//a)[1]")
    WebElement next;
	
	@FindBy(xpath="//a[@class='btn btn-success btn-table-header pull-right']")
    WebElement allVisitors;
	
	@FindBy(xpath="(//a[@class='pull-right'])[1]")
    WebElement reset;
	
	@FindBy(xpath="//button[@class='btn btn-success btn-table-header pull-right']")
    WebElement filter;
	
	@FindBy(xpath="(//div[@class='multiselect__select'])[3]")
    WebElement selectBlock;
	
	@FindBy(xpath="//span[text()='Cascade']")
    WebElement cascade;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-block']")
    WebElement filterSubmit;
	
	public  void visitors_log_test() throws InterruptedException {
	    
		Thread.sleep(7000);
		Actions actions = new Actions(driver);
        WebElement menuOption = logs;
        Thread.sleep(3000);
	  	actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
	  	WebElement subMenuOption = visitors; 
	  	actions.moveToElement(subMenuOption).perform();
		subMenuOption.click();
		Thread.sleep(3000);
	}
	
	public  void visitors_details_log_test() throws InterruptedException {
		
		visitorDetailsLog.click();
		Thread.sleep(3000);
		visitorDetailsLogClose.click();
		Thread.sleep(3000);
	}
	
	public  void seeCurrentlyInsideVisitors_log_test() throws InterruptedException {
			
		seeCurrentlyInsideVisitors.click();
		Thread.sleep(3000);
		next.click();
		Thread.sleep(3000);
		}
	
	public  void allVisitors_log_test() throws InterruptedException {
		
		allVisitors.click();
		Thread.sleep(3000);
		reset.click();
		Thread.sleep(3000);
		}
	
	public  void filter_test() throws InterruptedException {
			
			filter.click();
			Thread.sleep(3000);
			selectBlock.click();
			Thread.sleep(1000);
			cascade.click();
			Thread.sleep(1000);
			filterSubmit.click();
			Thread.sleep(3000);
			reset.click();
			Thread.sleep(3000);
			
			
			}
	
}
