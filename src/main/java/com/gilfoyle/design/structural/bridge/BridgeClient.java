package com.gilfoyle.design.structural.bridge;

import com.gilfoyle.design.structural.bridge.code.MediumCoffee;
import com.gilfoyle.design.structural.bridge.code.Sugar;

/**
 * @author jaylee
 * @description: 桥接模式客户端（方便uml图）
 * @author: Mr.JayLee
 * @create: 2022-09-09 14:08
 */
public class BridgeClient {
	public static void main(String[] args) {
		MediumCoffee coffee = new MediumCoffee(new Sugar());
		coffee.orderCoffee(23);
		coffee.checkQuality();
	}
}
