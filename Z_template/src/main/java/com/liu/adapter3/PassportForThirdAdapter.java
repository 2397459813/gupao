package com.liu.adapter3;

import com.liu.adapter2.ResultMsg;
import com.liu.adapter2.SiginService;

public class PassportForThirdAdapter extends SiginService implements IPassportForThird {
	public ResultMsg loginForQQ(String id) {
		return processLogin(id, LoginForQQAdapter.class);
	}

	public ResultMsg loginForWechat(String id) {
		return processLogin(id, LoginForWechatAdapter.class);
	}

	public ResultMsg loginForToken(String token) {
		return processLogin(token, LoginForTokenAdapter.class);
	}

	public ResultMsg loginForTelphone(String telphone, String code) {
		return processLogin(telphone, LoginForTelAdapter.class);
	}

	public ResultMsg loginForRegist(String username, String passport) {
		super.regist(username, null);
		return super.login(username, null);
	}

//这里用到了简单工厂模式及策略模式
	//return processLogin(id, LoginForQQAdapter.class);
	private ResultMsg processLogin(String key, Class<? extends LoginAdapter> clazz) {
		try {
			LoginAdapter adapter = clazz.newInstance();
			if (adapter.support(adapter)) {
				return adapter.login(key, adapter);
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
	}
}
