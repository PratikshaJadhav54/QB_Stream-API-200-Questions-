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
		
		System.out.println("\n\nAll Set element print in uppercase letter");
		uppercase.stream().map(x -> x.toUpperCase()).forEach(x -> System.out.print(x+", "));
		
		//3.Filter and print only even numbers from a Set<Integer>
		Set<Integer> evennumber=new HashSet<Integer>();
		evennumber.add(12);
		evennumber.add(34);
		evennumber.add(90);
		evennumber.add(77);
		evennumber.add(24);
		
		System.out.println("\n\nPrint even number only");
		evennumber.stream().filter(x -> x%2==0).forEach(x -> System.out.print(x+", "));
		
		//4.Count how many Strings in a Set<String> start with the letter "A"
		Set<String> startWith=new HashSet<String>();
		startWith.add("Pooja");
		startWith.add("Akash");
		startWith.add("Akshay");
		startWith.add("Prakash");
		startWith.add("Ramu");
		
		System.out.println("\n\nPrint only name start with A");
		startWith.stream().filter(x -> x.startsWith("A")).forEach(x -> System.out.print(x+", "));
		
		
		
		
		
		
		
		
		
		
		
	}
}
