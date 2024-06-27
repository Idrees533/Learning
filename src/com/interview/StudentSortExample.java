package com.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentSortExample {

	public static void main(String[] args) {
		List<Student> studentList=new ArrayList();
		studentList.add(new Student("Alice", "Strong"));
		studentList.add(new Student("Bob", "Average"));
		studentList.add(new Student("Charli", "Outstanding"));
		studentList.add(new Student("Alie", "Strong"));
		studentList.add(new Student("Boby", "Average"));
		studentList.add(new Student("Charls", "Outstanding"));
		
		studentList.sort(Comparator.comparingInt(student-> {
			
			switch (((Student) student).getGrade()) {
			case "Outstanding":
				return 3;
			case "Strong":
				return 2;
			case "Average":
				return 1;
			default:
				return 0;
			}
			
		}).reversed());
		
		for(Student student:studentList) {
			System.out.println(student.getName() + " "+student.getGrade());
			//System.out.println(new Student());
		}
	}
}
