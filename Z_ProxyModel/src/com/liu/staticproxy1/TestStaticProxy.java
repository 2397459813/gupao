package com.liu.staticproxy1;

import java.text.SimpleDateFormat;
import java.util.Date;
//根据代理模式动态分配数据源
public class TestStaticProxy {
	public static void main(String[] args) {

		try {
			Order order = new Order();
			// Date today = new Date();
			// order.setCreateTime(today.getTime());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Date date = sdf.parse("2017/02/01");
			order.setCreateTime(date.getTime());
			//静态代理类持有对原对象的引用，增强和保护了原对象
			IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
			orderService.createOrder(order);
		} catch (Exception e) {
			e.printStackTrace();
			;
		}
	}
}
