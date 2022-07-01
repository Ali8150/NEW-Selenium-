package Testpackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	
	
	
@Test(dataProvider ="getdata")	
public void test(String username, String password) {
	
	System.out.println(username);
	System.out.println(password);
	
	
	
}
	

	
@Test	
@DataProvider
public Object[][] getdata (){
	
	Object[][] data = new Object [3] [2] ;
	
	
	 data[0][0] = "FirstUsername";
	 data[0][1] = "FirstPassword";
	 
	 
	 
	 data[1][0] = "2ndUsername";
	 data[1][1] = "2ndpassword";
	 
	 
	 data[2][0] = "3rdUsername";
	 data[2][1] = "3rdpassword";
	 
	return data;
	
	
}




}
