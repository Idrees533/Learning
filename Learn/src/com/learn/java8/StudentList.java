package com.learn.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentList {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				   new Student(1, "Aditya", "Mall", 30, "Male", "Mechanical Engineering", 2014, "Mumbai", 122),
				   new Student(2, "Pulkith", "Singh", 26, "Male", "Computer Engineering", 2018, "Delhi", 67),
				   new Student(3, "Ankita", "Patil", 25, "Female", "Computer Engineering", 2019, "Kerala", 164),
				   new Student(4, "Satish", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
				   new Student(5, "Darshan", "Mukd", 23, "Male", "Instrumentation Engineering", 2022, "Mumbai", 12),
				   new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
				   new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
				   new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
				   new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
				   new Student(10, "Satyam", "Pandey", 26, "Male", "Biotech Engineering", 2017, "Mumbai", 98)
				);
		
		
		//Group the students by department names.
				Map<String, List<Student>> StudentList=list.stream().distinct().collect(Collectors.groupingBy(Student::getDepartmantName));
				System.out.println(StudentList);
				
		//Find the count of students in each department.
				
			Map<String, Long>studentCount=list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.counting()));
					System.out.println(studentCount);
		//. Find all departments names.
			List deptList=list.stream().map(t->t.getDepartmantName()).distinct().collect(Collectors.toList());
	System.out.println("deptName List :"+deptList);
	
	//Find the list of students whose age is less than 25.
				List<Student> StudentAge=list.stream().filter(t->t.getAge() < 25).collect(Collectors.toList());
					System.out.println("Student Ages "+StudentAge);
	//Find the max age of students.
			OptionalInt maxAge		=list.stream().mapToInt(t->t.getAge()).max();
					Student studentage=list.stream().max(Comparator.comparing(Student::getAge)).get();
							System.out.println(studentage.getAge());
			System.out.println(maxAge.getAsInt());
			
	// Find the average age of male and female students.
			
Map<String, Long> Studentgender=list.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
				System.out.println("count wise student gender:"+Studentgender);
				
	//Find the young student in all departments.
		Student youngStudent=list.stream().min(Comparator.comparing(Student::getAge)).get();
		System.out.println(youngStudent);
		
		
		//Find the senior female student in all departments.
			int seniorFemaleStudent=list.stream()
				.filter(t->t.getGender().equals("Female"))
				.mapToInt(Student::getAge)
				.max()
				.getAsInt();
			
	Student FemalSenior	=	list.stream()
			.filter(st->st.getGender()=="Female")
			.max(Comparator.comparing(Student::getAge))
			.get();
			System.out.println("Senior Female Student "+seniorFemaleStudent);
			System.out.println("Senior female Student; "+FemalSenior);
			
		//	Find the list of students whose rank is between 50 and 100.	
		 List midRanker	=list.stream()
				.filter(st->st.getRank() >= 25 && st.getRank() <=100)
				.collect(Collectors.toList());
		 
		 System.out.println("midyoker Ranker"+midRanker);
		 
	// Find the department who is having maximum number of students.
		 
  Entry<String, Long> studentDeptList	= list.stream()
		 .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()))
		 .entrySet().stream()
		 .max(Map.Entry.comparingByValue())
		 .get();
     System.out.println("Depat List " +studentDeptList);
				
			
     //Find the Students who stays in Mumbai and sort them by their names.
     
    List mumbaiStudent =list.stream()
     .filter(st->st.getCity().equals("Mumbai"))
     .sorted(Comparator.comparing(Student::getFirstName))
     .collect(Collectors.toList());
    
    System.out.println("Mumbai Student: "+mumbaiStudent);
     
    	//Find the total count of students.
    	Long TotalStudent=list.stream().count();
    	System.out.println("Total student: "+TotalStudent);
     
	//Find the average rank in all departments
    	
    Map<String, Double> AvergaeDept=	list.stream()
    	.collect(Collectors.groupingBy(Student::getDepartmantName,
    			Collectors.averagingDouble(Student::getRank)));
    System.out.println("Avergae rank of dept: "+AvergaeDept);
			
    //Find the highest rank in each department.
    Map<String, Optional<Student>> studentRank =	list.stream()
    	.collect(Collectors.groupingBy(Student::getDepartmantName,
    			Collectors.minBy(Comparator.comparing(Student::getRank))));
			
			System.out.println("Studnet Rank :"+studentRank);
			
	// Find the list of students , which are sorted by their rank.
			
	List studentRankList=list.stream().sorted(Comparator.comparing(Student::getRank))
			.collect(Collectors.toList());
	System.out.println(studentRankList);
	
	// Find the second highest rank student.
	// skip the first position 
				Student secondRank	=list.stream()
					.sorted(Comparator.comparing(Student::getRank))
					.skip(1).findFirst()
					.get();
							System.out.println("Second Rank : "+secondRank);
							
							
	//Find the ranks of students in all department in ascending order.
			Map<String,List<Student>> departRankList	=list.stream()
							.collect(Collectors.groupingBy(Student::getDepartmantName, 
							 Collectors.collectingAndThen(Collectors.toList(), list1->list1.stream()
							.sorted(Comparator.comparing(Student::getRank)).collect(Collectors.toList()))));
			
			System.out.println("studnet Rank based On Department: "+departRankList);
	
			
			
			
			
				
	}
}
