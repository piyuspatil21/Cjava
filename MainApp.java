package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Student s=(Student) context.getBean("s");
		s.display();
		Student s1=(Student) context.getBean("s1");
		s1.display();
		Student s2=(Student) context.getBean("s2");
		s2.display();
	}

}
