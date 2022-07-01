import java.util.Arrays;
import java.util.List;
import org.testng.Assert;

import org.testng.Assert;

public class match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String>names = Arrays.asList("Abhijeet","Don", "Alekhya","Adam","Ram","Rahim","karim","Jaber");
		
		boolean	flag=names.stream().anyMatch(s->s.equalsIgnoreCase("Adam"));
			
		Assert.assertTrue(flag);
		
	}

}
