package pages_360;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PropertyFunctionalityPage {
	
	WebDriver driver;
	public PropertyFunctionalityPage(WebDriver ldriver) {
		this.driver= ldriver;
	}
	
	@FindBy(xpath="//a[text()='Requested Users']")
    WebElement RequestedUsers;
	
	@FindBy(xpath="(//div[@class='col-md-11'])[1]/*")
    WebElement RequestedUsersInput;
	
	@FindBy(xpath="//a[text()='All Users']")
    WebElement AllUsers;
	
	@FindBy(xpath="(//div[@class='col-md-11'])[2]/*")
    WebElement AllUsersInput;
	
	@FindBy(xpath="(//a[text()='Flat Owners'])[2]")
    WebElement FlatOwners;
	
	@FindBy(xpath="(//div[@class='multiselect__tags'])[1]")
    WebElement FilterByBlock;
	
	@FindBy(xpath="//span[text()='Cascade']")
	List<WebElement> cascade;
	
	@FindBy(xpath="(//div[@class='col-md-2'])[2]//a")
    WebElement Reset;
	
	@FindBy(xpath="(//div[@class='multiselect__tags'])[2]")
    WebElement FilterByFlat;
	
	@FindBy(xpath="//span[text()='Aspen - 1B']")
	List<WebElement> Aspen;
	
	@FindBy(xpath="(//input[@class='multiselect__input'])[2]")
    WebElement input;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-table-header pull-right']")
    WebElement FlatOwnerReport;
	
	public  void proprty_functionality_test() throws InterruptedException {
	  
		RequestedUsers.click();
		Thread.sleep(3000);
		RequestedUsersInput.sendKeys("abby");
		Thread.sleep(3000);
		AllUsers.click();
		Thread.sleep(3000);
		AllUsersInput.sendKeys("abby");
		Thread.sleep(3000);
		FlatOwners.click();
		Thread.sleep(3000);
		WebElement dropdown = FilterByBlock; 
  	    dropdown.click();
  	    Thread.sleep(3000);
	    List<WebElement> options = cascade;
   	    options.get(0).click();
   	    Thread.sleep(7000);
   	    Reset.click();
   	    Thread.sleep(3000);
   	    WebElement dropdown2 = FilterByFlat; 
	    dropdown2.click();
	    Thread.sleep(3000);
	    List<WebElement> options2 = Aspen;
	    options2.get(0).click();
	    Thread.sleep(7000);
	    dropdown2.click();
	    Thread.sleep(3000);
	    input.sendKeys(Keys.ENTER);
	    Thread.sleep(5000);
	    FlatOwnerReport.click();
	    Thread.sleep(3000);

  	    
   	    
		
}

}
