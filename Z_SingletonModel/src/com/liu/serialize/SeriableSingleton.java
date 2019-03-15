package com.liu.serialize;

import java.io.Serializable;

//�����л�ʱ���µ����ƻ�
public class SeriableSingleton implements Serializable {
//���л�����˵���ڴ��е�״̬ͨ��ת�����ֽ������ʽ
//�Ӷ�ת��һ�� IO ����д�뵽�����ط�(�����Ǵ��̡����� IO)
//�ڴ���״̬�����ñ���������
//�����л�
//���Ѿ��־û����ֽ������ݣ�ת��Ϊ IO ��
//ͨ�� IO ���Ķ�ȡ����������ȡ������ת��Ϊ Java ����
//��ת�������л����´������� new
	public final static SeriableSingleton INSTANCE = new SeriableSingleton();

	private SeriableSingleton() {
	}

	public static SeriableSingleton getInstance() {
		return INSTANCE;
	}
	
	private Object readResolve(){
		return INSTANCE;
	}
}
