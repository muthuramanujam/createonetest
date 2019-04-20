package eample;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SeleniumCodeMain {

	public static void main(String[] args) {
		String baseUrl = "http://demo.guru99.com/v4";
		FirefoxProfile profile;
		WebDriver driver;
		System.out.println("=========>>>launching Ch browser");

		System.setProperty("webdriver.gecko.driver",
				"C:\\development\\downloads\\devSoftwares\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		profile = new FirefoxProfile();

		driver = new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
		System.out.println("This step enter the Username and Password on the login page.");
		
		//WebElement to which the keyboard actions are performed
		WebElement textBoxElement = driver.findElement(By.name("uid"));
		 
		//Creating object of Actions class
		Actions builder = new Actions(driver);
		 
		//Generating an action to type a text in CAPS
		Action typeInCAPS = builder.keyDown(textBoxElement, Keys.SHIFT)
				     .sendKeys(textBoxElement, "artOfTesting")
				     .keyUp(textBoxElement, Keys.SHIFT)
		        	     .build();

		//Performing the typeInCAPS action
		typeInCAPS.perform();
		
		//Scrolling Web Page
		Actions scrooLSerAct =  new Actions(driver);
		Action actionS = scrooLSerAct.sendKeys(Keys.DOWN).build();
		actionS.perform();
		
		
		//driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys("password");
		
		//Click Menu action - Mouse move
		WebElement we = driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Selenium')]"));
		Actions serAct = new Actions(driver);
		Action action = serAct.moveToElement(we).click().build();
		action.perform();
		
		//Simple action - Mouse move
		WebElement we1 = driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Selenium')]"));
		Actions serAct1 = new Actions(driver);
		Action action1 =  serAct1.moveToElement(we).build();
		action1.perform();
				
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		driver.manage().window().maximize();
		//driver.switchTo().frame("");
		
		 File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 System.out.println("--->"+screenshotFile.getAbsolutePath());
		 System.out.println("--User->"+System.getProperty("user.dir"));
		 System.out.println("--Home->"+System.getProperty("user.home"));
		 try {
			FileUtils.copyFile(screenshotFile, new File("C:\\development\\wksJOBEXAMPLES\\screenshots\\1SoftwareTestingMaterial.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
/*		TakesScreenshot shot = ((TakesScreenshot)driver); 
		File scrFile = shot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:\\development\\wksJOBEXAMPLES\\screenshots\\"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
