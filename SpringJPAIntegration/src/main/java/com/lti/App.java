package com.lti;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Student;
import com.lti.service.StudentBO;

public class App 
{
	private static StudentBO studBo;
	private static ApplicationContext context;
    public static void main( String[] args )
    {
    	context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	studBo=context.getBean(StudentBO.class);
//    	Student s1=new Student(101, "Sneha", "Female", "MH");
//    	studBo.saveStudent(s1);
    	
    	//Student s1=new Student(100, "Neha", "Female", "MH");
    	//studBo.updateStudent(s1);
//    	Student s1=new Student(100, "Neha", "Female", "MH");
//    	studBo.removeStudent(s1);
   	studBo.searchStudent(101);
    	System.out.println("Application worked");
        
    }
}
