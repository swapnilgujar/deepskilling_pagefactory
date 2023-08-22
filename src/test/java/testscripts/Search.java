package testscripts;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;


public class Search extends TestBase{
	
	HomePage homePage;
	
  @Test
  public void searchItem() {
	  homePage = new HomePage();
	  homePage.searchItems("Parry Hotter");
  }
  
  @Test
  public void addItemToCart() {
  }
  
  
}
