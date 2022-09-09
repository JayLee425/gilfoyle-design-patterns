package com.gilfoyle.design.behavioral.interpreter.test;

import com.gilfoyle.design.behavioral.interpreter.code.Context;
import com.gilfoyle.design.behavioral.interpreter.code.Minus;
import com.gilfoyle.design.behavioral.interpreter.code.Plus;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 22:26
 */
public class InterpreterTest {
	public static void main(String[] args) {
		
		// 计算9+2-8的值
		int result = new Minus()
				             .interpret((new Context(
						             new Plus()
								             .interpret(new Context(9, 2)), 8)));
		System.out.println(result);
	}
}
