package org.acme.service;

import java.util.List;

import org.acme.model.Student;

public interface StudentService {

	public void addStudent(Student s);
	public List<Student> listStudents();
	public Student getStudentById(int id);
	public void updateStudent(Student s);
	public void removeStudent(int id);
}
