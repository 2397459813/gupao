package com.liu.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
	public static void main(String[] args) {
// ����һ���������Ҫ��¡�Ķ���
		ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
// ������ԣ��������
		concretePrototype.setAge(18);
		concretePrototype.setName("prototype");
		List hobbies = new ArrayList<String>();
		concretePrototype.setHobbies(hobbies);
		System.out.println(concretePrototype);

// ���� Client ����׼����ʼ��¡
		Client client = new Client(concretePrototype);
		ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA) client.startClone(concretePrototype);
		System.out.println(concretePrototypeClone);
		System.out.println("��¡�����е��������͵�ֵַ��" + concretePrototypeClone.getHobbies());
		System.out.println("ԭ�����е��������͵�ֵַ��" + concretePrototype.getHobbies());
		System.out.println("�����ַ�Ƚϣ�" + (concretePrototypeClone.getHobbies() == concretePrototype.getHobbies()));
	}
}