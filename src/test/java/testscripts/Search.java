package testscripts;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.SearchResultPage;


public class Search extends TestBase{
	
	HomePage homePage;
	SearchResultPage searchResultPage;
	
	
  @Test(priority = 0) 
  public void searchItem() {
	  homePage = new HomePage();
	  homePage.searchItems("Parry Hotter");
	  searchResultPage = new SearchResultPage();
	  searchResultPage.clickSearchResult();
  }
	
  @Test(priority = 1) 
  public void addItemToCart() {
	  searchResultPage = new SearchResultPage();
	  searchResultPage.clickAddToCart(); 
	  
  }
	  
  
  
}
