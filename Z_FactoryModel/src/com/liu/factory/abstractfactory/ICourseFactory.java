package com.liu.factory.abstractfactory;
/**
 * 
* @version:
* @Description:�����γ̹��� ,��Ʒ����������ܶ�Ĳ�Ʒ����Ʒ�ṹ�����ܶ๫˾�µ���ͬ�Ĳ�Ʒ
* @author: liu 
* @date:
 */
public interface ICourseFactory {
	public IVideo createVideo();
	public INote createNote();
}
