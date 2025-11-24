package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllSetQuestions {

	public static void main(String[] args) {
		
		//1.print all element of a list stream API
		Set<Integer> number=new HashSet<Integer>();
		number.add(10);
		number.add(12);
		number.add(23);
		number.add(78);
		number.add(90);
		System.out.println("All Element In set");
		number.stream().forEach(x -> System.out.print(x+","));
		
		//2.convert all strings in a set<String> to upper case using streams
		Set<String> uppercase=new HashSet<String>();
		uppercase.add("pooja");
		uppercase.add("vidya");
		uppercase.add("mrudula");
		uppercase.add("Raju");
		
		System.out.println("All Set element print in uppercase letter");
		uppercase.stream().map(x -> x.toUpperCase()).forEach(x -> System.out.print(x+", "));
		
		//3.
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
