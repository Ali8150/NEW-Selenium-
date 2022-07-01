import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sortNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> values = Arrays.asList(3,4,5,4,8,4,3,2,1,8,4,7,6,1);
		
		   List<Integer> li=  values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li);
		
	}

}
