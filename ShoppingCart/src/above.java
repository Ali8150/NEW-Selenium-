import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class above {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadali/Documents/chromedriver");

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
//above		
	WebElement child =	driver.findElement(By.cssSelector("[name='name']"));
		
	System.out.println(	driver.findElement(with(By.tagName("label")).above(child)).getText());
	
	
	
	//below
	 WebElement parents =  driver.findElement(By.cssSelector("[for='dateofBirth']"));
	 driver.findElement(with(By.tagName("input")).below(parents)).click();
	 
	 
	 //left
	 
WebElement left =	 driver.findElement(By.cssSelector("[for='exampleCheck1']"));
	 
driver.findElement(with(By.tagName("input")).toLeftOf(left)).click();




//right


WebElement Right = driver.findElement(By.id("inlineRadio1"));
   System.out.println( driver.findElement(with(By.tagName("label")).toRightOf(Right)).getText());

	}
	

}
