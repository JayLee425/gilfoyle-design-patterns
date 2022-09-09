package com.gilfoyle.design.behavioral.template_method.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 15:54
 */
public class Plus extends AbstractCalculateTemplate {
	@Override
	protected int calculate(int num1, int num2) {
		return num1 + num2;
	}
}
