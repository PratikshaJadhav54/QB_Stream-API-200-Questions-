package List;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Given a list of Employee objects, sort them by salary (ascending).
public class Employee_37_38 {

	private int id;
	private String name;
	private double salary;

	public Employee_37_38(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public static void main(String[] args) {
		
		List<Employee_37_38> list=Arrays.asList(
				new Employee_37_38(1, "chetan", 23000),
				new Employee_37_38(2, "rohit", 45000),
				new Employee_37_38(3,"pooja",12000));
		
		List<Employee_37_38> sortedElement=list.stream().sorted(Comparator.comparing(Employee_37_38::getSalary)).collect(Collectors.toList());
		sortedElement.forEach(x -> System.out.println(x.getId()+" - "+x.getName()+" - "+x.getSalary()));
		
		Optional<Employee_37_38> highestSalary=list.stream().max(Comparator.comparing(Employee_37_38::getSalary));
		highestSalary.ifPresent(e -> System.out.println("\nHighest Paid Salary: "+e.getId()+" - "+e.getName()+" - "+e.getSalary()));
		
	}
}