import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadali/Documents/chromedriver");
						// TODO Auto-generated method stub
						WebDriver driver = new ChromeDriver();
						driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
						
						
WebElement table =driver.findElement(By.id("product"));		
						
	System.out.println(table.findElements(By.tagName("tr")).size() );			
	
//List <WebElement>row=(table.findElements(By.tagName("")));
	//driver.findElements(By.cssSelector(".courses td:nth-child(4)").size();

						
	}

}
