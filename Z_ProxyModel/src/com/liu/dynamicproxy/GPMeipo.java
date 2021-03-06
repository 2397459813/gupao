package com.liu.dynamicproxy;

import java.lang.reflect.Method;

import com.liu.staticproxy.Person;

public class GPMeipo implements GPInvocationHandler {
	// 被代理的对象，把引用给保存下来
	private Person target;

	public Object getInstance(Person target) throws Exception {
		this.target = target;
		Class<?> clazz = target.getClass();
		return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		method.invoke(this.target, args);
		after();
		return null;
	}

	private void before() {
		System.out.println("我是媒婆：我要给你找对象，现在已经拿到你的需求");
		System.out.println("开始物色");
	}

	private void after() {
		System.out.println("如果合适的话，就准备办事");
	}
}
