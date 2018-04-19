package com.java.spring.b_instance;

public class Bean2 {
	
	private static Bean2 bean2=new Bean2();
	
	private Bean2() {
		
	}
	
	public static Bean2 createInstance() {
		
		return bean2;
	}

}
