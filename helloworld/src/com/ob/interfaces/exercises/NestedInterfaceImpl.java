package com.ob.interfaces.exercises;

public class NestedInterfaceImpl implements OuterInterface {
	public void nestInner() {
		System.out.println("nested interface");
	}

//	@Override
	public void nestOuter() {
		System.out.println("outer");
	}
}
