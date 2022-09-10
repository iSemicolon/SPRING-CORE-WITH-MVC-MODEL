package org.kol.ConstructorAutoWiringXmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
	BigBazarController bigbazar=(BigBazarController) context.getBean("bigbazar");
	bigbazar.purchase();
}
