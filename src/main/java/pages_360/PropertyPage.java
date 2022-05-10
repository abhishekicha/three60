package pages_360;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PropertyPage {
	
	WebDriver driver;
	public PropertyPage(WebDriver ldriver) {
		this.driver= ldriver;
	}

	@FindBy(xpath="(//a[@class='dropdown-toggle border-contact-clr sm-arrow3 dropdown-toggle'])[1]")
    WebElement Property;
	
	@FindBy(xpath="(//a[text()='Flat Owners'])[1]")
    WebElement FlatOwners;
	
	
	public  void proprty_test() throws InterruptedException {
		    
			Thread.sleep(7000);
			Actions actions = new Actions(driver);
	        WebElement menuOption = Property;
	        Thread.sleep(3000);
		  	actions.moveToElement(menuOption).perform();
	        Thread.sleep(3000);
		  	WebElement subMenuOption = FlatOwners; 
		   	actions.moveToElement(subMenuOption).perform();
			subMenuOption.click();
			Thread.sleep(3000);
	
	}

}
