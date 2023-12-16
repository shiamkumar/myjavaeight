package com.java.eight.programs.employees;

import java.util.List;
import java.util.stream.Collectors;

public class FemaleEmployeeList {
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeUtil.getEmployees();
		
		List<Employee> femaleEmpList = employees.stream()
				.filter(emp -> emp.getGender().toString().equals("female"))
				.collect(Collectors.toList());
		femaleEmpList.forEach(System.out::println);
	}
}
