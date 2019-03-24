package com.liu.adapter3;

import com.liu.adapter2.ResultMsg;

public interface LoginAdapter {
	boolean support(Object adapter);
	ResultMsg login(String id,Object adapter);
}