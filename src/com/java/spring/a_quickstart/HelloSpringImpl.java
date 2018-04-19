package com.java.spring.a_quickstart;

public class HelloSpringImpl implements HelloSpring{
	
//	private String info;
	
	@Override
	public void sayHello() {
		
		
		System.out.println("hello spring first"/*+getInfo()*/);
		
	}

/*	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
*/

}
