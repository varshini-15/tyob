package com.ob.interfaces.exercises;

interface OuterInterface {
	void nestOuter();

	interface InnerInterface {
		void nestInner();
	}
}
