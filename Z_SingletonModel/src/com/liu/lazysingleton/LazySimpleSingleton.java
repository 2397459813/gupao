package com.liu.lazysingleton;

public class LazySimpleSingleton {
	private static LazySimpleSingleton singleton = null;

	private LazySimpleSingleton() {
	}

	public static synchronized LazySimpleSingleton getInstance() {
		if (singleton == null) {
			
		    singleton = new LazySimpleSingleton();

		}
		return singleton;

	}

}
