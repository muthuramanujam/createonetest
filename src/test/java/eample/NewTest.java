package eample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
 	
	String baseUrl = "http://demo.guru99.com/test/newtours/";
	FirefoxProfile profile;
	WebDriver driver;
    public String expected = null;
    public String actual = null;
	@Test
	
	public void testEasy() {	
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page"));
		//Assert.assertTrue(false);
	}	
	@BeforeTest
	@Parameters({"author"})
	public void beforeTest(String author) {	
		System.out.println("=========>>>launching Ch browser"+author);
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\development\\downloads\\devSoftwares\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		 profile = new FirefoxProfile();
	
		 driver = new FirefoxDriver(profile);
		 driver.get(baseUrl); 
	}		
	@AfterTest
	public void afterTest() {
		System.out.println("Close Ch browser");
		driver.close();			
	}

}
