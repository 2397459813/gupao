package com.liu.strategy.pay;

public class JDPay extends Payment {
	public String getName() {
		return "��������";
	}

	protected double queryBalance(String uid) {
		return 500;
	}
}