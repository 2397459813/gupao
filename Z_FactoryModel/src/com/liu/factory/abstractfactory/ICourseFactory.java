package com.liu.factory.abstractfactory;
/**
 * 
* @version:
* @Description:创建课程工厂 ,产品族下面包含很多的产品，产品结构包含很多公司下的相同的产品
* @author: liu 
* @date:
 */
public interface ICourseFactory {
	public IVideo createVideo();
	public INote createNote();
}
