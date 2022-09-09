package com.gilfoyle.design.behavioral.visitor.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 22:17
 */
public class MySubject implements Subject{
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	@Override
	public String getSubject() {
		return "Love ";
	}
}
