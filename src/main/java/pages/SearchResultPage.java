package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchResultPage extends TestBase{
	
	@FindBy(css  = "ul > li.preview")
	WebElement searchResult;
	
	@FindBy(id = "button-search")
	WebElement searchButton;
	
	@FindBy(xpath = "//button[contains(text(),'Add to cart')]")
	WebElement addToCartButton;
	
	public void clickSearchResult() {
		searchResult.click();
	}

	public void clickAddToCart() {
		addToCartButton.click();
	}
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}


}
