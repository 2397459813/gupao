package com.liu.factory.simplefactory;

public class SimpleFactoryTest {
	public static void main(String[] args) {
		ICourse course = MySimpleFactory.create("java");
		course.buy();
		course = MySimpleFactory.create("python");
		course.buy();
	}
}
