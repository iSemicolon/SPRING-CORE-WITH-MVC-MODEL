package org.kol.SingletoneBeanScopeApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 Here Only One Bean Object Will be Created. No Matter how many times we call it

 proved: If we check hashcode only one hashcode will be generate means always hashcode value are same
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");

		System.out.println("Spring Object !!");
		Student student1=(Student) context.getBean("student");
		System.out.println(student1.hashCode()); //same hashcode here

		Student student2=(Student) context.getBean("student");
		System.out.println(student2.hashCode()); //same hashcode here


		System.out.println("Java Object !!");
		Student st1=new Student();
		System.out.println(st1.hashCode());

		Student st2=new Student();
		System.out.println(st2.hashCode());
	}

}
