package com.ob.interfacessss.exercise;

public interface AndroidOSInterface {
	void optimizeBattery();

	void optimizeScreenColor();

	default void nightPhotography() {
		System.out.println("AndroidOSInterface");
		
	}
	default void beauty() {
		System.out.println(" b from andrroid");
	}
	static void m3() {
		System.out.println("Static M3 AndroidOS");
	}
}
