package com.java.eight.programs.employees;

import java.util.List;
import java.util.stream.Collectors;

public class AverageSalaryByDepartment {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeUtil.getEmployees();
		
		int deptId = 100003;
		int totalSalaryByDept = employees.stream().filter(e -> e.getDepartmentId() == deptId)
				.collect(Collectors.summingInt(Employee::getSalary));
		long empCountByDept = employees.stream().filter(e -> e.getDepartmentId() == deptId).count();
		System.out.println("Employee Department Average Salary: " + totalSalaryByDept / empCountByDept);

	}
}
