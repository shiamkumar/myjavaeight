package com.java.eight.programs.employees;

import java.util.List;
import java.util.stream.Collectors;

public class SeniorEmployeeList {
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeUtil.getEmployees();
		
		List<Employee> seniorEmpList = employees.stream()
				.filter(emp -> emp.getAge() > 40)
				.collect(Collectors.toList());
		seniorEmpList.forEach(System.out::println);
	}
}
