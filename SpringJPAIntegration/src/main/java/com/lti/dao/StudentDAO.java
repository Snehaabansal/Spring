package com.lti.dao;

import com.lti.model.Student;

public interface StudentDAO {
	public void saveStudent(Student student);
	public void searchStudent(int id);
	public void removeStudent(Student student);
	public void updateStudent(Student student);

}
