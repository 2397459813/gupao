package com.liu.strategy.pay;

public class WechatPay extends Payment {
	public String getName() {
		return "Œ¢–≈÷ß∏∂";
	}

	protected double queryBalance(String uid) {
		return 256;
	}
}
