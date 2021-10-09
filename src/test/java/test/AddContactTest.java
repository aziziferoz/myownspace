package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.loginPage;
import util.BrowserFactory;

public class AddContactTest {

	WebDriver driver;
	String fullName = "Ahmad";
	String companyName = "Techfios";
	String email = "abc231@techfios.com";
	String phoneNo = "25369874";
	String country = "United States";
	String address = "Street";
	String city = "Richardson";
	String state = "Tx";
	String zipCode = "75081";
	String tag = "My tags";
	
	@Test
	public void validUserShoudBeAbleToAddCustomer() {
		
		driver =BrowserFactory.init();
		loginPage login = PageFactory.initElements(driver, loginPage.class);
		login.insertUserName("demo@techfios.com");
		login.insertPassword("abc123");
		login.clickLoginButton();
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.clickCustomerButton();
		dashboard.clickAddCustomerButton();
		AddContactPage addcontactPage = PageFactory.initElements(driver, AddContactPage.class);
		addcontactPage.insertFullName(fullName);
		addcontactPage.selectCompany(companyName);
		addcontactPage.insertEmail(email);
		addcontactPage.insertPhone(phoneNo);
		addcontactPage.selectCountry(country);
		addcontactPage.insertAddress(address);
		addcontactPage.insertCity(city);
		addcontactPage.insertState(state);
		addcontactPage.insertZipCode(zipCode);
		addcontactPage.selectTags(tag);
		addcontactPage.clickSaveButton();
		
		
	}
}
