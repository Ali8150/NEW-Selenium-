package Testpackage;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Basic4 {
	@Test(timeOut=4000)
	public void demo(){
		
		
		System.out.println("Hello Texas");
		
		
	}
	@Test(groups= {"city"})
public void demo2(){
		
		
		System.out.println("Hello New Jersy");
		
		
	}
@Parameters({"URL"})	
@Test	
public void demo3(String urlname){
	

	
	System.setProperty("webdriver.chrome.driver",
			"/Users/mohammadali/Documents/chromedriver");

	// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
driver.get(urlname);
		System.out.println("Hello OHIO");
		
		
	}
@Test
public void Rida(){
	
	
	
	
	System.out.println("Hello FLORIDA");
	
	
}
@BeforeTest
public void beforetest(){
	
	
	
	
	System.out.println("I will run first");
	
	
}
@AfterTest
public void aftertest(){
	
	
	
	
	System.out.println("I will run last");
	
	
}


}


