package com.gilfoyle.design.behavioral.template_method.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 15:56
 */
public class Multiply extends AbstractCalculateTemplate {
	@Override
	protected int calculate(int num1, int num2) {
		return num1 * num2;
	}
}
