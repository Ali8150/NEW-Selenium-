package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	      By singin  =By.cssSelector("a[href*='https://rahulshettyacademy.com/sign_in/']");
	
	By close = By.xpath("//button[text()='NO THANKS']");   
	      
	      
	By Title =  By.cssSelector(".text-center>h2");
	

	   By nav = By.cssSelector("ul[class='nav navbar-nav navbar-right']");
	
	
	
public LandingPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
	
	this.driver=driver;
	
		}

public WebElement cancel () {
	
	
	return driver.findElement(close);
	
	
}

public WebElement getTitle () {
	
	
	return driver.findElement(Title);
	
	
}





public WebElement getLogin (){	      
	
	
	return driver.findElement(singin);
	
	
}

public WebElement navagation (){	      
	
	
	return driver.findElement(nav);
	
	
}


	      
	
}
