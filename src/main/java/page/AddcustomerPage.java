package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class AddcustomerPage extends BasePage {
	WebDriver driver;

	public AddcustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	// Element library
	// By USER_NAME_LOCATOR = By.id("username");
	// WebElement USER_NAME_ELEMENT = driver.findElement(By.id("username"));

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a")
	WebElement CUSTOMER_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")
	WebElement ADD_CUSTOMER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement FULLNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")
	WebElement COMPANY_DROPDOWN_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
	WebElement EMAIL_FIELD_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]")
	WebElement PHONE_FIELD_LOCATOR;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"address\"]")
	WebElement ADDRESS_FIELD_LOCATOR;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]")
	WebElement CITY_FIELD_LOCATOR;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]")
	WebElement STATE_FIELD_LOCATOR;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"zip\"]")
	WebElement ZIP_ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"group\"]")
	WebElement GROUP_BUTTON_LOCATOR;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]")
	WebElement COUNTRY_DROPDOWN__ELEMENT;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement SAVE_BUTTON_LOCATOR;
	
	@FindBy(how = How.XPATH, using ="//a[contains(text(),'List Customers')]")
	WebElement LIST_CUSTOMER_BUTTON_LOCATOR;
	
	// Interactive methods
	public void clickCustomerlocator() {
		CUSTOMER_LOCATOR.click();
	}

	public void clickAddCustomerlocator() {
		ADD_CUSTOMER_ELEMENT.click();
	}
	
	String enteredname1;
	public void enterName(String Fullname) {
		waitForElement(driver, 3, FULLNAME_ELEMENT);
		int randomNumber = randomNumberGenerator();
		//we make a string(local first) for this data and declare globally and earese "string"keyword then pass it on assert expected msg
		 enteredname1 = Fullname + randomNumber;
		FULLNAME_ELEMENT.sendKeys( enteredname1 );
	}

	public void enterCompanyName(String Company) {
		waitForElement(driver, 3, FULLNAME_ELEMENT);
		COMPANY_DROPDOWN_LOCATOR.sendKeys(Company);
	}

	public void enteremail(String email) {
		waitForElement(driver, 3, EMAIL_FIELD_LOCATOR);
		int randomNumber = randomNumberGenerator();
		EMAIL_FIELD_LOCATOR.sendKeys(randomNumber + email);
	}

	public void enterphoneNumber(String number) {
		waitForElement(driver, 3, PHONE_FIELD_LOCATOR);
		int randomNumber = randomNumberGenerator();
		PHONE_FIELD_LOCATOR.sendKeys(number + randomNumber);
	}
	
	public void enteraddress(String Address) {
		waitForElement(driver, 3, ADDRESS_FIELD_LOCATOR);
		ADDRESS_FIELD_LOCATOR.sendKeys(Address);
	}

	public void enterCityname(String city) {
		CITY_FIELD_LOCATOR.sendKeys(city);
	}

	
	public void enterstatename(String State) {
		waitForElement(driver, 3, STATE_FIELD_LOCATOR);
		STATE_FIELD_LOCATOR.sendKeys(State);
	}
	
	public void enterZiplocator(String zip) {
		ZIP_ELEMENT.sendKeys(zip);
	}

	public void selectgroup(String group) {
		waitForElement(driver, 3, GROUP_BUTTON_LOCATOR);
		GROUP_BUTTON_LOCATOR.sendKeys(group);
	}
		public void clickcountryDropdownlocator(String country) {
			waitForElement(driver, 3, COUNTRY_DROPDOWN__ELEMENT);
			COUNTRY_DROPDOWN__ELEMENT.sendKeys(country);
		}
		
		
	
	public void clicksavebuttonlocator() throws InterruptedException {
		Thread.sleep(2000);
		SAVE_BUTTON_LOCATOR.click();
	}
//	public void validatesuccessmsg() {
		//Assert.assertEquals(actual, expected, message);
	//}

	public void clicklistcustomerbutton() throws InterruptedException {
		Thread.sleep(2000);
		LIST_CUSTOMER_BUTTON_LOCATOR.click();
	}
//tbody/tr[2]/td[3]
//tbody/tr[3]/td[3]
//tbody/tr[3]/td[3]/following-sibling::td[4]/a[2]
	//tbody/tr[1]/td[3]/following-sibling::td[4]/a[2]
	String before_xpath = "//tbody/tr[";
	String after_xpath = "]/td[3]";
	
	//using forloop to get how many data u have to select and validate
	public void verifyEnteredNameandDelete() throws InterruptedException {
		for(int i = 1; i <= 4; i++) {
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			//System.out.println(name);
										//enteredname1(71) 
			//Assert.assertEquals(name, enteredname1, "Entered name doesnot exist");
			//break;
			//then its time to delete button perform time
			
			if(name.contains(enteredname1)) { 
				System.out.println("Entered name exist.");
				driver.findElement(By.xpath("//tbody/tr[1]/td[3]/following-sibling::td[4]/a[2]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button[2]")).click();
				////*[@id="page-wrapper"]/div[3]/div[1]
			
			}
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
