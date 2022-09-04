package org.kol.ApplicationContextApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		HelloWorld obj= (HelloWorld)context.getBean("hello");
		obj.display();
	}
}
