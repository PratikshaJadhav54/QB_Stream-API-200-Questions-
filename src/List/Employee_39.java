package List;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee_39 {
		
		static class Employee {
	        String name;
	        String department;

	        Employee(String name, String department) {
	            this.name = name;
	            this.department = department;
	        }

	        String getName() {
	            return name;
	        }

	        String getDepartment() {
	            return department;
	        }
	    }

	    public static void main(String[] args) {

	        // Employee list
	        List<Employee> employees = Arrays.asList(
	                new Employee("Rohit", "HR"),
	                new Employee("Sneha", "IT"),
	                new Employee("Amit", "Finance"),
	                new Employee("Priya", "IT"),
	                new Employee("Kiran", "HR")
	        );

	        // Group by department
	        Map<String, List<Employee>> grouped =
	                employees.stream()
	                        .collect(Collectors.groupingBy(Employee::getDepartment));

	        // Print grouped result
	        grouped.forEach((dept, empList) -> {
	            System.out.println(dept + ":");
	            empList.forEach(e -> System.out.println("  - " + e.getName()));
	        });
	    }
}
