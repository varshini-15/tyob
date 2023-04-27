package com.ob.interfacessss.exercise;

public class Upcastmain {
	public static void main(String[] args) {
		UpcastParent upcastparent = new UpcastChild();
		upcastparent.run();
		upcastparent.get();
	}
	
}
