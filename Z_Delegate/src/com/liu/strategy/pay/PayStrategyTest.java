package com.liu.strategy.pay;

public class PayStrategyTest {
	public static void main(String[] args) {
//ʡ�԰���Ʒ��ӵ����ﳵ���ٴӹ��ﳵ�µ�
//ֱ�Ӵӵ㵥��ʼ
		Order order = new Order("1", "20180311001000009", 324.45);
//��ʼ֧����ѡ��΢��֧����֧�������������������������Ƹ�ͨ
//ÿ��������֧���ľ����㷨�ǲ�һ����
//�����㷨�̶���
//���ֵ����֧����ʱ��ž������ĸ�ֵ
		System.out.println(order.pay(PayStrategy.ALI_PAY));
	}
}