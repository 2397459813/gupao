package com.liu.delegate.simple;

public class EmployeeB implements IEmployee {
	@Override
	public void doing(String command) {
		System.out.println("����Ա�� B�������ڿ�ʼ��" + command + "����");
	}
}
