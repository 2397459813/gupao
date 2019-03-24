package com.liu.lazysingleton;

public class TestSingleton {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new lazySingletonThread());
		Thread thread2 = new Thread(new lazySingletonThread());
		thread1.start();
		thread2.start();
	}
}
