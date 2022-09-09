package com.gilfoyle.design.structural.bridge.code;

/**
 * @author jaylee
 * @description: 中杯
 * @author: Mr.JayLee
 * @create: 2022-09-09 13:57
 */
public class MediumCoffee extends RefinedCoffee {
	public MediumCoffee(ICoffeeAdditives additives) {
		super(additives);
	}
	
	@Override
	public void orderCoffee(int count) {
		additives.addSomething();
		System.out.println(String.format("中杯咖啡%d杯", count));
	}
}
