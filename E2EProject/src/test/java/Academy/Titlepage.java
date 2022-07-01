package Academy;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.basic;

public class Titlepage extends basic {
	
	
	public WebDriver driver; 
	public static Logger log = LogManager.getLogger(basic.class.getName());
	@BeforeTest
	public void initailize () throws IOException {
		
		driver = initializerDriver() ;
		log.info("Driver is initialized");
		
		driver.get(prop.getProperty("url"));
		
		log.info("Navigated to Home page");
		
	}
		
	
	@SuppressWarnings("deprecation")
	@Test
	
	public void Title () throws IOException, InterruptedException {
		
		
		
		
	
	
		LandingPage l = new LandingPage(driver);
		
		l.cancel().click();
		

		
		AssertJUnit.assertEquals(l.getTitle().getText(), "FEATURED COURSES1514");
		
		log.info("Successfully validated");

		
		
	}
	

	@AfterTest 
	public void closeborwser() {
		
		driver.close();
		
		
	}
	
	

	
	 
	
	
}
