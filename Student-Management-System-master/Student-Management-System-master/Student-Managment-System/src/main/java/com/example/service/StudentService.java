package com.example.service;

import java.util.List;

import com.example.entity.Student;

public interface StudentService {
	
List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(int id);

	Student getStudentById(int id);
}
