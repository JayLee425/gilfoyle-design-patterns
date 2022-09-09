package com.gilfoyle.design.structural.proxy.dynamic.dyproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author jaylee
 * @description: 动态代理类 （随机，机动律师 处理这个案件）
 * @author: Mr.JayLee
 * @create: 2022-09-09 12:41
 */
public class DynProxyLawyer implements InvocationHandler {
	/**
	 * 被代理的对象（原告：牛翠花）
	 */
	private Object target;
	
	public DynProxyLawyer(Object target) {
		this.target = target;
	}
	
	/**
	 *
	 * @param proxy     代表动态代理对象
	 * @param method    代表正在执行的方法
	 * @param args      代表当前执行方法传入的实参
	 * @return          表示当前执行方法的返回值
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("案件进展: [" + method.getName() + "]");
		return method.invoke(target, args);
	}
}
