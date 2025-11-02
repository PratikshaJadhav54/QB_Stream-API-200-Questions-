package List;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintAllElement {

	public static void main(String[] args) {
		//1.Print all element
		
		System.out.println("Print All Element: ");
		List<Integer> list=Arrays.asList(12,13,45,67,86,87);
		list.stream().forEach(x -> System.out.print(x+", "));
		
		//2.Print Only Even Number
		
		System.out.println("\n\nPrint Only Even Number: ");
		List<Integer> evennumber=Arrays.asList(12,22,34,55,77,87,90);
		evennumber.stream().filter(x -> x%2==0).forEach(x -> System.out.print(x+", "));
		
		//3.Create a list of String and print this list in Upper case letter
		
		System.out.println("\n\nPrint List in Uppercase Letter: ");
		List<String> uppercaselist=Arrays.asList("mango","banana","pineapple","grapes","orange");
		uppercaselist.stream().map(x -> x.toUpperCase()).forEach(x -> System.out.print(x+", "));
		
		//4.create a list of strings, filter those starting with the letter “A”
		
		System.out.println("\n\nPrint List in those starting with 'A': ");
		List<String> filteringwitha=Arrays.asList("Apple","Mango","Orange","Grapes");
		filteringwitha.stream().filter(x -> x.startsWith("A")).forEach(x -> System.out.println(x));
		
		//5.Count how many numbers in a list are greater than 10
		
		System.out.println("\nCount How Many Nuumbers Greater then 10: ");
		List<Integer> Countnumber=Arrays.asList(1,2,12,13,45,67,86,87,10);
		Long graterthenten=Countnumber.stream().filter(x -> x>10).count();
		System.out.println(graterthenten);
		
		//6.Remove all null or empty strings from a list using streams
		
		System.out.println("\nRemove All null or Empty string: ");
		List<String> removeEmpty=Arrays.asList("Mango",null," ","Orange",null,null,"Pineapple");
		List<String> filteredlist=removeEmpty.stream()
				.filter(Objects::nonNull)       //remove actual null value
				.map(String::trim)             //remove spaces around strings
				.filter(x -> !x.isEmpty())     //remove empty strings
				.collect(Collectors.toList());
		System.out.println(filteredlist);
				
		//7.Sort a list of integers in ascending order using streams
		System.out.println("\nSort List in Ascending Order: ");
		List<Integer> sortAscending=Arrays.asList(1,2,12,13,45,12,32,67,86,87,10);
		List<Integer> sortinglist=sortAscending.stream().sorted().collect(Collectors.toList());
		System.out.println(sortinglist);
	
		//By using Second 
		Stream<Integer> sortingStream=sortAscending.stream().sorted();
		sortAscending.forEach(System.out::println);
		
		//8.Sort a list of strings in descending order using streams.
		System.out.println("\nSort List in Descending Order: ");
		List<Integer> sortDescending=Arrays.asList(1,2,12,13,45,12,32,67,86,87,10);
		List<Integer> names=sortDescending.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(names);
		
		//9.Find the first element in a list using Stream API.
		System.out.println("\nFind the first element: ");
		List<String> firstelement=Arrays.asList("Pooja","prakash","Janbbai");
		Optional<String> find=firstelement.stream().findFirst();
		System.out.println(find);
		//or
		System.out.println("Finding First element is: "+firstelement.stream().findFirst().get());
		
		//10.Find the maximum value in a list of integers using streams.
		System.out.println("\nFind Maximum value: ");
		List<Integer> maxvalue=Arrays.asList(21,2,99,3,4,45,67,98);
		System.out.println(maxvalue.stream().max(Integer::compareTo).get());
		
		//11.Find the minimum value in a list of integers using streams.
		System.out.println("\nFind Minimum value: ");
		List<Integer> minvalue=Arrays.asList(23,1,4,6,89,1);
		System.out.println(minvalue.stream().distinct().min(Integer::compareTo).get());
		
		//12.Count how many elements are in a list using Stream API.
		System.out.println("\nCount how many element: ");
		List<Integer> countelements=Arrays.asList(12,2,3,3,454,756,7);
		Long numbercount=countelements.stream().count();
		System.out.println(numbercount);
		
		//13.Given a list of integers, double each value using map() 
		System.out.println("\nDouble value of each element: ");
		List<Integer> number=Arrays.asList(1,2,3,4,5,6,7);
		number.stream().map(x -> x*2).forEach(x -> System.out.print(x +" "));
		
		//14.Filter and print only unique elements from a list using distinct()
		System.out.println("\n\nFilter Unique value: ");
		List<Integer> uniqueelement=Arrays.asList(12,23,12,23,34,45,56);
		uniqueelement.stream().distinct().forEach(x -> System.out.print(x+" "));
		
		//15.Concatenate all strings in a list into a single comma-separated string.
		System.out.println("\n\nConcate all string into single comma-separsted: ");
		List<String> element=Arrays.asList("pooja","prathmesh","akash","mohan","vijay");
		String result=element.stream().collect(Collectors.joining(", "));
		System.out.println(result);
		
		//16.Convert a list of integers into a list of their squares.
		System.out.println("\nConvert a list of integer and their squares: ");
		List<Integer> elements=Arrays.asList(12,13,14,15,16,17);
		List<Integer> squrelist=elements.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(squrelist);
		
		//17.Check if any number in a list is divisible by 7 using streams.
		System.out.println("\nCheck if anu number is divisible by 7: ");
		List<Integer> numbers=Arrays.asList(7,56,49,23,255,6243);
		numbers.stream().filter(x -> x%7==0).forEach(x -> System.out.print(x+" "));
		
		//18.. Check if all strings in a list have length greater than 3.
		System.out.println("\n\nCheck if all Strings are length greater then 3: ");
		List<String> name=Arrays.asList("Pooja","Prathmesh","Akash","Pratiksha");
		name.stream().filter(x -> x.length()>7).forEach(x -> System.out.print(x+", "));
		
		//19.Get the sum of all integers in a list using reduce()
		System.out.println("\n\nSum of all integers numbers using reduce: ");
		List<Integer> sumOfNumber=Arrays.asList(12,123,234,13);
		Optional<Integer> optional=sumOfNumber.stream().reduce((x,y)->x+y);
		System.out.println(optional);
		
		//20.Collect only odd numbers from a list into a new list using streams.
		System.out.println("\nCollect Only Odd Number into new list: ");
		List<Integer> oddNumber=Arrays.asList(21,2,99,3,4,45,67,98);
		List<Integer> resultOdd=oddNumber.stream().filter(x -> x%2!=0).collect(Collectors.toList());
		System.out.println(resultOdd);
		
		//21.Given a list of words, create a list of their lengths using map() .
		System.out.println("\ncreate a list of their lengths using map(): ");
		List<String> words=Arrays.asList("Pooja","Prathmesh","prakash");
		words.stream().map(x -> x.length()).forEach(x -> System.out.print(x+" "));
		
		//22.Given a list of sentences, extract all unique words using flatMap()
		System.out.println("\n\nlist of sentences,extract all unique words: ");
		List<String> sentences=Arrays.asList("java is powerful","java is varsatile","java makes stream API");
	    Set<String> uniqueWords=sentences.stream()
	    		.flatMap(sentence -> Arrays.stream(sentence.split("")))
	    		.map(String::toLowerCase)
	    		.collect(Collectors.toSet());
		System.out.println(uniqueWords);
		//23.		
		
		
	}
}
