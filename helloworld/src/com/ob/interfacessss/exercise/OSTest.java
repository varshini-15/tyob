package com.ob.interfacessss.exercise;

public class OSTest {
	public static void main(String[] args) {
		MiUiOS miuios = new MiUiOS();
		miuios.optimizeBattery();
		miuios.optimizeScreenColor();
		miuios.nightPhotography();
		AndroidOSInterface.m3();
		LinuxOSInterface.m3();
		
	}
}
