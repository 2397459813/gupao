package com.liu.factory.simplefactory;
/**
 * 
* @version:
* @Description:简单工厂不符合开闭原则 
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
