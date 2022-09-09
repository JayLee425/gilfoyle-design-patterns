package com.gilfoyle.design.behavioral.chain_of_responsibility.code;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jaylee
 * @description: 3、校验黑名单
 * @author: Mr.JayLee
 * @create: 2022-09-09 19:20
 */
@Component
@Order(3)
public class CheckBlackFilter extends AbstractHandler {
	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response) {
		//invoke black list check
		System.out.println("3、校验黑名单");
	}
}
