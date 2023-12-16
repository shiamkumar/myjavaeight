package com.java.eight.programs.employees;

import java.util.Arrays;
import java.util.List;

public class EmployeeUtil {
	public static List<Employee> getEmployees() {
		Employee emp1 = new Employee(1, "Peter", 46, 20000, 100001, "male");
		Employee emp2 = new Employee(3, "Sam", 42, 90000, 100003, "male");
		Employee emp3 = new Employee(5, "Jack", 29, 70000, 100007, "female");
		Employee emp4 = new Employee(4, "Hari", 26, 50000, 100005, "male");
		Employee emp5 = new Employee(2, "Lucky", 24, 30000, 100005, "female");
		Employee emp6 = new Employee(7, "Ravi", 25, 40000, 100003, "male");
		Employee emp7 = new Employee(5, "John", 55, 120000, 100001, "female");
		Employee emp8 = new Employee(8, "Lucy", 27, 50000, 100003, "male");
		return Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8);
	}
}
