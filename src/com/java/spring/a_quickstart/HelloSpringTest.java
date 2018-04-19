package com.java.spring.a_quickstart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringTest {
	
	public static void main(String [] args) {
		
		//��ͳд��(�������)
		HelloSpring helloSpring=new HelloSpringImpl();
		helloSpring.sayHello();
		
		//����+����+�����ļ�
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		//���÷��䴴��HelloSpring�Ķ���
		HelloSpring helloSpring2=(HelloSpring)applicationContext.getBean("helloSpring");
		helloSpring2.sayHello();
		
//		HelloSpringImpl helloSpringImpl=new HelloSpringImpl();
//		helloSpringImpl.setInfo("zz");
//		helloSpringImpl.sayHello();
		
	}

}
