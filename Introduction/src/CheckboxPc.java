import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxPc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mohammad\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		

		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
driver.findElement(By.id("checkBoxOption1")).click();
System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
	}

}
