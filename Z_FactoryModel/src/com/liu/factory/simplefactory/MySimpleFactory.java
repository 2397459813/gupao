package com.liu.factory.simplefactory;
/**
 * 
* @version:
* @Description:�򵥹��������Ͽ���ԭ�� 
* @author: liu 
* @date:
 */
public class MySimpleFactory {
	public static ICourse create(String name) {
		if (name.equals("java")) {
			return new JavaCourse();
		} else if (name.equals("python")) {
			return new PythonCourse();
		}
		return null;
	}
}
