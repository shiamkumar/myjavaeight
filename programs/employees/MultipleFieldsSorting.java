package com.java.eight.programs.employees;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleFieldsSorting {
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeUtil.getEmployees();

		Comparator<Employee> compareByIdAndName = 
				Comparator
				.comparing(Employee::getId)
				.thenComparing(Employee::getName);//.reversed();

		List<Employee> sortedEmployee =
				employees
				.stream()
				.sorted(compareByIdAndName)
				//.sorted(compareByIdAndName.reversed())
				.collect(Collectors.toList());
		
		sortedEmployee.forEach(System.out::println);
		
	}
}
