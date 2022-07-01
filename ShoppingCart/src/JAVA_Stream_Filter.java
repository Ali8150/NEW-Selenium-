import java.util.ArrayList;

public class JAVA_Stream_Filter {

	public void Steamfilter (){
		
		
ArrayList<String> names = new ArrayList<String>();		

names.add("Abhijeet");

names.add("Don");
names.add("Alekhya");
names.add("Adam");
names.add("Ram");
names.add("Rahim");
names.add("Karim");
names.add("Jaber");
	
	Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
	}
}
