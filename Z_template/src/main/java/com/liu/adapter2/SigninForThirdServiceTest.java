package com.liu.adapter2;

public class SigninForThirdServiceTest {
	public static void main(String[] args) {
		SigninForThirdService service = new SigninForThirdService();
//���ı�ԭ���Ĵ��룬ҲҪ�ܹ������µ�����
//�������ټ�һ�����ģʽ
		ResultMsg msg = service.loginForQQ("sdfgdgfwresdf9123sdf");
		System.out.println(msg);
	}
}