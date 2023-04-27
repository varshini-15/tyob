package com.ob.spring.car;

public class Engine {//independent class
	String enginename;
	
	
	public void setEnginename(String enginename) {
		this.enginename = enginename;
	}

	void function() {
		System.out.println(enginename + "Engine is ready");
	}
}
