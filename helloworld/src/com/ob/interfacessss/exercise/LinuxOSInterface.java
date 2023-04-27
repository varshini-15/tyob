package com.ob.interfacessss.exercise;

public interface LinuxOSInterface {
	void optimizeBattery();

	void optimizeScreenColor();

	default void nightPhotography() {
      System.out.println("LinuxOSInterface");
	}
	default void beauty() {
		System.out.println("b from linux");
	}
	static void m3() {
		System.out.println("Static M3 Linuxos");
	}
}
