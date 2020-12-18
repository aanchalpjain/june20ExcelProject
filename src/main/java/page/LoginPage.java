package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
//import org.testng.annotations.Test;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//Element library
	//By USER_NAME_LOCATOR = By.id("username");
	//WebElement USER_NAME_ELEMENT = driver.findElement(By.id("username"));
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USER_NAME_ELEMENT1;
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Sign in')]") WebElement SIGNING_BUTTON_ELEMENT;
	//@FindBy(how = How.XPATH, using ="//i[@class ='fa-fw fa fa-times']") WebElement INVALID_USERNAME_PASSWORD_ELEMENT;
	
	
	//Interactive methods
	public void enterUsername(String username) {
		USER_NAME_ELEMENT1.sendKeys(username);	
		
	}
	public void enterPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}
	
	public void clickSignnigbutton() {
		SIGNING_BUTTON_ELEMENT.click();	
		
	}
	//public void enterinvalidusernameorpassword(String invalidPassword) {
		//SIGNING_BUTTON_ELEMENT.click();	
		
	}
	
		//i can use both tech to run 22-33 or 37-41 both are same
	
	/*public void login(String username, String password,String invalidPassword) {
		USER_NAME_ELEMENT1.sendKeys(username);
		PASSWORD_ELEMENT.sendKeys(password);
		SIGNING_BUTTON_ELEMENT.click();
		 INVALID_USERNAME_PASSWORD_ELEMENT.sendKeys(invalidPassword);
	}*/
	
		
	
	



