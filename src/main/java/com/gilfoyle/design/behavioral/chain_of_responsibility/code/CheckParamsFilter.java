package com.gilfoyle.design.behavioral.chain_of_responsibility.code;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jaylee
 * @description: 1、参数校验对象
 * @author: Mr.JayLee
 * @create: 2022-09-09 19:13
 */
@Component
@Order(1) //顺序排第1，最先校验
public class CheckParamsFilter extends AbstractHandler {
	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("1、非空参数校验");
	}
}
