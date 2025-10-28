package List;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
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
		
		//3.Create a list of String and print this list in uppercase letter
		
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
		
		//8.
	}
}
