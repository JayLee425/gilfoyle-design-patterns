package com.gilfoyle.design.behavioral.chain_of_responsibility.code;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jaylee
 * @description: 2、安全校验对象
 * @author: Mr.JayLee
 * @create: 2022-09-09 19:19
 */
@Component
@Order(2)//校验顺序排第2
public class CheckSecurityFilter extends AbstractHandler {
	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response) {
		//invoke Security check
		System.out.println("2、安全校验对象");
	}
}
