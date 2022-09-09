package com.gilfoyle.design.structural.bridge.code;

/**
 * @author jaylee
 * @description: 小杯
 * @author: Mr.JayLee
 * @create: 2022-09-09 13:56
 */
public class SmallCoffee extends RefinedCoffee{
	/**
	 * 构造器注入 在此例子中，实际运用了 桥接模式
	 *
	 * @param additives
	 */
	public SmallCoffee(ICoffeeAdditives additives) {
		super(additives);
	}
	
	@Override
	public void orderCoffee(int count) {
		additives.addSomething();
		System.out.println(String.format("小杯咖啡%d杯",count));
	}
}
