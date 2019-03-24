package com.liu.strategy.pay;

public class AliPay extends Payment {
	public String getName() {
		return "Ö§¸¶±¦";
	}

	protected double queryBalance(String uid) {
		return 900;
	}
}