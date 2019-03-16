package com.liu.factory.factorymethod;

public class CourseFactoryTest {
	public static void main(String[] args) {
		ICourseFactory factory = new JavaCourseFactory();
		ICourse course = factory.create();
		course.buy();
		factory = new PythonCourseFactory();
		course = factory.create();
		course.buy();
	}
}
