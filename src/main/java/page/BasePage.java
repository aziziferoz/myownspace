package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	public int GenerateRandomNo(int boundaryNumber) {
		Random rnd = new Random();
		int generatedNo = rnd.nextInt(boundaryNumber);
		return generatedNo;
	}
	
	public void SelectFromDropdown(WebElement selectElement, String visibleText) {
		Select sel = new Select(selectElement);
		sel.selectByVisibleText(visibleText);
		
	}
}
