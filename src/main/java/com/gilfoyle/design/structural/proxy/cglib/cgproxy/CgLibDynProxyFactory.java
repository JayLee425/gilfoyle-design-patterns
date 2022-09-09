package com.gilfoyle.design.structural.proxy.cglib.cgproxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author jaylee
 * @description: 定义动态代理工厂，生成动态代理
 * @author: Mr.JayLee
 * @create: 2022-09-09 13:25
 */
public class CgLibDynProxyFactory {
	public static Object getCglibDybProxy(Object target) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setCallback(new CglibDynProxyLawyer());
		
		Object targetProxy = enhancer.create();
		return targetProxy;
	}
}
