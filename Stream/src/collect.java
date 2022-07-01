import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//covert stream to privious method
List<String> ls = (List<String>) Stream.of("Abhijeet","Don", "Alekhya","Adam","Ram","Rahim","karim","Jaber").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());



	
System.out.println(ls.get(0));
	

}
}