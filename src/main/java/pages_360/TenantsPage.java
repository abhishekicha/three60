package pages_360;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class TenantsPage {
	
	WebDriver driver;
	public TenantsPage(WebDriver ldriver) {
		this.driver= ldriver;
	}
	
	@FindBy(xpath="(//a[@class='dropdown-toggle border-contact-clr sm-arrow3 dropdown-toggle'])[1]")
    WebElement property;
	
	@FindBy(xpath="//ul[@class='dropdown-menu drop-white-arrow fadeInDown']//a[text()='Tenants']")
    WebElement tenants;
	
	@FindBy(xpath="//button[@class='add-tenant-btn btn btn-table-header pull-right']")
    WebElement addTenants;
	
	@FindBy(xpath="//div[@class='col-md-12 form-group']//input")
    WebElement mobileNumber;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[1]")
    WebElement next;
	
	@FindBy(xpath="(//div[@class='multiselect__select'])[1]")
    WebElement unit;
	
	@FindBy(xpath="(//span[text()='Aspen - 2B'])[1]")
    WebElement flatNo;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
    WebElement eMail;
	
	@FindBy(xpath="(//input[@class='form-control'])[2]")
    WebElement fName;
	
	@FindBy(xpath="(//input[@class='form-control'])[3]")
    WebElement lName;
	
	@FindBy(xpath="(//input[@class='form-control'])[4]")
    WebElement photo;
	
	@FindBy(xpath="(//input[@class='form-control'])[5]")
    WebElement kycFront;
	
	@FindBy(xpath="(//input[@class='form-control'])[6]")
    WebElement kycBack;
	
	@FindBy(xpath="(//button[@class='btn btn-primary'])[2]")
    WebElement submit;
	
	@FindBy(xpath="//button[@class='close pull-right']")
    WebElement close;
	
	@FindBy(xpath="//a[text()='All Approval Requests']")
    WebElement allApprovalRequest;
	
	@FindBy(xpath="//a[text()='Requested Tenants']")
    WebElement requestedTenants;
	
	@FindBy(xpath="//a[text()='Tenant List']")
    WebElement tenantsList;
	
	@FindBy(xpath="(//input[@class='vgt-input vgt-pull-left'])[1]")
    WebElement searchTenants;
	
	@FindBy(xpath="(//div[@class='multiselect__select'])[1]")
    WebElement filterByUnit;
	
	@FindBy(xpath="(//span[text()='Aspen - 1B'])[1]")
    WebElement flatSelect;
	
	@FindBy(xpath="//div[@class='col-md-1']//a")
    WebElement reset;
	
	@FindBy(xpath="(//div[@class='multiselect__select'])[2]")
    WebElement filterByBlock;
	
	@FindBy(xpath="//span[text()='Aspen']")
    WebElement selectFlatByBlock;
	
	@FindBy(xpath="(//input[@class='multiselect__input'])[2]")
    WebElement removeFlatByEnter;
	
	public  void tenants_test() throws InterruptedException {
	    
		Thread.sleep(7000);
		Actions actions = new Actions(driver);
        WebElement menuOption = property;
        Thread.sleep(3000);
	  	actions.moveToElement(menuOption).perform();
        Thread.sleep(3000);
	  	WebElement subMenuOption = tenants; 
	  	actions.moveToElement(subMenuOption).perform();
		subMenuOption.click();
		Thread.sleep(3000);
	}

	public  void add_tenants_test() throws InterruptedException {
		
		addTenants.click();
		Thread.sleep(3000);
		mobileNumber.sendKeys("9834182450");
		Thread.sleep(3000);
		next.click();
		Thread.sleep(3000);
		unit.click();
		Thread.sleep(1000);
		flatNo.click();
		Thread.sleep(1000);
		eMail.sendKeys("okkty@gmail.com");
		Thread.sleep(1000);
		fName.sendKeys("ckknty");
		Thread.sleep(1000);
		lName.sendKeys("dey");
		Thread.sleep(1000);
		photo.sendKeys("C:\\Users\\admin\\Downloads\\profile.png"); //Uploading the file using sendKeys
		System.out.println("File is Uploaded Successfully");
		Thread.sleep(1000);
		kycFront.sendKeys("C:\\Users\\admin\\Downloads\\kyc.jpg");
		System.out.println("File is Uploaded Successfully");
		Thread.sleep(1000);
		kycBack.sendKeys("C:\\Users\\admin\\Downloads\\kyc.jpg");
		System.out.println("File is Uploaded Successfully");
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(5000);
		
	}
	
public  void add_tenants_test_withoutName() throws InterruptedException {
		
		addTenants.click();
		Thread.sleep(3000);
		mobileNumber.sendKeys("9244216745");
		Thread.sleep(3000);
		next.click();
		Thread.sleep(3000);
		unit.click();
		Thread.sleep(1000);
		flatNo.click();
		Thread.sleep(1000);
		eMail.sendKeys("kjfhlu@ymail.com");
		Thread.sleep(1000);
		lName.sendKeys("ksfhlamik");
		Thread.sleep(1000);
		photo.sendKeys("C:\\Users\\admin\\Downloads\\profile.png"); //Uploading the file using sendKeys
		System.out.println("File is Uploaded Successfully");
		Thread.sleep(1000);
		kycFront.sendKeys("C:\\Users\\admin\\Downloads\\kyc.jpg");
		System.out.println("File is Uploaded Successfully");
		Thread.sleep(1000);
		kycBack.sendKeys("C:\\Users\\admin\\Downloads\\kyc.jpg");
		System.out.println("File is Uploaded Successfully");
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(3000);
		isElementExists();
		Thread.sleep(3000);
		
	}

public  void add_tenants_test_withoutProperNumber() throws InterruptedException {
	
	addTenants.click();
	Thread.sleep(3000);
	mobileNumber.sendKeys("9411546");
	Thread.sleep(3000);
	next.click();
	Thread.sleep(3000);
	unit.click();
	Thread.sleep(1000);
	flatNo.click();
	Thread.sleep(1000);
	fName.sendKeys("avskkjk");
	Thread.sleep(1000);
	eMail.sendKeys("krmhaakalkk@cmail.com");
	Thread.sleep(1000);
	lName.sendKeys("hjkrakmsanik");
	Thread.sleep(1000);
	photo.sendKeys("C:\\Users\\admin\\Downloads\\profile.png"); //Uploading the file using sendKeys
	System.out.println("File is Uploaded Successfully");
	Thread.sleep(1000);
	kycFront.sendKeys("C:\\Users\\admin\\Downloads\\kyc.jpg");
	System.out.println("File is Uploaded Successfully");
	Thread.sleep(1000);
	kycBack.sendKeys("C:\\Users\\admin\\Downloads\\kyc.jpg");
	System.out.println("File is Uploaded Successfully");
	Thread.sleep(1000);
	submit.click();
	Thread.sleep(3000);
	isElementExists();
	Thread.sleep(3000);
	
 }

public  void add_tenants_test_withoutkyc() throws InterruptedException {
	
	addTenants.click();
	Thread.sleep(3000);
	mobileNumber.sendKeys("9003200445");
	Thread.sleep(3000);
	next.click();
	Thread.sleep(3000);
	unit.click();
	Thread.sleep(1000);
	flatNo.click();
	Thread.sleep(1000);
	fName.sendKeys("aviisehphkh");
	Thread.sleep(1000);
	eMail.sendKeys("ramaahkla@gmail.com");
	Thread.sleep(1000);
	lName.sendKeys("ramlkhaanik");
	Thread.sleep(1000);
	photo.sendKeys("C:\\Users\\admin\\Downloads\\profile.png"); //Uploading the file using sendKeys
	System.out.println("File is Uploaded Successfully");
	Thread.sleep(1000);
	submit.click();
	Thread.sleep(3000);
	isElementExists();
	Thread.sleep(3000);
	
 }

	public void tenants_list_test() throws InterruptedException {
		allApprovalRequest.click();
		Thread.sleep(3000);
		requestedTenants.click();
		Thread.sleep(3000);
		tenantsList.click();
		Thread.sleep(3000);
		searchTenants.sendKeys("rajanikanth das");
		Thread.sleep(3000);
		searchTenants.sendKeys(Keys.CONTROL + "a");
		searchTenants.sendKeys(Keys.DELETE);
		Thread.sleep(3000);
		filterByUnit.click();
		Thread.sleep(1000);
		flatSelect.click();
		Thread.sleep(1000);
		reset.click();
		Thread.sleep(1000);
		filterByBlock.click();
		Thread.sleep(1000);
		selectFlatByBlock.click();
		Thread.sleep(1000);
		filterByBlock.click();
		Thread.sleep(1000);
		removeFlatByEnter.sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		
		
	}

	public boolean isElementExists() {

		
		try {
		    close.click();
		}
		catch (org.openqa.selenium.NoSuchElementException e) {
		    System.out.println(driver.getTitle());
		}
		return false;
	}
	
	
}
