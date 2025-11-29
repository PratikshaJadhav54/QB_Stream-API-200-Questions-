package Set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

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
		
		//5.. Convert a Set<Integer> to a sorted list using Stream API.
		Set<Integer> sortedlist= Set.of(90,56,2,1,9,6);
		System.out.println("\n\nSorted list Print");
		sortedlist.stream().sorted().forEach(x -> System.out.print(x+", "));
		
		//6.Remove all null or empty strings from a list using streams
		Set<String> numberlist=new HashSet<String>();
		System.out.println("\n\nRemove all null or empty strings from a list using streams");
        numberlist.add("");
        numberlist.add("Mohan");
        numberlist.add("pooja");
        numberlist.add(null);
        numberlist.add("Vaibhav");
        
        Set<String> cleanedSet=numberlist.stream().filter(x -> x!=null && !x.isEmpty()).collect(Collectors.toSet());
		System.out.println(cleanedSet);
		
		
		//7.Find the maximum element in a Set<Integer> using streams.
		Set<Integer> maxnumber=Set.of(12,7,67,89,65,4);
		System.out.println("\nMaximum Number: ");
		System.out.println(maxnumber.stream().max(Integer::compareTo).get());
		
		//8.Find the minimum element in a Set<Integer> using streams.
		Set<Integer> minnumber=Set.of(12,7,67,89,65,4);
		System.out.println("\nMinimum Number: ");
        System.out.println(minnumber.stream().min(Integer::compareTo).get());	
        
        //9.Calculate the sum of all integers in a Set<Integer> using reduce()
        Set<Integer> sumOfNumber=Set.of(12,7,67,89,65,4);
        System.out.println("\nSum Of All Numbers: ");
        Optional<Integer> sum=sumOfNumber.stream().reduce((x,y)->x+y);
        System.out.println(sum);
        
        //10.Check if any element in a Set<Integer> is divisible by 5 using streams.
        Set<Integer> divisibleByFive=Set.of(12,7,67,89,65,4);
        System.out.println("\nCheck if number is divisible by 5");
        divisibleByFive.stream().filter(x -> x%5==0).forEach(x-> System.out.println(x));
        
        //11.Check if all elements in a Set<Integer> are positive numbers.
        Set<Integer> positiveNumber=Set.of(12,7,67,89,65,4,-9,78,-91);
        System.out.println("\nCheck if all elements are positive numbers:");
        positiveNumber.stream().filter(x -> x>0).forEach(x -> System.out.print(x+", "));
        
        //12.
        
        
        
        
        
        
        
        
        
	}
}
