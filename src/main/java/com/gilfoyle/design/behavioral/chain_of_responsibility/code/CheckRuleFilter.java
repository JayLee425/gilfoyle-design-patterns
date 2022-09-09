package com.gilfoyle.design.behavioral.chain_of_responsibility.code;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jaylee
 * @description: 4、规则拦截对象
 * @author: Mr.JayLee
 * @create: 2022-09-09 19:21
 */
@Component
@Order(4) //校验顺序排第4
public class CheckRuleFilter extends AbstractHandler {
	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response) {
		//check rule
		System.out.println("4、规则拦截对象");
	}
}
