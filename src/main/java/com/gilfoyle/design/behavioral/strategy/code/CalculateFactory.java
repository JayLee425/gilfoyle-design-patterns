package com.gilfoyle.design.behavioral.strategy.code;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 15:34
 */
public class CalculateFactory {
	/**
	 * 工厂模式 封装策略模式
	 * @param iCalculator
	 * @param exp
	 * @return
	 */
	public static int goCalculateStrategy(ICalculator iCalculator, String exp){
		return iCalculator.calculate(exp);
	}
}
