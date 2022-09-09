package com.gilfoyle.design.structural.bridge.code;

/**
 * @author jaylee
 * @description: 大杯
 * @author: Mr.JayLee
 * @create: 2022-09-09 13:55
 */
public class LargeCoffee extends RefinedCoffee{
	
	public LargeCoffee(ICoffeeAdditives additives) {
		super(additives);
	}
	
	@Override
	public void orderCoffee(int count) {
		additives.addSomething();
		System.out.println(String.format("大杯咖啡%d杯",count));
	}
}
