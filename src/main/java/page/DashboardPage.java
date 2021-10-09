package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {

	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using= "//h2[contains(text(),' Dashboard ')]") WebElement Dashboard_Element;
	@FindBy(how=How.XPATH, using= "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement Customer_Element;
	@FindBy(how=How.XPATH, using= "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement AddCustomer_Element;
	
	public void verifyDashboard() {
		Assert.assertEquals(Dashboard_Element.getText(), "Dashboard", "Dashboard page not found !!");
	}
	
	public void clickCustomerButton() {
		Customer_Element.click();
		
	}
	
	public void clickAddCustomerButton() {
		AddCustomer_Element.click();
	}
	
	
}
