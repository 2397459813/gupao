package com.liu.adapter3;

import com.liu.adapter2.ResultMsg;

public class LoginForSinaAdapter implements LoginAdapter {
	public boolean support(Object adapter) {
		return adapter instanceof LoginForSinaAdapter;
	}

	public ResultMsg login(String id, Object adapter) {
		return null;
	}
}
