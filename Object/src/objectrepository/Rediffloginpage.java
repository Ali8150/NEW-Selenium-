package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffloginpage {

	WebDriver driver;
	
	
	public Rediffloginpage(WebDriver driver) {
		
		this.driver=driver;
		
		
	}
	
	By usernam = By.xpath(".//*[@id='login1']");
	By Password = By.name("password");
	By go=By.name("proceed");
	
	public WebElement Emaild() {
		
		return driver.findElement(usernam);
		
		
	}
	
public WebElement pass() {
		
		return driver.findElement(Password);
		
		
	}
public WebElement login() {
	
	return driver.findElement(go);
	
	
}
	
}
