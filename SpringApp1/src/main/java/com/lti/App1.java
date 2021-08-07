package com.lti;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.pojo.Address;
import com.lti.pojo.Employee1;

public class App1 
{
    public static void main( String[] args )
    {
//        //ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//    	ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class)	;
//      
//    	Employee1 eObj=(Employee1) context.getBean("empBean1"); 
//      System.out.println(eObj.getEmpno()+" "+eObj.getName());
//      Address adr=eObj.getAddress();
//      System.out.println("Address: "+adr.getState()+" "+adr.getCity());
//      
    	//ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");      
    	ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class)	;
    	Employee1 eObj=(Employee1) context.getBean("empBean1"); 
    	eObj.setEmpno(101);
    	eObj.setName("mary");
    	Employee1 eObj2=(Employee1) context.getBean("empBean1");
    	eObj2.setEmpno(201);
    	Employee1 eObj3=(Employee1) context.getBean("empBean1");
    	eObj3.setName("max");
      
      System.out.println(eObj.getEmpno()+" "+eObj.getName());
      System.out.println(eObj2.getEmpno()+" "+eObj2.getName());
      System.out.println(eObj3.getEmpno()+" "+eObj3.getName());
      
    }
}
