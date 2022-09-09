package com.example.hays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeServiceStub {
	private static Map<Long, Employee> employees = new HashMap<>();
	private static Long index = 2L;
	
	static {
		Employee employee1 = new Employee(1L, "Raj","1214545666",(long) 45211);
		Employee employee2 = new Employee(2L, "Sapna","12221453",(long) 45211);
		Employee employee3 = new Employee(3L, "Sapna","12221453",(long) 45211);
		Employee employee4 = new Employee(4L, "Sapna","12245566",(long) 45211);
		Employee employee5 = new Employee(5L, "Sapna","124546645",(long) 45666);
		
		
		employees.put(1L, employee1);
		employees.put(2L, employee2);
		employees.put(3L, employee3);
		employees.put(4L, employee4);
		employees.put(5L, employee5);
		
	}
	
	
	public static List<Employee> getAllEmployees(){
		return new ArrayList<>(employees.values());
	}
	
	public static Employee getEmployeeDetails(Long employeeId) {
		return employees.get(employeeId);
	}
	public static Employee addEmployee(Employee employee) {
		index+=1;
		employee.setId(index);
		employees.put(index, employee);
		return employee;
	}
	public static Employee updateEmployee(Long employeeId,Employee employee ) {
		employee.setId(employeeId);
		employees.put(employeeId, employee);
		return employee;
	}
	
	public static Employee deleteEmployee(Long employeeId) {
		return employees.remove(employeeId);
	}
	
	
	
	
	

}
