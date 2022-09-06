package com.gilfoyle.design.structural.decorator.test;

import com.gilfoyle.design.structural.decorator.design.Decorator;
import com.gilfoyle.design.structural.decorator.design.Source;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-07 00:11
 */
public class DecoratorTest {
	
	public static void main(String[] args) {
		Source source = new Source();
		Decorator decorator = new Decorator(source);
		decorator.method();
	}
}
