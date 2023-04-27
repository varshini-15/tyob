package com.ob.interfaces.exercises;

public class NestedMain {
	public static void main(String[] args) {
		OuterInterface ou = new NestedInterfaceImpl();
		OuterInterface innerInterface = new NestedInterfaceImpl();
		innerInterface.nestInner();
		ou.nestOuter();
	}
}
