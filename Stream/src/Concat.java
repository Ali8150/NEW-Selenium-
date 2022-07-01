import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//merging 2 different list
		List <String>names1 = Arrays.asList("mohammad","Tash","Ali");
		List <String>names = Arrays.asList("Abhijeet","Don", "Alekhya" , "Adam","Ram","Rahim","karim","Jaber");
		
Stream<String>   newStream = Stream.concat(names1.stream(), names.stream());
		newStream.sorted().forEach(s->System.out.println(s));
	}
	}


