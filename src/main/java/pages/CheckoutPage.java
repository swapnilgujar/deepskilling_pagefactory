package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckoutPage extends TestBase {
	
	@FindBy(xpath = "//button[contains(text(),'Checkout')]")
	WebElement checkoutButton;
	
	@FindBy(id = "s-name")
	WebElement nameTexBox;
	
	@FindBy(id = "s-surname")
	WebElement surNameTexBox;
	
	@FindBy(id = "s-address")
	WebElement addressTextBox;
	
	
	 public void fillForm(String name,String surname, String address) { 
	   nameTexBox.sendKeys(name); 
	   surNameTexBox.sendKeys(surname); 
	   addressTextBox.sendKeys(address); 
	}
	 	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}

}
