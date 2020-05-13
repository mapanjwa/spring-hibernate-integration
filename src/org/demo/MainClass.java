package org.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//DAO Support
		HibernateDaoImpl dao = context.getBean("hibernateDaoImpl",HibernateDaoImpl.class);
		System.out.println("Employee count using Simple Hibernate:"+ dao.getEmployeeCount());	
	}

}
