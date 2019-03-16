package com.liu.lazysingleton;

//������ʽ��˶���ʽ���ڴ��˷ѣ�Ҳ��� synchronized ��������
public class LazyInnerClassSingleton {
	private LazyInnerClassSingleton() {
		//��ֹ�����ƻ�����
		if(InnerLoad.singleton != null){
			throw new RuntimeException("�����������ʵ��");
			}
	}

	public static final LazyInnerClassSingleton getInstance() {
		//return ֮ǰһ������ִ�о�̬�ڲ���
		return InnerLoad.singleton;
	}

	private static class InnerLoad {
		private static final LazyInnerClassSingleton singleton = new LazyInnerClassSingleton();
	}
}
