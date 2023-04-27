package com.ob.Vpay.demo;

public class BankConnect {
	static InterVpay bankconnect(String bankType) {
		if (bankType.equals("SBI")) {
			return new SBI();
		} else if (bankType.equals("VBI")) {
			return new VBI();
		} else if (bankType.equals("KVB")) {
			return new KVB();
		}
		return null;
	}
}
