package testscripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;


public class Search extends TestBase{
	
	HomePage homePage;
	
	@BeforeTest
	public void setUp() {
		initialise();
	}
	
	
  @Test
  public void searchItem() {
	  homePage = new HomePage();
	  homePage.searchItems("Parry Hotter");
  }
  
  @Test
  public void addItemToCart() {
  }
  
  @AfterTest
  public void close() {
	  driver.close();
  }
}
