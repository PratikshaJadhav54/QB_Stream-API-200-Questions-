package List;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee_43 {

   //43.Given a list of sentences, count how many times each word occurs.
	public static void main(String[] args) {
		
	List<String> sentences=Arrays.asList("Rahul is god Boy","The cat saw the cat in the mirror","I like ice cream because ice cream make",
		"The dog ran fast, but the dog stopped suddenly","She said yes again because yes felt right.");
	
	 Map<String, Long> wordCount =
             sentences.stream()
                     .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                     .map(String::toLowerCase)   // optional: to make counting case-insensitive
                     .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

     System.out.println(wordCount);
    }
}
