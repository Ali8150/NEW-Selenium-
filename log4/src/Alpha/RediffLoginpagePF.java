package Alpha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpagePF {

	// TODO Auto-generated method stub
			WebDriver driver;
			
			
			public  RediffLoginpagePF(WebDriver driver){
				
				this.driver=driver;
				PageFactory.initElements(driver, this);
				
			}
			

			
			@FindBy (xpath=".//*[@id='login1']")
		WebElement	usernam;
			
			
			@FindBy (name="passwd")
			WebElement	Password;
			
			
			@FindBy (name="proceed")
			WebElement	go;
			
			
			
			
			
			
			
			
			public WebElement Emaild() {
				
				return usernam;
				
				
			}
			
		public WebElement pass() {
				
				return Password;
				
				
			}
		public WebElement login() {
			
			return go;
			
			
		}
	
	
}
