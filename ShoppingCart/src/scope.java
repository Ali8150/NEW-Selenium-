import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadali/Documents/chromedriver");

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
                  System.out.println(driver.findElements(By.tagName("a")).size());
                  
   WebElement  footer = driver.findElement(By.id("gf-BIG"));           
		
   System.out.println(footer.findElements(By.tagName("a")).size());
   WebElement footcolum1 =  footer.findElement(By.xpath("//tbody/tr/td[4]/ul"));
   System.out.println(footcolum1.findElements(By.tagName("a")).size());


   for (int i=1; i <= footcolum1.findElements(By.tagName("a")).size(); i++ ) {
	   
	   String clickLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
	   
	   footcolum1.findElements(By.tagName("a")).get(i).sendKeys(clickLinkTab);
	   
	   Thread.sleep(5000L);
   
   }
	  Set<String> abc =driver.getWindowHandles();
	  Iterator<String> it=abc.iterator();
		
	while(it.hasNext()) {
		
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
		
	}
		
		 
		
	   
	   
   
   
	
		
		
	}

}
