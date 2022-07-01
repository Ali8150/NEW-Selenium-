package Academy;

import org.testng.annotations.Test;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.basic;

public class HomePage extends basic {
	public WebDriver driver; 
	
	public static Logger log = LogManager.getLogger(basic.class.getName());
@BeforeTest
public void initailize () throws IOException {
	
	driver = initializerDriver() ;
	log.info("Driver is initialized");
	
	driver.get(prop.getProperty("url"));
	
	log.info("Navigated to Home page");
	
}
	
	
	
	
	
	
	@Test(dataProvider="getdata")
	
	public void basePagenavigation (String Username, String Password) throws IOException {
		

		
		
		
		
LandingPage l = new LandingPage(driver);
		
		l.cancel().click();
		
		
		LoginPage in = new LoginPage (driver);
		
		in.login().click();
		in.usr().sendKeys(Username);
		in.pass().sendKeys(Password);
		
		log.info("login succesfull");
		
		
	}
	
	
	@DataProvider 
	
	public Object[][] getdata() {
		
		
		Object[][] data= new Object [1][2];
		
		   data[0][0] ="abc@qw.com";
		   
		   data[0][1]="123456";
		
		return data;
		
	}
	
	
	@AfterTest 
	public void closeborwser() {
		
		driver.close();
		
		
	}
	

	 
	
	
}
