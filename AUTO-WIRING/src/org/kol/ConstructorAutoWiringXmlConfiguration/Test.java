package org.kol.ConstructorAutoWiringXmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Bigbazar.xml");
		BigBazarController bigBazar=(BigBazarController) context.getBean("bigbazar");
		bigBazar.purchase();
	}
}
