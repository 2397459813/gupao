package com.liu.adapter3;

public class PassportTest {
	public static void main(String[] args) {
	IPassportForThird passportForThird = new PassportForThirdAdapter();
	passportForThird.loginForQQ("");
}
}
