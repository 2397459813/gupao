package com.liu.destory;

import java.lang.reflect.Constructor;

import com.liu.lazysingleton.LazyInnerClassSingleton;

public class LazyInnerClassSingletonTest {
	public static void main(String[] args) {
		try {
//�����ĵ�����£������ƻ�
			Class<?> clazz = LazyInnerClassSingleton.class;
//ͨ�������õ�˽�еĹ��췽��
			Constructor c = clazz.getDeclaredConstructor(null);
//ǿ�Ʒ��ʣ�ǿ�ǣ���Ը��ҲҪ��
			c.setAccessible(true);
//������ʼ��
			Object o1 = c.newInstance();
//���������ι��췽�����൱�� new ������
//����ԭ�������⣬
			Object o2 = c.newInstance();
			System.out.println(o1 == o2);
// Object o2 = c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
