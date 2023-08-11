package edu.kh.collection.list.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.collection.list.model.dto.Student;

public class StudentService {
	
	List<Student> studentList = new ArrayList<Student>();
	
	public StudentService() {

		studentList.add(new Student(3, 5, 7, "홍길동", 'M', 75));
		studentList.add(new Student(2, 4, 3, "박진아", 'F', 85));
		studentList.add(new Student(2, 5, 7, "우민지", 'F', 85));
		studentList.add(new Student(3, 8, 1, "정동현", 'M', 45));
		studentList.add(new Student(1, 2, 3, "박선주", 'M', 90));
	}

}
