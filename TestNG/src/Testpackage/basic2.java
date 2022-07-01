package Testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Test(groups= {"city"})
public class basic2 {
	
	@Parameters({"URL2","URL3"})
	@Test
	public void demo(String nameurl2,String nameurl3){
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadali/Documents/chromedriver");

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
driver.get(nameurl2);
	
	driver.get(nameurl3);
	
		
		
	}
}
