import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sellintroduction {

	public static void main(String[] args) {
		//for google chorme
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		
		
		//for firefox
		
/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohammad\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver(); 
		
		*/
driver.get("https://rahulshettyacademy.com/locatorspractice/");

System.out.println(driver.getTitle());
System.out.println(driver.getCurrentUrl());

	}

}
