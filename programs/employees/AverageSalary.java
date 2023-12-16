package com.java.eight.programs.employees;

import java.util.List;
import java.util.stream.Collectors;

public class AverageSalary {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeUtil.getEmployees();

		int totalSalary = employees.stream().collect(Collectors.summingInt(Employee::getSalary));
		int empCount = employees.size();
		System.out.println("Employee Average Salary: " + totalSalary / empCount);
	}

}
