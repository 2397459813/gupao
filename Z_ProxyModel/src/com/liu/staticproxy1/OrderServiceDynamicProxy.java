package com.liu.staticproxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceDynamicProxy implements InvocationHandler {
	private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
	//持有被代理对象的引用
	private Object target;

	public Object getInstance(Object target) {
		this.target = target;
		Class<?> clazz = target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before(args[0]);
		Object object = method.invoke(target, args);
		after();
		return object;
	}

	private void before(Object target) {
		try {
			System.out.println("Proxy before method.");
			//通过反射调用方法，约定大于配置，约定要有getCreateTime方法
			Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
			Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
			System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据。");
			DynamicDataSourceEntry.set(dbRouter);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void after() {
		System.out.println("Proxy after method.");
	}
}
