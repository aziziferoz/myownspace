package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddContactPage extends BasePage {
	
	WebDriver driver;
	
	public AddContactPage(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(how=How.XPATH, using= "//input[@id='account']") WebElement FullName_Element;
	@FindBy(how=How.XPATH, using= "//select[@id='cid']") WebElement Company_Element;
	@FindBy(how=How.XPATH, using= "//input[@name='email']") WebElement Email_Element;
	@FindBy(how=How.XPATH, using= "//input[@name='phone']") WebElement Phone_Element;
	@FindBy(how=How.XPATH, using= "//select[@name='country']") WebElement Country_Element;
	@FindBy(how=How.XPATH, using= "//input[@name='address']") WebElement Address_Element;
	@FindBy(how=How.XPATH, using= "//input[@name='city']") WebElement City_Element;
	@FindBy(how=How.XPATH, using= "//input[@id='state']") WebElement State_Element;
	@FindBy(how=How.XPATH, using= "//input[@id='zip']") WebElement ZipCode_Element;
	@FindBy(how=How.XPATH, using= "//select[@id='tags']") WebElement Tag_Element;
	@FindBy(how=How.XPATH, using= "//button[@id='submit']") WebElement SaveButton_Element;
	
	public void insertFullName(String userName) {
		GenerateRandomNo(999);
		FullName_Element.sendKeys(userName + GenerateRandomNo(999));
	}
	
	public void selectCompany(String company) {
		SelectFromDropdown(Company_Element,company);
	}

	public void insertEmail(String email) {
		Email_Element.sendKeys(GenerateRandomNo(9999)+email);
	}
	
	public void insertPhone(String phone) {
		Phone_Element.sendKeys(phone + GenerateRandomNo(99));
	}
	
	public void selectCountry(String country) {
		SelectFromDropdown(Country_Element, country);
		
	}

	public void insertAddress(String address) {
		Address_Element.sendKeys(address);
		
	}
	
	public void insertCity(String city) {
		City_Element.sendKeys(city);
		
	}
	
	public void insertState(String state) {
		State_Element.sendKeys(state);
		
	}
	
	public void insertZipCode(String zipcode) {
		ZipCode_Element.sendKeys(zipcode);
		
	}
	
	public void selectTags(String tags) {
		Tag_Element.sendKeys(tags);
		
	}
	
	public void clickSaveButton() {
		SaveButton_Element.click();
		
	}
}
