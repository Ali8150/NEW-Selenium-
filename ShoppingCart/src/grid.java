import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Assert;
public class grid {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadali/Documents/chromedriver");
		
		

		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
	JavascriptExecutor js =(JavascriptExecutor)driver;	
	
	js.executeScript("window.scrollBy(0,500)");
	
	//Thread.sleep(3000);
		
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	
	//grid code start here
	
	
	
List<WebElement> Values =	driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
int sum = 0;
			
	for (int i =0; i <Values.size(); i++) {
		
		
	sum = sum + (Integer.parseInt(Values.get(i).getText()));
		
		
	}
	
System.out.println(sum);	
	
	String text =(driver.findElement(By.cssSelector(".totalAmount")).getText());
	
	Assert.assertEquals(text, "Total Amount Collected: 296" );
	driver.quit();
	
	
	
	}

}
