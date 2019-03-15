package com.liu.hungrysingleton;
/**
 * 优点：没有加锁，执行效率比较高
 * 缺点：类加载的时候就初始化，用不用都占用内存，浪费内存
* @version:
* @Description: 
* @author: liu 
* @date:
 */
public class HungrySingleton {
	private static final HungrySingleton singleton = new HungrySingleton ();
	//构造方法私有化
	private HungrySingleton() {}
	
	public static HungrySingleton getInstance() {
		return singleton;
	}
}
