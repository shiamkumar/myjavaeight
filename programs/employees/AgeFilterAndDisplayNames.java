package com.java.eight.programs.employees;

import java.util.List;
import java.util.stream.Collectors;

public class AgeFilterAndDisplayNames {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeUtil.getEmployees();
		List<String> result = employees
			.stream()
			.filter(e -> e.getAge()>30)
			.map(Employee::getName)
			.collect(Collectors.toList());
		System.out.println("Employee Names: "+result);
	}
}
