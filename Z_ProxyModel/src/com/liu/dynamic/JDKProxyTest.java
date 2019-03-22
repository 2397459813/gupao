package com.liu.dynamic;

import java.io.FileOutputStream;

import com.liu.staticproxy.Person;

import sun.misc.ProxyGenerator;

public class JDKProxyTest {
	public static void main(String[] args) {
		try {
			Person obj = (Person) new JDKMeipo().getInstance(new Customer());
			obj.findLove();
//ͨ�������빤�߿��Բ鿴Դ����
			byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[] { Person.class });
			FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
			os.write(bytes);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}