import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadali/Documents/chromedriver");
						// TODO Auto-generated method stub
						WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies(); //delete all cokkies in the window			
			driver.manage().deleteCookieNamed("");  //delete only one cookie
			
						
	}

}
