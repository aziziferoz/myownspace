package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.loginPage;
import util.BrowserFactory;

public class loginTest {
	
	WebDriver driver;
	String userName = "demo@techfios.com";
	String password = "abc123";
	
	@Test
	public void testLoginPage() {
		
		driver =BrowserFactory.init();
		
		loginPage login = PageFactory.initElements(driver, loginPage.class);
		login.insertUserName(userName);
		login.insertPassword(password);
		login.clickLoginButton();
		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.verifyDashboard();
		//BrowserFactory.tearDown();
	}
	

}
