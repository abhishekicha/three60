package pages_360;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserPage {
	
	WebDriver driver;
	public AddUserPage(WebDriver ldriver) {
		this.driver= ldriver;
	}

	
	@FindBy(xpath="//button[@class='btn btn-success btn-table-header pull-right']")
    WebElement addUser;
	
	@FindBy(xpath="(//div[@class='form-group'])[1]//input")
    WebElement fName;
	
	@FindBy(xpath="(//div[@class='form-group'])[2]//input")
    WebElement lName;
	
	@FindBy(xpath="(//div[@class='form-group'])[3]//input")
    WebElement email;
	
	@FindBy(xpath="(//div[@class='form-group'])[4]//input")
    WebElement phone;
	
	@FindBy(xpath="(//div[@class='multiselect__tags'])[1]")
    WebElement flatNum;
	
	@FindBy(xpath="(//span[text()='Cascade - 2A'])[1]")
    WebElement flatSelect;
	
	@FindBy(xpath="(//span[text()='Committee Member'])[1]")
    WebElement commiteeMember;
	
	@FindBy(xpath="(//div[@class='form-group'])[7]//input")
    WebElement designation;
	
	@FindBy(xpath="(//button[@class='btn btn-primary middle text-capitalize m-top  m-bot'])[1]")
    WebElement save;
	
	
	
	
	public  void addUserTest() throws InterruptedException {
		  
		addUser.click();
		Thread.sleep(3000);
		fName.sendKeys("abbys");
		Thread.sleep(3000);
		lName.sendKeys("Prama");
		Thread.sleep(3000);
		email.sendKeys("ajji@yopmail.com");
		Thread.sleep(3000);
		phone.sendKeys("9674405756");
		Thread.sleep(3000);
		flatNum.click();
		Thread.sleep(3000);
		flatSelect.click();
		Thread.sleep(5000);
		commiteeMember.click();
		Thread.sleep(3000);
		designation.sendKeys("qa");
		Thread.sleep(3000);
		save.click();
		Thread.sleep(7000);
		
		
		
		
		
		
		
		
	}
	
}
