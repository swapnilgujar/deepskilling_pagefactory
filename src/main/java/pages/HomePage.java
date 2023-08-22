package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(name = "searchbar")
	WebElement searchBar;
	
	@FindBy(id = "button-search")
	WebElement searchButton;
	
	public void searchItems(String searchItem) {
		searchBar.sendKeys(searchItem);
		searchButton.click();
	}
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

}
