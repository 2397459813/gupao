package com.liu.staticproxy1;

public class OrderService implements IOrderService {
	private OrderDao orderDao;

	public OrderService() {
//���ʹ�� Spring Ӧ�����Զ�ע���
//����Ϊ��ʹ�÷��㣬�ڹ��췽���н� orderDao ֱ�ӳ�ʼ����
		orderDao = new OrderDao();
	}

	@Override
	public int createOrder(Order order) {
		System.out.println("OrderService ���� orderDao ��������");
		return orderDao.insert(order);
	}
}