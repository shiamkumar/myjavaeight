package com.java.eight.programs.employees;

import java.util.List;
import java.util.stream.Collectors;

public class MaleEmployeeList {
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeUtil.getEmployees();
		
		List<Employee> maleEmpList = employees.stream()
				.filter(emp -> emp.getGender().toString().equals("male"))
				.collect(Collectors.toList());
		maleEmpList.forEach(System.out::println);
		
	}
}
