package com.ob.interfacessss.exercise;

public class MiUiOS implements LinuxOSInterface, AndroidOSInterface{
	public void optimizeBattery() {
		System.out.println("MIUI Optimize Battery");
	}
	public void optimizeScreenColor() {
		System.out.println("MIUI Optimize Screen Color");
	}
	
	@Override
	public void nightPhotography() {
		
		AndroidOSInterface.super.nightPhotography();
		//LinuxOSInterface.super.nightPhotography();
	}
	@Override
	public void beauty() {
		
		AndroidOSInterface.super.beauty();
	}
	
	
}
