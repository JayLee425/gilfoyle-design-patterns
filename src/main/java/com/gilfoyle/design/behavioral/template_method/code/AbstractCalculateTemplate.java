package com.gilfoyle.design.behavioral.template_method.code;

/**
 * @author jaylee
 * @description: 模版方法模式 （抽象父类）
 * @author: Mr.JayLee
 * @create: 2022-09-09 15:49
 */
public abstract class AbstractCalculateTemplate {
	
	/**
	 * 主方法，实现对本类其它方法的调用
	 **/
	public final int calculate(String exp, String opt) {
		int[] arrayInts = split(exp, opt);
		return calculate(arrayInts[0], arrayInts[1]);
	}
	
	/**
	 * 被子类重写的方法
	 **/
	protected abstract int calculate(int num1, int num2);
	
	/* 通用逻辑 */
	public int[] split(String exp, String opt) {
		String[] split = exp.split(opt);
		int[] ints = new int[2];
		ints[0] = Integer.parseInt(split[0].trim());
		ints[1] = Integer.parseInt(split[1].trim());
		return ints;
	}
	
}
