package com.saif.mvc_demo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

	public static List<Student> getStudents() {
		
		// create an empty list
		List<Student> students = new ArrayList<>();
		
		// add sample data
		students.add(new Student("John", "Cena", "john@saif.com"));
		students.add(new Student("Roki", "Da", "roki@saif.com"));
		students.add(new Student("Tajul", "Khan", "khan@saif.com"));
		
		// return the list
		return students;
	}
}







