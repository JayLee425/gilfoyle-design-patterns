package com.gilfoyle.design.structural.bridge.code;

/**
 * @author jaylee
 * @description: 加奶
 * @author: Mr.JayLee
 * @create: 2022-09-09 13:54
 */
public class Milk implements ICoffeeAdditives{
	@Override
	public void addSomething() {
		System.out.println("加奶");
	}
}
