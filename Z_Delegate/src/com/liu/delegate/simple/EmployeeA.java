package com.liu.delegate.simple;

public class EmployeeA implements IEmployee {
	@Override
	public void doing(String command) {
		System.out.println("����Ա�� A�������ڿ�ʼ��" + command + "����");

	}
}