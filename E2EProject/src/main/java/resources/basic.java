package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
public class basic {

	public WebDriver driver;
public	Properties prop = new Properties();
	public WebDriver initializerDriver() throws IOException {
		
		
		
		
		
		
	 FileInputStream fis=new FileInputStream("/Users/mohammadali/eclipse-workspace/E2EProject/src/main/java/resources/data.properties");
	 
	 prop.load(fis);
		
		
String browserName = prop.getProperty("browser");


if(browserName.equals("chrome")) {
	
	
	System.setProperty("webdriver.chrome.driver",
			"/Users/mohammadali/Documents/chromedriver");

	// TODO Auto-generated method stub
	 driver = new ChromeDriver();
	
} else if(browserName.equals("firfox")) {
	
	System.setProperty("webdriver.geckodriver.driver",
			"/Users/mohammadali/Documents/geckodriver");
	
	
	driver = new FirefoxDriver();
	

	
	
	} 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		return driver;
		
		
		
		
		}
	
	
	
	
	


	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;


	}
	
	
}
