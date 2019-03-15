package com.liu.hungrysingleton;
/**
 * �ŵ㣺û�м�����ִ��Ч�ʱȽϸ�
 * ȱ�㣺����ص�ʱ��ͳ�ʼ�����ò��ö�ռ���ڴ棬�˷��ڴ�
* @version:
* @Description: 
* @author: liu 
* @date:
 */
public class HungrySingleton {
	private static final HungrySingleton singleton = new HungrySingleton ();
	//���췽��˽�л�
	private HungrySingleton() {}
	
	public static HungrySingleton getInstance() {
		return singleton;
	}
}
