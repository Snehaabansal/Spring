package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.model.Student;
@Repository
public class StudentDAOImpl implements StudentDAO {
	@PersistenceContext
	private EntityManager entityManager;
	Student std=null;
	

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		System.out.println("Inside DAO "+student.getName());
		this.entityManager.persist(student);
		
	}

	@Override
	public void searchStudent(int id) {
		// TODO Auto-generated method stub
		System.out.println("Inside search DAO ");
		
		std=this.entityManager.find(Student.class, id);
		System.out.println(std);
		
	}

	@Override
	public void removeStudent(Student student) {
		Student sRem=this.entityManager.find(Student.class, student.getStudentid());
		this.entityManager.remove(sRem);
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		this.entityManager.merge(student);
		
	}

}
