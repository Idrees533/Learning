package com.code.interview.ness;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class EmployeeList {

	public static void main(String[] args) {
		List<Employee> employeesList = new ArrayList<>();
		 
        employeesList.add(new Employee(101, "Glady", "Manager", "Male", 25_00_000));
        employeesList.add(new Employee(102, "Vlad", "Software Engineer", "Female", 160_00_000));
        employeesList.add(new Employee(103, "Shine", "Lead Engineer", "Female", 20_00_000));
        employeesList.add(new Employee(104, "Nike", "Manager", "Female", 25_00_000));
        employeesList.add(new Employee(105, "Slagan", "Software Engineer", "Male", 15_00_000));
        employeesList.add(new Employee(106, "Murekan", "Software Engineer", "Male", 13_00_000));
        employeesList.add(new Employee(107, "Gagy", "Software Engineer", "Male", 15_00_000));
        
     //find the average salary of each desgination
        
     List list  = employeesList.stream() 
        .collect(Collectors.groupingBy(Employee::getDesignation,
        		Collectors.averagingLong(Employee::getSalary)))
        .entrySet().stream()
        .collect(Collectors.toList());
     
     System.out.println(list);
	}
}
