package org.kol.ByNameAutoWiringXmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		FlipkartController flipkart=(FlipkartController) context.getBean("flipkart");
		flipkart.purchase();
	}

}
