package com.liu.delegate.simple;

public class DelegateTest {
	public static void main(String[] args) {
//�ͻ�����Boss����ί���ߣ�Leader��������ί���ߣ�Target��
//ί����Ҫ���б�ί���ߵ�����
//����ģʽע�ص��ǹ��̣� ί��ģʽע�ص��ǽ��
//����ģʽע���ǿ���չ���ⲿ��չ����ί��ģʽע���ڲ������͸���
//ί�ɵĺ��ģ����Ƿַ������ȡ���ǲ(ί��ģʽ���ַ������ȣ���ǲ)
//ί��ģʽ�����Ǿ�̬����Ͳ���ģʽһ����������
		new Boss().command("��¼", new Leader());
	}
}
