package com.liu.lazysingleton;
//˫���������Ȼ�Ǽ�����Χ��С�������ǻ��xia
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
