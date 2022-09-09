package com.gilfoyle.design.behavioral.strategy.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 15:23
 */
public class Minus extends AbstractCalculator implements ICalculator {
	@Override
	public int calculate(String exp) {
		int[] arrayInt = split(exp, "-");
		return arrayInt[0] - arrayInt[1];
	}
}
