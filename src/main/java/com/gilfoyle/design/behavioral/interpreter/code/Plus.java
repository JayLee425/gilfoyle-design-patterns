package com.gilfoyle.design.behavioral.interpreter.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 22:25
 */
public class Plus implements Expression{
	@Override
	public int interpret(Context context) {
		return context.getNum1() + context.getNum2();
	}
}
