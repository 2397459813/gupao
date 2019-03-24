package com.liu.dynamicproxy;

import java.lang.reflect.Method;

import com.liu.staticproxy.Person;

public class GPMeipo implements GPInvocationHandler {
	// ������Ķ��󣬰����ø���������
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
		System.out.println("����ý�ţ���Ҫ�����Ҷ��������Ѿ��õ��������");
		System.out.println("��ʼ��ɫ");
	}

	private void after() {
		System.out.println("������ʵĻ�����׼������");
	}
}
