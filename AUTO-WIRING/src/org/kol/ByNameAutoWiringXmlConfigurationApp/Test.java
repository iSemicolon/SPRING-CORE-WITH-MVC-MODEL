package org.kol.ByNameAutoWiringXmlConfigurationApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("Flipkart.xml");
		FlipkartController flipkart=(FlipkartController) context.getBean("flipkart");
		flipkart.purchase();
	}

}
