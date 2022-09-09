package com.gilfoyle.design.structural.bridge.test;

import com.gilfoyle.design.structural.bridge.code.LargeCoffee;
import com.gilfoyle.design.structural.bridge.code.Milk;
import com.gilfoyle.design.structural.bridge.code.RefinedCoffee;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 14:02
 */
public class BridgeTest {
	public static void main(String[] args) {
		//点两杯加奶的大杯咖啡
		RefinedCoffee largeMilk = new LargeCoffee(new Milk());
		largeMilk.orderCoffee(2);
		largeMilk.checkQuality();
	}
}
