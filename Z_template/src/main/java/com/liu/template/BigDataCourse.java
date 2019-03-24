package com.liu.template;

public class BigDataCourse extends NetworkCourse {
	private boolean needHomeworkFlag = false;

	public BigDataCourse(boolean needHomeworkFlag) {
		this.needHomeworkFlag = needHomeworkFlag;
	}

	void checkHomework() {
		System.out.println("�������ݵĿκ���ҵ");
	}

	@Override
	protected boolean needHomework() {
		return this.needHomeworkFlag;
	}
}
