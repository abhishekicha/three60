package pages_360;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GuardPetrollingRoutes {
	

	WebDriver driver;
	public GuardPetrollingRoutes(WebDriver ldriver) {
		this.driver= ldriver;
	}
	
	@FindBy(xpath="(//a[@class='dropdown-toggle border-quote-clr sm-arrow1 dropdown-toggle'])[2]")
    WebElement guards;
	
	@FindBy(xpath="(//ul[@class='dropdown-menu drop-white-arrow fadeInDown']//a)[2]")
    WebElement routes;
	
	@FindBy(xpath="//input")
    WebElement search;
	
	@FindBy(xpath="//button[@class='btn btn-success btn-table-header pull-right']")
    WebElement addNewRoute;
	
	@FindBy(xpath="(//input)[1]")
    WebElement routeName;
	
	@FindBy(xpath="(//input)[2]")
    WebElement startTime;
	
	@FindBy(xpath="(//input)[3]")
    WebElement endTime;
	
	@FindBy(xpath="(//div[@class='multiselect__select'])[1]")
    WebElement frequencyDropdown;
	
	@FindBy(xpath="(//span[text()='1 Hour'])[1]")
    WebElement frequencySet;
	
	@FindBy(xpath="(//div[@class='multiselect__select'])[2]")
    WebElement patrolDuration;
	
	@FindBy(xpath="(//input)[5]")
    WebElement durationSet;
	
	@FindBy(xpath="//span[text()='Main Gate']")
    WebElement assignCheckPoints;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[3]")
    WebElement save;
	
	
	public  void guardPetrollingroutes_test() throws InterruptedException {
	    
		Thread.sleep(7000);
		Actions actions = new Actions(driver);
        WebElement menuOption = guards;
        Thread.sleep(3000);
	  	actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
	  	WebElement subMenuOption = routes; 
	  	actions.moveToElement(subMenuOption).perform();
		subMenuOption.click();
		Thread.sleep(3000);
	}
	
	public  void checkFunctionality_test() throws InterruptedException {
		
		search.sendKeys("Main Gate");
		Thread.sleep(3000);
		addNewRoute.click();
		Thread.sleep(3000);
		routeName.sendKeys("Test-023");
		Thread.sleep(3000);
		startTime.sendKeys("1205AM");
		Thread.sleep(3000);
		endTime.sendKeys("0405PM");
		Thread.sleep(3000);
		frequencyDropdown.click();
		Thread.sleep(3000);
		frequencySet.click();
		Thread.sleep(3000);
		patrolDuration.click();
		Thread.sleep(3000);
		durationSet.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		assignCheckPoints.click();
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript
		("arguments[0].scrollIntoView(true);", save);
		Thread.sleep(5000);
		save.click();
		Thread.sleep(3000);
		
	}

}
