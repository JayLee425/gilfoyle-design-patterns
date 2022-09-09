package com.gilfoyle.design.behavioral.strategy.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 15:25
 */
public class Multiply extends AbstractCalculator implements ICalculator {
	@Override
	public int calculate(String exp) {
		int[] arrayInt = split(exp, "*");
		return arrayInt[0] * arrayInt[1];
	}
}
