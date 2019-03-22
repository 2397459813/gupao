package com.liu.staticproxy;

public class TestStaticProxy {
	public static void main(String[] args) {
		Father father = new Father(new Son());
		father.findLove();
	}
}
