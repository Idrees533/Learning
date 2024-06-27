package com.learn.java8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeList {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));
		
		//Group the Employees by city.
		Map<String, List<Employee>> empCity	=empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		
		System.out.println(empCity);
		
		//Group the Employees by age
		Map<Integer, List<Employee>> empAge	=empList.stream().collect(Collectors.groupingBy(Employee::getAge));
			System.out.println(empAge);
			
		// Find the count of male and female employees present in the organization.
		Map<String,Long>noOfMaleFemaleEmployees	=empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
					System.out.println(noOfMaleFemaleEmployees);
					
		//Print the names of all departments in the organization.
					System.out.println("Print the names of all departments in the organization.");
					empList.stream().map(Employee::getName).distinct().forEach(System.out::println);
		//Print employee details whose age is greater than 28.
				System.out.println("Print employee details whose age is greater than 28.");
			empList.stream().filter(e->e.getAge() > 28).collect(Collectors.toList()).forEach(System.out::println);
		//Find maximum age of employee.
			empList.stream().mapToInt(Employee::getAge).max();
		Optional maxAge	=empList.stream().max(Comparator.comparing(Employee::getAge));
				System.out.println(maxAge.get());
		//Print Average age of Male and Female Employees.
		Map<String,Double>	AvergaeAge	=empList.stream().collect(Collectors.groupingBy(Employee::getGender,
						Collectors.averagingInt(Employee::getAge)));
		System.out.println(AvergaeAge);
		//print the number of employees in each department.
		empList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()))
				.entrySet().stream()
				.forEach(s->System.out.println(s.getKey() +" "+s.getValue()));
		
		
		// Find oldest employee.
		
	Employee oldEmp	=empList.stream().max(Comparator.comparing(Employee::getAge)).get();
	System.out.println(oldEmp);
	
	//Find youngest female employee.
	
		Optional youngFemale=empList.stream().filter(p->p.getGender()=="F")
				.min(Comparator.comparing(Employee::getAge));
		
		System.out.println("Young Female : "+youngFemale);
		
	//Find employees whose age is greater than 30 and less than 30.
 Map<Boolean, List<Employee>> partitionEmp	=	empList.stream().collect(Collectors.partitioningBy(p->p.getAge() > 30));
 Set<Map.Entry<Boolean, List<Employee>>> empSet=partitionEmp.entrySet();
 					for(Map.Entry<Boolean, List<Employee>> age :empSet) {
 									System.out.println(age.getKey() + " "+age.getValue());
 					}
		
 	//Find the department name which has the highest number of employees.
 	Map.Entry<String, Long>	maxOfEmployee=empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
 							Collectors.counting())).entrySet()
 					.stream().max(Map.Entry.comparingByValue()).get();
 	System.out.println("Max of no of emp"+maxOfEmployee.getKey());
 	
//Find if there any employees from HR Department
 		Optional<Employee> hrEmp=empList.stream().filter(f->f.getDeptName().equalsIgnoreCase("HR"))
 				.findAny();
 		hrEmp.ifPresent(e->System.out.println("HR Department :"+hrEmp));
 //Find the department names that these employees work for, 
 		//where the number of employees in the department is over 3.
 		empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()))
 		.entrySet().stream().filter(e->e.getValue() > 3).forEach(System.out::println);
 		
 		//Find distinct department names that employees work for.
 		empList.stream() .map(Employee::getDeptName).distinct()
 		.forEach(System.out::println);
 	// Find all employees who lives in ‘Blore’ city, sort them by their name and print the names of 
 		//employees.
				
 		empList.stream().filter(p->p.getCity().equalsIgnoreCase("Blore"))
 		.sorted(Comparator.comparing(Employee::getName))
 		.forEach(e->System.out.println("Sort the print names  "+e.getName()));
 		
 		//No of employees in the organisation.
 		
 System.out.println("Totatl number of employees ="+empList.stream().count());	
 
 //Find employee count in every department
 	Map<String, Long> employeeCount	=empList.stream() .collect(Collectors.groupingBy(Employee::getDeptName,
 				Collectors.counting()));
 		
 		System.out.println("Empllyee Count "+employeeCount);
 //Find the department which has the highest number of employees.
 	Optional<Map.Entry<String, Long>> deptNamesList	=empList.stream() .collect(Collectors.groupingBy(Employee::getDeptName,
 				Collectors.counting())).entrySet()
 		.stream() 
 		.max(Map.Entry.comparingByValue());
 	
 	
 		if(deptNamesList.isPresent()) {
 			System.out.println("Department highest number of employees "+deptNamesList.get());
 		}
			
 		
 //Sorting a Stream by age and name fields.
 	Comparator compare1	=Comparator.comparing(Employee::getAge);
 	Comparator compare2	=Comparator.comparing(Employee::getName);
 	
 					empList.stream().sorted(compare1.thenComparing(compare2))
 					.forEach(System.out::println);
 	
 	//Highest experienced employees in the organization.
 					
 	Optional<Employee> oldestEmp	=empList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining))
 		.findFirst();
 		
 	System.out.println("Oldest  "+oldestEmp);
 	
 	// Print average and total salary of the organization.
 	DoubleSummaryStatistics empSalary=empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
 			
 	System.out.println("Total salary : "+empSalary.getSum());
 	System.out.println("Average Salary : "+empSalary.getAverage());
 	
 	// Print Average salary of each department.
 				Map<String, Double>	avgSalry=	empList.stream()
 							.collect(Collectors.groupingBy(Employee::getDeptName,
 									Collectors.averagingDouble(Employee::getSalary)));
 						Set<Map.Entry<String,Double>>	entySet	=avgSalry.entrySet();
 						
 						for(Map.Entry<String, Double>entry:entySet ) {
 							System.out.println(entry.getKey() + " "+entry.getValue());
 	//Find Highest salary in the organisation.
 			Optional HighestSalary=empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
 							.findFirst();
 			System.out.println("Highest salary : "+HighestSalary.get());
 						}
 			//2nd Highest slary
 			
 				Employee secondHighestsalryEmp	=empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
 						.skip(1).findFirst().get();
 						
 			System.out.println("Second Highest Salary : "+secondHighestsalryEmp);
 			
 			//Nth Highest Salary:
 			int n=5;
 	Employee nthHighestSalary	=empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.skip(n-1).findFirst().get();
				
	System.out.println("Nth Highest Salary : "+nthHighestSalary);
	
	
	//Find highest paid salary in the organisation based on gender.
	Map<String, Optional<Employee>>	HighestPaidMFEmp=	empList.stream().collect(Collectors
			.groupingBy(Employee::getGender,
							Collectors.maxBy((t1,t2) -> (int)(t1.getSalary()-t2.getSalary()))));
	System.out.println("Highes paid empl "+ HighestPaidMFEmp);
 			
	
	//Find Lowest paid salary in the organisation based on gender
	
	Map<String, Optional<Employee>> lowestPaidMFemp=empList.stream().collect(Collectors
			.groupingBy(Employee::getGender,
			Collectors.minBy((t1,t2) -> (int)(t1.getSalary()-t2.getSalary()))));		
 		
 		
				
				System.out.println("Lowest paid FM emp"+lowestPaidMFemp);
		//Sort the employees salary in the organisation in ascending orde
					empList.stream().sorted(Comparator.comparing(Employee::getSalary)).toList()
					.forEach(System.out::println);
					
		//Highest salary based on department.
					
					Map<String, Optional<Employee>> highestSlarDept
					=	empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors
							.collectingAndThen(Collectors.toList(),
									l->l.stream().max(Comparator.comparing(Employee::getSalary)))));
					System.out.println("highest salary "+highestSlarDept);
					
		//Print list of employee’s second highest record based on department
					
							
		System.out.println("Second Highest Salary based On Departent"+
			empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
			  Collectors.collectingAndThen(Collectors.toList(),
			     list -> list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst()))));
					
		//Sort the employees salary in each department in ascending order
		
		Map<String, Stream<Employee>> sortSalaryDept=empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
				Collectors.collectingAndThen(Collectors.toList(), list->list.stream()
						.sorted(Comparator.comparing(Employee::getSalary)))));
		
		
	
		sortSalaryDept.forEach((k,v)->{
			System.out.println(v.collect(Collectors.toList()));
		});
			
					
	}
}
