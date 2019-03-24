package com.liu.adapter2;

public class SigninForThirdServiceTest {
	public static void main(String[] args) {
		SigninForThirdService service = new SigninForThirdService();
//不改变原来的代码，也要能够兼容新的需求
//还可以再加一层策略模式
		ResultMsg msg = service.loginForQQ("sdfgdgfwresdf9123sdf");
		System.out.println(msg);
	}
}