package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class NewTest {
	WebDriver driver;
	
	ExcelReader exlReader = new ExcelReader("./TestData/New Microsoft Excel Worksheet.xlsx");
	String username = exlReader.getCellData("Excelsheet1", "UserName", 2);
	String password = exlReader.getCellData("Excelsheet1", "Password", 2);
	@Test
	public void validusershouldbeabletologin() {
	
	
			driver = BrowserFactory.init();
			
			LoginPage login1 = PageFactory.initElements(driver, LoginPage.class);
			login1.enterUsername(username);
			login1.enterPassword(password);
			login1.clickSignnigbutton();
			
			DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
			dashboard.validateDashboard();
			
			BrowserFactory.tearDown();
		}
			
		}
