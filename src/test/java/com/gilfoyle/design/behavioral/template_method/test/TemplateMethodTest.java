package com.gilfoyle.design.behavioral.template_method.test;

import com.gilfoyle.design.behavioral.template_method.code.AbstractCalculateTemplate;
import com.gilfoyle.design.behavioral.template_method.code.Divide;
import com.gilfoyle.design.behavioral.template_method.code.Plus;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 15:57
 */
public class TemplateMethodTest {
	public static void main(String[] args) {
		String exp = "8+8";
		AbstractCalculateTemplate template = new Plus();
		int result = template.calculate(exp, "\\+");
		System.out.println(result);
		
		template = new Divide();
		String divideExp = "100 / 23";
		int calculate = template.calculate(divideExp, "\\/");
		System.out.println(calculate);
	}
}
