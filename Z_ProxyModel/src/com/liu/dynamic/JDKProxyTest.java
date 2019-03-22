package com.liu.dynamic;

import java.io.FileOutputStream;

import com.liu.staticproxy.Person;

import sun.misc.ProxyGenerator;

public class JDKProxyTest {
	public static void main(String[] args) {
		try {
			Person obj = (Person) new JDKMeipo().getInstance(new Customer());
			obj.findLove();
//通过反编译工具可以查看源代码
			byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[] { Person.class });
			FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
			os.write(bytes);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}