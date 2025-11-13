package List;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//36.Given a list of custom Employee objects, extract all unique departments
public class Employee_36 {

	private int id;
	private String name;
	private String department;
	
	public Employee_36(int id,String name,String department) {
		this.id=id;
		this.name=name;
		this.department=department;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public static void main(String[] args) {
		
	List<Employee_36> extractUnique=Arrays.asList(
			new Employee_36(101,"nilesh","Full stack development"),
			new Employee_36(102, "chetan","IT"),
			new Employee_36(103, "rohit", "Testing"),
			new Employee_36(104, "rohit", "Testing"));
	
	Set<String> uniqueElement=extractUnique.stream().map(Employee_36::getDepartment).collect(Collectors.toSet());
	System.out.println(uniqueElement);
	
	} 
}
