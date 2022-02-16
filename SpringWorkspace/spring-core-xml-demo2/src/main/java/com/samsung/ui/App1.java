package com.samsung.ui;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.samsung.bean.Employee;

public class App1 {

	public static void main(String[] args) {
		AbstractApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
		
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);
		
		Employee emp3 = context.getBean("emp3", Employee.class);
		System.out.println(emp3);
		
		System.out.println(emp == emp3);
				
		context.close();
	}

}