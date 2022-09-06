package com.gilfoyle.design.structural.adapter.classs;

/**
 * @author jaylee
 * @description: 类适配器设计模式
 * @author: Mr.JayLee
 * @create: 2022-09-06 23:03
 */
public class AdapterClass extends OldSource implements TargetAble {
	
	@Override
	public void verifyUser() {
		System.out.println("This is new verify user function for new system !!!"
				                   + "AdapterClass#verifyUser");
	}
}
