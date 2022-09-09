package com.gilfoyle.design.structural.proxy.statics;

/**
 * @author jaylee
 * @description: 二狗诉讼类型，实现ILawSuit接口
 * @author: Mr.JayLee
 * @create: 2022-09-09 12:13
 */
public class DogLee implements ILawSuit{
	@Override
	public void lawsuit(String proof) {
		System.out.println(String.format("boss not pay salary, proof is : %s", proof));
	}
	
	@Override
	public void defend() {
		System.out.println(String.format("天网恢恢，铁证如山，%s,还钱","周扒皮"));
	}
}
