package Testpackage;

import org.testng.annotations.Test;

public class Basic {

	@Test
	public void demo(){
		
		
		System.out.println("Hello NYC");
		
		
	}
	
	@Test(groups= {"city"})
	
public void demo8(){
		
		
		System.out.println("Hello Chicago");
		
		
	}
}