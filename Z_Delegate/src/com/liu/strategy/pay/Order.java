package com.liu.strategy.pay;

public class Order {
	private String uid;
	private String orderId;
	private double amount;

	public Order(String uid, String orderId, double amount) {
		this.uid = uid;
		this.orderId = orderId;
		this.amount = amount;
	}

//�����ؽ���� switch �Ĺ��̣�����Ҫ�ڴ����߼���д switch ��
//������Ҫд if else if
	public PayState pay() {
		return pay(PayStrategy.DEFAULT_PAY);
	}

	public PayState pay(String payKey) {
		Payment payment = PayStrategy.get(payKey);
		System.out.println("��ӭʹ��" + payment.getName());
		System.out.println("���ν��׽��Ϊ��" + amount + "����ʼ�ۿ�...");
		return payment.pay(uid, amount);
	}
}