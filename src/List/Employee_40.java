package List;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee_40 {

    static class Employee {
        String name;
        String department;
        Double salary;

        Employee(String name, String department, Double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        String getName() { return name; }
        String getDepartment() { return department; }
        Double getSalary() { return salary; }
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rohit", "HR", 12000.00),
                new Employee("Sneha", "IT", 78000.00),
                new Employee("Amit", "Finance", 90000.00),
                new Employee("Priya", "IT", 12344.00),
                new Employee("Kiran", "HR", 45637.00)
        );

        // Calculate total salary per department
        Map<String, Double> totalSalary =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.summingDouble(Employee::getSalary)
                        ));

        System.out.println(totalSalary);
    }
}
