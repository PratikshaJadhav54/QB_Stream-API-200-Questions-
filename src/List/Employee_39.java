package List;

import java.util.Arrays;
import java.util.List;

//39. Group a list of employees by department using Collectors.groupingBy()
public class Employee_39 {

	private int id;
	private String name;
	private String department;
	
	public Employee_39(int id,String name,String department)
	{
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
		
//		extractUnique.stream().map()
	}
}
