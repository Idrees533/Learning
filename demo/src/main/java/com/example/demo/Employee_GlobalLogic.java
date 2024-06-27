package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee_GlobalLogic {

	public static void main(String[] args) {
		
		List<Employee> employeesList = new ArrayList<>();
		 
        employeesList.add(new Employee(101, "Glady", "Manager", "Male", 25_00_000));
        employeesList.add(new Employee(102, "Vlad", "Software Engineer", "Female", 15_00_000));
        employeesList.add(new Employee(103, "Shine", "Lead Engineer", "Female", 20_00_000));
        employeesList.add(new Employee(104, "Nike", "Manager", "Female", 25_00_000));
        employeesList.add(new Employee(105, "Slagan", "Software Engineer", "Male", 15_00_000));
        employeesList.add(new Employee(106, "Murekan", "Software Engineer", "Male", 15_00_000));
        employeesList.add(new Employee(107, "Gagy", "Software Engineer", "Male", 15_00_000));
        
        
    //groupby on designation then gender
        //Group by on multiple properties
        //{Software Engineer={Male=3, Female=1}, Manager={Female=1, Male=1}, 
        //Lead Engineer={Female=1}}
        
        employeesList.stream().collect(Collectors.groupingBy(Employee::getDesignation,
        	Collectors.groupingBy(Employee::getGender,Collectors.counting())))
        .entrySet().stream().forEach(k->System.out.println(k.getKey() +" "+k.getValue()));
        
        
        		
        
        
        
        
        
	}
}
