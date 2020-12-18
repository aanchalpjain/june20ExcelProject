package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Assert;

public class DashboardPage {
WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	// Element library
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")
	WebElement DASHBOARD_VALIDATION_ELEMENT;
	 
	// interactive Method
	
	public void validateDashboard() {
		String dashboardText = DASHBOARD_VALIDATION_ELEMENT.getText();
	Assert.assertEquals(dashboardText, "Dashboard","Wrong page");
	
	}
	
	
}
