package com.liu.template;

public class NetworkCourseTest {
	public static void main(String[] args) {
		System.out.println("---Java �ܹ�ʦ�γ�---");
		NetworkCourse javaCourse = new JavaCourse();
		javaCourse.createCourse();
		System.out.println("---�����ݿγ�---");
		NetworkCourse bigDataCourse = new BigDataCourse(true);
		bigDataCourse.createCourse();
	}
}