package com.liu.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.liu.staticproxy.Person;

public class JDKMeipo implements InvocationHandler {
	// ������Ķ��󣬰����ø���������
	private Person target;

	public Object getInstance(Person target) throws Exception {

		this.target = target;
		Class<?> clazz = target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object obj = method.invoke(this.target, args);
		after();
		return obj;
	}

	private void before() {
		System.out.println("����ý�ţ���Ҫ�����Ҷ��������Ѿ��õ��������");
		System.out.println("��ʼ��ɫ");
	}

	private void after() {
		System.out.println("������ʵĻ�����׼������");
	}
}
