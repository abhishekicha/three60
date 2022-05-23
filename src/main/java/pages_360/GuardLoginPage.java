package pages_360;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class GuardLoginPage {
	
	WebDriver driver;
	public GuardLoginPage(WebDriver ldriver) {
		this.driver= ldriver;
	}

	@FindBy(xpath="(//a[@class='dropdown-toggle border-quote-clr sm-arrow1 dropdown-toggle'])[1]")
    WebElement SupportStaff;
	
	
	@FindBy(xpath="(//ul[@class='dropdown-menu drop-white-arrow fadeInDown']//a)[2]")
    WebElement guardLogin;
	
	
	@FindBy(xpath="//div[@class='vgt-global-search__input vgt-pull-left']//input")
    WebElement search;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[1]")
    WebElement edit;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[1]")
    WebElement update;
	
	@FindBy(xpath="//button[@class='btn btn-success btn-table-header pull-right']")
    WebElement addAppLogin;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
    WebElement gateContactNumber;
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
    WebElement gateNumber;
	
	@FindBy(xpath="(//input[@class='form-control'])[3]")
    WebElement userName;
	
	@FindBy(xpath="(//input[@class='form-control'])[4]")
    WebElement password;
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
    WebElement towerGuardLogin;
	
	@FindBy(xpath="//div[@class='multiselect__select']")
    WebElement tower;
	
	@FindBy(xpath="//span[text()='Aspen']")
    WebElement selectBlock;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[1]")
    WebElement submit;
	
	@FindBy(xpath="//button[@class='close pull-right']")
    WebElement close;
	
	public  void guard_login_test() throws InterruptedException {
	    
		Thread.sleep(7000);
		Actions actions = new Actions(driver);
        WebElement menuOption = SupportStaff;
        Thread.sleep(3000);
	  	actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
	  	WebElement subMenuOption = guardLogin; 
	  	actions.moveToElement(subMenuOption).perform();
		subMenuOption.click();
		Thread.sleep(3000);
	}

	public void search_app_login_test() throws InterruptedException{
		
		search.sendKeys("danish");
		Thread.sleep(3000);
		search.sendKeys(Keys.CONTROL + "a");
		search.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
	
	}
	
public void editGuardProfileTest() throws InterruptedException{
		
		edit.click();
		Thread.sleep(3000);
		update.click();
		Thread.sleep(3000);
	
	}

public void addAppLoginTest() throws InterruptedException{
	
	addAppLogin.click();
	Thread.sleep(3000);
	gateContactNumber.sendKeys("7845886660");
	Thread.sleep(3000);
	gateNumber.sendKeys("AA");
	Thread.sleep(3000);
	userName.sendKeys("Abbyprama");
	Thread.sleep(3000);
	password.sendKeys("Abby1234");
	Thread.sleep(3000);
	towerGuardLogin.click();
	Thread.sleep(3000);
	tower.click();
	Thread.sleep(3000);
	selectBlock.click();
	Thread.sleep(3000);
	submit.click();
	Thread.sleep(3000);

}
	public void addAppLoginWithInvalidDetails()throws InterruptedException{
		
		addAppLogin.click();
		Thread.sleep(3000);
		gateContactNumber.sendKeys("7845886888888660");
		Thread.sleep(3000);
		gateNumber.sendKeys("AA");
		Thread.sleep(3000);
		userName.sendKeys("Abbypramcdbdhbchvbha");
		Thread.sleep(3000);
		password.sendKeys("Abby12vbebh34");
		Thread.sleep(3000);
		towerGuardLogin.click();
		Thread.sleep(3000);
		tower.click();
		Thread.sleep(3000);
		selectBlock.click();
		Thread.sleep(3000);
		submit.click();
		Thread.sleep(3000);
		close.click();
		Thread.sleep(3000);
	}
	
public void search_app_login_test_with_invalid_details() throws InterruptedException{
		
		search.sendKeys("danisfbvehfbefuh");
		Thread.sleep(3000);
		search.sendKeys(Keys.CONTROL + "a");
		search.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		
	
	}
}
