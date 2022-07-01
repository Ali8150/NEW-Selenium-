import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multimaplewindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadali/Documents/chromedriver");
						// TODO Auto-generated method stub
						WebDriver driver = new ChromeDriver();
						
						
						
						driver.get("https://rahulshettyacademy.com/angularpractice/");		
						driver.switchTo().newWindow(WindowType.TAB);
						
						Set<String> windows = driver.getWindowHandles();
						
						Iterator<String>it = windows.iterator();
						String parentId = it.next();
						String child = it.next();
						driver.switchTo().window(child);
						
						driver.get("https://rahulshettyacademy.com/#/index");
					String Username =	driver.findElements(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/p/get-access-to-all-courses']")).get(1).getText();
					driver.switchTo().window(parentId);
					
						
					driver.findElement(By.cssSelector("[name='name']")).sendKeys(Username);
						
						
	}

}
//a[href='https://courses.rahulshettyacademy.com/p/get-access-to-all-courses']