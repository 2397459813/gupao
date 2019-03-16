package com.liu.dynamic;

import com.liu.staticproxy.Person;

public class TestMeipo {
	public static void main(String[] args) {
		try {
			Person obj = (Person) new JDKMeipo().getInstance(new Customer());
			obj.findLove();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
