package Set;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import javax.security.auth.x500.X500Principal;

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
        
        //12.Convert a Set<Integer> to a comma-separated string using Collectors.joining() .
        Set<String> commaName=Set.of("mohan","ppoja","vaibhav","pritesh");
        System.out.println("\n\nConvert set to comma-seperated: ");
        String result=commaName.stream().collect(Collectors.joining(", "));
        System.out.println(result);
        
        //13.Create a new Set<Integer> containing only odd numbers from an existing set
        Set<Integer> oddNumber=Set.of(34,343,26,75,743,87);
        System.out.println("\n\nContaining odd Numbers Existing Only: ");
        Set<Integer> odd=oddNumber.stream().filter(x -> x%2==0).collect(Collectors.toSet());
        System.out.println(odd);
        
        //14.. Convert a Set<String> into a Set<Integer> representing each stringʼs length
        Set<String> namesLength=Set.of("poja","bhushan","priti","vidya","prakash");
        System.out.println("\nconvert set string into interger with each string's  length: ");
        Set<Integer> result1=namesLength.stream().map(String::length).collect(Collectors.toSet());
        System.out.println(result1);
        
        //15.Count the total number of characters across all strings in a Set<String> .
        Set<String> chracterStrings=Set.of("pooja","rahul","thejas","purvesh");
        System.out.println("Count total number of charachter in all strings");
        chracterStrings.stream().filter(x -> x!=null).mapToInt(String::length).sum();
        
        //16.Print only distinct lowercase versions of all strings in a Set<String> .
        Set<String> lowercaseDistincenames=Set.of("pooja","rahul","thejas","purvesh","pritu");
        System.out.println("\nPrint only distince and lowercase letter Names: ");
       lowercaseDistincenames.stream().map(x -> x.toLowerCase()).distinct().forEach(x -> System.out.print(x+", "));
//        System.out.println(lowercase);
        
        //17.Convert a Set<Integer> to a List<Integer> using streams.
        Set<Integer> convertintoList=Set.of(23,56,4,3,2,1);
        System.out.println("\n\nSet integer convert into list integer: ");
        List<Integer> convertlist=convertintoList.stream().collect(Collectors.toList());
        System.out.println(convertlist);
        
        //18.Limit a stream from a Set<Integer> to the first 3 elements and print them.
        Set<Integer> firstThreeLetter=Set.of(12,34,2,1,32,21);
        System.out.println("\nLimit the stream and the only three element are print: ");
        firstThreeLetter.stream().limit(3).forEach(x -> System.out.print(x+", "));
        
        //19.Skip the first 2 elements from a Set<Integer> stream and print the rest.
        Set<Integer> skipTwoElement=Set.of(12,35,25,15,76);
        System.out.println("\n\nSkip First Three Element: ");
        skipTwoElement.stream().skip(2).forEach(x -> System.out.print(x+", "));
        
        //20.. Given a Set<String> , create a Map<String, Integer> (key = string, value = length)
        Set<String> keyValueResult=Set.of("pooja","raju","pritesh","vaibhav");
        System.out.println("\n\nGiven String result show in key and value pairs: ");
        Map<String, Integer> result2=keyValueResult.stream().collect(Collectors.toMap(str -> str,str ->str.length()));
        System.out.println(result2);
        
        //21.Given a Set<Integer> , find the average value using Stream API.
        Set<Integer> average=Set.of(12,34,23,13);
        System.out.println("\nFind the average value of numbers: ");
        double avg=average.stream().mapToInt(n -> n).average().orElse(0);
        System.out.println(avg);
        
        //22.Given a Set<Integer> , find the second highest number using streams.
//        Set<Integer> 
        //fytfyfyfyfytftttdtdttt\
        System.out.println("uyeryteytreyteuytuety");
        
        
        
        
        
        
        
        
	}
}
