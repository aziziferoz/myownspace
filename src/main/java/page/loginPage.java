package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {
	
	WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	String userName = "demo@techfios.com";
	String password = "abc123";
	
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Sign in')]") WebElement LOGIN_ELEMENT;

	public void insertUserName(String userName) {
		USERNAME_ELEMENT.sendKeys(userName);
		
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
		
	}
	
	public void clickLoginButton() {
		LOGIN_ELEMENT.click();
	}
	
	public void testLoginPage(String userName, String password) {
		USERNAME_ELEMENT.sendKeys(userName);
		PASSWORD_ELEMENT.sendKeys(password);
		LOGIN_ELEMENT.click();
	}
	
}

