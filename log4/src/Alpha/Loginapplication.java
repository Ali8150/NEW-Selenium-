package Alpha;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Loginapplication {

	
		// TODO Auto-generated method stub
		@Test
		public void Login() {
			
			System.setProperty("webdriver.chrome.driver",
					"/Users/mohammadali/Documents/chromedriver");

			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			RediffLoginpagePF rd = new RediffLoginpagePF(driver);
			
			rd.Emaild().sendKeys("hello");
			
			rd.pass().sendKeys("word");
			
			
			rd.login().click();
			
		}
		
	}


