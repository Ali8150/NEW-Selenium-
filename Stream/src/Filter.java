import java.util.ArrayList;

public class Filter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Steamfilter ();
		
		
	}
	
	
	
	public static void Steamfilter (){
		
		
		ArrayList<String> names = new ArrayList<String>();		

		names.add("Abhijeet");

		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		names.add("Rahim");
		names.add("Karim");
		names.add("Jaber");
			//count the name that start with A ;
			Long Startwith = names.stream().filter(s->s.startsWith("A")).count();
				System.out.println(Startwith);
				
				
				
				//count the name that end with A ;	
		Long Endwith =names.stream().filter(s->s.endsWith("a")).count();
		System.out.println(Endwith);
		
		//print the name that lenght is less than 4		
				
		names.stream().filter(s->s.length()>4).forEach(s ->System.out.println(s));		
				
				
		//print one name that lenght is less than 4	
		
		names.stream().filter(s->s.length()>4).limit(1).forEach(s ->System.out.println(s));	
		
		
		
		
			}
	}


