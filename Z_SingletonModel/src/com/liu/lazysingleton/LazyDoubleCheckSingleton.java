package com.liu.lazysingleton;
//双检查锁，虽然是加锁范围变小，但还是会对xia
public class LazyDoubleCheckSingleton {
	private volatile static LazyDoubleCheckSingleton singleton = null;

	private LazyDoubleCheckSingleton() {
	};

	public static LazyDoubleCheckSingleton getInstance() {
		if (singleton == null) {
			synchronized (LazyDoubleCheckSingleton.class) {
				if (singleton == null) {
					singleton = new LazyDoubleCheckSingleton();

				}

			}

		}
		return singleton;

	}

}
