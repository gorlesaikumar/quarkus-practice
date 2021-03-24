package org.acme.dao;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.acme.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



@ApplicationScoped
public class StudentDAOimpl implements StudentDAO{
	
	
    @Inject
    private static SessionFactory sessionFactory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory() {
		return sessionFactory;
    	
    }
    
   
	
	@Override
	public void addStudent(Student s) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(s);
		
	}

	@Override
	public List<Student> listStudents() {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<Student> studentList = session.createQuery("from student").list();
		
		return studentList;
	}

	@Override
	public Student getStudentById(int id) {
		Session session = sessionFactory.getCurrentSession();
		session.update(id);
		return null;
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
