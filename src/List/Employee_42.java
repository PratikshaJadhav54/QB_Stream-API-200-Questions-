package List;

import java.util.Arrays;
import java.util.List;

public class Employee_42 {

	//42.From a list of numbers, create a list of numbers squared but only if they are even.
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(12,23,43,3,4,5,2);
		
		list.stream().map(x -> x*x).filter(x -> x%2==0).forEach(x -> System.out.print(x+", "));
	}
}
