package com.liu.deep;
//ԭ��ģʽ
public class DeepCloneTest {
	public static void main(String[] args) {

		QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
		try {
			QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
			System.out.println("���¡��" + (qiTianDaSheng.jinGuBang == clone.jinGuBang));
		} catch (Exception e) {
			e.printStackTrace();
		}
		QiTianDaSheng q = new QiTianDaSheng();
		QiTianDaSheng n = q.shallowClone(q);
		System.out.println("ǳ��¡��" + (q.jinGuBang == n.jinGuBang));

	}
}