import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"/Users/mohammadali/Documents/chromedriver");
						// TODO Auto-generated method stub
						WebDriver driver = new ChromeDriver();
						
						driver.get("https://www.google.com/");
						
						
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
				
				FileUtils.copyFile(src, new File("/Users/mohammadali/screenshot.png"))	;		
	}

}
