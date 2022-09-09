package com.gilfoyle.design.behavioral.strategy.test;

import com.gilfoyle.design.behavioral.strategy.code.CalculateFactory;
import com.gilfoyle.design.behavioral.strategy.code.ICalculator;
import com.gilfoyle.design.behavioral.strategy.code.Plus;

public class StrategyTest {
	
	public static void main(String[] args) {
		/**
		 * 策略模式
		 */
		String exp = "2+8";
		ICalculator cal = new Plus();
		int result = cal.calculate(exp);
		System.out.println(result);
		
		/**
		 * 策略模式 + 工厂模式
		 */
		//String minusExp = "10-2";
		//int res = CalculateFactory.goCalculateStrategy(new Minus(), minusExp);
		int res = CalculateFactory.goCalculateStrategy(new Plus(), exp);
		System.out.println(res);
	}
}  