package com.liu.adapter3;

import com.liu.adapter2.ResultMsg;

public class LoginForQQAdapter implements LoginAdapter {
	public boolean support(Object adapter) {
		return adapter instanceof LoginForQQAdapter;
	}

	public ResultMsg login(String id, Object adapter) {
		return null;
	}
}