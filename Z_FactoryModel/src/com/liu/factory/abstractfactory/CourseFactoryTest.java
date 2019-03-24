package com.liu.factory.abstractfactory;

public class CourseFactoryTest {
	public static void main(String[] args) {
		ICourseFactory factory = new JavaCourseFactory();
		factory.createVideo().video();
		factory.createNote().note();
		
	}
}	
