package com.liu.staticproxy1;

public class OrderDao {
	public int insert(Order order) {
		System.out.println("OrderDao ���� Order �ɹ�!");
		return 1;
	}
}
