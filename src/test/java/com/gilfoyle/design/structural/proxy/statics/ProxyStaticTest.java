package com.gilfoyle.design.structural.proxy.statics;

/**
 * @author jaylee
 * @description:
 * @author: Mr.JayLee
 * @create: 2022-09-09 12:24
 */
public class ProxyStaticTest {
	
	public static void main(String[] args) {
		ProxyStaticFactory.getProxy().lawsuit("工资流水在此!! ");
		System.out.println();
		ProxyStaticFactory.getProxy().defend();
	}
}
