package com.liu.strategy.pay;

/**
 * ֧������ Created by Tom.
 */
public abstract class Payment {
//֧������
	public abstract String getName();

//��ѯ���
	protected abstract double queryBalance(String uid);

//�ۿ�֧��
	public PayState pay(String uid, double amount) {
		if (queryBalance(uid) < amount) {
			return new PayState(500, "֧��ʧ��", "����");
		}
		return new PayState(200, "֧���ɹ�", "֧����" + amount);
	}
}
