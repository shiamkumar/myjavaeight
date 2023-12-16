package com.java.eight.programs.employees;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupedByDepartmentList {
	public static void main(String[] args) {
		
		List<Employee> employees = EmployeeUtil.getEmployees();
		
		Map<Integer, List<Employee>> result = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartmentId, Collectors.toList()));
		
		result.forEach((key, value) -> {
			System.out.println(key + " : " +  value);
		});
		
	}
}
