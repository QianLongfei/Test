package com.java.spring.a_quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringTest {
	
	public static void main(String [] args) {
		
		//传统写法(紧密耦合)
		HelloSpring helloSpring=new HelloSpringImpl();
		helloSpring.sayHello();
		
		//工厂+反射+配置文件
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//利用反射创建HelloSpring的对象
		HelloSpring helloSpring2=(HelloSpring)applicationContext.getBean("helloSpring");
		helloSpring2.sayHello();
		
//		HelloSpringImpl helloSpringImpl=new HelloSpringImpl();
//		helloSpringImpl.setInfo("zz");
//		helloSpringImpl.sayHello();
		
	}

}
