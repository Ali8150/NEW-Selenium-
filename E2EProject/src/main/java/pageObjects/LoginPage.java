package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	      By usrname  =By.id("user_email");
	
	By password = By.id("user_password");
	      
	By log = By.cssSelector("a[href='https://rahulshettyacademy.com/sign_in/']");
	      
	      
	      
	      
public LoginPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
	
	this.driver=driver;
	
	
		}

public WebElement usr () {
	
	
	return driver.findElement(usrname);
	
	
}



public WebElement pass (){	      
	
	
	return driver.findElement(password);
	
	
}
	      

public WebElement login(){	      
	
	
	return driver.findElement(log);
	
	
}

	
}
