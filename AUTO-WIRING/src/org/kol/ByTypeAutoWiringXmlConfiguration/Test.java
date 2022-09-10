package org.kol.ByTypeAutoWiringXmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Amazon.xml");
		AmazonController amazon=(AmazonController) context.getBean("amazon");
		amazon.purchase();
	}

}
