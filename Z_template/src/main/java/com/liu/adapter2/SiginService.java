package com.liu.adapter2;

public class SiginService {
	/**
	 * ע�᷽��
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public ResultMsg regist(String username, String password) {
		return new ResultMsg(200, "ע��ɹ�", new Member());
	}

	/**
	 * ��¼�ķ���
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public ResultMsg login(String username, String password) {
		return null;
	}
}
