package com.liu.adapter;

public class PowerAdapter implements DC5 {
	private AC220 ac220;

	public PowerAdapter(AC220 ac220) {
		this.ac220 = ac220;
	}

	public int outputDC5V() {
		int adapterInput = ac220.outputAC220V();
//��ѹ��...
		int adapterOutput = adapterInput / 44;
		System.out.println("ʹ�� PowerAdapter ���� AC:" + adapterInput + "V" + "���DC:" + adapterOutput + "V");
		return adapterOutput;
	}
}
