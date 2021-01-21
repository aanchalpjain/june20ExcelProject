package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.AddcustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;

public class AddCustomerTest {
	WebDriver driver;
	
	ExcelReader exlReader = new ExcelReader("./TestData/Exceldata.xlsx");
	String username = exlReader.getCellData("Sheet1", "UserName", 2);
	String password = exlReader.getCellData("Sheet1", "Password", 2);
	
	String name = exlReader.getCellData("Sheet1", "Fullname", 2);
	String company = exlReader.getCellData("Sheet1", "Company", 2);
	String Email = exlReader.getCellData("Sheet1", "email", 2);
	String Number = exlReader.getCellData("Sheet1", "number", 2);
	String address = exlReader.getCellData("Sheet1", "address", 2);
	String City = exlReader.getCellData("Sheet1", "city", 2);
	String state = exlReader.getCellData("Sheet1", "state", 2);
	String Zip = exlReader.getCellData("Sheet1", "zip", 2);
	String Group = exlReader.getCellData("Sheet2", "group", 2);
	String Country = exlReader.getCellData("Sheet2", "country", 2);
	

	@Test
	public void validusershouldbeabletocreateAddCustomer() throws InterruptedException {
			driver = BrowserFactory.init();
			
			LoginPage login1 = PageFactory.initElements(driver, LoginPage.class);
			login1.enterUsername(username);
			login1.enterPassword(password);
			login1.clickSignnigbutton();
			
			DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
			dashboard.validateDashboard();
			
			AddcustomerPage addcustomer = PageFactory.initElements(driver, AddcustomerPage.class);
			addcustomer.clickCustomerlocator();
			addcustomer.clickAddCustomerlocator();
			addcustomer.enterName(name);
			addcustomer.enterCompanyName(company);
			addcustomer.enteremail(Email);
			addcustomer.enterphoneNumber(Number);
			Thread.sleep(2000);
			addcustomer.enteraddress(address);
			addcustomer.enterCityname(City);
			addcustomer.enterstatename(state);
			addcustomer.enterZiplocator(Zip);
			
			addcustomer.selectgroup(Group);
			addcustomer.clickcountryDropdownlocator(Country);
			addcustomer.clicksavebuttonlocator();
			addcustomer.clicklistcustomerbutton();
			addcustomer.verifyEnteredNameandDelete();
			
			
			
			
			BrowserFactory.tearDown();
			
}
}