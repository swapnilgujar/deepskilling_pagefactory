package testscripts;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.SearchResultPage;


public class Search extends TestBase{
	
	HomePage homePage;
	SearchResultPage searchResultPage;
	
	
  @Test
  public void searchItem() {
	  homePage = new HomePage();
	  homePage.searchItems("Parry Hotter");
	  searchResultPage = new SearchResultPage();
	  searchResultPage.clickSearchResult();
	  
  }
  
	/*
	 * @Test public void addItemToCart() { }
	 */
  
  
}
