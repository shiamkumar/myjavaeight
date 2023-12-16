package com.java.eight.programs.employees;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class MaximumSalaryByEachDepartment {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeUtil.getEmployees();
		
		Map<Integer, Optional<Employee>> maxSalarybyEachDepart = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));

		maxSalarybyEachDepart.entrySet().forEach(map -> {
			System.out.println(map.getKey() + ": " + map.getValue().get().getName()  + ": " + map.getValue().get().getSalary());
		});
		
	}
}
