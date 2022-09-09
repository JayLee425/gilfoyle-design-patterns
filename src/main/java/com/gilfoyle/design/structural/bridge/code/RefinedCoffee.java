package com.gilfoyle.design.structural.bridge.code;

import java.util.Random;

/**
 * @author jaylee
 * @description: 修正抽象的咖啡类（通过继承）
 * @author: Mr.JayLee
 * @create: 2022-09-09 13:53
 */
public abstract class RefinedCoffee extends Coffee{
	public RefinedCoffee(ICoffeeAdditives additives) {
		super(additives);
	}
	
	public void checkQuality(){
		Random ran=new Random();
		System.out.println(String.format("%s 添加%s",additives.getClass().getSimpleName(),ran.nextBoolean()?"太多":"正常"));
	}
	
}
