package com.liu.staticproxy1;

public class DynamicDataSourceEntry {
	// Ĭ������Դ
	public final static String DEFAULT_SOURCE = null;
	private final static ThreadLocal<String> local = new ThreadLocal<String>();

	private DynamicDataSourceEntry() {
	}

	/**
	 * �������Դ
	 */
	public static void clear() {
		local.remove();
	}

	/**
	 * ��ȡ��ǰ����ʹ�õ�����Դ����
	 *
	 * @return String
	 */
	public static String get() {
		return local.get();
	}

	/**
	 * ��ԭ��ǰ���������Դ
	 */
	public static void restore() {
		local.set(DEFAULT_SOURCE);
	}

	/**
	 * ������֪���ֵ�����Դ
	 *
	 * @param source
	 */
	public static void set(String source) {
		local.set(source);
	}

	/**
	 * ������ݶ�̬��������Դ
	 * 
	 * @param year
	 */
	public static void set(int year) {
		local.set("DB_" + year);
	}
}