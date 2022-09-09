package com.gilfoyle.design.structural.proxy.dynamic.dyproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author jaylee
 * @description: 动态代理 的工厂工具（对应例子中的  受理牛翠花的哪个律师事务所）
 * @author: Mr.JayLee
 * @create: 2022-09-09 12:47
 */
public class DynProxyFactory {
	
	public static Object getDynProxy(Object target){
		InvocationHandler handler = new DynProxyLawyer(target);
		
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),handler);
	}
}
