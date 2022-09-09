package com.gilfoyle.design.structural.bridge.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 13:51
 */
public abstract class Coffee {
	
	protected ICoffeeAdditives additives;
	
	/**
	 * 构造器注入 在此例子中，实际运用了 桥接模式
	 * @param additives
	 */
	public Coffee(ICoffeeAdditives additives) {
		this.additives = additives;
	}
	
	public abstract void orderCoffee(int count);
}
