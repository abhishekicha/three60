package pages_360;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GuardPetrollingCheckpoint {
	
	WebDriver driver;
	public GuardPetrollingCheckpoint(WebDriver ldriver) {
		this.driver= ldriver;
	}

	@FindBy(xpath="(//a[@class='dropdown-toggle border-quote-clr sm-arrow1 dropdown-toggle'])[2]")
    WebElement guards;
	
	@FindBy(xpath="(//ul[@class='dropdown-menu drop-white-arrow fadeInDown']//a)[1]")
    WebElement checkPoints;
	
	@FindBy(xpath="//input")
    WebElement search;
	
	@FindBy(xpath="//button[@class='btn btn-success btn-table-header pull-right']")
    WebElement createCheckpoints;
	
	@FindBy(xpath="(//input)[1]")
    WebElement checkPointName;
	
	@FindBy(xpath="(//input)[2]")
    WebElement checkPointArea;
	
	@FindBy(xpath="//span[text()='Yes']")
    WebElement radioYes;
	
	@FindBy(xpath="//strong[text()='Save']")
    WebElement save;
	
	
	public  void guardPetrollingCheckpoint_test() throws InterruptedException {
	    
		Thread.sleep(7000);
		Actions actions = new Actions(driver);
        WebElement menuOption = guards;
        Thread.sleep(3000);
	  	actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
	  	WebElement subMenuOption = checkPoints; 
	  	actions.moveToElement(subMenuOption).perform();
		subMenuOption.click();
		Thread.sleep(3000);
	}
	
	public  void checkFunctionality_test() throws InterruptedException {
		
		search.sendKeys("Main Gate");
		Thread.sleep(3000);
		createCheckpoints.click();
		Thread.sleep(3000);
		checkPointName.sendKeys("Test-023");
		Thread.sleep(3000);
		checkPointArea.sendKeys("Main Gate");
		Thread.sleep(3000);
		radioYes.click();
		Thread.sleep(3000);
		save.click();
		Thread.sleep(3000);
		
	}
}
