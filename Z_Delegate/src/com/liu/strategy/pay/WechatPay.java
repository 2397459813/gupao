package com.liu.strategy.pay;

public class WechatPay extends Payment {
	public String getName() {
		return "΢��֧��";
	}

	protected double queryBalance(String uid) {
		return 256;
	}
}
