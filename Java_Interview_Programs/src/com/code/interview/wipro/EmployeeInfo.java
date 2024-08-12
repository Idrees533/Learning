package com.code.interview.wipro;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmployeeInfo {

	public static void main(String[] args) {
		
		List<Employee1> empList=Arrays.asList(new Employee1(101, "MIA", "MALE", 2017, Arrays.asList(50000.00 , 60000.00)),
				new Employee1(101, "Zaher", "MALE", 2002,Arrays.asList(50000.00,60000.00)),
				new Employee1(102, "Rahul", "MALE", 2000, Arrays.asList(50000.00,80000.00)),
				new Employee1(103, "Rohit", "MALE", 2004, Arrays.asList(90000.00,60000.00)),
				new Employee1(104, "Sachin", "FEMALE",1990, Arrays.asList(150000.00,60000.00)),
				new Employee1(105, "Virat", "MALE", 2005, Arrays.asList(70000.00,60000.00)),
				new Employee1(106, "Siraj", "MALE", 2020, Arrays.asList(90000.00,690000.00)));
		
		
		//find the highest payed salary
		
		/*
		 * Optional<Employee1>
		 * fifthHighest=Optional.ofNullable(empList.stream().max(Comparator.
		 * comparingDouble(a->a.getSalary().stream() .mapToDouble(i->i).sum())).stream()
		 * .skip(4).findFirst().get());
		 * 
		 * //System.out.println(fifthHighest.get());
		 */	
	
		Optional<Double>	 fiftHeighest	=	Optional.ofNullable(empList.stream()
					.flatMap(e->e.getSalary().stream())
					.sorted(Comparator.reverseOrder())
					.skip(4)
					.findFirst().get()); 
		
		Optional<Employee1>	 highestSalary	=empList.stream()
				.sorted((e1,e2)->Collections.max(e2.getSalary())
						.compareTo(Collections.max(e1.getSalary())))
				.skip(4)
				.findFirst();
		
		
		highestSalary.ifPresent(e->System.out.println("5th largest salay "+Collections.max(e.getSalary()) +" employee"+e.getName()));
	
		
		/*
		 * Optional<Employee1>
		 * highestSalary=Optional.ofNullable(empList.stream().sorted(Comparator.
		 * comparingDouble(Employee1::getSalary).reversed()) .findFirst().get());
		 * 
		 * if(highestSalary.isPresent()) { System.out.println(highestSalary.get()); }
		 * 
		 * else { System.out.println("not prestent "); }
		 * 
		 * 
		 * //find the how many males and females in company
		 * 
		 * empList.stream().collect(Collectors.groupingBy(Employee1::getGender,
		 * Collectors.counting())).
		 * entrySet().stream().forEach(k->System.out.println(k.getKey() +
		 * " "+k.getValue()));
		 */
    		
	}
}
