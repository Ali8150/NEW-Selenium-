import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class parctice5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"/Users/mohammadali/Documents/chromedriver");
								// TODO Auto-generated method stub
								WebDriver driver = new ChromeDriver();
								driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");		
			driver.findElement(By.id("autocomplete")).sendKeys("Ban");					
			
			
			Thread.sleep(3000);
			List<WebElement> options = driver.findElements(By.className("ui-menu-item"));
			for (WebElement option : options) {
				if (option.getText().equalsIgnoreCase("Bangladesh")) {
					option.click();
					break;
					
					
				}
			}
			
			
		
		
		
	}

}
