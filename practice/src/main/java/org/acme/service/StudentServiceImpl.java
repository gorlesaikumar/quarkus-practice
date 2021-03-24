package org.acme.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.acme.dao.StudentDAO;

import org.acme.model.Student;


@ApplicationScoped
public class StudentServiceImpl implements StudentService {
	
	@Inject
	private StudentDAO studentdao;
	 
	

	@Override
	public void addStudent(Student s) {
		
		studentdao.addStudent(s);
	}

	@Override
	public List<Student> listStudents() {
		// TODO Auto-generated method stub
		return studentdao.listStudents();
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentdao.getStudentById(id);
	}

	@Override
	public void updateStudent(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeStudent(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
