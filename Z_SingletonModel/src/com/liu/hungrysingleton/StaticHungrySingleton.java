package com.liu.hungrysingleton;

public class StaticHungrySingleton {
	private static final StaticHungrySingleton singleton;

	static {
		singleton = new StaticHungrySingleton();
	}

	private StaticHungrySingleton() {
	}

	public static StaticHungrySingleton getInstance() {
		return singleton;
	}
}
