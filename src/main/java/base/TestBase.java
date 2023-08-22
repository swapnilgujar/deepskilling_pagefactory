package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties properties;
	String propertyPath;
	
	public TestBase()  {
		
		propertyPath = System.getProperty("user.dir")+ "//src//test//resources//config/config.properties";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(propertyPath);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		properties = new Properties();
		try {
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void initialise() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.get(properties.getProperty("url"));
	}
	
	@BeforeClass
	public void setUp() {
		initialise();
	}
	
	/*
	 * @AfterClass public void close() { driver.close(); }
	 */
	
}
