package com.liu.staticproxy1;

import java.text.SimpleDateFormat;
import java.util.Date;
//���ݴ���ģʽ��̬��������Դ
public class TestStaticProxy {
	public static void main(String[] args) {

		try {
			Order order = new Order();
			// Date today = new Date();
			// order.setCreateTime(today.getTime());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Date date = sdf.parse("2017/02/01");
			order.setCreateTime(date.getTime());
			//��̬��������ж�ԭ��������ã���ǿ�ͱ�����ԭ����
			IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
			orderService.createOrder(order);
		} catch (Exception e) {
			e.printStackTrace();
			;
		}
	}
}
