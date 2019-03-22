package com.liu.strategy.pay;

public class UnionPay extends Payment {
	public String getName() {
		return "ÒøÁªÖ§¸¶";
	}

	protected double queryBalance(String uid) {
		return 120;
	}
}