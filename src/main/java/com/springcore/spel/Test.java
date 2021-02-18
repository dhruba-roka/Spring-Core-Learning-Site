package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spel/spelConfig.xml");
		Demo d=(Demo) context.getBean("demo");
		System.out.println(d);
	}
	
	

}
