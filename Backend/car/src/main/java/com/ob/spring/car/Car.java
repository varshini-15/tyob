package com.ob.spring.car;

public class Car {//dependent class
	
	Engine engine;
	
	

//	public Car(Engine engine) {//1 way - bean with constructor-arg
//	
//		this.engine = engine;
//	}

	public void setEngine(Engine engine) {//2nd way - bean with property name = "as 
		this.engine = engine;
	}

	
	void start() {
		engine.function();
		System.out.println("Car is moving");
	}



	

	
}
