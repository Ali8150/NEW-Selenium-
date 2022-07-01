package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.Rediffloginpage;

public class Loginapplication {

	@Test
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadali/Documents/chromedriver");

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Rediffloginpage rd = new Rediffloginpage(driver);
		
		rd.Emaild().sendKeys("hello");
		
		rd.pass().sendKeys("word");
		
		
		rd.login().click();
		
	}
	
	
}
