package com.liu.lazysingleton;

//这种形式兼顾饿汉式的内存浪费，也兼顾 synchronized 性能问题
public class LazyInnerClassSingleton {
	private LazyInnerClassSingleton() {
		//禁止反射破坏单利
		if(InnerLoad.singleton != null){
			throw new RuntimeException("不允许创建多个实例");
			}
	}

	public static final LazyInnerClassSingleton getInstance() {
		//return 之前一定会先执行静态内部类
		return InnerLoad.singleton;
	}

	private static class InnerLoad {
		private static final LazyInnerClassSingleton singleton = new LazyInnerClassSingleton();
	}
}
