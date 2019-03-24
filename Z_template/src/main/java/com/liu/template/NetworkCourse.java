package com.liu.template;

public abstract class NetworkCourse {
	protected final void createCourse() {
//1������Ԥϰ����
		this.postPreResource();
//2������ PPT �μ�
		this.createPPT();
//3������ֱ��
		this.liveVideo();
//4���ύ�μ������ñʼ�
		this.postNote();
//5���ύԴ��
		this.postSource();
//6��������ҵ����Щ����û����ҵ����Щ��������ҵ��
//�������ҵ�Ļ��������ҵ�����û��ҵ�������
		if (needHomework()) {
			checkHomework();
		}
	}

	abstract void checkHomework();

//���ӷ�����ʵ�����̵�΢��
	protected boolean needHomework() {
		return false;
	}

	final void postSource() {
		System.out.println("�ύԴ����");
	}

	final void postNote() {
		System.out.println("�ύ�μ��ͱʼ�");
	}

	final void liveVideo() {
		System.out.println("ֱ���ڿ�");
	}

	final void createPPT() {
		System.out.println("�������� PPT");
	}

	final void postPreResource() {
		System.out.println("�ַ�Ԥϰ����");
	}
}