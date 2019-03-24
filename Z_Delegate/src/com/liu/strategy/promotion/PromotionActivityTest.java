package com.liu.strategy.promotion;

import org.apache.commons.lang3.StringUtils;
/*
 * 将各种策略由工厂统一管理,需要时从工厂中取
 */
public class PromotionActivityTest {
	public static void main(String[] args) {
/*		PromotionActivity promotionActivity = null;
		String promotionKey = "COUPON";
		if(StringUtils.equals(promotionKey,"COUPON")){
		promotionActivity = new PromotionActivity(new CouponStrategy());
		}else if(StringUtils.equals(promotionKey,"CASHBACK")){
		promotionActivity = new PromotionActivity(new CashbackStrategy());
		}//......
		promotionActivity.execute();*/
		
		String promotionKey = "GROUPBUY";
		PromotionActivity promotionActivity = new
		PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
		promotionActivity.execute();
		
		
		
	}
}
