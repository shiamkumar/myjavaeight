package com.java.eight.programs.employees;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestSalaryOfEmployee {
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeUtil.getEmployees();
		
		Optional<Employee> result01 = employees.stream()
			.sorted(Comparator.comparing(Employee::getSalary).reversed())
			.skip(1)
			.findFirst();
		System.out.println("2nd Highest Salary: "+result01.get().getSalary());

			
		List<Employee> result02 = employees.stream()
			.sorted(Comparator.comparing(Employee::getSalary).reversed())
			.collect(Collectors.toList());	
		System.out.println("3rd Highest Salary: "+result02.get(2).getSalary()); 
		
	}
}
