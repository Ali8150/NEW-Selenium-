import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class sorted {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadali/Documents/chromedriver");

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
	List <WebElement>	elements =driver.findElements(By.xpath("//tr/td[1]"));
		//sort and compaire with original.
          List<String> original =  elements.stream().map(s->s.getText()).collect(Collectors.toList());
         List<String> sorted = elements.stream().map(s->s.getText()).sorted().collect(Collectors.toList());
         
         Assert.assertEquals(original, sorted);
         
         
         
         
         //get the price
         
         List<String> price;
         
         
       do {  
    	   List <WebElement>	rows =driver.findElements(By.xpath("//tr/td[1]"));
              price = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getpriceVeggie(s)).collect(Collectors.toList());
         price.forEach(a->System.out.println(a));
         
         if(price.size()<1) {
        	 
        	 driver.findElement(By.cssSelector("[aria-label='Next']")).click();
        	 
        	 
        	 
        	 
       }
       }while(price.size()<1);
         
         
         
}
	
	
	
	
	
	
	
	

	private static String getpriceVeggie(WebElement s) {
		String pricevalu =	s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return  pricevalu;
	}

	

}
