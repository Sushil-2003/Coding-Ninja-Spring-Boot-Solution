package com.sushil.testingSpringdemo;

import java.util.*;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TestingSpringdemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TestingSpringdemoApplication.class, args);
		Scanner s = new Scanner(System.in);
		System.out.println("welcome ! please size of table");
		String st = s.nextLine();
//		Table shortTable = new shortTable();
//		Table longTable = new longTable();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Table longTable = (Table) context.getBean("longTable");
		Table shortTable = (Table)context.getBean("shortTable");
		
		if(st.equals("long")) {
			System.out.println(longTable.showDetails());
		}else {
			System.out.println(shortTable.showDetails());
		}
	}

}
