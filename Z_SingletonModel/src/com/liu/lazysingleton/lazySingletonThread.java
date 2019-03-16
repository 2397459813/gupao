package com.liu.lazysingleton;

public class lazySingletonThread implements Runnable {

	@Override
	public void run() {
		LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
		System.out.println(Thread.currentThread().getName()+":"+singleton);
		
	}

}
