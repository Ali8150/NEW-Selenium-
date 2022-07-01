import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_Screenshot {

	public static void main(String[] args) throws IOException {
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
							
								
					WebElement name = driver.findElement(By.cssSelector("[name='name']"));

                       name.sendKeys(Username);
                       
                       
//partial Screenshot

                    File file = name.getScreenshotAs(OutputType.FILE);
                    
                    FileUtils.copyFile(file, new File("logo.png"));



		
		
	}

}
