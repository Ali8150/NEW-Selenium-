import java.util.Arrays;
import java.util.List;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//convert a array into array list
				List <String>names = Arrays.asList("Abhijeet","Don", "Alekhya" , "Adam","Ram","Rahim","karim","Jaber");
				
				
				 //print names which have last letter as "a" with Uppercase
				names.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			
				//print names which have first letter as "A" with uppercase and sorter
				
				
				names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
				
	}

}
