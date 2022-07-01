import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadali/Documents/chromedriver");
		
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);

		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver(option);
	
	driver.get("https://expired.badssl.com/");
	
System.out.println(driver.getTitle());	
	}

}
