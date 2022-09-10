package org.kol.PrototypeBeanScopeApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 Here various Bean Object Will be Created. Depends on how many times we create it

 proved: If we check hashcode different hashcode will be generate means always hashcode value are changed
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");

		System.out.println("Spring Object !!");
		Student student1=(Student) context.getBean("new-student"); 
		System.out.println(student1.hashCode()); // unique hashcode

		Student student2=(Student) context.getBean("new-student");
		System.out.println(student2.hashCode()); // unique hashcode


		System.out.println("Java Object !!");
		Student st1=new Student();
		System.out.println(st1.hashCode());

		Student st2=new Student();
		System.out.println(st2.hashCode());
	}

}
