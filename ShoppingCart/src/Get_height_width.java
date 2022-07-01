import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_height_width {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadali/Documents/chromedriver");
						// TODO Auto-generated method stub
						WebDriver driver = new ChromeDriver();
						
						
						
						driver.get("https://rahulshettyacademy.com/angularpractice/");		
						WebElement name = driver.findElement(By.cssSelector("[name='name']"));
						
					System.out.println(	name.getRect().getDimension().getHeight());
                    System.out.println( name.getRect().getDimension().getWidth() );
	                     
	}

}
