package List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee_41 {
 
	public static void main(String[] args) {
		List<String> words=Arrays.asList("madam","mam","saas","rahul","vishali");
		
	  List<String> Palindromes=words.stream().filter(word ->isPalindrome(word)).collect(Collectors.toList());
		
	  System.out.println(Palindromes);
	}

	private static boolean isPalindrome(String str) {
		return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
	}
}
