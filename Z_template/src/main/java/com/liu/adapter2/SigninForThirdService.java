package com.liu.adapter2;

public class SigninForThirdService extends SiginService {
	public ResultMsg loginForQQ(String openId) {
//1��openId ��ȫ��Ψһ�����ǿ��԰���������һ���û���(�ӳ�)
//2������Ĭ��Ϊ QQ_EMPTY
//3��ע�ᣨ��ԭ��ϵͳ���洴��һ���û���
//4������ԭ���ĵ�¼����
		return loginForRegist(openId, null);
	}

	public ResultMsg loginForWechat(String openId) {
		return null;
	}

	public ResultMsg loginForToken(String token) {
//ͨ�� token �õ��û���Ϣ��Ȼ�������µ�½��һ��
		return null;
	}

	public ResultMsg loginForTelphone(String telphone, String code) {
		return null;
	}

	public ResultMsg loginForRegist(String username, String password) {
		super.regist(username, null);
		return super.login(username, null);
	}
}