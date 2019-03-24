package com.liu.adapter3;

import com.liu.adapter2.ResultMsg;

public interface IPassportForThird {
/**
* QQ ��¼
* @param id
* @return
���ݳ�Ʒ��������Ʒ www.gupaoedu.com
23
*/
ResultMsg loginForQQ(String id);
/**
* ΢�ŵ�¼
* @param id
* @return
*/
ResultMsg loginForWechat(String id);
/**
* ��ס��¼״̬���Զ���¼
* @param token
* @return
*/
ResultMsg loginForToken(String token);
/**
* �ֻ��ŵ�¼
* @param telphone
* @param code
* @return
*/
ResultMsg loginForTelphone(String telphone, String code);
/**
* ע����Զ���¼
* @param username
* @param passport
* @return
*/
ResultMsg loginForRegist(String username, String passport);
}