package com.java.spring.b_instance;

public class Bean3Factory {
	
	private static Bean3 bean3=new Bean3Impl();
	
	public Bean3 getBean3() {
		System.out.println("实例化工厂方法。。。");
		return bean3;
	}

}
