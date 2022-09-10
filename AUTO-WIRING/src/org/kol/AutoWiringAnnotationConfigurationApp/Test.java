package org.kol.AutoWiringAnnotationConfigurationApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("Myntra.xml");
		MyntraController myntra=(MyntraController) context.getBean("myntra");
		myntra.purchase();
	}

}
