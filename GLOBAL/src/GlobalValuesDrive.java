import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
                  
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("/Users/mohammadali/eclipse-workspace/GLOBAL/data.properties");
		
		prop.load(fis);
		
System.out.println(prop.getProperty("browser"));
		
System.out.println(prop.getProperty("url"));	

  prop.setProperty("browser", "firefox");
  prop.setProperty("url", "https://www.google.com/");
  FileOutputStream fos = new FileOutputStream("/Users/mohammadali/eclipse-workspace/GLOBAL/data.properties");

	prop.store(fos, null);	
	System.out.println(prop.getProperty("browser"));
	
	System.out.println(prop.getProperty("url"));	
  
	}

}
