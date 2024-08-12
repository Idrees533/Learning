package com.code.interview.wipro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentList {

	public static void main(String[] args) {
		//List<Integer> student1=Arrays.asList(10,20,30);
		//Emp
		List<Student> studentList=Arrays.asList(new Student(2006, "MIA", Arrays.asList(10,30) ),
				new Student(2006, "MIZ", Arrays.asList(20,40)),
				new Student(2008,"MIB",Arrays.asList(30,50)));
		
		//Find the highest marks joined after 2008
		Optional<Student> highestMarksStudent=studentList.stream()
				.filter(f->f.getDoj() >= 2008 )
				.max(Comparator.comparingInt(a->a.getMarks().stream().mapToInt(i->i).sum()));
					highestMarksStudent.ifPresent(st->System.out.println("Highest Marks: "+st.name +""+st.getMarks()));
					
		int maxMarks2020=studentList.stream().filter(f->f.getDoj() >=2008)
			.mapToInt(s->s.getMarks().stream().mapToInt(i->i).sum())
			.max()
			.orElse(0);
					
				List<Student> highestMarks	=studentList.stream()
						.filter(s->s.getDoj()==2008 && s.getMarks().stream().mapToInt(i->i).sum()== maxMarks2020)
					.collect(Collectors.toList());
				highestMarks.forEach(s->System.out.println("Name :"+s.getName()+ "Marks"+s.getMarks()));
		
	}
}
