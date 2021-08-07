package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.StudentDAO;
import com.lti.model.Student;

@Service //class can be injected to other classes managed by Spring Container
@Transactional //Denotes all methods in this class to perform JPA transactions managed by Spr. Cont.
public class StudentBOImpl implements StudentBO{
	@Autowired //Dependency Injection
	StudentDAO studDao;

	@Override
	public void saveStudent(Student student) {
		System.out.println("Inside BO");
		studDao.saveStudent(student);
		
		
	}

	@Override
	public void searchStudent(int id) {
		System.out.println("Inside search BO");
		studDao.searchStudent(id);
		
	}

	@Override
	public void removeStudent(Student student) {
		studDao.removeStudent(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		studDao.updateStudent(student);
		
		
	}

}
