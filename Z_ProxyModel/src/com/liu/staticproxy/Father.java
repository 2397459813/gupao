package com.liu.staticproxy;

public class Father {
	private Person person;

//û�취��չ
	public Father(Person person) {
		this.person = person;
	}

//Ŀ���������ø��õ�
	public void findLove() {
		System.out.println("��ĸ��ɫ����");
		this.person.findLove();
		System.out.println("˫��ͬ�⽻����ȷ����ϵ");
	}
}