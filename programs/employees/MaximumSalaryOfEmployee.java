package com.java.eight.programs.employees;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaximumSalaryOfEmployee {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeUtil.getEmployees();

		Employee employeeMaxSalary = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println("Maximum Salary:: " + employeeMaxSalary.getName() + " : " + employeeMaxSalary.getSalary());

		Optional<Employee> employeeMinSalary = employees.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("Minimum Salary:: " + employeeMinSalary.get().getName() + " : " + employeeMinSalary.get().getSalary());

	}
}
