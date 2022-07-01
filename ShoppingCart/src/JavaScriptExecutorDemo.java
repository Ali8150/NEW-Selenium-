import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadali/Documents/chromedriver");
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadali/Documents/chromedriver");

		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
	JavascriptExecutor js =(JavascriptExecutor)driver;	
	
	js.executeScript("window.scrollBy(0,500)");
	
	Thread.sleep(3000);
		
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
	}

}
