package testscripts;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.SearchResultPage;

public class AddItemToCart extends TestBase{
//	HomePage homePage;
	SearchResultPage searchResultPage;
	
	@Test(priority = 1) 
	  public void addItemToCart() {
		  searchResultPage = new SearchResultPage();
		  searchResultPage.clickAddToCart(); 
	  }

}
