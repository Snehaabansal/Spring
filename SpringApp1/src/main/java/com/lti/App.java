package com.lti;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.pojo.Department;
import com.lti.pojo.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       //we can also use annotaion also in place of classpath but as we are using xml file so use classpath
        Employee e1; //object created by bean not we are creating
        e1=(Employee) context.getBean("empBean"); //typecasting the object empBean object created by bean to employee type
        System.out.println(e1.getMessage());
        //here setter method is getting called by spring only and if we want to change the value then we can call setter method here
        e1.displayEmpMsg();
        Department d1;
        d1=(Department) context.getBean("deptBean");
        System.out.println(d1.getDeptname());
        System.out.println(d1.getLocation());
        d1.display();
        
        
        
    }
}
