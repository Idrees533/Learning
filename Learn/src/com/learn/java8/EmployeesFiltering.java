package com.learn.java8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class EmployeesFiltering {

	public static void main(String[] args) {
		
		Map<String, Integer> employeeSalary=new HashMap<>();
		employeeSalary.put("Alice", 5000);
		employeeSalary.put("Bob", 7000);
		employeeSalary.put("Charli", 8000);
		employeeSalary.put("Devil", 6000);
		
		int salaryThreshold=6000;
		//ou want to filter out employees with salaries above a certain threshold 
		//and collect their names into a list.
 List<String> highPaidSalary=employeeSalary.entrySet().stream()
		.filter(p->p.getValue() > salaryThreshold)
		.map(Map.Entry ::getKey)
		.collect(Collectors.toList());
 System.out.println(highPaidSalary);
	}
}
