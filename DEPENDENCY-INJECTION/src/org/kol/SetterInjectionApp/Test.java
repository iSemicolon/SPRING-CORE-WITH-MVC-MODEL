package org.kol.SetterInjectionApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring.xml");

		ICar i1= (ICar) ctx.getBean("bmw");
		i1.drive();


		ICar i2=(ICar) ctx.getBean("audi");
		i2.drive();
	}
}
