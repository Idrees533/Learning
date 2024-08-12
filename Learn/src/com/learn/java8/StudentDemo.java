package com.learn.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student1> list=Arrays.asList(new Student1(101, "MIA", 8, "B"),
				new Student1(102,"MIT",9,"C"),
				new Student1(103,"MIAZ",10,"F"),
				new Student1(104,"MIW",7,"E"),
				new Student1(105,"MIX",10,"B"),
				new Student1(106,"MIE",8,"B"),
				new Student1(107,"MIE",10,"B"),
				new Student1(108,"MIE",8,"B"),
				new Student1(109,"MIE",10,"F"));
		
		//name of the student as list  8th standard whose grade B
		
	List studentList=list.stream().filter(s->s.getStandard()==8).filter(p->p.getGrade().equals("B"))
		.collect(Collectors.toList());
	
	System.out.println(studentList);
		
	//count the studnet from 10th standard who have failed grade like 'F'
	Long failedStudent=list.stream().filter(s->s.getStandard()==10 && s.getGrade().equals("F"))
			.collect(Collectors.counting());
	System.out.println("failedStudent ="+failedStudent);
		
	}

}
